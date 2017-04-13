package parse;
import java.util.ArrayList;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object to be returned by the parser
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/char position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method that registers a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	// top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <class decl> ::= `class # ID `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, List<Decl> vec) {
		return new ClassDecl(pos, name, "Object", new DeclList(vec));
	}
	
	//: <class decl> ::= `class # ID `extends ID `{ <decl in class>* `} =>
	public ClassDecl createExtendedClassDecl(int pos, String name, String extName, List<Decl> vec){
		return new ClassDecl(pos, name, extName, new DeclList(vec));
	}

	//: <decl in class> ::= <method decl> => pass

	//: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}
	
	//: <method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `} =>
	public Decl createMethodDeclNonVoid(Type type, int pos, String name, List<Statement> stmts, Exp e){
		return new MethodDeclNonVoid(pos, type, name, new VarDeclList(), new StatementList(stmts), e);
	}
	
	//: <formal list> ::= <type> ID # <formal argument>* =>
	public VarDeclList createFormalList(Type origType, String origName, int origPos, List<Integer> remPos, List<Type> remTypes, List<String> remNames){
		List<VarDecl> formalList = new ArrayList<>();
		formalList.add(new InstVarDecl(origPos, origType, origName));
		for(int i = 0; i < remPos.size(); i++)	formalList.add(new InstVarDecl(remPos.get(i), remTypes.get(i), remNames.get(i)));
		return new VarDeclList(formalList);
	}
	
	//: <formal argument> ::= # `, <type> ID => pass
	
	//: <stmt decl> ::= <stmt> => pass
	//: <stmt decl> ::= <local var decl> => pass
	
	
	//: <method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `} =>
	public Decl createFormalMethodDeclVoid(int pos, String name, VarDeclList fList, List<Statement> stmts){
		return new MethodDeclVoid(pos, name, fList, new StatementList(stmts));
	}
	
	//: <method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `} =>
	public Decl createMethodDeclNonVoid(Type type, int pos, String name, VarDeclList fList, List<Statement> stmts, Exp e){
		return new MethodDeclNonVoid(pos, type, name, fList, new StatementList(stmts), e);
	}	
	
	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= <instance type> => pass
	
	//: <instance type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}
	//: <type> ::= # <type> <empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}
	//: <empty bracket pair> ::= `[ `] => null

	//: <bracket> ::= `[ => pass
	//================================================================
	// statement-level program constructs
	//================================================================

	//: <stmt> ::= # `; =>
	public Statement newBlank(int pos){
		return new Block(pos, new StatementList());
	}
	//: <stmt> ::= <assign> `; => pass
	
	//: <stmt> ::= # <call exp> `; =>
	public Statement newCallStmt(int pos, Call c){
		return new CallStatement(pos, c);
	}
	
	//: <stmt> ::= # `break `; =>
	public Statement newBreak(int pos){
		return new Break(pos);
	}
	
	
	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}
	//: <stmt> ::= <local var decl> `; => pass

	//: <assign> ::= <exp> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}
	
	//: <assign> ::= # `++ ID =>
	public Statement prependAddition(int pos, String name){
		IdentifierExp e = new IdentifierExp(pos, name);
		return new Assign(pos, e, new Plus(pos, e, new IntegerLiteral(pos, 1)));
	}
		
	//: <assign> ::= # ID `++ =>
	public Statement appendAddition(int pos, String name){
		IdentifierExp e = new IdentifierExp(pos, name);
		return new Assign(pos, e, new Plus(pos, e, new IntegerLiteral(pos, 1)));
	}
		
	//: <assign> ::= # `-- ID =>
	public Statement prependSubstract(int pos, String name){
		IdentifierExp e = new IdentifierExp(pos, name);
		return new Assign(pos, e, new Minus(pos, e, new IntegerLiteral(pos, 1)));
	}
	
	//: <assign> ::= # ID `-- =>
	public Statement appendSubtract(int pos, String name){
		IdentifierExp e = new IdentifierExp(pos, name);
		return new Assign(pos, e, new Minus(pos, e, new IntegerLiteral(pos, 1)));
	}

	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalDeclStatement(pos, new LocalVarDecl(pos, t, name, init));
	}

	
	//: <stmt> ::= # `if `( <exp> `) <stmt> !`else =>
	public Statement newIf(int pos, Exp e , Statement s){
		return new If(pos, e, s, new Block(pos, new StatementList()));
	}
	//: <stmt> ::= # `if `( <exp> `) <stmt> `else <stmt> =>
	public Statement  newIfElse(int pos, Exp e, Statement s1, Statement s2){
		return new If(pos, e, s1, s2);
	}
	
	//: <stmt> ::= # `while `( <exp> `) <stmt> =>
	public Statement newWhile(int pos, Exp e, Statement s){
		return new While(pos, e, s);
	}
	
	//: <stmt> ::= # `do `{ <stmt> `} `while `( <exp> `) `; =>
	public Statement newDoWhile(int pos, Statement s, Exp e){
		return new While(pos, e, s);
	}
	
	//: <stmt> ::= # `for `( <for first> `; <exp> `; <for third> `) <stmt> => 
	public Statement newFor(int pos, Exp e, Statement s){
		return new While(pos, e, s);
	}
	
	//: <for first> ::= # <type> ID `= <exp>
	//: <for first> ::= # <assign>
	//: <for first> ::= # <call exp>
	
	//: <for third> ::= # <assign>
	//: <for third> ::= # <call exp>
	
	//: <switch option> ::= # <stmt decl>
	//: <switch option> ::= # `case <exp> `: 
	//: <switch option> ::= # `default `: 
	
	//================================================================
	// expressions
	//================================================================

	//: <exp> ::= <exp8> => pass
	
	//: <exp8> ::= # <exp8> `|| <exp7> =>
	public Exp newOr(int pos, Exp e1, Exp e2){
		return new Or(pos, e1, e2);
	}
	//: <exp8> ::= <exp7> => pass
	
	//: <exp7> ::= # <exp7> `&& <exp6> =>
		public Exp newAnd(int pos, Exp e1, Exp e2){
			return new And(pos, e1, e2);
		}
	//: <exp7> ::= <exp6> => pass
	
	
	//: <exp6> ::= # <exp6> `!= <exp5> =>
	public Exp newNotEquals(int pos, Exp e1, Exp e2){
		return new Not(pos, new Equals(pos, e1, e2));
	}
	
	//: <exp6> ::= # <exp6> `== <exp5> =>
	public Exp newIsEqual(int pos, Exp e1, Exp e2){
		return new Equals(pos, e1, e2);
	}
	//: <exp6> ::= <exp5> => pass
	
	//: <exp5> ::= # <exp5> `> <exp4> =>
	public Exp newGreaterThan(int pos, Exp e1, Exp e2){
		return new GreaterThan(pos, e1, e2);
	}
		
	//: <exp5> ::= # <exp5> `>= <exp4> =>
	public Exp newGreaterThanEqual(int pos, Exp e1, Exp e2){
		return new Not(pos, new LessThan(pos, e1, e2));
	}
			
		
	//: <exp5> ::= # <exp5> `< <exp4> =>
	public Exp newLessThan(int pos, Exp e1, Exp e2){
		return new LessThan(pos, e1, e2);
	}
	
	//: <exp5> ::= # <exp5> `<= <exp4> =>
	public Exp newLessThanEqual(int pos, Exp e1, Exp e2){
		return new Not(pos, new GreaterThan(pos, e1, e2));
	}
	
	//: <exp5> ::= # <exp5> `instanceof <instance type> =>
	public Exp newInstanceOf(int pos, Exp e1, Type t1){
		return new InstanceOf(pos, e1, t1);
	}
	//: <exp5> ::= <exp4> => pass
	
	//: <exp4> ::= <exp4> # `+ <exp3> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}
	
	//: <exp4> ::= <exp4> # `- <exp3> =>
	public Exp newMinus(Exp e1, int pos, Exp e2){
		return new Minus(pos, e1, e2);
	}
	//: <exp4> ::= <exp3> => pass
	
	//: <exp3> ::= <exp3> # `* <exp2> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}

	//: <exp3> ::= <exp2> # `/ <exp2> =>
	public Exp newDivide(Exp e1, int pos, Exp e2) {
		return new Divide(pos, e1, e2);
	}

	//: <exp5> ::= <exp5> # `% <exp4> =>
	public Exp newRemainder(Exp e1, int pos, Exp e2) {
		return new Remainder(pos, e1, e2);
	}
	//: <exp3> ::= <exp2> => pass

	
	//: <exp2> ::= <cast exp> => pass
	//: <exp2> ::= <unary exp> => pass

	//: <cast exp> ::= # `( <type> `) <cast exp> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}
	//: <cast exp> ::= # `( <type> `) <exp1> => Exp newCast(int, Type, Exp)

	//: <unary exp> ::= # `- <unary exp> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}
	
	//: <unary exp> ::= # `+ <unary exp> =>
	public Exp newUnaryPlus(int pos, Exp e){
		return new Plus(pos, new IntegerLiteral(pos, 0), e);
	}
	

	//: <unary exp> ::= # `! <unary exp> =>
	public Exp newNot(int pos, Exp e){
		return new Not(pos, e);
	}
	
	//: <unary exp> ::= <exp1> => pass
	
	//: <call exp> ::= # ID `( `) =>
	public Call newCallExp(int pos, String name){
		return new Call(pos, new This(pos), name, new ExpList());
	}
	
	//: <call exp> ::= # ID `( <exp list> `) =>
	public Call newCallExpArgs(int pos, String name, ExpList el){
		return new Call(pos, new This(pos), name, el);
	}
	
	//: <call exp> ::= # <exp1> `. ID `( `) =>
	public Call newCallExpDot(int pos, Exp e, String name){
		return new Call(pos, new This(pos), name, new ExpList());
	}
	
	//: <call exp> ::= # <exp1> `. ID `( <exp list> `) =>
	public Call newCallExpDotArgs(int pos, Exp e, String name, ExpList el){
		return new Call(pos, new This(pos), name, el);
	}
	
	//: <call exp> ::= # `super `. ID `( `) =>
	public Call newSuper(int pos, String name){
		return new Call(pos, new This(pos), name, new ExpList());
	}

	//: <call exp> ::= # `super `. ID `( <exp list> `) =>
	public Call newSuperArgs(int pos, String name, ExpList el){
		return new Call(pos, new This(pos), name, el);
	}
	
	
	//: <exp list> ::= # <exp> <mult exp>* =>
	public ExpList newExpList(int origPos, Exp expOrig, List<Integer> pos, List<Exp> exps){
		List<Exp> expList = new ArrayList<>();
		expList.add(origPos, expOrig);
		for(int i = 0; i < pos.size(); i++)	expList.add(pos.get(i), exps.get(i));
		return new ExpList(expList);
	}
	
	//: <mult exp> ::= # `, <exp> => pass
	
	//: <exp1> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}
		
	//: <exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}
	
	//: <exp1> ::= `new <type> # `[ <exp> `] <empty bracket pair>* =>
	public Exp newArrayLookType(Type type, int pos, Exp e, List<Object> objs){
		return null;
	}
	
	//: <exp1> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}
	
	//: <exp1> ::= # CHARLIT =>
	public Exp newCharacterLiteral(int pos, int c){
		return new IntegerLiteral(pos, c);
	}
	
	//: <exp1> ::= # STRINGLIT =>
	public Exp newStringLiteral(int pos, String s){
		return new StringLiteral(pos, s);
	}
	//: <exp1> ::= # `null =>
	public Exp newNull(int pos){
		return new Null(pos);
	}
	
	//: <exp1> ::= # `true =>
	public Exp newTrueLiteral(int pos){
		return new True(pos);
	}
	
	//: <exp1> ::= # `false =>
	public Exp newFalseLiteral(int pos){
		return new False(pos);
	}
	
	//: <exp1> ::= # `this =>
	public Exp newThis(int pos){
		return new This(pos);
	}
	
	//: <exp1> ::= # <call exp> =>
	public Exp newCallExp1(int pos, Call c){
		return new Call(pos, c.obj, c.methName, c.parms);
	}
	
	//: <exp1> ::= # `new ID `( `) =>
	public Exp newId(int pos, String name){
		return new IdentifierExp(pos, name);
	}
	//: <exp1> ::= # !<cast exp> `( <exp> `) =>
	public Exp newParenthesesExp(int pos, Exp e){
		return e;
	}
	
	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

