package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 173; }
public int getNttSym() { return 174; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"\"b\"",
"\"o\"",
"\"l\"",
"\"e\"",
"\"a\"",
"\"n\"",
"idChar",
"reserved",
"\"r\"",
"\"k\"",
"\"c\"",
"\"s\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"f\"",
"\"i\"",
"\"w\"",
"\"u\"",
"\"p\"",
"\"h\"",
"\"v\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"*\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\"/\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"|\"",
"\"}\"",
"id2",
"intLit2",
"charLit2",
"stringLit3",
"letter",
"idChar*",
"\"0\"",
"digit++",
"hex++",
"\"\'\"",
"{\"1\"..\"9\"}",
"{\"#\"..\"$\" \":\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"\" \"",
"\"_\"",
"{\"A\"..\"F\"}",
"{\"G\"..\"Z\" \"j\" \"q\"}",
"\'\"\'",
"stringLit2",
"stringPrintable",
"stringLit2**",
"\"\\\"",
"printable",
"digit",
"hex",
"withoutStar",
"commentChar",
"eol",
"ws",
"{9 12}",
"printable**",
"commentChar**",
"10",
"13",
"token*",
"printable*",
"hex+",
"commentChar*",
"digit+",
"stringLit2*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 175;}
private static final int MIN_REDUCTION = 1224;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|190, // match move
0x80000000|907, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
0x80000000|260, // match move
0x80000000|1046, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 4
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 6
0x80000000|1176, // match move
0x80000000|1112, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 7
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 8
0x80000000|814, // match move
0x80000000|896, // no-match move
0x80000000|26, // NT-test-match state for digit
  }
,
{ // state 9
88,78, // "b"
91,78, // "e"
92,78, // "a"
98,78, // "c"
102,78, // "d"
103,78, // "f"
140,135, // "0"
144,135, // {"1".."9"}
148,78, // {"A".."F"}
156,386, // digit
157,117, // hex
  }
,
{ // state 10
160,364, // eol
161,629, // ws
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 11
160,364, // eol
161,629, // ws
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 13
-1, // $$start
-1, // start
318, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 14
174,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 15
101,339, // "t"
  }
,
{ // state 16
0x80000000|350, // match move
0x80000000|1140, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 17
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 18
174,MIN_REDUCTION+144, // $NT
  }
,
{ // state 19
89,839, // "o"
90,824, // "l"
92,529, // "a"
108,96, // "h"
  }
,
{ // state 20
0x80000000|518, // match move
0x80000000|835, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 21
174,MIN_REDUCTION+135, // $NT
  }
,
{ // state 22
0x80000000|987, // match move
0x80000000|671, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 23
0x80000000|624, // match move
0x80000000|148, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 24
-1, // $$start
-1, // start
325, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+182, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+182, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+182, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+182, // "u"
582, // "p"
MIN_REDUCTION+182, // "h"
453, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
804, // "g"
MIN_REDUCTION+182, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+182, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+182, // {"A".."F"}
MIN_REDUCTION+182, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 25
101,355, // "t"
  }
,
{ // state 26
140,282, // "0"
144,282, // {"1".."9"}
  }
,
{ // state 27
89,313, // "o"
  }
,
{ // state 28
174,MIN_REDUCTION+325, // $NT
  }
,
{ // state 29
0x80000000|30, // match move
0x80000000|154, // no-match move
0x80000000|26, // NT-test-match state for digit
  }
,
{ // state 30
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 31
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+97, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 32
89,312, // "o"
  }
,
{ // state 33
2,825, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 34
2,3, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 35
92,383, // "a"
  }
,
{ // state 36
0x80000000|590, // match move
0x80000000|943, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 37
174,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 38
93,960, // "n"
  }
,
{ // state 39
-1, // $$start
-1, // start
46, // ws*
-1, // $$0
MIN_REDUCTION+300, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+300, // $
-1, // $NT
  }
,
{ // state 40
0x80000000|940, // match move
0x80000000|592, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 41
0x80000000|916, // match move
0x80000000|122, // no-match move
0x80000000|648, // NT-test-match state for printable
  }
,
{ // state 42
0x80000000|1022, // match move
0x80000000|175, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 43
120,552, // "*"
164,427, // commentChar**
170,926, // commentChar*
  }
,
{ // state 44
174,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 46
0x80000000|338, // match move
0x80000000|80, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 47
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 48
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 49
93,256, // "n"
  }
,
{ // state 50
104,973, // "i"
  }
,
{ // state 51
0x80000000|393, // match move
0x80000000|611, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 52
0x80000000|501, // match move
0x80000000|233, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 53
0x80000000|1209, // match move
0x80000000|126, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 54
104,955, // "i"
  }
,
{ // state 55
0x80000000|562, // match move
0x80000000|198, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 56
0x80000000|211, // match move
0x80000000|43, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 57
0x80000000|243, // match move
0x80000000|324, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 58
0x80000000|780, // match move
0x80000000|389, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 59
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 60
0x80000000|1157, // match move
0x80000000|435, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 61
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 62
174,MIN_REDUCTION+228, // $NT
  }
,
{ // state 63
0x80000000|2, // match move
0x80000000|567, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 64
0x80000000|773, // match move
0x80000000|1125, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 65
104,348, // "i"
  }
,
{ // state 66
-1, // $$start
-1, // start
57, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+209, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+209, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+209, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+209, // "u"
582, // "p"
MIN_REDUCTION+209, // "h"
453, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
804, // "g"
MIN_REDUCTION+209, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+209, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+209, // {"A".."F"}
MIN_REDUCTION+209, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 67
2,1011, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 69
0x80000000|316, // match move
0x80000000|720, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 70
98,945, // "c"
  }
,
{ // state 71
0x80000000|2, // match move
0x80000000|133, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 72
174,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 73
174,MIN_REDUCTION+207, // $NT
  }
,
{ // state 74
92,1033, // "a"
  }
,
{ // state 75
160,364, // eol
161,629, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 77
0x80000000|677, // match move
0x80000000|1040, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 78
0x80000000|76, // match move
0x80000000|852, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 79
0x80000000|1107, // match move
0x80000000|931, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 80
0x80000000|225, // match move
0x80000000|782, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 81
103,195, // "f"
  }
,
{ // state 82
91,500, // "e"
  }
,
{ // state 83
3,1089, // $$0
4,458, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
167,965, // token*
  }
,
{ // state 84
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 85
115,52, // "="
  }
,
{ // state 86
101,202, // "t"
  }
,
{ // state 87
2,797, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 88
0x80000000|718, // match move
0x80000000|48, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 89
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 90
96,371, // "r"
  }
,
{ // state 91
0x80000000|2, // match move
0x80000000|201, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 92
2,715, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 94
0x80000000|89, // match move
0x80000000|1038, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 95
174,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 96
92,972, // "a"
  }
,
{ // state 97
89,391, // "o"
  }
,
{ // state 98
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 99
109,382, // "v"
  }
,
{ // state 100
174,MIN_REDUCTION+204, // $NT
  }
,
{ // state 101
2,613, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 102
2,3, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 104
101,343, // "t"
  }
,
{ // state 105
0x80000000|2, // match move
0x80000000|442, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 106
0x80000000|444, // match move
0x80000000|526, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 107
174,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 111
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 112
0x80000000|881, // match move
0x80000000|652, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 113
88,1206, // "b"
99,737, // "s"
  }
,
{ // state 114
174,MIN_REDUCTION+222, // $NT
  }
,
{ // state 115
2,477, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 117
0x80000000|892, // match move
0x80000000|988, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 118
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 119
107,451, // "p"
  }
,
{ // state 120
160,364, // eol
161,629, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 121
104,993, // "i"
  }
,
{ // state 122
174,MIN_REDUCTION+355, // $NT
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 123
0x80000000|2, // match move
0x80000000|66, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 124
0x80000000|261, // match move
0x80000000|366, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 125
150,1036, // '"'
  }
,
{ // state 126
0x80000000|107, // match move
0x80000000|658, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 127
174,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 128
0x80000000|470, // match move
0x80000000|573, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 129
0x80000000|1193, // match move
0x80000000|1154, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 130
0x80000000|218, // match move
0x80000000|927, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 131
0x80000000|512, // match move
0x80000000|194, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 132
160,364, // eol
161,629, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 133
-1, // $$start
-1, // start
968, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+245, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+245, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+245, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+245, // "u"
582, // "p"
MIN_REDUCTION+245, // "h"
453, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
804, // "g"
MIN_REDUCTION+245, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+245, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+245, // {"A".."F"}
MIN_REDUCTION+245, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 134
0x80000000|144, // match move
0x80000000|235, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 135
0x80000000|68, // match move
0x80000000|110, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 136
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 137
160,364, // eol
161,629, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 138
90,889, // "l"
  }
,
{ // state 139
174,MIN_REDUCTION+336, // $NT
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 140
-1, // $$start
-1, // start
745, // ws*
-1, // $$0
MIN_REDUCTION+276, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 141
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 142
0x80000000|676, // match move
0x80000000|146, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 143
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 145
-1, // $$start
-1, // start
248, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+194, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+194, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+194, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+194, // "u"
582, // "p"
MIN_REDUCTION+194, // "h"
453, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
804, // "g"
MIN_REDUCTION+194, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+194, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+194, // {"A".."F"}
MIN_REDUCTION+194, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 146
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 147
-1, // $$start
-1, // start
570, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+107, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+107, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+107, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+107, // "u"
582, // "p"
MIN_REDUCTION+107, // "h"
453, // "v"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
804, // "g"
MIN_REDUCTION+107, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+107, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+107, // {"A".."F"}
MIN_REDUCTION+107, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 148
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+124, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 149
160,364, // eol
161,629, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 150
0x80000000|864, // match move
0x80000000|142, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 151
174,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 152
0x80000000|369, // match move
0x80000000|275, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 153
90,468, // "l"
  }
,
{ // state 154
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 155
174,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 157
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+157, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 158
2,706, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 159
-1, // $$start
-1, // start
665, // ws*
-1, // $$0
MIN_REDUCTION+302, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 160
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 161
174,MIN_REDUCTION+356, // $NT
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 162
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 163
174,MIN_REDUCTION+313, // $NT
  }
,
{ // state 164
2,477, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 165
96,1127, // "r"
  }
,
{ // state 166
174,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 167
3,1089, // $$0
4,458, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
88,1032, // "b"
90,27, // "l"
91,1035, // "e"
92,113, // "a"
93,288, // "n"
96,396, // "r"
98,19, // "c"
99,670, // "s"
101,534, // "t"
102,267, // "d"
103,719, // "f"
104,205, // "i"
105,847, // "w"
107,582, // "p"
109,453, // "v"
112,804, // "g"
167,965, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 168
160,364, // eol
161,629, // ws
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 169
101,475, // "t"
  }
,
{ // state 170
92,1087, // "a"
  }
,
{ // state 171
0x80000000|995, // match move
0x80000000|295, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 172
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 173
0x80000000|85, // match move
0x80000000|1133, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 174
91,71, // "e"
  }
,
{ // state 175
-1, // $$start
-1, // start
788, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 176
0x80000000|452, // match move
0x80000000|755, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 177
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 178
-1, // $$start
-1, // start
1162, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+203, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+203, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+203, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+203, // "u"
582, // "p"
MIN_REDUCTION+203, // "h"
453, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
804, // "g"
MIN_REDUCTION+203, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+203, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+203, // {"A".."F"}
MIN_REDUCTION+203, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 179
0x80000000|640, // match move
0x80000000|1158, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 180
90,871, // "l"
93,874, // "n"
96,81, // "r"
100,642, // "x"
  }
,
{ // state 181
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 182
0x80000000|583, // match move
0x80000000|543, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 183
160,364, // eol
161,629, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 184
174,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 185
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 186
174,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 187
2,613, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 188
0x80000000|989, // match move
0x80000000|957, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 189
174,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 190
0x80000000|429, // match move
0x80000000|634, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 191
0x80000000|653, // match move
0x80000000|1002, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 192
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 193
0x80000000|250, // match move
0x80000000|259, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 194
0x80000000|508, // match move
0x80000000|328, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 195
92,465, // "a"
  }
,
{ // state 196
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+103, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 197
103,1025, // "f"
  }
,
{ // state 198
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 199
99,1137, // "s"
  }
,
{ // state 200
2,862, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 201
-1, // $$start
-1, // start
270, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+179, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+179, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+179, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+179, // "u"
582, // "p"
MIN_REDUCTION+179, // "h"
453, // "v"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
804, // "g"
MIN_REDUCTION+179, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+179, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+179, // {"A".."F"}
MIN_REDUCTION+179, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 202
106,1110, // "u"
  }
,
{ // state 203
-1, // $$start
-1, // start
191, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+143, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+143, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+143, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+143, // "u"
582, // "p"
MIN_REDUCTION+143, // "h"
453, // "v"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
804, // "g"
MIN_REDUCTION+143, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+143, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+143, // {"A".."F"}
MIN_REDUCTION+143, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 204
0x80000000|12, // match move
0x80000000|1163, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 205
93,496, // "n"
103,1190, // "f"
111,310, // "m"
  }
,
{ // state 206
0x80000000|390, // match move
0x80000000|279, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 207
174,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 208
174,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 209
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 210
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 211
88,193, // "b"
89,193, // "o"
90,193, // "l"
91,193, // "e"
92,193, // "a"
93,193, // "n"
96,193, // "r"
97,193, // "k"
98,193, // "c"
99,193, // "s"
100,193, // "x"
101,193, // "t"
102,193, // "d"
103,193, // "f"
104,193, // "i"
105,193, // "w"
106,193, // "u"
107,193, // "p"
108,193, // "h"
109,193, // "v"
110,193, // "y"
111,193, // "m"
112,193, // "g"
113,193, // "z"
114,193, // "!"
115,193, // "="
116,193, // "%"
117,193, // "&"
118,193, // "("
119,193, // ")"
120,843, // "*"
121,193, // "+"
122,193, // ","
123,193, // "-"
124,193, // "."
125,193, // "/"
126,193, // ";"
127,193, // "<"
128,193, // ">"
129,193, // "["
130,193, // "]"
131,193, // "{"
132,193, // "|"
133,193, // "}"
140,193, // "0"
143,193, // "'"
144,193, // {"1".."9"}
145,193, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,193, // " "
147,193, // "_"
148,193, // {"A".."F"}
149,193, // {"G".."Z" "j" "q"}
150,193, // '"'
154,193, // "\"
158,55, // withoutStar
159,778, // commentChar
160,1048, // eol
164,427, // commentChar**
165,128, // {10}
166,768, // {13}
170,926, // commentChar*
  }
,
{ // state 212
99,246, // "s"
101,1129, // "t"
  }
,
{ // state 213
96,479, // "r"
  }
,
{ // state 214
0x80000000|408, // match move
0x80000000|726, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 215
174,MIN_REDUCTION+234, // $NT
  }
,
{ // state 216
160,364, // eol
161,629, // ws
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 217
2,631, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 218
174,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 219
160,364, // eol
161,629, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 220
0x80000000|902, // match move
0x80000000|23, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 221
0x80000000|1021, // match move
0x80000000|159, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 222
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 223
92,621, // "a"
104,348, // "i"
106,851, // "u"
110,833, // "y"
  }
,
{ // state 224
2,422, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 226
-1, // $$start
-1, // start
36, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+155, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+155, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+155, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+155, // "u"
582, // "p"
MIN_REDUCTION+155, // "h"
453, // "v"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
804, // "g"
MIN_REDUCTION+155, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+155, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+155, // {"A".."F"}
MIN_REDUCTION+155, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 227
110,410, // "y"
  }
,
{ // state 228
174,MIN_REDUCTION+333, // $NT
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 229
0x80000000|2, // match move
0x80000000|24, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 230
105,515, // "w"
  }
,
{ // state 231
174,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 232
98,1217, // "c"
  }
,
{ // state 233
0x80000000|33, // match move
0x80000000|963, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 234
0x80000000|1076, // match move
0x80000000|210, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 235
2,MIN_REDUCTION+323, // ws*
4,MIN_REDUCTION+323, // token
114,MIN_REDUCTION+323, // "!"
115,MIN_REDUCTION+323, // "="
116,MIN_REDUCTION+323, // "%"
117,MIN_REDUCTION+323, // "&"
118,MIN_REDUCTION+323, // "("
119,MIN_REDUCTION+323, // ")"
120,MIN_REDUCTION+323, // "*"
121,MIN_REDUCTION+323, // "+"
122,MIN_REDUCTION+323, // ","
123,MIN_REDUCTION+323, // "-"
124,MIN_REDUCTION+323, // "."
125,MIN_REDUCTION+323, // "/"
126,MIN_REDUCTION+323, // ";"
127,MIN_REDUCTION+323, // "<"
128,MIN_REDUCTION+323, // ">"
129,MIN_REDUCTION+323, // "["
130,MIN_REDUCTION+323, // "]"
131,MIN_REDUCTION+323, // "{"
132,MIN_REDUCTION+323, // "|"
133,MIN_REDUCTION+323, // "}"
143,MIN_REDUCTION+323, // "'"
146,MIN_REDUCTION+323, // " "
150,MIN_REDUCTION+323, // '"'
162,MIN_REDUCTION+323, // {9 12}
165,MIN_REDUCTION+323, // {10}
166,MIN_REDUCTION+323, // {13}
173,MIN_REDUCTION+323, // $
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 236
174,MIN_REDUCTION+180, // $NT
  }
,
{ // state 237
0x80000000|911, // match move
0x80000000|1072, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 238
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 239
101,531, // "t"
  }
,
{ // state 240
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 241
0x80000000|575, // match move
0x80000000|31, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 242
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+106, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 243
160,364, // eol
161,629, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 244
-1, // $$start
-1, // start
378, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+176, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+176, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+176, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
747, // "u"
582, // "p"
MIN_REDUCTION+176, // "h"
453, // "v"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
804, // "g"
MIN_REDUCTION+176, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+176, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+176, // {"A".."F"}
MIN_REDUCTION+176, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 245
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 246
101,753, // "t"
  }
,
{ // state 247
0x80000000|2, // match move
0x80000000|203, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 248
0x80000000|712, // match move
0x80000000|306, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 249
0x80000000|513, // match move
0x80000000|560, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 250
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 251
174,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 252
-1, // $$start
-1, // start
1222, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+236, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+236, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+236, // "x"
329, // "t"
267, // "d"
719, // "f"
205, // "i"
1015, // "w"
810, // "u"
582, // "p"
97, // "h"
453, // "v"
542, // "y"
MIN_REDUCTION+236, // "m"
804, // "g"
MIN_REDUCTION+236, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+236, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+236, // {"A".."F"}
MIN_REDUCTION+236, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 253
160,364, // eol
161,629, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 254
-1, // $$start
-1, // start
319, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+212, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+212, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+212, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+212, // "u"
582, // "p"
MIN_REDUCTION+212, // "h"
453, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
804, // "g"
MIN_REDUCTION+212, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+212, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+212, // {"A".."F"}
MIN_REDUCTION+212, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 255
0x80000000|285, // match move
0x80000000|106, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 256
102,523, // "d"
  }
,
{ // state 257
174,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 258
0x80000000|983, // match move
0x80000000|947, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 259
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 260
160,364, // eol
161,629, // ws
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 261
174,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 262
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 263
0x80000000|516, // match move
0x80000000|88, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 264
0x80000000|397, // match move
0x80000000|418, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 265
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 266
89,313, // "o"
110,410, // "y"
  }
,
{ // state 267
89,1056, // "o"
91,332, // "e"
  }
,
{ // state 268
-1, // $$start
-1, // start
631, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
-1, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
-1, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
MIN_REDUCTION+268, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 269
160,364, // eol
161,629, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 270
0x80000000|691, // match move
0x80000000|514, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 271
160,364, // eol
161,629, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 272
0x80000000|729, // match move
0x80000000|1215, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 273
174,MIN_REDUCTION+186, // $NT
  }
,
{ // state 274
0x80000000|823, // match move
0x80000000|307, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 275
-1, // $$start
-1, // start
929, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
-1, // `=
-1, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
MIN_REDUCTION+286, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 276
-1, // $$start
-1, // start
837, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 277
93,471, // "n"
  }
,
{ // state 278
-1, // $$start
-1, // start
858, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+149, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+149, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+149, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+149, // "u"
582, // "p"
MIN_REDUCTION+149, // "h"
453, // "v"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
804, // "g"
MIN_REDUCTION+149, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+149, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+149, // {"A".."F"}
MIN_REDUCTION+149, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 279
0x80000000|521, // match move
0x80000000|659, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 280
174,MIN_REDUCTION+162, // $NT
  }
,
{ // state 281
174,MIN_REDUCTION+114, // $NT
  }
,
{ // state 282
174,MIN_REDUCTION+324, // $NT
  }
,
{ // state 283
0x80000000|834, // match move
0x80000000|883, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 284
2,309, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 285
160,364, // eol
161,629, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 286
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+247, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 287
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 288
91,230, // "e"
92,432, // "a"
106,138, // "u"
  }
,
{ // state 289
123,693, // "-"
  }
,
{ // state 290
0x80000000|253, // match move
0x80000000|1122, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 291
160,364, // eol
161,629, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 292
89,520, // "o"
  }
,
{ // state 293
0x80000000|654, // match move
0x80000000|1066, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 294
89,777, // "o"
104,99, // "i"
  }
,
{ // state 295
0x80000000|167, // match move
0x80000000|1031, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 296
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+320, // (default reduction)
  }
,
{ // state 298
0x80000000|251, // match move
0x80000000|748, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 299
2,745, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 300
0x80000000|764, // match move
0x80000000|405, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 301
112,574, // "g"
  }
,
{ // state 302
90,54, // "l"
  }
,
{ // state 303
2,46, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 304
2,788, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 305
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 306
0x80000000|127, // match move
0x80000000|587, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 307
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+199, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 308
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 309
0x80000000|598, // match move
0x80000000|1194, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 310
107,981, // "p"
  }
,
{ // state 311
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 312
93,735, // "n"
  }
,
{ // state 313
93,580, // "n"
  }
,
{ // state 314
88,134, // "b"
89,134, // "o"
90,134, // "l"
91,134, // "e"
92,134, // "a"
93,134, // "n"
94,757, // idChar
96,134, // "r"
97,134, // "k"
98,134, // "c"
99,134, // "s"
100,134, // "x"
101,134, // "t"
102,134, // "d"
103,134, // "f"
104,134, // "i"
105,134, // "w"
106,134, // "u"
107,134, // "p"
108,134, // "h"
109,134, // "v"
110,134, // "y"
111,134, // "m"
112,134, // "g"
113,134, // "z"
138,1023, // letter
140,1106, // "0"
144,1106, // {"1".."9"}
147,584, // "_"
148,134, // {"A".."F"}
149,134, // {"G".."Z" "j" "q"}
156,283, // digit
  }
,
{ // state 315
-1, // $$start
-1, // start
388, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+146, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+146, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+146, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+146, // "u"
582, // "p"
MIN_REDUCTION+146, // "h"
453, // "v"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
804, // "g"
MIN_REDUCTION+146, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+146, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+146, // {"A".."F"}
MIN_REDUCTION+146, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 316
120,56, // "*"
125,545, // "/"
  }
,
{ // state 317
91,38, // "e"
  }
,
{ // state 318
0x80000000|821, // match move
0x80000000|701, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 319
0x80000000|1148, // match move
0x80000000|483, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 320
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 321
0x80000000|257, // match move
0x80000000|878, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 322
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 323
0x80000000|605, // match move
0x80000000|1111, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 324
0x80000000|1152, // match move
0x80000000|1195, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 325
0x80000000|668, // match move
0x80000000|298, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 326
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 327
0x80000000|912, // match move
0x80000000|13, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 328
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+303, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+303, // $
-1, // $NT
  }
,
{ // state 329
92,169, // "a"
96,223, // "r"
108,1095, // "h"
  }
,
{ // state 330
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 332
103,604, // "f"
  }
,
{ // state 333
99,50, // "s"
  }
,
{ // state 334
2,422, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 335
174,MIN_REDUCTION+174, // $NT
  }
,
{ // state 336
160,364, // eol
161,629, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 337
0x80000000|411, // match move
0x80000000|1090, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 338
160,364, // eol
161,629, // ws
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 339
96,661, // "r"
  }
,
{ // state 340
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 341
160,364, // eol
161,629, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 342
174,MIN_REDUCTION+198, // $NT
  }
,
{ // state 343
0x80000000|2, // match move
0x80000000|278, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 344
139,353, // idChar*
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 345
0x80000000|2, // match move
0x80000000|400, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 346
0x80000000|1018, // match move
0x80000000|913, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 347
0x80000000|964, // match move
0x80000000|1003, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 348
98,593, // "c"
  }
,
{ // state 349
-1, // $$start
-1, // start
150, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 350
160,364, // eol
161,629, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 351
160,364, // eol
161,629, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 352
174,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 353
0x80000000|314, // match move
0x80000000|1016, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 354
-1, // $$start
-1, // start
206, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+89, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+89, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+89, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+89, // "u"
582, // "p"
MIN_REDUCTION+89, // "h"
453, // "v"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
804, // "g"
MIN_REDUCTION+89, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+89, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+89, // {"A".."F"}
MIN_REDUCTION+89, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 355
98,803, // "c"
  }
,
{ // state 356
0x80000000|2, // match move
0x80000000|761, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 357
0x80000000|187, // match move
0x80000000|1082, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 358
98,708, // "c"
  }
,
{ // state 359
0x80000000|11, // match move
0x80000000|346, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 360
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 361
174,MIN_REDUCTION+231, // $NT
  }
,
{ // state 362
160,364, // eol
161,629, // ws
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 363
0x80000000|102, // match move
0x80000000|813, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 364
174,MIN_REDUCTION+330, // $NT
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 365
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+223, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 366
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+166, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 367
-1, // $$start
-1, // start
430, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+200, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+200, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+200, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+200, // "u"
582, // "p"
MIN_REDUCTION+200, // "h"
453, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
804, // "g"
MIN_REDUCTION+200, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+200, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+200, // {"A".."F"}
MIN_REDUCTION+200, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 368
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 369
2,929, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 370
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+184, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 371
101,595, // "t"
  }
,
{ // state 372
91,703, // "e"
  }
,
{ // state 373
-1, // $$start
-1, // start
309, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
-1, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
-1, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
MIN_REDUCTION+262, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+262, // $
-1, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 374
0x80000000|2, // match move
0x80000000|315, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 375
-1, // $$start
-1, // start
40, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 376
-1, // $$start
-1, // start
131, // ws*
-1, // $$0
MIN_REDUCTION+304, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 377
117,1010, // "&"
  }
,
{ // state 378
0x80000000|695, // match move
0x80000000|868, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 379
91,789, // "e"
  }
,
{ // state 380
174,MIN_REDUCTION+117, // $NT
  }
,
{ // state 381
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 382
92,740, // "a"
  }
,
{ // state 383
101,739, // "t"
  }
,
{ // state 384
0x80000000|326, // match move
0x80000000|790, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 385
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+148, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 386
0x80000000|846, // match move
0x80000000|398, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 387
91,1099, // "e"
  }
,
{ // state 388
0x80000000|183, // match move
0x80000000|751, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 389
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+151, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 390
160,364, // eol
161,629, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 391
96,636, // "r"
  }
,
{ // state 392
91,948, // "e"
  }
,
{ // state 393
160,364, // eol
161,629, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 394
89,74, // "o"
  }
,
{ // state 395
160,364, // eol
161,629, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 396
91,86, // "e"
  }
,
{ // state 397
174,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 399
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 400
-1, // $$start
-1, // start
546, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+224, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+224, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+224, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+224, // "u"
582, // "p"
MIN_REDUCTION+224, // "h"
453, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
804, // "g"
MIN_REDUCTION+224, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+224, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+224, // {"A".."F"}
MIN_REDUCTION+224, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 401
174,MIN_REDUCTION+327, // $NT
  }
,
{ // state 402
88,134, // "b"
89,134, // "o"
90,134, // "l"
91,134, // "e"
92,134, // "a"
93,134, // "n"
94,714, // idChar
96,134, // "r"
97,134, // "k"
98,134, // "c"
99,134, // "s"
100,134, // "x"
101,134, // "t"
102,134, // "d"
103,134, // "f"
104,134, // "i"
105,134, // "w"
106,134, // "u"
107,134, // "p"
108,134, // "h"
109,134, // "v"
110,134, // "y"
111,134, // "m"
112,134, // "g"
113,134, // "z"
138,1023, // letter
139,353, // idChar*
140,1106, // "0"
144,1106, // {"1".."9"}
147,584, // "_"
148,134, // {"A".."F"}
149,134, // {"G".."Z" "j" "q"}
156,283, // digit
  }
,
{ // state 403
0x80000000|547, // match move
0x80000000|461, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 404
160,364, // eol
161,629, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 405
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 406
101,692, // "t"
  }
,
{ // state 407
174,MIN_REDUCTION+147, // $NT
  }
,
{ // state 408
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 409
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 410
0x80000000|2, // match move
0x80000000|509, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 411
2,715, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 412
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 413
0x80000000|92, // match move
0x80000000|337, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 414
174,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 415
174,MIN_REDUCTION+129, // $NT
  }
,
{ // state 416
0x80000000|217, // match move
0x80000000|1061, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 417
174,MIN_REDUCTION+323, // $NT
  }
,
{ // state 418
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+226, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 419
88,78, // "b"
91,78, // "e"
92,78, // "a"
98,78, // "c"
102,78, // "d"
103,78, // "f"
140,135, // "0"
142,723, // hex++
144,135, // {"1".."9"}
148,78, // {"A".."F"}
156,386, // digit
157,507, // hex
169,1136, // hex+
  }
,
{ // state 420
160,364, // eol
161,629, // ws
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 421
101,1101, // "t"
  }
,
{ // state 422
0x80000000|1207, // match move
0x80000000|428, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 423
160,364, // eol
161,629, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 424
160,364, // eol
161,629, // ws
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 426
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
763, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
-1, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
-1, // eol
-1, // ws
-1, // {9 12}
-1, // printable**
-1, // commentChar**
-1, // {10}
-1, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+359, // $
-1, // $NT
  }
,
{ // state 427
120,1221, // "*"
  }
,
{ // state 428
0x80000000|143, // match move
0x80000000|994, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 429
1,680, // start
2,171, // ws*
3,628, // $$0
4,458, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
167,965, // token*
  }
,
{ // state 430
0x80000000|395, // match move
0x80000000|274, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 431
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 432
101,121, // "t"
  }
,
{ // state 433
0x80000000|2, // match move
0x80000000|401, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 434
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 435
0x80000000|299, // match move
0x80000000|140, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 436
0x80000000|801, // match move
0x80000000|262, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 437
0x80000000|284, // match move
0x80000000|908, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 438
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 439
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+100, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 440
0x80000000|2, // match move
0x80000000|226, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 441
0x80000000|67, // match move
0x80000000|890, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 442
-1, // $$start
-1, // start
769, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+122, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+122, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+122, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+122, // "u"
582, // "p"
MIN_REDUCTION+122, // "h"
453, // "v"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
804, // "g"
MIN_REDUCTION+122, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+122, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+122, // {"A".."F"}
MIN_REDUCTION+122, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 443
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 444
174,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 445
160,364, // eol
161,629, // ws
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 446
174,MIN_REDUCTION+213, // $NT
  }
,
{ // state 447
-1, // $$start
-1, // start
797, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 448
-1, // $$start
-1, // start
702, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 449
0x80000000|414, // match move
0x80000000|439, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 450
0x80000000|791, // match move
0x80000000|98, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 451
0x80000000|2, // match move
0x80000000|690, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 452
2,706, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 453
89,1150, // "o"
  }
,
{ // state 454
0x80000000|571, // match move
0x80000000|166, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 455
0x80000000|351, // match move
0x80000000|77, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 456
-1, // $$start
-1, // start
841, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+173, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+173, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+173, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+173, // "u"
582, // "p"
MIN_REDUCTION+173, // "h"
453, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
804, // "g"
MIN_REDUCTION+173, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+173, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+173, // {"A".."F"}
MIN_REDUCTION+173, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 457
0x80000000|1134, // match move
0x80000000|486, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 458
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 459
174,MIN_REDUCTION+240, // $NT
  }
,
{ // state 460
0x80000000|685, // match move
0x80000000|863, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 461
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+121, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 462
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 463
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 464
0x80000000|108, // match move
0x80000000|425, // no-match move
0x80000000|26, // NT-test-match state for digit
  }
,
{ // state 465
98,744, // "c"
  }
,
{ // state 466
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 467
-1, // $$start
-1, // start
544, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+119, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+119, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+119, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+119, // "u"
582, // "p"
MIN_REDUCTION+119, // "h"
453, // "v"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
804, // "g"
MIN_REDUCTION+119, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+119, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+119, // {"A".."F"}
MIN_REDUCTION+119, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 468
91,374, // "e"
  }
,
{ // state 469
174,MIN_REDUCTION+348, // $NT
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 471
98,756, // "c"
  }
,
{ // state 472
2,1174, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 473
0x80000000|151, // match move
0x80000000|1009, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 474
174,MIN_REDUCTION+93, // $NT
  }
,
{ // state 475
104,694, // "i"
  }
,
{ // state 476
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 477
0x80000000|1167, // match move
0x80000000|436, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 478
160,364, // eol
161,629, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 479
0x80000000|2, // match move
0x80000000|147, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 480
174,MIN_REDUCTION+246, // $NT
  }
,
{ // state 481
0x80000000|2, // match move
0x80000000|541, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 482
174,MIN_REDUCTION+216, // $NT
  }
,
{ // state 483
0x80000000|207, // match move
0x80000000|697, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 484
-1, // $$start
680, // start
171, // ws*
628, // $$0
458, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
965, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 485
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 486
-1, // $$start
-1, // start
795, // ws*
-1, // $$0
MIN_REDUCTION+252, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+252, // $
-1, // $NT
  }
,
{ // state 487
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 489
0x80000000|17, // match move
0x80000000|556, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 490
2,40, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 491
0x80000000|977, // match move
0x80000000|473, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 492
0x80000000|271, // match move
0x80000000|1039, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 493
0x80000000|1138, // match move
0x80000000|347, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 494
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 495
91,170, // "e"
  }
,
{ // state 496
99,827, // "s"
101,182, // "t"
  }
,
{ // state 497
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
,
{ // state 498
0x80000000|1160, // match move
0x80000000|1092, // no-match move
0x80000000|648, // NT-test-match state for printable
  }
,
{ // state 499
160,364, // eol
161,629, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 500
102,63, // "d"
  }
,
{ // state 501
2,825, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 503
0x80000000|322, // match move
0x80000000|192, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 504
-1, // $$start
-1, // start
610, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+140, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+140, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+140, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+140, // "u"
582, // "p"
MIN_REDUCTION+140, // "h"
453, // "v"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
804, // "g"
MIN_REDUCTION+140, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+140, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+140, // {"A".."F"}
MIN_REDUCTION+140, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 505
99,199, // "s"
  }
,
{ // state 506
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 507
0x80000000|623, // match move
0x80000000|532, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 508
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 509
-1, // $$start
-1, // start
263, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+188, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+188, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+188, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+188, // "u"
582, // "p"
MIN_REDUCTION+188, // "h"
453, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
804, // "g"
MIN_REDUCTION+188, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+188, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+188, // {"A".."F"}
MIN_REDUCTION+188, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 510
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 512
160,364, // eol
161,629, // ws
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 513
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 514
0x80000000|554, // match move
0x80000000|528, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 515
0x80000000|2, // match move
0x80000000|467, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 516
160,364, // eol
161,629, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 517
174,MIN_REDUCTION+150, // $NT
  }
,
{ // state 518
88,214, // "b"
89,214, // "o"
90,214, // "l"
91,214, // "e"
92,214, // "a"
93,214, // "n"
96,214, // "r"
97,214, // "k"
98,214, // "c"
99,214, // "s"
100,214, // "x"
101,214, // "t"
102,214, // "d"
103,214, // "f"
104,214, // "i"
105,214, // "w"
106,214, // "u"
107,214, // "p"
108,214, // "h"
109,214, // "v"
110,214, // "y"
111,214, // "m"
112,214, // "g"
113,214, // "z"
114,214, // "!"
115,214, // "="
116,214, // "%"
117,214, // "&"
118,214, // "("
119,214, // ")"
120,214, // "*"
121,214, // "+"
122,214, // ","
123,214, // "-"
124,214, // "."
125,214, // "/"
126,214, // ";"
127,214, // "<"
128,214, // ">"
129,214, // "["
130,214, // "]"
131,214, // "{"
132,214, // "|"
133,214, // "}"
140,214, // "0"
143,214, // "'"
144,214, // {"1".."9"}
145,214, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,214, // " "
147,214, // "_"
148,214, // {"A".."F"}
149,214, // {"G".."Z" "j" "q"}
151,204, // stringLit2
152,249, // stringPrintable
153,125, // stringLit2**
154,214, // "\"
172,615, // stringLit2*
  }
,
{ // state 519
0x80000000|216, // match move
0x80000000|450, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 520
0x80000000|2, // match move
0x80000000|145, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 521
174,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 522
0x80000000|438, // match move
0x80000000|111, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 523
99,967, // "s"
  }
,
{ // state 524
174,MIN_REDUCTION+319, // $NT
  }
,
{ // state 525
0x80000000|698, // match move
0x80000000|141, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 526
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+214, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 527
91,232, // "e"
  }
,
{ // state 528
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 529
99,392, // "s"
101,358, // "t"
  }
,
{ // state 530
91,481, // "e"
  }
,
{ // state 531
0x80000000|2, // match move
0x80000000|456, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 532
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 533
0x80000000|667, // match move
0x80000000|915, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 534
96,918, // "r"
108,1095, // "h"
  }
,
{ // state 535
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 536
160,364, // eol
161,629, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 537
0x80000000|600, // match move
0x80000000|196, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 538
174,MIN_REDUCTION+165, // $NT
  }
,
{ // state 539
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 541
-1, // $$start
-1, // start
1075, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+98, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+98, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+98, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+98, // "u"
582, // "p"
MIN_REDUCTION+98, // "h"
453, // "v"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
804, // "g"
MIN_REDUCTION+98, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+98, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+98, // {"A".."F"}
MIN_REDUCTION+98, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 542
93,826, // "n"
  }
,
{ // state 543
-1, // $$start
-1, // start
1144, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+116, // "o"
27, // "l"
180, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+116, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+116, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+116, // "u"
582, // "p"
MIN_REDUCTION+116, // "h"
453, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
804, // "g"
MIN_REDUCTION+116, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+116, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+116, // {"A".."F"}
MIN_REDUCTION+116, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 544
0x80000000|120, // match move
0x80000000|293, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 545
0x80000000|979, // match move
0x80000000|1201, // no-match move
0x80000000|648, // NT-test-match state for printable
  }
,
{ // state 546
0x80000000|132, // match move
0x80000000|844, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 547
174,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 548
174,MIN_REDUCTION+159, // $NT
  }
,
{ // state 549
174,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 550
0x80000000|115, // match move
0x80000000|1064, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 551
0x80000000|2, // match move
0x80000000|504, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 552
125,877, // "/"
  }
,
{ // state 553
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+305, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 554
174,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 555
0x80000000|746, // match move
0x80000000|129, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 556
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 557
0x80000000|563, // match move
0x80000000|124, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 558
0x80000000|1020, // match move
0x80000000|579, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 559
174,MIN_REDUCTION+102, // $NT
  }
,
{ // state 560
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 561
105,1065, // "w"
  }
,
{ // state 562
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 563
160,364, // eol
161,629, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 564
88,939, // "b"
89,939, // "o"
90,939, // "l"
91,939, // "e"
92,939, // "a"
93,939, // "n"
96,939, // "r"
97,939, // "k"
98,939, // "c"
99,939, // "s"
100,939, // "x"
101,939, // "t"
102,939, // "d"
103,939, // "f"
104,939, // "i"
105,939, // "w"
106,939, // "u"
107,939, // "p"
108,939, // "h"
109,939, // "v"
110,939, // "y"
111,939, // "m"
112,939, // "g"
113,939, // "z"
114,939, // "!"
115,939, // "="
116,939, // "%"
117,939, // "&"
118,939, // "("
119,939, // ")"
120,939, // "*"
121,939, // "+"
122,939, // ","
123,939, // "-"
124,939, // "."
125,939, // "/"
126,939, // ";"
127,939, // "<"
128,939, // ">"
129,939, // "["
130,939, // "]"
131,939, // "{"
132,939, // "|"
133,939, // "}"
140,939, // "0"
143,939, // "'"
144,939, // {"1".."9"}
145,939, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,939, // " "
147,939, // "_"
148,939, // {"A".."F"}
149,939, // {"G".."Z" "j" "q"}
152,163, // stringPrintable
154,939, // "\"
  }
,
{ // state 565
0x80000000|2, // match move
0x80000000|367, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 566
0x80000000|2, // match move
0x80000000|354, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 567
-1, // $$start
-1, // start
493, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+230, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+230, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+230, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+230, // "u"
582, // "p"
MIN_REDUCTION+230, // "h"
453, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
804, // "g"
MIN_REDUCTION+230, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+230, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+230, // {"A".."F"}
MIN_REDUCTION+230, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 568
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 569
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+139, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 570
0x80000000|137, // match move
0x80000000|866, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 571
165,139, // {10}
  }
,
{ // state 572
174,MIN_REDUCTION+120, // $NT
  }
,
{ // state 573
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 574
91,905, // "e"
  }
,
{ // state 575
174,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 576
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 577
174,MIN_REDUCTION+99, // $NT
  }
,
{ // state 578
90,930, // "l"
  }
,
{ // state 579
0x80000000|549, // match move
0x80000000|497, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 580
112,641, // "g"
  }
,
{ // state 581
-1, // $$start
-1, // start
558, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+95, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+95, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+95, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+95, // "u"
582, // "p"
MIN_REDUCTION+95, // "h"
453, // "v"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
804, // "g"
MIN_REDUCTION+95, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+95, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+95, // {"A".."F"}
MIN_REDUCTION+95, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 582
92,70, // "a"
96,294, // "r"
106,608, // "u"
  }
,
{ // state 583
91,996, // "e"
  }
,
{ // state 584
0x80000000|136, // match move
0x80000000|297, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 585
2,318, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 586
0x80000000|1192, // match move
0x80000000|1057, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 587
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+193, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 588
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 589
93,1181, // "n"
  }
,
{ // state 590
160,364, // eol
161,629, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 591
174,MIN_REDUCTION+320, // $NT
  }
,
{ // state 592
0x80000000|502, // match move
0x80000000|7, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 593
101,1028, // "t"
  }
,
{ // state 594
2,150, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 595
0x80000000|2, // match move
0x80000000|816, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 596
174,MIN_REDUCTION+201, // $NT
  }
,
{ // state 597
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 598
160,364, // eol
161,629, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 599
0x80000000|37, // match move
0x80000000|678, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 600
174,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 601
2,845, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 602
174,MIN_REDUCTION+335, // $NT
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 603
111,317, // "m"
  }
,
{ // state 604
92,879, // "a"
  }
,
{ // state 605
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 606
92,301, // "a"
  }
,
{ // state 607
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+127, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 608
88,302, // "b"
  }
,
{ // state 609
2,702, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 610
0x80000000|696, // match move
0x80000000|820, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 611
0x80000000|1189, // match move
0x80000000|1142, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 612
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 613
0x80000000|1096, // match move
0x80000000|752, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 614
174,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 615
0x80000000|975, // match move
0x80000000|5, // no-match move
0x80000000|564, // NT-test-match state for stringLit2
  }
,
{ // state 616
160,364, // eol
161,629, // ws
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 617
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 618
-1, // $$start
-1, // start
1053, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+242, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+242, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+242, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+242, // "u"
582, // "p"
MIN_REDUCTION+242, // "h"
453, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
804, // "g"
MIN_REDUCTION+242, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+242, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+242, // {"A".."F"}
MIN_REDUCTION+242, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 619
-1, // $$start
-1, // start
422, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 620
0x80000000|352, // match move
0x80000000|370, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 621
93,333, // "n"
  }
,
{ // state 622
174,MIN_REDUCTION+331, // $NT
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 624
174,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 625
174,MIN_REDUCTION+90, // $NT
  }
,
{ // state 626
0x80000000|304, // match move
0x80000000|42, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 627
102,1171, // "d"
  }
,
{ // state 628
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 629
174,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 630
0x80000000|341, // match move
0x80000000|599, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 631
0x80000000|336, // match move
0x80000000|666, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 632
0x80000000|1086, // match move
0x80000000|276, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 633
160,364, // eol
161,629, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 634
1,680, // start
2,171, // ws*
3,628, // $$0
4,458, // token
58,754, // `!
59,725, // `!=
60,1058, // `%
61,731, // `&&
62,93, // `*
63,855, // `(
64,588, // `)
65,683, // `{
66,873, // `}
67,59, // `-
68,510, // `+
69,893, // `=
70,1026, // `==
71,340, // `[
72,431, // `]
73,717, // `||
74,704, // `<
75,360, // `<=
76,817, // `,
77,409, // `>
78,172, // `>=
79,443, // `.
80,311, // `;
81,45, // `++
82,576, // `--
83,330, // `/
84,222, // ID
85,412, // INTLIT
86,568, // STRINGLIT
87,1077, // CHARLIT
134,925, // id2
135,888, // intLit2
136,179, // charLit2
137,924, // stringLit3
138,897, // letter
140,1200, // "0"
160,364, // eol
161,469, // ws
167,965, // token*
  }
,
{ // state 635
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 636
101,710, // "t"
  }
,
{ // state 637
0x80000000|296, // match move
0x80000000|308, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 638
0x80000000|291, // match move
0x80000000|449, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 639
-1, // $$start
-1, // start
455, // ws*
-1, // $$0
MIN_REDUCTION+250, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 640
2,131, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 641
0x80000000|2, // match move
0x80000000|840, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 642
101,895, // "t"
  }
,
{ // state 643
2,46, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 644
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+145, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 645
0x80000000|2, // match move
0x80000000|733, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 646
174,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 647
-1, // $$start
-1, // start
828, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+110, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+110, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+110, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+110, // "u"
582, // "p"
MIN_REDUCTION+110, // "h"
453, // "v"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
804, // "g"
MIN_REDUCTION+110, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+110, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+110, // {"A".."F"}
MIN_REDUCTION+110, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 648
88,999, // "b"
89,999, // "o"
90,999, // "l"
91,999, // "e"
92,999, // "a"
93,999, // "n"
96,999, // "r"
97,999, // "k"
98,999, // "c"
99,999, // "s"
100,999, // "x"
101,999, // "t"
102,999, // "d"
103,999, // "f"
104,999, // "i"
105,999, // "w"
106,999, // "u"
107,999, // "p"
108,999, // "h"
109,999, // "v"
110,999, // "y"
111,999, // "m"
112,999, // "g"
113,999, // "z"
114,999, // "!"
115,999, // "="
116,999, // "%"
117,999, // "&"
118,999, // "("
119,999, // ")"
120,999, // "*"
121,999, // "+"
122,999, // ","
123,999, // "-"
124,999, // "."
125,999, // "/"
126,999, // ";"
127,999, // "<"
128,999, // ">"
129,999, // "["
130,999, // "]"
131,999, // "{"
132,999, // "|"
133,999, // "}"
140,999, // "0"
143,999, // "'"
144,999, // {"1".."9"}
145,999, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,999, // " "
147,999, // "_"
148,999, // {"A".."F"}
149,999, // {"G".."Z" "j" "q"}
150,999, // '"'
154,999, // "\"
  }
,
{ // state 649
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 650
160,364, // eol
161,629, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 651
0x80000000|445, // match move
0x80000000|1079, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 652
-1, // $$start
-1, // start
651, // ws*
-1, // $$0
MIN_REDUCTION+306, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 653
160,364, // eol
161,629, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 654
174,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 655
174,MIN_REDUCTION+225, // $NT
  }
,
{ // state 656
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 658
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 659
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+88, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 660
174,MIN_REDUCTION+321, // $NT
  }
,
{ // state 661
92,970, // "a"
  }
,
{ // state 662
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 663
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 664
108,949, // "h"
  }
,
{ // state 665
0x80000000|1059, // match move
0x80000000|503, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 666
0x80000000|663, // match move
0x80000000|177, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 667
2,455, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 668
160,364, // eol
161,629, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 669
-1, // $$start
-1, // start
220, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+125, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+125, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+125, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+125, // "u"
582, // "p"
MIN_REDUCTION+125, // "h"
453, // "v"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
804, // "g"
MIN_REDUCTION+125, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+125, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+125, // {"A".."F"}
MIN_REDUCTION+125, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 670
101,986, // "t"
105,904, // "w"
106,810, // "u"
108,97, // "h"
110,542, // "y"
  }
,
{ // state 671
0x80000000|44, // match move
0x80000000|784, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 672
-1, // $$start
-1, // start
630, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+137, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+137, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+137, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+137, // "u"
582, // "p"
MIN_REDUCTION+137, // "h"
453, // "v"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
804, // "g"
MIN_REDUCTION+137, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+137, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+137, // {"A".."F"}
MIN_REDUCTION+137, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 673
-1, // $$start
-1, // start
51, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+221, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+221, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+221, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+221, // "u"
582, // "p"
MIN_REDUCTION+221, // "h"
453, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
804, // "g"
MIN_REDUCTION+221, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+221, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+221, // {"A".."F"}
MIN_REDUCTION+221, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 674
160,364, // eol
161,629, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 675
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 676
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 677
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 678
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+136, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 679
160,364, // eol
161,629, // ws
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 680
173,MIN_REDUCTION+0, // $
  }
,
{ // state 681
0x80000000|1115, // match move
0x80000000|617, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 682
0x80000000|793, // match move
0x80000000|252, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 683
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 684
0x80000000|2, // match move
0x80000000|1218, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 685
2,272, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 686
174,MIN_REDUCTION+105, // $NT
  }
,
{ // state 687
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 688
0x80000000|478, // match move
0x80000000|1117, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 689
106,379, // "u"
  }
,
{ // state 690
-1, // $$start
-1, // start
928, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+227, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+227, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+227, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+227, // "u"
582, // "p"
MIN_REDUCTION+227, // "h"
453, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
804, // "g"
MIN_REDUCTION+227, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+227, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+227, // {"A".."F"}
MIN_REDUCTION+227, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 691
160,364, // eol
161,629, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 692
91,440, // "e"
  }
,
{ // state 693
0x80000000|224, // match move
0x80000000|1000, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 694
98,345, // "c"
  }
,
{ // state 695
160,364, // eol
161,629, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 696
160,364, // eol
161,629, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 697
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+211, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 698
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 699
89,774, // "o"
  }
,
{ // state 700
0x80000000|2, // match move
0x80000000|766, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 701
0x80000000|1051, // match move
0x80000000|185, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 702
0x80000000|1214, // match move
0x80000000|681, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 703
92,785, // "a"
  }
,
{ // state 704
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 705
-1, // $$start
-1, // start
845, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 706
0x80000000|650, // match move
0x80000000|300, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 707
0x80000000|594, // match move
0x80000000|349, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 708
108,909, // "h"
  }
,
{ // state 709
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 710
0x80000000|2, // match move
0x80000000|673, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 711
0x80000000|472, // match move
0x80000000|802, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 712
160,364, // eol
161,629, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 713
0x80000000|200, // match move
0x80000000|776, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 714
0x80000000|1151, // match move
0x80000000|597, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 715
0x80000000|616, // match move
0x80000000|1169, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 716
93,421, // "n"
  }
,
{ // state 717
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 718
174,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 719
89,213, // "o"
90,394, // "l"
92,1017, // "a"
104,589, // "i"
  }
,
{ // state 720
2,974, // ws*
146,1120, // " "
160,364, // eol
161,469, // ws
162,1120, // {9 12}
165,602, // {10}
166,454, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 722
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+202, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 723
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 724
5,625, // `boolean
6,933, // `class
7,559, // `extends
8,18, // `void
9,380, // `int
10,407, // `while
11,1100, // `if
12,577, // `else
13,997, // `for
14,474, // `break
15,1055, // `this
16,686, // `false
17,848, // `true
18,1109, // `super
19,900, // `null
20,415, // `return
21,281, // `instanceof
22,572, // `new
23,517, // `abstract
24,1123, // `assert
25,1037, // `byte
26,548, // `case
27,280, // `catch
28,538, // `char
29,812, // `const
30,875, // `continue
31,335, // `default
32,1047, // `do
33,236, // `double
34,935, // `enum
35,273, // `final
36,799, // `finally
37,772, // `float
38,1045, // `goto
39,342, // `implements
40,596, // `import
41,100, // `interface
42,73, // `long
43,941, // `native
44,446, // `package
45,482, // `private
46,1108, // `protected
47,867, // `public
48,114, // `short
49,655, // `static
50,62, // `strictfp
51,21, // `switch
52,361, // `synchronized
53,215, // `throw
54,1113, // `throws
55,459, // `transient
56,1094, // `try
57,480, // `volatile
88,1032, // "b"
90,27, // "l"
91,1035, // "e"
92,113, // "a"
93,288, // "n"
96,396, // "r"
98,19, // "c"
99,670, // "s"
101,534, // "t"
102,267, // "d"
103,719, // "f"
104,205, // "i"
105,847, // "w"
107,582, // "p"
109,453, // "v"
112,804, // "g"
  }
,
{ // state 725
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 726
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 727
-1, // $$start
-1, // start
1103, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+185, // "o"
266, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+185, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+185, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+185, // "u"
582, // "p"
MIN_REDUCTION+185, // "h"
453, // "v"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
804, // "g"
MIN_REDUCTION+185, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+185, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+185, // {"A".."F"}
MIN_REDUCTION+185, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 728
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 729
160,364, // eol
161,629, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 730
0x80000000|656, // match move
0x80000000|1081, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 731
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 732
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+112, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 733
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+197, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+197, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+197, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+197, // "u"
582, // "p"
MIN_REDUCTION+197, // "h"
453, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
804, // "g"
MIN_REDUCTION+197, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+197, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+197, // {"A".."F"}
MIN_REDUCTION+197, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 734
-1, // $$start
-1, // start
557, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+167, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+167, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+167, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+167, // "u"
582, // "p"
MIN_REDUCTION+167, // "h"
453, // "v"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
804, // "g"
MIN_REDUCTION+167, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+167, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+167, // {"A".."F"}
MIN_REDUCTION+167, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 735
104,991, // "i"
  }
,
{ // state 736
99,387, // "s"
  }
,
{ // state 737
99,1027, // "s"
  }
,
{ // state 738
0x80000000|815, // match move
0x80000000|707, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 739
104,1012, // "i"
  }
,
{ // state 740
101,1024, // "t"
  }
,
{ // state 741
0x80000000|1216, // match move
0x80000000|231, // no-match move
0x80000000|648, // NT-test-match state for printable
  }
,
{ // state 742
0x80000000|822, // match move
0x80000000|375, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 743
2,1174, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 744
91,982, // "e"
  }
,
{ // state 745
0x80000000|424, // match move
0x80000000|1078, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 746
160,364, // eol
161,629, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 747
88,1114, // "b"
  }
,
{ // state 748
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+181, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 749
0x80000000|1180, // match move
0x80000000|426, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 750
0x80000000|164, // match move
0x80000000|550, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 751
0x80000000|155, // match move
0x80000000|644, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 752
0x80000000|181, // match move
0x80000000|952, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 753
0x80000000|2, // match move
0x80000000|734, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 754
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 755
-1, // $$start
-1, // start
706, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 756
91,1116, // "e"
  }
,
{ // state 757
0x80000000|853, // match move
0x80000000|116, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 758
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 759
4,287, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
  }
,
{ // state 760
160,364, // eol
161,629, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 761
-1, // $$start
-1, // start
870, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+131, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+131, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+131, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+131, // "u"
582, // "p"
MIN_REDUCTION+131, // "h"
453, // "v"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
804, // "g"
MIN_REDUCTION+131, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+131, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+131, // {"A".."F"}
MIN_REDUCTION+131, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 762
-1, // $$start
-1, // start
862, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 763
0x80000000|2, // match move
0x80000000|720, // no-match move
// T-test match for {"*" "/"}:
120,
125,
  }
,
{ // state 764
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 765
93,922, // "n"
  }
,
{ // state 766
-1, // $$start
-1, // start
688, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+92, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+92, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+92, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+92, // "u"
582, // "p"
MIN_REDUCTION+92, // "h"
453, // "v"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
804, // "g"
MIN_REDUCTION+92, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+92, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+92, // {"A".."F"}
MIN_REDUCTION+92, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 767
143,1091, // "'"
  }
,
{ // state 768
0x80000000|1074, // match move
0x80000000|79, // no-match move
// T-test match for 10:
165,
  }
,
{ // state 769
0x80000000|1188, // match move
0x80000000|403, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 770
160,364, // eol
161,629, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 771
0x80000000|891, // match move
0x80000000|750, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 772
174,MIN_REDUCTION+192, // $NT
  }
,
{ // state 773
160,364, // eol
161,629, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 774
90,495, // "l"
  }
,
{ // state 775
2,862, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 776
0x80000000|775, // match move
0x80000000|762, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 777
101,527, // "t"
  }
,
{ // state 778
0x80000000|1203, // match move
0x80000000|946, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 779
174,MIN_REDUCTION+318, // $NT
  }
,
{ // state 780
174,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 781
0x80000000|186, // match move
0x80000000|385, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 782
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+299, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 783
0x80000000|984, // match move
0x80000000|58, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 784
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+205, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 785
97,700, // "k"
  }
,
{ // state 786
93,689, // "n"
  }
,
{ // state 787
-1, // $$start
-1, // start
1174, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
-1, // `=
-1, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
MIN_REDUCTION+278, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 788
0x80000000|1168, // match move
0x80000000|384, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 789
0x80000000|2, // match move
0x80000000|1029, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 790
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 791
174,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 792
1,680, // start
2,171, // ws*
3,628, // $$0
4,458, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
88,1032, // "b"
90,27, // "l"
91,1035, // "e"
92,113, // "a"
93,288, // "n"
96,396, // "r"
98,19, // "c"
99,670, // "s"
101,534, // "t"
102,267, // "d"
103,719, // "f"
104,205, // "i"
105,847, // "w"
107,582, // "p"
109,453, // "v"
112,804, // "g"
167,965, // token*
173,MIN_REDUCTION+1, // $
  }
,
{ // state 793
101,986, // "t"
105,904, // "w"
106,810, // "u"
108,97, // "h"
110,542, // "y"
  }
,
{ // state 794
160,364, // eol
161,629, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 795
0x80000000|633, // match move
0x80000000|323, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 796
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 797
0x80000000|1124, // match move
0x80000000|489, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 798
2,797, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 799
174,MIN_REDUCTION+189, // $NT
  }
,
{ // state 800
2,929, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 802
0x80000000|743, // match move
0x80000000|787, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 803
108,684, // "h"
  }
,
{ // state 804
89,1166, // "o"
  }
,
{ // state 805
0x80000000|794, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 806
0x80000000|487, // match move
0x80000000|796, // no-match move
0x80000000|26, // NT-test-match state for digit
  }
,
{ // state 807
0x80000000|539, // match move
0x80000000|368, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 808
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 810
107,1165, // "p"
  }
,
{ // state 811
99,1153, // "s"
  }
,
{ // state 812
174,MIN_REDUCTION+168, // $NT
  }
,
{ // state 813
-1, // $$start
-1, // start
3, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 814
140,464, // "0"
144,464, // {"1".."9"}
156,806, // digit
  }
,
{ // state 815
2,150, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 816
-1, // $$start
-1, // start
783, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+152, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+152, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+152, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+152, // "u"
582, // "p"
MIN_REDUCTION+152, // "h"
453, // "v"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
804, // "g"
MIN_REDUCTION+152, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+152, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+152, // {"A".."F"}
MIN_REDUCTION+152, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 817
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 818
0x80000000|1014, // match move
0x80000000|457, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 819
0x80000000|1161, // match move
0x80000000|1183, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 820
0x80000000|614, // match move
0x80000000|569, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 821
160,364, // eol
161,629, // ws
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 822
2,40, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 823
174,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 824
92,505, // "a"
  }
,
{ // state 825
0x80000000|168, // match move
0x80000000|188, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 826
98,664, // "c"
  }
,
{ // state 827
101,1145, // "t"
  }
,
{ // state 828
0x80000000|404, // match move
0x80000000|1198, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 829
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 830
0x80000000|798, // match move
0x80000000|447, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 831
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 832
2,309, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 833
0x80000000|2, // match move
0x80000000|618, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 834
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 835
150,758, // '"'
153,125, // stringLit2**
172,615, // stringLit2*
  }
,
{ // state 836
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 837
0x80000000|1004, // match move
0x80000000|522, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 838
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 839
93,212, // "n"
  }
,
{ // state 840
-1, // $$start
-1, // start
22, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+206, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+206, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+206, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+206, // "u"
582, // "p"
MIN_REDUCTION+206, // "h"
453, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
804, // "g"
MIN_REDUCTION+206, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+206, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+206, // {"A".."F"}
MIN_REDUCTION+206, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 841
0x80000000|934, // match move
0x80000000|258, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 842
0x80000000|859, // match move
0x80000000|437, // no-match move
// T-test match for "+":
121,
  }
,
{ // state 843
0x80000000|2, // match move
0x80000000|637, // no-match move
// T-test match for "/":
125,
  }
,
{ // state 844
0x80000000|189, // match move
0x80000000|365, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 845
0x80000000|536, // match move
0x80000000|94, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 846
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 847
108,1220, // "h"
  }
,
{ // state 848
174,MIN_REDUCTION+141, // $NT
  }
,
{ // state 849
0x80000000|2, // match move
0x80000000|669, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 850
0x80000000|1050, // match move
0x80000000|1080, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 851
91,551, // "e"
  }
,
{ // state 852
MIN_REDUCTION+322, // (default reduction)
  }
,
{ // state 853
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 854
91,627, // "e"
  }
,
{ // state 855
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 856
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 857
0x80000000|2, // match move
0x80000000|951, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 858
0x80000000|219, // match move
0x80000000|781, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 859
121,1097, // "+"
  }
,
{ // state 860
-1, // $$start
-1, // start
359, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+233, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+233, // "k"
19, // "c"
682, // "s"
MIN_REDUCTION+233, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+233, // "u"
582, // "p"
MIN_REDUCTION+233, // "h"
453, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
804, // "g"
MIN_REDUCTION+233, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+233, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+233, // {"A".."F"}
MIN_REDUCTION+233, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 861
174,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 862
0x80000000|1062, // match move
0x80000000|730, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 863
-1, // $$start
-1, // start
272, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 864
160,364, // eol
161,629, // ws
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 865
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 866
0x80000000|861, // match move
0x80000000|242, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 867
174,MIN_REDUCTION+126, // $NT
  }
,
{ // state 868
0x80000000|184, // match move
0x80000000|1052, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 869
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 870
0x80000000|423, // match move
0x80000000|819, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 871
99,530, // "s"
  }
,
{ // state 872
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 873
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 874
106,1191, // "u"
  }
,
{ // state 875
174,MIN_REDUCTION+171, // $NT
  }
,
{ // state 876
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 877
174,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 878
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 879
106,1186, // "u"
  }
,
{ // state 880
115,738, // "="
  }
,
{ // state 881
2,651, // ws*
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 882
0x80000000|303, // match move
0x80000000|39, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 883
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 884
88,767, // "b"
89,767, // "o"
90,767, // "l"
91,767, // "e"
92,767, // "a"
93,767, // "n"
96,767, // "r"
97,767, // "k"
98,767, // "c"
99,767, // "s"
100,767, // "x"
101,767, // "t"
102,767, // "d"
103,767, // "f"
104,767, // "i"
105,767, // "w"
106,767, // "u"
107,767, // "p"
108,767, // "h"
109,767, // "v"
110,767, // "y"
111,767, // "m"
112,767, // "g"
113,767, // "z"
114,767, // "!"
115,767, // "="
116,767, // "%"
117,767, // "&"
118,767, // "("
119,767, // ")"
120,767, // "*"
121,767, // "+"
122,767, // ","
123,767, // "-"
124,767, // "."
125,767, // "/"
126,767, // ";"
127,767, // "<"
128,767, // ">"
129,767, // "["
130,767, // "]"
131,767, // "{"
132,767, // "|"
133,767, // "}"
140,767, // "0"
144,767, // {"1".."9"}
145,767, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,767, // " "
147,767, // "_"
148,767, // {"A".."F"}
149,767, // {"G".."Z" "j" "q"}
150,767, // '"'
  }
,
{ // state 885
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 886
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 887
-1, // $$start
-1, // start
638, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+101, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+101, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+101, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+101, // "u"
582, // "p"
MIN_REDUCTION+101, // "h"
453, // "v"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
804, // "g"
MIN_REDUCTION+101, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+101, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+101, // {"A".."F"}
MIN_REDUCTION+101, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 888
0x80000000|1098, // match move
0x80000000|221, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 889
90,105, // "l"
  }
,
{ // state 890
-1, // $$start
-1, // start
1011, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
-1, // `=
-1, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
MIN_REDUCTION+248, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 891
115,910, // "="
  }
,
{ // state 892
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 893
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 894
174,MIN_REDUCTION+322, // $NT
  }
,
{ // state 895
91,49, // "e"
  }
,
{ // state 896
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 897
0x80000000|402, // match move
0x80000000|344, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 898
0x80000000|490, // match move
0x80000000|742, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 899
2,455, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 900
174,MIN_REDUCTION+123, // $NT
  }
,
{ // state 901
0x80000000|2, // match move
0x80000000|958, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 902
160,364, // eol
161,629, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 903
99,1083, // "s"
  }
,
{ // state 904
104,25, // "i"
  }
,
{ // state 905
0x80000000|2, // match move
0x80000000|254, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 906
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+133, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 907
0x80000000|792, // match move
0x80000000|484, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 908
0x80000000|832, // match move
0x80000000|373, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 909
0x80000000|2, // match move
0x80000000|1121, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 910
0x80000000|585, // match move
0x80000000|327, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 911
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 912
2,318, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 913
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+232, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 914
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 915
0x80000000|899, // match move
0x80000000|639, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 916
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 917
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 918
92,621, // "a"
106,851, // "u"
110,833, // "y"
  }
,
{ // state 919
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 920
174,MIN_REDUCTION+328, // $NT
  }
,
{ // state 921
4,287, // token
58,754, // `!
59,725, // `!=
60,1058, // `%
61,731, // `&&
62,93, // `*
63,855, // `(
64,588, // `)
65,683, // `{
66,873, // `}
67,59, // `-
68,510, // `+
69,893, // `=
70,1026, // `==
71,340, // `[
72,431, // `]
73,717, // `||
74,704, // `<
75,360, // `<=
76,817, // `,
77,409, // `>
78,172, // `>=
79,443, // `.
80,311, // `;
81,45, // `++
82,576, // `--
83,330, // `/
84,222, // ID
85,412, // INTLIT
86,568, // STRINGLIT
87,1077, // CHARLIT
134,925, // id2
135,888, // intLit2
136,179, // charLit2
137,924, // stringLit3
138,897, // letter
140,1200, // "0"
  }
,
{ // state 922
0x80000000|2, // match move
0x80000000|1175, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 923
2,837, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 924
0x80000000|1205, // match move
0x80000000|112, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 925
0x80000000|643, // match move
0x80000000|882, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 926
0x80000000|978, // match move
0x80000000|1132, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 927
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+190, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 928
0x80000000|1030, // match move
0x80000000|264, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 929
0x80000000|679, // match move
0x80000000|525, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 930
0x80000000|998, // match move
0x80000000|727, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 931
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 932
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 933
174,MIN_REDUCTION+96, // $NT
  }
,
{ // state 934
160,364, // eol
161,629, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 935
174,MIN_REDUCTION+183, // $NT
  }
,
{ // state 936
0x80000000|609, // match move
0x80000000|1043, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 937
0x80000000|1202, // match move
0x80000000|705, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 938
-1, // $$start
-1, // start
290, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+113, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+113, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+113, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+113, // "u"
582, // "p"
MIN_REDUCTION+113, // "h"
453, // "v"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
804, // "g"
MIN_REDUCTION+113, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+113, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+113, // {"A".."F"}
MIN_REDUCTION+113, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 939
174,MIN_REDUCTION+316, // $NT
  }
,
{ // state 940
160,364, // eol
161,629, // ws
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 941
174,MIN_REDUCTION+210, // $NT
  }
,
{ // state 942
174,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 943
0x80000000|14, // match move
0x80000000|728, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 944
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 945
97,606, // "k"
  }
,
{ // state 946
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 947
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+172, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 948
0x80000000|2, // match move
0x80000000|1044, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 949
96,32, // "r"
  }
,
{ // state 950
89,561, // "o"
  }
,
{ // state 951
-1, // $$start
-1, // start
1007, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+191, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+191, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+191, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+191, // "u"
582, // "p"
MIN_REDUCTION+191, // "h"
453, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
804, // "g"
MIN_REDUCTION+191, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+191, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+191, // {"A".."F"}
MIN_REDUCTION+191, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 952
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 953
160,364, // eol
161,629, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 954
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 955
98,849, // "c"
  }
,
{ // state 956
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 957
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 958
-1, // $$start
-1, // start
491, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+164, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+164, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+164, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+164, // "u"
582, // "p"
MIN_REDUCTION+164, // "h"
453, // "v"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
804, // "g"
MIN_REDUCTION+164, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+164, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+164, // {"A".."F"}
MIN_REDUCTION+164, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 959
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 960
101,1170, // "t"
  }
,
{ // state 961
160,364, // eol
161,629, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 962
96,356, // "r"
  }
,
{ // state 963
-1, // $$start
-1, // start
825, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 964
174,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 965
0x80000000|1013, // match move
0x80000000|749, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 966
102,247, // "d"
  }
,
{ // state 967
0x80000000|2, // match move
0x80000000|887, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 968
0x80000000|674, // match move
0x80000000|850, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 969
132,413, // "|"
  }
,
{ // state 970
98,104, // "c"
  }
,
{ // state 971
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 972
96,901, // "r"
  }
,
{ // state 973
91,716, // "e"
  }
,
{ // state 974
0x80000000|420, // match move
0x80000000|1159, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 975
88,214, // "b"
89,214, // "o"
90,214, // "l"
91,214, // "e"
92,214, // "a"
93,214, // "n"
96,214, // "r"
97,214, // "k"
98,214, // "c"
99,214, // "s"
100,214, // "x"
101,214, // "t"
102,214, // "d"
103,214, // "f"
104,214, // "i"
105,214, // "w"
106,214, // "u"
107,214, // "p"
108,214, // "h"
109,214, // "v"
110,214, // "y"
111,214, // "m"
112,214, // "g"
113,214, // "z"
114,214, // "!"
115,214, // "="
116,214, // "%"
117,214, // "&"
118,214, // "("
119,214, // ")"
120,214, // "*"
121,214, // "+"
122,214, // ","
123,214, // "-"
124,214, // "."
125,214, // "/"
126,214, // ";"
127,214, // "<"
128,214, // ">"
129,214, // "["
130,214, // "]"
131,214, // "{"
132,214, // "|"
133,214, // "}"
140,214, // "0"
143,214, // "'"
144,214, // {"1".."9"}
145,214, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,214, // " "
147,214, // "_"
148,214, // {"A".."F"}
149,214, // {"G".."Z" "j" "q"}
151,234, // stringLit2
152,249, // stringPrintable
154,214, // "\"
  }
,
{ // state 976
88,28, // "b"
89,28, // "o"
90,28, // "l"
91,28, // "e"
92,28, // "a"
93,28, // "n"
96,28, // "r"
97,28, // "k"
98,28, // "c"
99,28, // "s"
100,28, // "x"
101,28, // "t"
102,28, // "d"
103,28, // "f"
104,28, // "i"
105,28, // "w"
106,28, // "u"
107,28, // "p"
108,28, // "h"
109,28, // "v"
110,28, // "y"
111,28, // "m"
112,28, // "g"
113,28, // "z"
114,28, // "!"
115,28, // "="
116,28, // "%"
117,28, // "&"
118,28, // "("
119,28, // ")"
120,433, // "*"
121,28, // "+"
122,28, // ","
123,28, // "-"
124,28, // "."
125,28, // "/"
126,28, // ";"
127,28, // "<"
128,28, // ">"
129,28, // "["
130,28, // "]"
131,28, // "{"
132,28, // "|"
133,28, // "}"
140,28, // "0"
143,28, // "'"
144,28, // {"1".."9"}
145,28, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,28, // " "
147,28, // "_"
148,28, // {"A".."F"}
149,28, // {"G".."Z" "j" "q"}
150,28, // '"'
154,28, // "\"
158,1130, // withoutStar
160,920, // eol
165,602, // {10}
166,454, // {13}
  }
,
{ // state 977
160,364, // eol
161,629, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 978
88,193, // "b"
89,193, // "o"
90,193, // "l"
91,193, // "e"
92,193, // "a"
93,193, // "n"
96,193, // "r"
97,193, // "k"
98,193, // "c"
99,193, // "s"
100,193, // "x"
101,193, // "t"
102,193, // "d"
103,193, // "f"
104,193, // "i"
105,193, // "w"
106,193, // "u"
107,193, // "p"
108,193, // "h"
109,193, // "v"
110,193, // "y"
111,193, // "m"
112,193, // "g"
113,193, // "z"
114,193, // "!"
115,193, // "="
116,193, // "%"
117,193, // "&"
118,193, // "("
119,193, // ")"
120,843, // "*"
121,193, // "+"
122,193, // ","
123,193, // "-"
124,193, // "."
125,193, // "/"
126,193, // ";"
127,193, // "<"
128,193, // ">"
129,193, // "["
130,193, // "]"
131,193, // "{"
132,193, // "|"
133,193, // "}"
140,193, // "0"
143,193, // "'"
144,193, // {"1".."9"}
145,193, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,193, // " "
147,193, // "_"
148,193, // {"A".."F"}
149,193, // {"G".."Z" "j" "q"}
150,193, // '"'
154,193, // "\"
158,55, // withoutStar
159,1211, // commentChar
160,1048, // eol
165,128, // {10}
166,768, // {13}
  }
,
{ // state 979
88,741, // "b"
89,741, // "o"
90,741, // "l"
91,741, // "e"
92,741, // "a"
93,741, // "n"
96,741, // "r"
97,741, // "k"
98,741, // "c"
99,741, // "s"
100,741, // "x"
101,741, // "t"
102,741, // "d"
103,741, // "f"
104,741, // "i"
105,741, // "w"
106,741, // "u"
107,741, // "p"
108,741, // "h"
109,741, // "v"
110,741, // "y"
111,741, // "m"
112,741, // "g"
113,741, // "z"
114,741, // "!"
115,741, // "="
116,741, // "%"
117,741, // "&"
118,741, // "("
119,741, // ")"
120,741, // "*"
121,741, // "+"
122,741, // ","
123,741, // "-"
124,741, // "."
125,741, // "/"
126,741, // ";"
127,741, // "<"
128,741, // ">"
129,741, // "["
130,741, // "]"
131,741, // "{"
132,741, // "|"
133,741, // "}"
140,741, // "0"
143,741, // "'"
144,741, // {"1".."9"}
145,741, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,741, // " "
147,741, // "_"
148,741, // {"A".."F"}
149,741, // {"G".."Z" "j" "q"}
150,741, // '"'
154,741, // "\"
155,1054, // printable
163,622, // printable**
168,498, // printable*
  }
,
{ // state 980
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 981
89,165, // "o"
90,1049, // "l"
  }
,
{ // state 982
0x80000000|2, // match move
0x80000000|178, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 983
174,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 984
160,364, // eol
161,629, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 985
0x80000000|34, // match move
0x80000000|363, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 986
92,169, // "a"
96,65, // "r"
  }
,
{ // state 987
160,364, // eol
161,629, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 988
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 989
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 990
0x80000000|2, // match move
0x80000000|1070, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 991
113,82, // "z"
  }
,
{ // state 992
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+217, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 993
109,1128, // "v"
  }
,
{ // state 994
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 995
0x80000000|83, // match move
0x80000000|1063, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 996
96,81, // "r"
  }
,
{ // state 997
174,MIN_REDUCTION+108, // $NT
  }
,
{ // state 998
90,227, // "l"
  }
,
{ // state 999
174,MIN_REDUCTION+317, // $NT
  }
,
{ // state 1000
0x80000000|334, // match move
0x80000000|619, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1001
0x80000000|1041, // match move
0x80000000|1149, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1002
0x80000000|1173, // match move
0x80000000|1212, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1003
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+229, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1004
160,364, // eol
161,629, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1005
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1007
0x80000000|770, // match move
0x80000000|130, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1008
91,91, // "e"
  }
,
{ // state 1009
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+163, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1010
0x80000000|1060, // match move
0x80000000|460, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1011
0x80000000|760, // match move
0x80000000|1213, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1012
90,174, // "l"
  }
,
{ // state 1013
0x80000000|759, // match move
0x80000000|921, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1014
2,795, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1015
104,25, // "i"
108,1220, // "h"
  }
,
{ // state 1016
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1017
90,736, // "l"
  }
,
{ // state 1018
174,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1019
174,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1020
160,364, // eol
161,629, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1021
2,665, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1022
2,788, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1023
0x80000000|1147, // match move
0x80000000|1006, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1024
91,990, // "e"
  }
,
{ // state 1025
0x80000000|2, // match move
0x80000000|938, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1026
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1027
91,90, // "e"
  }
,
{ // state 1028
103,119, // "f"
  }
,
{ // state 1029
-1, // $$start
-1, // start
555, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+170, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+170, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+170, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+170, // "u"
582, // "p"
MIN_REDUCTION+170, // "h"
453, // "v"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
804, // "g"
MIN_REDUCTION+170, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+170, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+170, // {"A".."F"}
MIN_REDUCTION+170, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 1030
160,364, // eol
161,629, // ws
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1031
-1, // $$start
-1, // start
-1, // ws*
1089, // $$0
458, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
965, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1032
89,699, // "o"
96,372, // "r"
110,406, // "y"
  }
,
{ // state 1033
101,857, // "t"
  }
,
{ // state 1034
174,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1035
90,871, // "l"
93,874, // "n"
100,642, // "x"
  }
,
{ // state 1036
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1037
174,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1038
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1039
0x80000000|646, // match move
0x80000000|157, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1040
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 1041
115,533, // "="
  }
,
{ // state 1042
2,631, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1043
0x80000000|1085, // match move
0x80000000|448, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1044
-1, // $$start
-1, // start
492, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+158, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+158, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+158, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+158, // "u"
582, // "p"
MIN_REDUCTION+158, // "h"
453, // "v"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
804, // "g"
MIN_REDUCTION+158, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+158, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+158, // {"A".."F"}
MIN_REDUCTION+158, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 1045
174,MIN_REDUCTION+195, // $NT
  }
,
{ // state 1046
0x80000000|1005, // match move
0x80000000|959, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1047
174,MIN_REDUCTION+177, // $NT
  }
,
{ // state 1048
0x80000000|687, // match move
0x80000000|1219, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 1049
91,603, // "e"
  }
,
{ // state 1050
174,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1051
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 1052
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+175, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 1053
0x80000000|362, // match move
0x80000000|586, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1054
0x80000000|463, // match move
0x80000000|161, // no-match move
0x80000000|648, // NT-test-match state for printable
  }
,
{ // state 1055
174,MIN_REDUCTION+138, // $NT
  }
,
{ // state 1056
0x80000000|1187, // match move
0x80000000|244, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1057
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+241, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 1058
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1059
160,364, // eol
161,629, // ws
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1060
2,272, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1061
0x80000000|1042, // match move
0x80000000|268, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1062
160,364, // eol
161,629, // ws
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1063
3,1089, // $$0
4,458, // token
58,754, // `!
59,725, // `!=
60,1058, // `%
61,731, // `&&
62,93, // `*
63,855, // `(
64,588, // `)
65,683, // `{
66,873, // `}
67,59, // `-
68,510, // `+
69,893, // `=
70,1026, // `==
71,340, // `[
72,431, // `]
73,717, // `||
74,704, // `<
75,360, // `<=
76,817, // `,
77,409, // `>
78,172, // `>=
79,443, // `.
80,311, // `;
81,45, // `++
82,576, // `--
83,330, // `/
84,222, // ID
85,412, // INTLIT
86,568, // STRINGLIT
87,1077, // CHARLIT
134,925, // id2
135,888, // intLit2
136,179, // charLit2
137,924, // stringLit3
138,897, // letter
140,1200, // "0"
160,364, // eol
161,629, // ws
167,965, // token*
  }
,
{ // state 1064
-1, // $$start
-1, // start
477, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
-1, // `=
-1, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
MIN_REDUCTION+282, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 1065
0x80000000|903, // match move
0x80000000|860, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1066
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 1067
-1, // $$start
-1, // start
16, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+218, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+218, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+218, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+218, // "u"
582, // "p"
MIN_REDUCTION+218, // "h"
453, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
804, // "g"
MIN_REDUCTION+218, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+218, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+218, // {"A".."F"}
MIN_REDUCTION+218, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 1068
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1069
2,1011, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1070
-1, // $$start
-1, // start
255, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+215, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+215, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+215, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+215, // "u"
582, // "p"
MIN_REDUCTION+215, // "h"
453, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
804, // "g"
MIN_REDUCTION+215, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+215, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+215, // {"A".."F"}
MIN_REDUCTION+215, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1071
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1072
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 1073
88,417, // "b"
89,417, // "o"
90,417, // "l"
91,417, // "e"
92,417, // "a"
93,417, // "n"
96,417, // "r"
97,417, // "k"
98,417, // "c"
99,417, // "s"
100,417, // "x"
101,417, // "t"
102,417, // "d"
103,417, // "f"
104,417, // "i"
105,417, // "w"
106,417, // "u"
107,417, // "p"
108,417, // "h"
109,417, // "v"
110,417, // "y"
111,417, // "m"
112,417, // "g"
113,417, // "z"
138,779, // letter
140,282, // "0"
144,282, // {"1".."9"}
147,591, // "_"
148,417, // {"A".."F"}
149,417, // {"G".."Z" "j" "q"}
156,524, // digit
  }
,
{ // state 1074
165,237, // {10}
  }
,
{ // state 1075
0x80000000|499, // match move
0x80000000|241, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1076
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 1077
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1078
0x80000000|1139, // match move
0x80000000|1197, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1079
0x80000000|511, // match move
0x80000000|553, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1080
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+244, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 1081
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1082
0x80000000|101, // match move
0x80000000|1102, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1083
0x80000000|2, // match move
0x80000000|1178, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1084
-1, // $$start
-1, // start
1179, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+104, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+104, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+104, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+104, // "u"
582, // "p"
MIN_REDUCTION+104, // "h"
453, // "v"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
804, // "g"
MIN_REDUCTION+104, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+104, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+104, // {"A".."F"}
MIN_REDUCTION+104, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 1085
2,702, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1086
2,837, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1087
93,566, // "n"
  }
,
{ // state 1088
120,56, // "*"
125,545, // "/"
  }
,
{ // state 1089
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1090
-1, // $$start
-1, // start
715, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 1091
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1092
174,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 1093
0x80000000|208, // match move
0x80000000|607, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1094
174,MIN_REDUCTION+243, // $NT
  }
,
{ // state 1095
96,950, // "r"
104,811, // "i"
  }
,
{ // state 1096
160,364, // eol
161,629, // ws
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1097
0x80000000|601, // match move
0x80000000|937, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1098
2,665, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1099
0x80000000|2, // match move
0x80000000|1084, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1100
174,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1101
0x80000000|2, // match move
0x80000000|1196, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1102
-1, // $$start
-1, // start
613, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 1103
0x80000000|269, // match move
0x80000000|620, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1104
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1105
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+160, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 1106
0x80000000|540, // match move
0x80000000|635, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1107
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 1108
174,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1109
174,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1110
96,765, // "r"
  }
,
{ // state 1111
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 1112
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+115, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 1113
174,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1114
90,1008, // "l"
  }
,
{ // state 1115
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1116
89,197, // "o"
  }
,
{ // state 1117
0x80000000|942, // match move
0x80000000|1143, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1118
88,894, // "b"
91,894, // "e"
92,894, // "a"
98,894, // "c"
102,894, // "d"
103,894, // "f"
140,282, // "0"
144,282, // {"1".."9"}
148,894, // {"A".."F"}
156,660, // digit
  }
,
{ // state 1119
0x80000000|923, // match move
0x80000000|632, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1120
174,MIN_REDUCTION+329, // $NT
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1121
-1, // $$start
-1, // start
1199, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+161, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+161, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+161, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+161, // "u"
582, // "p"
MIN_REDUCTION+161, // "h"
453, // "v"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
804, // "g"
MIN_REDUCTION+161, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+161, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+161, // {"A".."F"}
MIN_REDUCTION+161, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 1122
0x80000000|95, // match move
0x80000000|732, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1123
174,MIN_REDUCTION+153, // $NT
  }
,
{ // state 1124
160,364, // eol
161,629, // ws
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1125
0x80000000|1019, // match move
0x80000000|906, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1126
0x80000000|158, // match move
0x80000000|176, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1127
101,565, // "t"
  }
,
{ // state 1128
91,123, // "e"
  }
,
{ // state 1129
104,786, // "i"
  }
,
{ // state 1130
174,MIN_REDUCTION+326, // $NT
  }
,
{ // state 1131
160,364, // eol
161,629, // ws
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1132
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1133
0x80000000|800, // match move
0x80000000|152, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1134
2,795, // ws*
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1135
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1136
0x80000000|9, // match move
0x80000000|721, // no-match move
0x80000000|1118, // NT-test-match state for hex
  }
,
{ // state 1137
0x80000000|2, // match move
0x80000000|581, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1138
160,364, // eol
161,629, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 1139
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1140
0x80000000|1034, // match move
0x80000000|992, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1141
0x80000000|72, // match move
0x80000000|722, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1142
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+220, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 1143
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 1144
0x80000000|953, // match move
0x80000000|6, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1145
92,277, // "a"
  }
,
{ // state 1146
0x80000000|289, // match move
0x80000000|416, // no-match move
// T-test match for "-":
123,
  }
,
{ // state 1147
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 1148
160,364, // eol
161,629, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1149
0x80000000|1069, // match move
0x80000000|441, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1150
90,35, // "l"
104,966, // "i"
  }
,
{ // state 1151
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 1152
174,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1153
0x80000000|2, // match move
0x80000000|672, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1154
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+169, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
  }
,
{ // state 1155
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 1156
174,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1157
2,745, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1158
0x80000000|1184, // match move
0x80000000|376, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1159
0x80000000|103, // match move
0x80000000|434, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1160
88,741, // "b"
89,741, // "o"
90,741, // "l"
91,741, // "e"
92,741, // "a"
93,741, // "n"
96,741, // "r"
97,741, // "k"
98,741, // "c"
99,741, // "s"
100,741, // "x"
101,741, // "t"
102,741, // "d"
103,741, // "f"
104,741, // "i"
105,741, // "w"
106,741, // "u"
107,741, // "p"
108,741, // "h"
109,741, // "v"
110,741, // "y"
111,741, // "m"
112,741, // "g"
113,741, // "z"
114,741, // "!"
115,741, // "="
116,741, // "%"
117,741, // "&"
118,741, // "("
119,741, // ")"
120,741, // "*"
121,741, // "+"
122,741, // ","
123,741, // "-"
124,741, // "."
125,741, // "/"
126,741, // ";"
127,741, // "<"
128,741, // ">"
129,741, // "["
130,741, // "]"
131,741, // "{"
132,741, // "|"
133,741, // "}"
140,741, // "0"
143,741, // "'"
144,741, // {"1".."9"}
145,741, // {"#".."$" ":" "?".."@" "^" "`" "~"}
146,741, // " "
147,741, // "_"
148,741, // {"A".."F"}
149,741, // {"G".."Z" "j" "q"}
150,741, // '"'
154,741, // "\"
155,41, // printable
  }
,
{ // state 1161
174,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1162
0x80000000|149, // match move
0x80000000|1141, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1163
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1165
91,962, // "e"
  }
,
{ // state 1166
101,292, // "t"
  }
,
{ // state 1167
160,364, // eol
161,629, // ws
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1168
160,364, // eol
161,629, // ws
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 1169
0x80000000|320, // match move
0x80000000|209, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1170
99,645, // "s"
  }
,
{ // state 1171
0x80000000|2, // match move
0x80000000|1067, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1172
174,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1173
174,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1174
0x80000000|1131, // match move
0x80000000|807, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1175
-1, // $$start
-1, // start
805, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+128, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+128, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+128, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+128, // "u"
582, // "p"
MIN_REDUCTION+128, // "h"
453, // "v"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
804, // "g"
MIN_REDUCTION+128, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+128, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+128, // {"A".."F"}
MIN_REDUCTION+128, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1176
174,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 1177
0x80000000|1156, // match move
0x80000000|1105, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1178
-1, // $$start
-1, // start
1222, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+236, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+236, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+236, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+236, // "u"
582, // "p"
MIN_REDUCTION+236, // "h"
453, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
804, // "g"
MIN_REDUCTION+236, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+236, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+236, // {"A".."F"}
MIN_REDUCTION+236, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1179
0x80000000|961, // match move
0x80000000|537, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1180
4,287, // token
5,885, // `boolean
6,829, // `class
7,305, // `extends
8,476, // `void
9,886, // `int
10,462, // `while
11,649, // `if
12,914, // `else
13,488, // `for
14,265, // `break
15,1182, // `this
16,331, // `false
17,506, // `true
18,1204, // `super
19,971, // `null
20,954, // `return
21,238, // `instanceof
22,917, // `new
23,1135, // `abstract
24,808, // `assert
25,831, // `byte
26,944, // `case
27,612, // `catch
28,84, // `char
29,494, // `const
30,109, // `continue
31,399, // `default
32,657, // `do
33,932, // `double
34,162, // `enum
35,381, // `final
36,1104, // `finally
37,1068, // `float
38,1155, // `goto
39,919, // `implements
40,980, // `import
41,1164, // `interface
42,61, // `long
43,156, // `native
44,662, // `package
45,709, // `private
46,865, // `protected
47,240, // `public
48,1, // `short
49,956, // `static
50,1071, // `strictfp
51,535, // `switch
52,838, // `synchronized
53,856, // `throw
54,466, // `throws
55,47, // `transient
56,876, // `try
57,485, // `volatile
88,1032, // "b"
90,27, // "l"
91,1035, // "e"
92,113, // "a"
93,288, // "n"
96,396, // "r"
98,19, // "c"
99,670, // "s"
101,534, // "t"
102,267, // "d"
103,719, // "f"
104,205, // "i"
105,847, // "w"
107,582, // "p"
109,453, // "v"
112,804, // "g"
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 1181
92,578, // "a"
  }
,
{ // state 1182
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1183
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 1184
2,131, // ws*
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1185
0x80000000|87, // match move
0x80000000|830, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1186
90,239, // "l"
  }
,
{ // state 1187
106,747, // "u"
  }
,
{ // state 1188
160,364, // eol
161,629, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1189
174,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1190
0x80000000|2, // match move
0x80000000|647, // no-match move
0x80000000|1073, // NT-test-match state for idChar
  }
,
{ // state 1191
111,229, // "m"
  }
,
{ // state 1192
174,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1193
174,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1194
0x80000000|869, // match move
0x80000000|245, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1195
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+208, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 1196
-1, // $$start
-1, // start
519, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+239, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+239, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+239, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+239, // "u"
582, // "p"
MIN_REDUCTION+239, // "h"
453, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
804, // "g"
MIN_REDUCTION+239, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+239, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+239, // {"A".."F"}
MIN_REDUCTION+239, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 1197
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 1198
0x80000000|1172, // match move
0x80000000|1208, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1199
0x80000000|75, // match move
0x80000000|1177, // no-match move
// T-test match for "0":
140,
  }
,
{ // state 1200
100,419, // "x"
140,464, // "0"
141,872, // digit++
144,464, // {"1".."9"}
156,29, // digit
171,8, // digit+
  }
,
{ // state 1201
163,622, // printable**
168,498, // printable*
174,MIN_REDUCTION+332, // $NT
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 1202
2,845, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1203
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 1204
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1205
2,651, // ws*
160,364, // eol
161,469, // ws
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1206
99,15, // "s"
  }
,
{ // state 1207
160,364, // eol
161,629, // ws
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1208
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+109, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 1209
160,364, // eol
161,629, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1210
0x80000000|880, // match move
0x80000000|711, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1211
0x80000000|4, // match move
0x80000000|160, // no-match move
0x80000000|976, // NT-test-match state for commentChar
  }
,
{ // state 1212
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
222, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
134, // "b"
134, // "o"
134, // "l"
134, // "e"
134, // "a"
134, // "n"
-1, // idChar
-1, // reserved
134, // "r"
134, // "k"
134, // "c"
134, // "s"
134, // "x"
134, // "t"
134, // "d"
134, // "f"
134, // "i"
134, // "w"
134, // "u"
134, // "p"
134, // "h"
134, // "v"
134, // "y"
134, // "m"
134, // "g"
134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
925, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
897, // letter
-1, // idChar*
464, // "0"
809, // digit++
-1, // hex++
884, // "'"
464, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
134, // {"A".."F"}
134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
29, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
629, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
8, // digit+
-1, // stringLit2*
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 1213
0x80000000|836, // match move
0x80000000|286, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1214
160,364, // eol
161,629, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1215
0x80000000|118, // match move
0x80000000|675, // no-match move
0x80000000|724, // NT-test-match state for reserved
  }
,
{ // state 1216
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 1217
101,854, // "t"
  }
,
{ // state 1218
-1, // $$start
-1, // start
64, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
885, // `boolean
829, // `class
305, // `extends
476, // `void
886, // `int
462, // `while
649, // `if
914, // `else
488, // `for
265, // `break
1182, // `this
331, // `false
506, // `true
1204, // `super
971, // `null
954, // `return
238, // `instanceof
917, // `new
1135, // `abstract
808, // `assert
831, // `byte
944, // `case
612, // `catch
84, // `char
494, // `const
109, // `continue
399, // `default
657, // `do
932, // `double
162, // `enum
381, // `final
1104, // `finally
1068, // `float
1155, // `goto
919, // `implements
980, // `import
1164, // `interface
61, // `long
156, // `native
662, // `package
709, // `private
865, // `protected
240, // `public
1, // `short
956, // `static
1071, // `strictfp
535, // `switch
838, // `synchronized
856, // `throw
466, // `throws
47, // `transient
876, // `try
485, // `volatile
754, // `!
725, // `!=
1058, // `%
731, // `&&
93, // `*
855, // `(
588, // `)
683, // `{
873, // `}
59, // `-
510, // `+
893, // `=
1026, // `==
340, // `[
431, // `]
717, // `||
704, // `<
360, // `<=
817, // `,
409, // `>
172, // `>=
443, // `.
311, // `;
45, // `++
576, // `--
330, // `/
-1, // ID
412, // INTLIT
568, // STRINGLIT
1077, // CHARLIT
1032, // "b"
MIN_REDUCTION+134, // "o"
27, // "l"
1035, // "e"
113, // "a"
288, // "n"
-1, // idChar
-1, // reserved
396, // "r"
MIN_REDUCTION+134, // "k"
19, // "c"
670, // "s"
MIN_REDUCTION+134, // "x"
534, // "t"
267, // "d"
719, // "f"
205, // "i"
847, // "w"
MIN_REDUCTION+134, // "u"
582, // "p"
MIN_REDUCTION+134, // "h"
453, // "v"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
804, // "g"
MIN_REDUCTION+134, // "z"
1001, // "!"
771, // "="
818, // "%"
377, // "&"
1119, // "("
1185, // ")"
1126, // "*"
842, // "+"
936, // ","
1146, // "-"
357, // "."
69, // "/"
60, // ";"
1210, // "<"
173, // ">"
898, // "["
985, // "]"
713, // "{"
969, // "|"
626, // "}"
-1, // id2
888, // intLit2
179, // charLit2
924, // stringLit3
-1, // letter
-1, // idChar*
1200, // "0"
-1, // digit++
-1, // hex++
884, // "'"
MIN_REDUCTION+134, // {"1".."9"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
1120, // " "
-1, // "_"
MIN_REDUCTION+134, // {"A".."F"}
MIN_REDUCTION+134, // {"G".."Z" "j" "q"}
20, // '"'
-1, // stringLit2
-1, // stringPrintable
-1, // stringLit2**
-1, // "\"
-1, // printable
-1, // digit
-1, // hex
-1, // withoutStar
-1, // commentChar
364, // eol
469, // ws
1120, // {9 12}
-1, // printable**
-1, // commentChar**
602, // {10}
454, // {13}
-1, // token*
-1, // printable*
-1, // hex+
-1, // commentChar*
-1, // digit+
-1, // stringLit2*
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 1219
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 1220
104,153, // "i"
  }
,
{ // state 1221
125,228, // "/"
  }
,
{ // state 1222
0x80000000|10, // match move
0x80000000|321, // no-match move
// T-test match for "0":
140,
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1223][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(95<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(95<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(95<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(95<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(95<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(95<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(95<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(95<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(95<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(95<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(95<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(95<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(95<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(95<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(95<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(95<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(95<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(95<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(95<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(95<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(95<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(95<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(95<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(95<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(95<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(95<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(95<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(95<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(95<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(95<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(95<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(95<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(95<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(95<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(95<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(95<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(95<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(95<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(95<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(95<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(95<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(95<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(95<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(95<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(95<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(95<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(95<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(95<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(95<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(95<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(95<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(95<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(95<<16)+1,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `* ::= "*" ws*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `/ ::= "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= "/" !{"*" "/"}
(83<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// ID ::= id2 ws*
(84<<16)+2,
// ID ::= id2
(84<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// CHARLIT ::= charLit2 ws*
(87<<16)+2,
// CHARLIT ::= charLit2
(87<<16)+1,
// STRINGLIT ::= stringLit3 ws*
(86<<16)+2,
// STRINGLIT ::= stringLit3
(86<<16)+1,
// id2 ::= !reserved letter idChar* !idChar
(134<<16)+2,
// id2 ::= !reserved letter !idChar
(134<<16)+1,
// intLit2 ::= !"0" digit++
(135<<16)+1,
// intLit2 ::= "0" "x" hex++
(135<<16)+3,
// intLit2 ::= "0" digit++
(135<<16)+2,
// charLit2 ::= "'" {" ".."&" "(".."[" "]".."~"} "'"
(136<<16)+3,
// stringLit2 ::= stringPrintable
(151<<16)+1,
// stringLit3 ::= '"' stringLit2** '"'
(137<<16)+3,
// stringLit3 ::= '"' !stringLit2 '"'
(137<<16)+2,
// stringPrintable ::= {" ".."!" "#".."~"}
(152<<16)+1,
// printable ::= {" ".."~"}
(155<<16)+1,
// idChar ::= letter
(94<<16)+1,
// idChar ::= digit
(94<<16)+1,
// idChar ::= "_"
(94<<16)+1,
// hex ::= digit
(157<<16)+1,
// hex ::= {"A".."F" "a".."f"}
(157<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(138<<16)+1,
// digit ::= {"0".."9"}
(156<<16)+1,
// withoutStar ::= {" "..")" "+".."~"}
(158<<16)+1,
// commentChar ::= withoutStar
(159<<16)+1,
// commentChar ::= "*" !"/"
(159<<16)+1,
// commentChar ::= eol
(159<<16)+1,
// ws ::= {9 12 " "}
(161<<16)+1,
// ws ::= eol
(161<<16)+1,
// ws ::= "/" "/" printable**
(161<<16)+3,
// ws ::= "/" "/" !printable
(161<<16)+2,
// ws ::= "/" "*" commentChar** "*" "/"
(161<<16)+5,
// ws ::= "/" "*" !commentChar "*" "/"
(161<<16)+4,
// eol ::= {10}
(160<<16)+1,
// eol ::= {13} {10}
(160<<16)+2,
// eol ::= {13} !10
(160<<16)+1,
// token* ::= token* token
(167<<16)+2,
// token* ::= token
(167<<16)+1,
// printable** ::= printable* !printable
(163<<16)+1,
// hex++ ::= hex+ !hex
(142<<16)+1,
// commentChar** ::= commentChar* !commentChar
(164<<16)+1,
// digit++ ::= digit+ !digit
(141<<16)+1,
// stringLit2** ::= stringLit2* !stringLit2
(153<<16)+1,
// idChar* ::= idChar* idChar
(139<<16)+2,
// idChar* ::= idChar
(139<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// hex+ ::= hex
(169<<16)+1,
// hex+ ::= hex+ hex
(169<<16)+2,
// digit+ ::= digit
(171<<16)+1,
// digit+ ::= digit+ digit
(171<<16)+2,
// stringLit2* ::= stringLit2* stringLit2
(172<<16)+2,
// stringLit2* ::= stringLit2
(172<<16)+1,
// printable* ::= printable* printable
(168<<16)+2,
// printable* ::= printable
(168<<16)+1,
// commentChar* ::= commentChar* commentChar
(170<<16)+2,
// commentChar* ::= commentChar
(170<<16)+1,
// $$0 ::= token*
(3<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
162, // 9
165, // 10
-1, // 11
162, // 12
166, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
146, // " "
114, // "!"
150, // '"'
145, // "#"
145, // "$"
116, // "%"
117, // "&"
143, // "'"
118, // "("
119, // ")"
120, // "*"
121, // "+"
122, // ","
123, // "-"
124, // "."
125, // "/"
140, // "0"
144, // "1"
144, // "2"
144, // "3"
144, // "4"
144, // "5"
144, // "6"
144, // "7"
144, // "8"
144, // "9"
145, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
145, // "?"
145, // "@"
148, // "A"
148, // "B"
148, // "C"
148, // "D"
148, // "E"
148, // "F"
149, // "G"
149, // "H"
149, // "I"
149, // "J"
149, // "K"
149, // "L"
149, // "M"
149, // "N"
149, // "O"
149, // "P"
149, // "Q"
149, // "R"
149, // "S"
149, // "T"
149, // "U"
149, // "V"
149, // "W"
149, // "X"
149, // "Y"
149, // "Z"
129, // "["
154, // "\"
130, // "]"
145, // "^"
147, // "_"
145, // "`"
92, // "a"
88, // "b"
98, // "c"
102, // "d"
91, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
149, // "j"
97, // "k"
90, // "l"
111, // "m"
93, // "n"
89, // "o"
107, // "p"
149, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
131, // "{"
132, // "|"
133, // "}"
145, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # ID", // 84
"token ::= # INTLIT", // 85
"token ::= # STRINGLIT", // 86
"token ::= # CHARLIT", // 87
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 88
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 89
"reserved ::= `boolean", // 90
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 91
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 92
"reserved ::= `break", // 93
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 94
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 95
"reserved ::= `class", // 96
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 97
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 98
"reserved ::= `else", // 99
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"reserved ::= `extends", // 102
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 103
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 104
"reserved ::= `false", // 105
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 106
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 107
"reserved ::= `for", // 108
"`if ::= \"i\" \"f\" !idChar ws*", // 109
"`if ::= \"i\" \"f\" !idChar ws*", // 110
"reserved ::= `if", // 111
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"reserved ::= `instanceof", // 114
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 115
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 116
"reserved ::= `int", // 117
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 118
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 119
"reserved ::= `new", // 120
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 121
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 122
"reserved ::= `null", // 123
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 124
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 125
"reserved ::= `public", // 126
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 127
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 128
"reserved ::= `return", // 129
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 130
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 131
"reserved ::= `super", // 132
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 133
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 134
"reserved ::= `switch", // 135
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 136
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 137
"reserved ::= `this", // 138
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 139
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 140
"reserved ::= `true", // 141
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 142
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 143
"reserved ::= `void", // 144
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 145
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 146
"reserved ::= `while", // 147
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 148
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 149
"reserved ::= `abstract", // 150
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 151
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 152
"reserved ::= `assert", // 153
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 154
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 155
"reserved ::= `byte", // 156
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 157
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 158
"reserved ::= `case", // 159
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 160
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 161
"reserved ::= `catch", // 162
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 163
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 164
"reserved ::= `char", // 165
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 166
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 167
"reserved ::= `const", // 168
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 169
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 170
"reserved ::= `continue", // 171
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 172
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 173
"reserved ::= `default", // 174
"`do ::= \"d\" \"o\" !idChar ws*", // 175
"`do ::= \"d\" \"o\" !idChar ws*", // 176
"reserved ::= `do", // 177
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 178
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 179
"reserved ::= `double", // 180
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 181
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 182
"reserved ::= `enum", // 183
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 184
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 185
"reserved ::= `final", // 186
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 187
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 188
"reserved ::= `finally", // 189
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 190
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 191
"reserved ::= `float", // 192
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 193
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 194
"reserved ::= `goto", // 195
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 196
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 197
"reserved ::= `implements", // 198
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 199
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 200
"reserved ::= `import", // 201
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 202
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 203
"reserved ::= `interface", // 204
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 205
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 206
"reserved ::= `long", // 207
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 208
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 209
"reserved ::= `native", // 210
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 211
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 212
"reserved ::= `package", // 213
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 214
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 215
"reserved ::= `private", // 216
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 217
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 218
"reserved ::= `protected", // 219
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 220
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 221
"reserved ::= `short", // 222
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 223
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 224
"reserved ::= `static", // 225
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 226
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 227
"reserved ::= `strictfp", // 228
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"reserved ::= `synchronized", // 231
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"reserved ::= `throw", // 234
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"reserved ::= `throws", // 237
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"reserved ::= `transient", // 240
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"reserved ::= `try", // 243
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"reserved ::= `volatile", // 246
"`! ::= \"!\" !\"=\" ws*", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`!= ::= \"!\" \"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`% ::= \"%\" ws*", // 251
"`% ::= \"%\" ws*", // 252
"`&& ::= \"&\" \"&\" ws*", // 253
"`&& ::= \"&\" \"&\" ws*", // 254
"`( ::= \"(\" ws*", // 255
"`( ::= \"(\" ws*", // 256
"`) ::= \")\" ws*", // 257
"`) ::= \")\" ws*", // 258
"`* ::= \"*\" ws*", // 259
"`* ::= \"*\" ws*", // 260
"`+ ::= \"+\" !\"+\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`++ ::= \"+\" \"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`, ::= \",\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`- ::= \"-\" !\"-\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`-- ::= \"-\" \"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`. ::= \".\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`/ ::= \"/\" !{\"*\" \"/\"} ws*", // 273
"`/ ::= \"/\" !{\"*\" \"/\"} ws*", // 274
"`; ::= \";\" ws*", // 275
"`; ::= \";\" ws*", // 276
"`< ::= \"<\" !\"=\" ws*", // 277
"`< ::= \"<\" !\"=\" ws*", // 278
"`<= ::= \"<\" \"=\" ws*", // 279
"`<= ::= \"<\" \"=\" ws*", // 280
"`= ::= \"=\" !\"=\" ws*", // 281
"`= ::= \"=\" !\"=\" ws*", // 282
"`== ::= \"=\" \"=\" ws*", // 283
"`== ::= \"=\" \"=\" ws*", // 284
"`> ::= \">\" !\"=\" ws*", // 285
"`> ::= \">\" !\"=\" ws*", // 286
"`>= ::= \">\" \"=\" ws*", // 287
"`>= ::= \">\" \"=\" ws*", // 288
"`[ ::= \"[\" ws*", // 289
"`[ ::= \"[\" ws*", // 290
"`] ::= \"]\" ws*", // 291
"`] ::= \"]\" ws*", // 292
"`{ ::= \"{\" ws*", // 293
"`{ ::= \"{\" ws*", // 294
"`|| ::= \"|\" \"|\" ws*", // 295
"`|| ::= \"|\" \"|\" ws*", // 296
"`} ::= \"}\" ws*", // 297
"`} ::= \"}\" ws*", // 298
"ID ::= id2 ws*", // 299
"ID ::= id2 ws*", // 300
"INTLIT ::= # intLit2 ws*", // 301
"INTLIT ::= # intLit2 ws*", // 302
"CHARLIT ::= charLit2 ws*", // 303
"CHARLIT ::= charLit2 ws*", // 304
"STRINGLIT ::= stringLit3 ws*", // 305
"STRINGLIT ::= stringLit3 ws*", // 306
"id2 ::= !reserved letter idChar* !idChar", // 307
"id2 ::= !reserved letter idChar* !idChar", // 308
"intLit2 ::= !\"0\" digit++", // 309
"intLit2 ::= \"0\" \"x\" hex++", // 310
"intLit2 ::= \"0\" digit++", // 311
"charLit2 ::= \"\'\" {\" \"..\"&\" \"(\"..\"[\" \"]\"..\"~\"} \"\'\"", // 312
"stringLit2 ::= stringPrintable", // 313
"stringLit3 ::= \'\"\' stringLit2** \'\"\'", // 314
"stringLit3 ::= \'\"\' stringLit2** \'\"\'", // 315
"stringPrintable ::= {\" \"..\"!\" \"#\"..\"~\"}", // 316
"printable ::= {\" \"..\"~\"}", // 317
"idChar ::= letter", // 318
"idChar ::= digit", // 319
"idChar ::= \"_\"", // 320
"hex ::= digit", // 321
"hex ::= {\"A\"..\"F\" \"a\"..\"f\"}", // 322
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 323
"digit ::= {\"0\"..\"9\"}", // 324
"withoutStar ::= {\" \"..\")\" \"+\"..\"~\"}", // 325
"commentChar ::= withoutStar", // 326
"commentChar ::= \"*\" !\"/\"", // 327
"commentChar ::= eol", // 328
"ws ::= {9 12 \" \"}", // 329
"ws ::= eol", // 330
"ws ::= \"/\" \"/\" printable**", // 331
"ws ::= \"/\" \"/\" printable**", // 332
"ws ::= \"/\" \"*\" commentChar** \"*\" \"/\"", // 333
"ws ::= \"/\" \"*\" commentChar** \"*\" \"/\"", // 334
"eol ::= {10} registerNewline", // 335
"eol ::= {13} {10} registerNewline", // 336
"eol ::= {13} !10 registerNewline", // 337
"token* ::= token* token", // 338
"token* ::= token* token", // 339
"printable** ::= printable* !printable", // 340
"hex++ ::= hex+ !hex", // 341
"commentChar** ::= commentChar* !commentChar", // 342
"digit++ ::= digit+ !digit", // 343
"stringLit2** ::= stringLit2* !stringLit2", // 344
"idChar* ::= idChar* idChar", // 345
"idChar* ::= idChar* idChar", // 346
"ws* ::= ws* ws", // 347
"ws* ::= ws* ws", // 348
"hex+ ::= hex", // 349
"hex+ ::= hex+ hex", // 350
"digit+ ::= digit", // 351
"digit+ ::= digit+ digit", // 352
"stringLit2* ::= stringLit2* stringLit2", // 353
"stringLit2* ::= stringLit2* stringLit2", // 354
"printable* ::= printable* printable", // 355
"printable* ::= printable* printable", // 356
"commentChar* ::= commentChar* commentChar", // 357
"commentChar* ::= commentChar* commentChar", // 358
"", // 359
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 89: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 90: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 91: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 92: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 93: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 94: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 95: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 96: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 97: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 98: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 99: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 100: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 102: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 103: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 104: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 105: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 106: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 110: `if ::= "i" "f" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 112: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 114: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 115: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 122: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 123: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 124: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 125: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 126: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 127: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 128: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 129: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 130: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 131: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 132: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 133: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 134: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 135: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 136: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 137: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 138: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 139: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 140: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 141: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 143: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 144: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 145: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 146: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 147: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 148: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 149: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 150: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 151: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 152: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 153: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 154: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 155: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 156: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 157: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 158: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 159: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 160: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 161: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 162: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 163: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 164: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 165: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 166: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 167: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 168: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 170: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 171: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 172: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 173: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 174: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 175: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `do ::= "d" "o" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 179: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 180: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 181: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 182: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 183: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 185: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 186: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 188: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 189: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 191: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 192: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 194: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 195: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 197: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 198: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 200: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 201: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 203: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 204: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 206: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 207: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 209: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 210: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 212: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 213: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 215: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 216: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 218: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 219: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 221: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 222: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 224: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 225: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 227: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 228: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 231: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 234: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 237: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 240: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `! ::= "!" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 250: `!= ::= "!" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 254: `&& ::= "&" "&" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 255: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 256: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 257: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `* ::= "*" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `++ ::= "+" "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `, ::= "," [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 270: `-- ::= "-" "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `. ::= "." [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `/ ::= "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= "/" !{"*" "/"} [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `< ::= "<" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 280: `<= ::= "<" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 281: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `= ::= "=" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `== ::= "=" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `>= ::= ">" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 296: `|| ::= "|" "|" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 297: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: ID ::= id2 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 300: ID ::= id2 [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 301: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 302: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 303: CHARLIT ::= charLit2 ws* @convertToChar(String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 304: CHARLIT ::= charLit2 [ws*] @convertToChar(String)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 305: STRINGLIT ::= stringLit3 ws* @convertToString(String)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 306: STRINGLIT ::= stringLit3 [ws*] @convertToString(String)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 307: id2 ::= !reserved letter idChar* !idChar @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 308: id2 ::= !reserved letter !idChar [idChar*] @text
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 309: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 310: intLit2 ::= "0" "x" hex++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 311: intLit2 ::= "0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x4)/*stringConcat:2*/,
    },
    { // 312: charLit2 ::= "'" {" ".."&" "(".."[" "]".."~"} "'" @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 313: stringLit2 ::= stringPrintable @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 314: stringLit3 ::= '"' stringLit2** '"' @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 315: stringLit3 ::= '"' !stringLit2 [stringLit2**] '"' @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 316: stringPrintable ::= {" ".."!" "#".."~"} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 317: printable ::= {" ".."~"} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 318: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 319: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 320: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 321: hex ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 322: hex ::= {"A".."F" "a".."f"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 323: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 324: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 325: withoutStar ::= {" "..")" "+".."~"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 326: commentChar ::= withoutStar @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: commentChar ::= "*" !"/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 328: commentChar ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 329: ws ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 330: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 331: ws ::= "/" "/" printable** @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 332: ws ::= "/" "/" !printable [printable**] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 333: ws ::= "/" "*" commentChar** "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 334: ws ::= "/" "*" !commentChar [commentChar**] "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 335: eol ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 336: eol ::= {13} {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 337: eol ::= {13} !10 [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 338: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // 340: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 341: hex++ ::= hex+ !hex @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 342: commentChar** ::= commentChar* !commentChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 343: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 344: stringLit2** ::= stringLit2* !stringLit2 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 346: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 347: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 348: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 349: hex+ ::= hex @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 350: hex+ ::= hex+ hex @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 351: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 352: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 353: stringLit2* ::= stringLit2* stringLit2 @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 354: stringLit2* ::= [stringLit2*] stringLit2 @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 356: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 357: commentChar* ::= commentChar* commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 358: commentChar* ::= [commentChar*] commentChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 359: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "stringLit2* ::=", // stringLit2*
    "printable** ::= printable* !printable", // printable**
    "printable* ::=", // printable*
    "stringLit2** ::= stringLit2* !stringLit2", // stringLit2**
    "start ::= ws* token*", // start
    "ws* ::=", // ws*
    "commentChar* ::=", // commentChar*
    "commentChar** ::= commentChar* !commentChar", // commentChar**
    "token* ::=", // token*
    "idChar* ::=", // idChar*
    "", // $$start
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // stringLit2*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // printable**
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // stringLit2**
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // start
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // ws*
    },
    { // commentChar*
    },
    { // commentChar**
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // $$start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 84: {
      String parm0 = (String)si.popPb();
      int result = actionObject.convertToChar(parm0);
      si.pushPb(result);
    }
    break;
    case 85: {
      String parm0 = (String)si.popPb();
      String result = actionObject.convertToString(parm0);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,String)",
"int convertToChar(String)",
"String convertToString(String)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
1,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    1,
    1,
    -1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    -1,
    1,
    0,
    -1,
    -1,
    0,
    1,
    1,
    0,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
