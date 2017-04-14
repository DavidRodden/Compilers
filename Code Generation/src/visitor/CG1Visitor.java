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

	// public Object visitProgram(Program n) {
	// code.emit(n, ".data");
	// ClassDecl classDecl = n.classDecls.get(0).superLink;
	// while (classDecl.superLink != null)
	// classDecl = classDecl.superLink;
	// classDecl.accept(this);
	// code.flush();
	// return null;
	// }
	//
	// public Object visitClassDecl(ClassDecl n) {
	// currentMethodTable = null;
	// final boolean superNull = n.superLink == null;
	// currentMethodOffset = 1 + (superNull ? 0 :
	// n.superLink.methodTable.size());
	// currentDataInstVarOffset = -16 - (superNull ? 0 : 4 *
	// n.superLink.numDataInstVars);
	// currentObjInstVarOffset = superNull ? 0 : 4 * n.superLink.numObjInstVars;
	// super.visitClassDecl(n);
	// n.numDataInstVars = (-16 - currentDataInstVarOffset) / 4;
	// n.numObjInstVars = currentObjInstVarOffset / 4;
	// code.emit(n, "CLASS_" + n.name);
	// code.emit(n, ".word " + (superNull ? "0" : "CLASS_" + n.superName));
	// for (int i = 0; i < currentMethodTable.size(); i++)
	// code.emit(n, ".word " + i);
	// superclassMethodTables.push(currentMethodTable);
	// n.subclasses.accept(this);
	// superclassMethodTables.pop();
	// code.emit(n, "CLASS_END_" + n.name);
	// return null;
	// }
}
