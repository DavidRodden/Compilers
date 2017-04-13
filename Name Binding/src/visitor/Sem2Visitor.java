package visitor;

import syntaxtree.*;
import java.util.*;
import errorMsg.*;

// the purpose of this class is to
// - link each ClassDecl to the ClassDecl for its superclass (via
//   its 'superLink'
// - link each ClassDecl to each of its subclasses (via the
//   'subclasses' instance variable
// - ensure that there are no cycles in the inheritance hierarchy
// - ensure that no class has 'String' or 'RunMain' as a superclass
public class Sem2Visitor extends ASTvisitor {

	Hashtable<String, ClassDecl> globalSymTab;
	ErrorMsg errorMsg;

	public Sem2Visitor(Hashtable<String, ClassDecl> globalSymTb, ErrorMsg e) {
		errorMsg = e;
		initInstanceVars(globalSymTb);
	}

	private void initInstanceVars(Hashtable<String, ClassDecl> globalTab) {
		globalSymTab = globalTab;
	}

	public Object visitProgram(Program n) {
		super.visitProgram(n);
		classIteration: for (final ClassDecl current : n.classDecls) {
			// check if there is a superclass of String or RunMain
			if (current.superName.matches("String|RunMain")) errorMsg.error(current.pos, "Cannot extend " + current.superName);
			// make sure no class is part of a cycle
			ClassDecl link = current;
			for (int i = 0; (link = link.superLink) != null; i++)
				if (i > n.classDecls.size() || link == current) {
					errorMsg.error(link.pos, current.name + " cannot be part of a cycle");
					continue classIteration;
				}
		}
		return null;
	}

	public Object visitClassDecl(ClassDecl n) {
		if (n.name.equals("Object")) return null;
		if (globalSymTab.containsKey(n.superName)) {
			final ClassDecl current = globalSymTab.get(n.superName);
			n.superLink = current;
			current.subclasses.add(n);
		} else
			errorMsg.error(n.pos, "Undefined class name: " + n.superName);
		return null;
	}
}
