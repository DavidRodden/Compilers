package visitor;

import syntaxtree.*;

import java.util.*;

import errorMsg.*;
import java.io.*;
import java.awt.Point;

//the purpose here is to annotate things with their offsets:
// - formal parameters, with respect to the (callee) frame
// - instance variables, with respect to their slot in the object
// - methods, with respect to their slot in the v-table
public class CG1Visitor extends ASTvisitor {

	// Error message object
	ErrorMsg errorMsg;

	// IO stream to which we will emit code
	CodeStream code;

	// v-table offset of next method we encounter
	int currentMethodOffset;

	// offset in object of next "object" instance variable we encounter
	int currentObjInstVarOffset;

	// offset in object of next "data" instance variable we encounter
	int currentDataInstVarOffset;

	// stack-offset of next formal parameter we encounter
	int currentFormalVarOffset;

	// stack method tables for current class and all superclasses
	Stack<Vector<String>> superclassMethodTables;

	// current method table
	Vector<String> currentMethodTable;

	public CG1Visitor(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		initInstanceVars(e, out);
	}

	private void initInstanceVars(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		currentMethodOffset = 0;
		currentObjInstVarOffset = 0;
		currentDataInstVarOffset = 0;
		code = new CodeStream(out, e);
		superclassMethodTables = new Stack<Vector<String>>();
		superclassMethodTables.addElement(new Vector<String>());
	}

	public Object visitProgram(Program n) {
		code.emit(n, ".data");
		ClassDecl classDecl = n.classDecls.get(0);
		while (classDecl.superLink != null)
			classDecl = classDecl.superLink;
		classDecl.accept(this);
		code.flush();
		return null;
	}

	public Object visitClassDecl(ClassDecl n) {
		currentMethodTable = (Vector<String>) superclassMethodTables.peek().clone();
		final boolean superNull = n.superLink == null;
		int methodsFound = 0;
		ClassDecl currentClass = n.superLink;
		while (currentClass != null) {
			for (final String s : currentClass.methodTable.keySet())
				if (currentClass.methodTable.get(s).superMethod == null) methodsFound++;
			currentClass = currentClass.superLink;
		}
		currentMethodOffset = superNull ? 1 : 1 + methodsFound;
		currentDataInstVarOffset = superNull ? -16 : -16 - (superNull ? 0 : 4 * n.superLink.numDataInstVars);
		currentObjInstVarOffset = superNull ? 0 : 4 * n.superLink.numObjInstVars;
		super.visitClassDecl(n);
		n.numDataInstVars = (-16 - currentDataInstVarOffset) / 4;
		n.numObjInstVars = currentObjInstVarOffset / 4;
		code.emit(n, "CLASS_" + n.name + ":");
		code.emit(n, ".word " + (superNull ? "0" : "CLASS_" + n.superName));
		currentMethodTable.forEach(t -> code.emit(n, ".word " + t));
		superclassMethodTables.push(currentMethodTable);
		n.subclasses.accept(this);
		superclassMethodTables.pop();
		code.emit(n, "CLASS_END_" + n.name + ":");
		return null;
	}

	public Object visitMethodDecl(MethodDecl n) {
		n.thisPtrOffset = 4;
		for (final VarDecl v : n.formals)
			n.thisPtrOffset += v.type instanceof IntegerType ? 8 : 4;
		currentFormalVarOffset = n.thisPtrOffset;
		super.visitMethodDecl(n);
		final String label = n.pos < 0 ? n.name + "_" + n.classDecl.name : String.format("fcn_%d_%s", n.uniqueId, n.name);
		if (n.superMethod == null) {
			code.emit(n, "# vtableOffset: " + n.vtableOffset);
			n.vtableOffset = currentMethodOffset++;
			code.emit(n, "# vtableOffset: " + n.vtableOffset);
			currentMethodTable.add(label);
			return null;
		}
		code.emit(n, "# vtableOffset: " + n.vtableOffset);
		n.vtableOffset = n.superMethod.vtableOffset;
		code.emit(n, "# vtableOffset: " + n.vtableOffset);
		currentMethodTable.set(n.superMethod.vtableOffset - 1, label);
		return null;
	}

	public Object visitInstVarDecl(InstVarDecl n) {
		super.visitInstVarDecl(n);
		if (n.type instanceof IntegerType || n.type instanceof BooleanType) {
			n.offset = currentDataInstVarOffset;
			currentDataInstVarOffset -= 4;
		} else if (n.type instanceof IdentifierType || n.type instanceof ArrayType) {
			n.offset = currentObjInstVarOffset;
			currentObjInstVarOffset += 4;
		}
		return null;
	}

	public Object visitFormalDecl(FormalDecl n) {
		super.visitFormalDecl(n);
		currentFormalVarOffset -= n.type instanceof IntegerType ? 8 : 4;
		n.offset = currentFormalVarOffset;
		return null;
	}
}
