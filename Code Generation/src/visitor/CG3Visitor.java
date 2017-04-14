package visitor;

import syntaxtree.*;

import errorMsg.*;
import java.io.*;

public class CG3Visitor extends ASTvisitor {

	// the purpose here is to annotate things with their offsets:
	// - formal parameters, with respect to the (callee) frame
	// - local variables, with respect to the frame
	// - instance variables, with respect to their slot in the object
	// - methods, with respect to their slot in the v-table
	// - while statements, with respect to the stack-size at the time
	// of loop-exit

	// Error message object
	ErrorMsg errorMsg;

	// IO stream to which we will emit code
	CodeStream code;

	// current stack height
	int stackHeight;

	// for constant evaluation
	ConstEvalVisitor conEvalVis;

	public CG3Visitor(ErrorMsg e, PrintStream out) {
		errorMsg = e;
		initInstanceVars(out);
		conEvalVis = new ConstEvalVisitor();
	}

	private void initInstanceVars(PrintStream out) {
		code = new CodeStream(out, errorMsg);
		stackHeight = 0;
	}

	public Object visitIntegerLiteral(IntegerLiteral n) {
		code.emit(n, "subu $sp, $sp, 8"); // ***
		stackHeight += 8;
		code.emit(n, "sw $s5,4($sp)");
		code.emit(n, "li $t0," + n.val);
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitNull(Null n) {
		code.emit(n, "subu $sp,$sp,4"); // ***
		stackHeight += 4;
		code.emit(n, "sw $zero,($sp)");
		return null;
	}

	public Object visitTrue(True n) {
		code.emit(n, "subu $sp,$sp,4"); // ***
		stackHeight += 4;
		code.emit(n, "li $t0, 1");
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitFalse(False n) {
		code.emit(n, "subu $sp,$sp,4"); // ***
		stackHeight += 4;
		code.emit(n, "sw $zero,($sp)");
		return null;
	}

	public Object visitStringLiteral(StringLiteral n) {
		code.emit(n, "subu $sp,$sp,4");
		stackHeight += 4;
		code.emit(n, "la $t0, strLit_" + n.uniqueCgRep.uniqueId);
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitThis(This n) {
		code.emit(n, "subu $sp,$sp,4");
		stackHeight += 4;
		code.emit(n, "sw $s2,($sp)");
		return null;
	}

	public Object visitSuper(Super n) {
		code.emit(n, "subu $sp,$sp,4");
		stackHeight += 4;
		code.emit(n, "sw $s2,($sp)");
		return null;
	}

	public Object visitIdentifierExp(IdentifierExp n) {
		if (n.link instanceof InstVarDecl)
			code.emit(n, "lw $t0, " + n.link.offset + "($s2)");
		else
			code.emit(n, "lw $t0, " + (stackHeight + n.link.offset) + "($sp)");
		final boolean isTypeInteger = n.type instanceof IntegerType;
		code.emit(n, "subu $sp, $sp, " + (isTypeInteger ? 8 : 4));
		stackHeight += isTypeInteger ? 8 : 4;
		if (isTypeInteger) code.emit(n, "sw $s5, 4($sp)");
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitNot(Not n) {
		n.exp.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "xor $t0,$t0,1");
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitPlus(Plus n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		code.emit(n, "addu $t0,$t0,$t1");
		code.emit(n, "addu $sp,$sp,8");
		stackHeight -= 8;
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitMinus(Minus n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		code.emit(n, "subu $t0,$t0,$t1");
		code.emit(n, "addu $sp,$sp,8");
		stackHeight -= 8;
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitDivide(Divide n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "jal divide");
		stackHeight -= 8;
		return null;
	}

	public Object visitRemainder(Remainder n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "jal remainder");
		stackHeight -= 8;
		return null;
	}

	public Object visitEquals(Equals n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0,($sp)");
		if (n.type instanceof IntegerType) {
			code.emit(n, "lw $t1,8($sp)");
			code.emit(n, "seq $t0,$t0,$t1");
			code.emit(n, "addu $sp,$sp,12");
			stackHeight -= 12;
		} else {
			code.emit(n, "lw $t1,4($sp)");
			code.emit(n, "seq $t0,$t0,$t1");
			code.emit(n, "addu $sp,$sp,4");
			stackHeight -= 4;
		}
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitGreaterThan(GreaterThan n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		code.emit(n, "sgt $t0,$t1,$t0");
		code.emit(n, "addu $sp,$sp,12");
		stackHeight -= 12;
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitLessThan(LessThan n) {
		n.left.accept(this);
		n.right.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "lw $t1,8($sp)");
		code.emit(n, "slt $t0,$t1,$t0");
		code.emit(n, "addu $sp,$sp,12");
		stackHeight -= 12;
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitAnd(And n) {
		n.left.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "beq $t0,$zero, skip_" + n.uniqueId);
		code.emit(n, "addu $sp,$sp,4");
		stackHeight -= 4;
		n.right.accept(this);
		code.emit(n, "skip_" + n.uniqueId);
		return null;
	}

	// public Object visitOr(Or n){
	// n.left.accept(this);
	// }

	public Object visitArrayLength(ArrayLength n) {
		n.exp.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "beq $t0,$zero,nullPtrException");
		code.emit(n, "lw $t0,-4($t0)");
		code.emit(n, "sw $s5,($sp)");
		code.emit(n, "subu $sp,4");
		stackHeight += 4;
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	// public Object visitArrayLength

	public Object visitArrayLookup(ArrayLookup n) {
		n.arrExp.accept(this);
		n.idxExp.accept(this);
		code.emit(n, "lw $t0,8($sp)");
		code.emit(n, "beq $t0,$zero,nullPtrException");
		code.emit(n, "lw $t1,-4($t0)");
		code.emit(n, "lw $t2,($sp)");
		code.emit(n, "bgeu $t2,$t1,arrayIndexOutOfBounds");
		code.emit(n, "sll $t2,$t2,2");
		code.emit(n, "addu $t2,$t2,$t0");
		code.emit(n, "lw $t0,($t2)");
		if (n.type instanceof IntegerType) {
			code.emit(n, "sw $t0,4($sp)");
			code.emit(n, "sw $s5,8($sp)");
			code.emit(n, "addu $sp,$sp,4");
			stackHeight -= 4;
			return null;
		}
		code.emit(n, "sw $t0,8($sp)");
		code.emit(n, "addu $sp,$sp,8");
		stackHeight -= 8;
		return null;
	}

	public Object visitInstVarAccess(InstVarAccess n) {
		n.exp.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "beq $t0,$zero,nullPtrException");
		code.emit(n, "lw $t0," + n.varDec.offset + "($t0)");
		if (!(n.type instanceof IntegerType)) {
			code.emit(n, "sw $t0,($sp)");
			return null;
		}
		code.emit(n, "subu $sp,$sp,4");
		stackHeight += 4;
		code.emit(n, "sw $s5,4($sp)");
		code.emit(n, "sw $t0,($sp)");
		return null;
	}

	public Object visitInstanceOf(InstanceOf n) {
		n.exp.accept(this);
		code.emit(n, "la $t0,CLASS_VerySimple"); // testing for VerySimple
													// class?
		code.emit(n, "la $t1,CLASS_END_VerySimple");
		code.emit(n, "jal instanceOf");
		return null;
	}

	public Object visitCast(Cast n) {
		n.exp.accept(this);
		if (!n.exp.type.equals(n.castType)) return null; // check if the
															// expression’s type
															// is a proper
															// superclass of the
															// target type
		code.emit(n, "la $t0,CLASS_VerySimple");
		code.emit(n, "la $t1,CLASS_END_VerySimple");
		code.emit(n, "checkCast");
		return null;
	}

	public Object visitNewObject(NewObject n) {

		code.emit(n, "jal newObject");
		code.emit(n, "la $t0,CLASS_" + "name??");
		code.emit(n, "sw $t0,-12($s7)");
		return null;
	}

	public Object visitNewArray(NewArray n) {
		n.sizeExp.accept(this);
		code.emit(n, "lw $s7,($sp)");
		code.emit(n, "addu $sp,$sp,8");
		stackHeight -= 8;
		final boolean isIntOrBool = n.objType instanceof IntegerType || n.objType instanceof BooleanType;
		code.emit(n, "li $s6, " + (isIntOrBool ? -1 : 1));
		code.emit(n, "jal newObject");
		stackHeight += 4;
		code.emit(n, "la $t0,CLASS__" + (isIntOrBool ? "DataArray" : "ObjectArray"));
		code.emit(n, "sw $t0,-12($s7)");
		return null;
	}

	public Object visitLocalVarDecl(LocalVarDecl n) {
		n.initExp.accept(this);
		n.offset = -stackHeight;
		return null;
	}

	public Object visitCall(Call n) {
		if (n.obj instanceof Super) {
			// rest here
		}
		return null;
	}

	public Object visitCallStatement(CallStatement n) {
		n.callExp.accept(this);
		if (n.callExp.type instanceof VoidType) return null;
		final int stackUpdate = n.callExp.type instanceof IntegerType ? 8 : 4;
		code.emit(n, "addu $sp,$sp," + stackUpdate);
		stackHeight -= stackUpdate;
		return null;
	}

	public Object visitBlock(Block n) {
		final int currentStackHeight = stackHeight;
		n.stmts.accept(this);
		if (stackHeight != currentStackHeight) code.emit(n, "addu $sp, " + (stackHeight - currentStackHeight));
		stackHeight = currentStackHeight;
		return null;
	}

	public Object visitIf(If n) {
		n.exp.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "addu $sp,$sp,4");
		stackHeight -= 4;
		code.emit(n, "beq $t0,$zero,if_else_" + n.uniqueId);
		n.trueStmt.accept(this);
		code.emit(n, "j if_done_" + n.uniqueId);
		code.emit(n, "if_else_" + n.uniqueId + ":");
		n.falseStmt.accept(this);
		code.emit(n, "if_done_" + n.uniqueId + ":");
		return null;
	}

	public Object visitWhile(While n) {
		n.stackHeight = stackHeight;
		code.emit(n, "j while_enter_" + n.uniqueId);
		code.emit(n, "while_top_" + n.uniqueId + ":");
		n.body.accept(this);
		code.emit(n, "while_enter_" + n.uniqueId + ":");
		n.exp.accept(this);
		code.emit(n, "lw $t0,($sp)");
		code.emit(n, "addu $sp,$sp,4");
		stackHeight -= 4;
		code.emit(n, "bne $t0,$zero,while_top_" + n.uniqueId);
		code.emit(n, "break_target_" + n.uniqueId + ":");
		return null;
	}

	public Object visitBreak(Break n) {
		final int stackDifference = stackHeight - n.breakLink.stackHeight;
		if (stackDifference != 0) code.emit(n, "addu $sp," + stackDifference);
		code.emit(n, "j break_target_" + n.uniqueId);
		return null;
	}

	public Object visitMethodDeclVoid(MethodDeclVoid n) {
		code.emit(n, ".globl fcn_" + n.uniqueId + "_" + n.name); // not sure if
																	// n.name is
																	// wanted
																	// for
																	// method
																	// name
		code.emit(n, "fcn_" + n.uniqueId + "_" + n.name + ":");
		code.emit(n, "subu $sp,$sp,4");
		code.emit(n, "sw $s2,($sp)");
		code.emit(n, "lw $s2," + n.thisPtrOffset + "($sp)");
		code.emit(n, "sw $ra," + n.thisPtrOffset + "($sp)");
		stackHeight = 0; // set visitor's stack height to 0??
		n.stmts.accept(this);
		code.emit(n, "lw $ra, " + n.vtableOffset + "($sp)");
		code.emit(n, "lw $s2, " + n.thisPtrOffset + "($sp)");
		code.emit(n, "addu $sp, $sp, " + (stackHeight + 4 + n.formals.size() * 4 + 4)); // compute
																						// amount
																						// to
																						// pop
																						// stack
		code.emit(n, "jr $ra");
		return null;
	}

	public Object visitProgram(Program n) {

		return null;
	}
}