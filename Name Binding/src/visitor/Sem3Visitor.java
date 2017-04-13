package visitor;

import syntaxtree.*;
import java.util.*;
import java.util.stream.Stream;

import errorMsg.*;

// The purpose of this class is to:
// - link each variable reference to its corresponding VarDecl
//   (via its 'link' instance variable)
//   - undefined variable names are reported
// - link each type reference to its corresponding ClassDecl
//   - undefined type names are reported
// - link each Break expression to its enclosing While or
//   Switch statement
//   - a break that is not inside any while or switch is reported
// - report conflicting local variable names (including formal
//   parameter names)
// - ensure that no instance variable has the name 'length'
public class Sem3Visitor extends ASTvisitor {

	Hashtable<String, ClassDecl> globalSymTab;
	ClassDecl currentClass;
	Hashtable<String, VarDecl> localSymTab;
	Stack<BreakTarget> breakTargetStack;

	ErrorMsg errorMsg;

	// dummy variable declaration indicating "uninitialized variable"
	private static VarDecl uninitVarDecl = new InstVarDecl(-1, null, "$$$$");

	public Sem3Visitor(Hashtable globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
		breakTargetStack = new Stack<>();
		currentClass = null;
	}

	private void initInstanceVars(Hashtable<String, ClassDecl> globalTab) {
		breakTargetStack = new Stack<BreakTarget>();
		globalSymTab = globalTab;
		localSymTab = new Hashtable<String, VarDecl>();
		currentClass = null;
	}

	public Object visitClassDecl(ClassDecl n) {
		currentClass = n;
		return super.visitClassDecl(n);
	}

	public Object visitMethodDecl(MethodDecl n) {
		localSymTab.clear();
		return super.visitMethodDecl(n);
	}

	public Object visitFormalDecl(FormalDecl n) {
		if (localSymTab.containsKey(n.name)) errorMsg.error(n.pos, "Duplicate variable name: " + n.name);
		localSymTab.put(n.name, uninitVarDecl);
		super.visitFormalDecl(n);
		localSymTab.put(n.name, n);
		return null;
	}

	public Object visitLocalVarDecl(LocalVarDecl n) {
		if (localSymTab.containsKey(n.name)) errorMsg.error(n.pos, "Duplicate variable name: " + n.name);
		if (currentClass.instVarTable.containsKey(n.name)) errorMsg.warning(n.pos, "Variable " + n.name + " hiding instance variable of same name");
		localSymTab.put(n.name, uninitVarDecl);
		super.visitLocalVarDecl(n);
		localSymTab.put(n.name, n);
		return null;
	}

	public Object visitInstVarDecl(InstVarDecl n) {
		if (n.name.equals("length")) errorMsg.error(n.pos, "Variable cannot have name: " + n.name);
		return super.visitInstVarDecl(n);
	}

	public Object visitBlock(Block n) {
		super.visitBlock(n);
		n.stmts.forEach(s -> {
			if (localSymTab.containsKey(s)) localSymTab.remove(s);
		});
		return null;
	}

	public Object visitIdentifierExp(IdentifierExp n) {
		if (localSymTab.containsKey(n.name)) {
			if (n.equals(uninitVarDecl))
				errorMsg.error(n.pos, "Identifier Exp cannot have same name: " + n.name);
			else
				n.link = localSymTab.get(n.name);
			return null;
		}
		final Optional<String> findLocalClosest = localSymTab.keySet().stream().filter(k -> closeMatch(k, n.name)).findFirst();
		if (findLocalClosest.isPresent()) {
			errorMsg.warning(n.pos, "IdentifierExp " + n.name + " not found, closest found was " + findLocalClosest.get());
			if (n.equals(uninitVarDecl))
				errorMsg.error(n.pos, "Identifier Exp cannot have same name: " + n.name);
			else
				n.link = localSymTab.get(findLocalClosest.get());
			return null;
		}
		for (ClassDecl examinedClass = currentClass;; examinedClass = currentClass.superLink) {
			if (examinedClass == null) {
				errorMsg.error(n.pos, "Undefined variable name: " + n.name);
				return null;
			}
			if (examinedClass.instVarTable.containsKey(n.name)) {
				n.link = examinedClass.instVarTable.get(n.name);
				return null;
			}
			final Optional<String> findInstClosest = examinedClass.instVarTable.keySet().stream().filter(k -> closeMatch(k, n.name)).findFirst();
			if (findInstClosest.isPresent()) {
				errorMsg.warning(n.pos, "IdentifierType " + n.name + " not found, closest found was " + findInstClosest.get());
				n.link = examinedClass.instVarTable.get(findInstClosest.get());
				return null;
			}
		}
	}

	public Object visitIdentifierType(IdentifierType n) {
		if (globalSymTab.containsKey(n.name)) {
			n.link = globalSymTab.get(n.name);
			return null;
		}
		final Optional<String> findGlobalClosest = globalSymTab.keySet().stream().filter(k -> closeMatch(k, n.name)).findFirst();
		if (findGlobalClosest.isPresent()) {
			n.link = globalSymTab.get(findGlobalClosest.get());
			errorMsg.warning(n.pos, "IdentifierType " + n.name + " not found, closest found was " + findGlobalClosest.get());
		} else
			errorMsg.error(n.pos, "Undefined class name: " + n.name);
		return null;
	}

	public Object visitWhile(While n) {
		breakTargetStack.push(n);
		super.visitWhile(n);
		breakTargetStack.pop();
		return null;
	}

	public Object visitBreak(Break n) {
		if (breakTargetStack.isEmpty())
			errorMsg.error(n.pos, "Break statement outside of a loop/switch");
		else
			n.breakLink = breakTargetStack.peek();
		return null;
	}

	public Object visitSwitch(Switch n) {
		breakTargetStack.push(n);
		// traverse switch expression

		final List<String> nameList = new ArrayList<>();
		n.stmts.forEach(s -> {
			if (s instanceof LocalDeclStatement) System.out.println("localdecl");
			if (s instanceof Break) System.out.println("break");
		});

		breakTargetStack.pop();
		return null;
	}

	public boolean closeMatch(String str1, String str2) {
		final int firstLength = str1.length(), secondLength = str2.length();
		int difference;
		if ((difference = Math.abs(firstLength - secondLength)) > 1) return false;
		for (int i = 0; i < Math.min(firstLength, secondLength); ++i) {
			if (str1.charAt(i) != str2.charAt(i)) difference++;
		}
		return difference <= 1;
	}
}
