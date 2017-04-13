package
parse
;
import
java
.
util
.
ArrayList
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
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 160; }
public int getNttSym() { return 161; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"`extends",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`return",
"<exp>",
"`;",
"<formal list>",
"<formal argument>*",
"<formal argument>",
"`,",
"`int",
"`boolean",
"<instance type>",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"<call exp>",
"`break",
"<local var decl>",
"`=",
"`++",
"`--",
"`if",
"`else",
"`while",
"`do",
"`for",
"<for first>",
"<for third>",
"<exp8>",
"`||",
"<exp7>",
"`&&",
"<exp6>",
"`!=",
"<exp5>",
"`==",
"`>",
"<exp4>",
"`>=",
"`<",
"`<=",
"`instanceof",
"`+",
"<exp3>",
"`-",
"`*",
"<exp2>",
"`/",
"`%",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`!",
"<exp list>",
"`.",
"`super",
"<mult exp>*",
"<mult exp>",
"`new",
"<empty bracket pair>*",
"INTLIT",
"CHARLIT",
"STRINGLIT",
"`null",
"`true",
"`false",
"`this",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"\"c\"",
"\"f\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"y\"..\"z\"}",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"\"w\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 162;}
private static final int MIN_REDUCTION = 845;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
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
1,788, // <start>
2,206, // ws*
3,477, // <program>
4,294, // <class decl>+
5,778, // <class decl>
6,831, // `class
120,476, // " "
121,331, // "#"
138,253, // {10}
147,396, // ws
  }
,
{ // state 1
  }
,
{ // state 2
120,476, // " "
138,253, // {10}
147,445, // ws
161,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 3
17,736, // `)
30,340, // <empty bracket pair>
31,227, // `[
116,714, // "["
123,74, // ")"
  }
,
{ // state 4
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 5
161,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 7
87,556, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,764, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
110,375, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,540, // digit128
114,37, // {176..185}
135,416, // "_"
145,682, // {223}
148,274, // idChar*
149,645, // $$0
156,6, // idChar
157,825, // idChar128
  }
,
{ // state 8
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 9
17,312, // `)
123,74, // ")"
  }
,
{ // state 10
31,MIN_REDUCTION+107, // `[
116,MIN_REDUCTION+107, // "["
161,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 11
0x80000000|609, // match move
0x80000000|649, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 12
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 13
31,MIN_REDUCTION+214, // `[
116,MIN_REDUCTION+214, // "["
161,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 14
22,80, // `;
127,215, // ";"
  }
,
{ // state 15
0x80000000|116, // match move
0x80000000|303, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 16
2,707, // ws*
31,MIN_REDUCTION+134, // `[
116,MIN_REDUCTION+134, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 17
7,499, // ID
8,394, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,296, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,626, // <stmt>
34,167, // <assign>
35,636, // <call exp>
36,510, // `break
37,14, // <local var decl>
39,780, // `++
40,142, // `--
41,534, // `if
43,546, // `while
44,721, // `do
45,193, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,215, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 18
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 19
161,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 21
0x80000000|138, // match move
0x80000000|51, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|505, // match move
0x80000000|536, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
0x80000000|611, // match move
0x80000000|581, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 24
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 25
2,563, // ws*
  }
,
{ // state 26
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 27
2,567, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 28
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 29
117,747, // "-"
133,321, // "+"
142,33, // '"'
  }
,
{ // state 30
142,33, // '"'
  }
,
{ // state 31
65,737, // `*
143,793, // "*"
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 32
30,340, // <empty bracket pair>
31,105, // `[
116,714, // "["
  }
,
{ // state 33
0x80000000|750, // match move
0x80000000|67, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 34
0x80000000|466, // match move
0x80000000|688, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 35
0x80000000|329, // match move
0x80000000|744, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
16,390, // `(
21,370, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 37
0x80000000|195, // match move
0x80000000|562, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 39
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 40
7,234, // ID
16,695, // `(
35,22, // <call exp>
71,293, // <exp1>
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
121,95, // "#"
132,77, // "("
137,30, // "@"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 41
99,470, // "u"
  }
,
{ // state 42
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 43
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 44
31,MIN_REDUCTION+211, // `[
116,MIN_REDUCTION+211, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 45
2,465, // ws*
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 46
2,563, // ws*
31,MIN_REDUCTION+132, // `[
116,MIN_REDUCTION+132, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 48
16,390, // `(
18,694, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 49
31,MIN_REDUCTION+94, // `[
116,MIN_REDUCTION+94, // "["
161,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 50
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 51
31,MIN_REDUCTION+108, // `[
116,MIN_REDUCTION+108, // "["
161,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 52
2,563, // ws*
161,MIN_REDUCTION+132, // $NT
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 53
43,659, // `while
121,140, // "#"
  }
,
{ // state 54
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|603, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 56
31,MIN_REDUCTION+177, // `[
116,MIN_REDUCTION+177, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 57
16,390, // `(
21,606, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 58
31,MIN_REDUCTION+204, // `[
116,MIN_REDUCTION+204, // "["
161,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 59
117,747, // "-"
133,321, // "+"
  }
,
{ // state 60
161,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 61
118,240, // "<"
119,641, // "|"
122,726, // "&"
128,357, // ">"
136,782, // "="
140,735, // "!"
  }
,
{ // state 62
31,MIN_REDUCTION+133, // `[
116,MIN_REDUCTION+133, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 64
26,389, // `,
76,422, // <mult exp>*
77,208, // <mult exp>
124,731, // ","
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 65
2,418, // ws*
161,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 66
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 67
2,78, // ws*
31,MIN_REDUCTION+212, // `[
116,MIN_REDUCTION+212, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 68
0x80000000|408, // match move
0x80000000|13, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
0x80000000|507, // match move
0x80000000|565, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 70
0x80000000|90, // match move
0x80000000|637, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 71
7,667, // ID
30,340, // <empty bracket pair>
31,227, // `[
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
116,714, // "["
  }
,
{ // state 72
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 73
49,669, // `||
137,277, // "@"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 74
2,570, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 76
2,313, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 77
2,599, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 78
0x80000000|806, // match move
0x80000000|44, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 79
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,381, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 80
0x80000000|354, // match move
0x80000000|290, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 81
0x80000000|796, // match move
0x80000000|79, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|94, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 83
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 85
7,499, // ID
8,309, // `{
10,159, // `}
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
139,86, // "}"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 86
2,564, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 87
161,MIN_REDUCTION+73, // $NT
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 89
32,214, // `]
125,457, // "]"
  }
,
{ // state 90
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 91
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
499, // ID
309, // `{
-1, // <decl in class>*
676, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
695, // `(
-1, // `)
694, // <stmt>*
189, // <type>
-1, // `return
777, // <exp>
740, // `;
-1, // <formal list>
-1, // <formal argument>*
-1, // <formal argument>
-1, // `,
485, // `int
43, // `boolean
753, // <instance type>
-1, // <empty bracket pair>
-1, // `[
-1, // `]
322, // <stmt>
508, // <assign>
533, // <call exp>
203, // `break
369, // <local var decl>
-1, // `=
780, // `++
142, // `--
112, // `if
-1, // `else
184, // `while
578, // `do
100, // `for
-1, // <for first>
-1, // <for third>
73, // <exp8>
-1, // `||
640, // <exp7>
-1, // `&&
175, // <exp6>
-1, // `!=
433, // <exp5>
-1, // `==
-1, // `>
701, // <exp4>
-1, // `>=
-1, // `<
-1, // `<=
-1, // `instanceof
529, // `+
317, // <exp3>
462, // `-
-1, // `*
774, // <exp2>
-1, // `/
-1, // `%
-1, // <cast exp>
356, // <unary exp>
431, // <exp1>
128, // `!
-1, // <exp list>
-1, // `.
486, // `super
-1, // <mult exp>*
-1, // <mult exp>
500, // `new
-1, // <empty bracket pair>*
300, // INTLIT
425, // CHARLIT
518, // STRINGLIT
790, // `null
223, // `true
259, // `false
366, // `this
7, // letter
298, // "a"
298, // "p"
298, // "s"
298, // "v"
298, // "c"
298, // "f"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
530, // letter128
654, // {199..218 231..250}
654, // {193..198 225..230}
-1, // digit
681, // {"1".."9"}
412, // "0"
123, // digit128
37, // {176..185}
-1, // any
-1, // "["
716, // "-"
-1, // "<"
-1, // "|"
-1, // " "
250, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
792, // ";"
-1, // ">"
209, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
77, // "("
817, // "+"
-1, // "."
-1, // "_"
-1, // "="
29, // "@"
-1, // {10}
86, // "}"
316, // "!"
362, // "'"
558, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 92
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 93
0x80000000|593, // match move
0x80000000|16, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
17,MIN_REDUCTION+48, // `)
31,MIN_REDUCTION+98, // `[
116,MIN_REDUCTION+98, // "["
123,MIN_REDUCTION+48, // ")"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 95
90,327, // "s"
93,386, // "f"
104,251, // "n"
105,176, // "t"
  }
,
{ // state 96
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 97
31,574, // `[
74,196, // `.
116,714, // "["
134,135, // "."
161,MIN_REDUCTION+73, // $NT
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 98
0x80000000|588, // match move
0x80000000|488, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 99
0x80000000|743, // match move
0x80000000|487, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 100
16,424, // `(
132,77, // "("
  }
,
{ // state 101
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 102
0x80000000|794, // match move
0x80000000|148, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
16,390, // `(
21,777, // <exp>
34,622, // <assign>
35,82, // <call exp>
47,535, // <for third>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 104
0x80000000|594, // match move
0x80000000|815, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 105
0x80000000|765, // match move
0x80000000|767, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 106
0x80000000|4, // match move
0x80000000|434, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 107
161,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 108
0x80000000|709, // match move
0x80000000|746, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 110
16,390, // `(
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
73,343, // <exp list>
132,77, // "("
  }
,
{ // state 111
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 112
16,738, // `(
132,77, // "("
  }
,
{ // state 113
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 114
31,MIN_REDUCTION+93, // `[
116,MIN_REDUCTION+93, // "["
161,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 115
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 116
16,390, // `(
18,218, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 117
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 118
7,754, // ID
16,695, // `(
21,777, // <exp>
34,622, // <assign>
35,82, // <call exp>
39,780, // `++
40,142, // `--
47,535, // <for third>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 119
2,840, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 121
16,390, // `(
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
73,229, // <exp list>
132,77, // "("
  }
,
{ // state 122
31,MIN_REDUCTION+131, // `[
116,MIN_REDUCTION+131, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+131, // $NT
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 123
0x80000000|775, // match move
0x80000000|239, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
91,171, // "v"
95,690, // "i"
101,435, // "b"
  }
,
{ // state 125
16,390, // `(
21,745, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 126
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 127
0x80000000|110, // match move
0x80000000|149, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 128
0x80000000|472, // match move
0x80000000|786, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 129
2,418, // ws*
  }
,
{ // state 130
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
499, // ID
309, // `{
-1, // <decl in class>*
814, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
695, // `(
-1, // `)
697, // <stmt>*
189, // <type>
-1, // `return
777, // <exp>
740, // `;
-1, // <formal list>
-1, // <formal argument>*
-1, // <formal argument>
-1, // `,
485, // `int
43, // `boolean
753, // <instance type>
-1, // <empty bracket pair>
-1, // `[
-1, // `]
322, // <stmt>
508, // <assign>
533, // <call exp>
203, // `break
369, // <local var decl>
-1, // `=
780, // `++
142, // `--
112, // `if
-1, // `else
184, // `while
578, // `do
100, // `for
-1, // <for first>
-1, // <for third>
73, // <exp8>
-1, // `||
640, // <exp7>
-1, // `&&
175, // <exp6>
-1, // `!=
433, // <exp5>
-1, // `==
-1, // `>
701, // <exp4>
-1, // `>=
-1, // `<
-1, // `<=
-1, // `instanceof
529, // `+
317, // <exp3>
462, // `-
-1, // `*
774, // <exp2>
-1, // `/
-1, // `%
-1, // <cast exp>
356, // <unary exp>
431, // <exp1>
128, // `!
-1, // <exp list>
-1, // `.
486, // `super
-1, // <mult exp>*
-1, // <mult exp>
500, // `new
-1, // <empty bracket pair>*
300, // INTLIT
425, // CHARLIT
518, // STRINGLIT
790, // `null
223, // `true
259, // `false
366, // `this
7, // letter
298, // "a"
298, // "p"
298, // "s"
298, // "v"
298, // "c"
298, // "f"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
530, // letter128
654, // {199..218 231..250}
654, // {193..198 225..230}
-1, // digit
681, // {"1".."9"}
412, // "0"
123, // digit128
37, // {176..185}
-1, // any
-1, // "["
716, // "-"
-1, // "<"
-1, // "|"
-1, // " "
250, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
792, // ";"
-1, // ">"
209, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
77, // "("
817, // "+"
-1, // "."
-1, // "_"
-1, // "="
29, // "@"
-1, // {10}
86, // "}"
316, // "!"
362, // "'"
558, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 131
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 132
0x80000000|150, // match move
0x80000000|268, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
31,MIN_REDUCTION+129, // `[
116,MIN_REDUCTION+129, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 134
2,797, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 135
2,436, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 136
161,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 137
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 138
161,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 139
161,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 140
106,368, // "w"
  }
,
{ // state 141
161,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 142
7,75, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 143
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 144
2,523, // ws*
161,MIN_REDUCTION+252, // $NT
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 145
31,MIN_REDUCTION+213, // `[
116,MIN_REDUCTION+213, // "["
161,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 146
0x80000000|174, // match move
0x80000000|326, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 147
22,734, // `;
127,792, // ";"
  }
,
{ // state 148
31,MIN_REDUCTION+89, // `[
116,MIN_REDUCTION+89, // "["
161,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 149
7,234, // ID
16,695, // `(
17,691, // `)
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
73,343, // <exp list>
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
123,104, // ")"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 150
161,MIN_REDUCTION+81, // $NT
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 151
0x80000000|363, // match move
0x80000000|222, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 152
0x80000000|358, // match move
0x80000000|372, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 153
31,MIN_REDUCTION+100, // `[
116,MIN_REDUCTION+100, // "["
161,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 154
0x80000000|824, // match move
0x80000000|550, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 155
31,MIN_REDUCTION+207, // `[
116,MIN_REDUCTION+207, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 156
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,137, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 157
2,686, // ws*
31,MIN_REDUCTION+248, // `[
116,MIN_REDUCTION+248, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+248, // $NT
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 158
2,419, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 160
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 161
0x80000000|724, // match move
0x80000000|257, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
0x80000000|141, // match move
0x80000000|423, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
2,707, // ws*
  }
,
{ // state 164
31,MIN_REDUCTION+210, // `[
116,MIN_REDUCTION+210, // "["
161,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 165
16,390, // `(
21,664, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 166
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
20,282, // `return
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,168, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 167
22,11, // `;
127,215, // ";"
  }
,
{ // state 168
90,327, // "s"
93,799, // "f"
95,690, // "i"
98,575, // "r"
101,613, // "b"
104,251, // "n"
105,176, // "t"
106,368, // "w"
117,180, // "-"
133,554, // "+"
  }
,
{ // state 169
161,MIN_REDUCTION+204, // $NT
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 170
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 171
97,624, // "o"
  }
,
{ // state 172
22,673, // `;
31,MIN_REDUCTION+98, // `[
116,MIN_REDUCTION+98, // "["
127,215, // ";"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 173
10,644, // `}
12,615, // <decl in class>
13,591, // <method decl>
14,336, // `public
121,635, // "#"
139,86, // "}"
  }
,
{ // state 174
161,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 175
53,351, // `!=
55,548, // `==
137,532, // "@"
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 176
98,93, // "r"
103,444, // "h"
  }
,
{ // state 177
0x80000000|661, // match move
0x80000000|56, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 178
102,832, // "e"
  }
,
{ // state 179
16,390, // `(
35,22, // <call exp>
57,677, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 180
2,210, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 181
7,234, // ID
16,695, // `(
21,220, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 182
0x80000000|179, // match move
0x80000000|660, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 183
0x80000000|5, // match move
0x80000000|377, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
16,711, // `(
132,77, // "("
  }
,
{ // state 185
2,177, // ws*
31,MIN_REDUCTION+178, // `[
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 186
31,MIN_REDUCTION+83, // `[
116,MIN_REDUCTION+83, // "["
161,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 187
32,161, // `]
125,457, // "]"
  }
,
{ // state 188
0x80000000|461, // match move
0x80000000|550, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 189
7,288, // ID
30,340, // <empty bracket pair>
31,227, // `[
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
116,714, // "["
  }
,
{ // state 190
104,595, // "n"
  }
,
{ // state 191
22,582, // `;
127,215, // ";"
  }
,
{ // state 192
16,511, // `(
132,77, // "("
  }
,
{ // state 193
16,830, // `(
132,77, // "("
  }
,
{ // state 194
0x80000000|684, // match move
0x80000000|385, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 195
161,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 196
7,672, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 197
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 198
2,365, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 199
22,541, // `;
127,792, // ";"
  }
,
{ // state 200
7,616, // ID
30,340, // <empty bracket pair>
31,227, // `[
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
116,714, // "["
  }
,
{ // state 201
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 202
0x80000000|52, // match move
0x80000000|46, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
22,812, // `;
127,792, // ";"
  }
,
{ // state 204
8,15, // `{
129,209, // "{"
  }
,
{ // state 205
161,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 206
3,360, // <program>
4,294, // <class decl>+
5,778, // <class decl>
6,831, // `class
120,476, // " "
121,331, // "#"
138,253, // {10}
147,445, // ws
  }
,
{ // state 207
17,380, // `)
123,74, // ")"
  }
,
{ // state 208
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 209
2,619, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 210
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 212
2,686, // ws*
161,MIN_REDUCTION+248, // $NT
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 214
0x80000000|463, // match move
0x80000000|598, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 215
0x80000000|45, // match move
0x80000000|384, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 216
35,22, // <call exp>
70,771, // <unary exp>
71,431, // <exp1>
  }
,
{ // state 217
16,390, // `(
21,199, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 218
0x80000000|783, // match move
0x80000000|166, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 219
88,448, // "a"
89,448, // "p"
90,448, // "s"
91,448, // "v"
92,448, // "c"
93,448, // "f"
94,448, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,448, // "i"
96,448, // "l"
97,448, // "o"
98,448, // "r"
99,448, // "u"
100,448, // "x"
101,448, // "b"
102,448, // "e"
103,448, // "h"
104,448, // "n"
105,448, // "t"
106,448, // "w"
108,841, // {199..218 231..250}
109,841, // {193..198 225..230}
111,448, // {"1".."9"}
112,448, // "0"
114,841, // {176..185}
115,213, // any
116,448, // "["
117,448, // "-"
118,448, // "<"
119,448, // "|"
120,448, // " "
121,448, // "#"
122,448, // "&"
123,448, // ")"
124,448, // ","
125,448, // "]"
126,448, // "/"
127,448, // ";"
128,448, // ">"
129,448, // "{"
130,448, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
131,448, // "%"
132,448, // "("
133,448, // "+"
134,448, // "."
135,448, // "_"
136,448, // "="
137,448, // "@"
138,448, // {10}
139,448, // "}"
140,448, // "!"
141,448, // "'"
142,448, // '"'
143,448, // "*"
144,99, // any128
145,841, // {223}
146,841, // {128..175 186..192 219..222 224 251..255}
155,404, // $$3
  }
,
{ // state 220
17,191, // `)
123,74, // ")"
  }
,
{ // state 221
161,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 222
7,234, // ID
16,695, // `(
21,273, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 223
0x80000000|689, // match move
0x80000000|318, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 224
2,177, // ws*
161,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 225
8,405, // `{
11,442, // `extends
121,243, // "#"
129,209, // "{"
  }
,
{ // state 226
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 227
32,497, // `]
125,802, // "]"
  }
,
{ // state 228
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 229
17,132, // `)
123,104, // ")"
  }
,
{ // state 230
17,733, // `)
123,74, // ")"
  }
,
{ // state 231
8,373, // `{
129,209, // "{"
  }
,
{ // state 232
16,720, // `(
132,77, // "("
  }
,
{ // state 233
2,517, // ws*
  }
,
{ // state 234
0x80000000|284, // match move
0x80000000|539, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 236
31,MIN_REDUCTION+97, // `[
116,MIN_REDUCTION+97, // "["
161,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 237
7,MIN_REDUCTION+23, // ID
16,127, // `(
31,MIN_REDUCTION+87, // `[
39,415, // `++
40,334, // `--
88,MIN_REDUCTION+23, // "a"
89,MIN_REDUCTION+23, // "p"
90,MIN_REDUCTION+23, // "s"
91,MIN_REDUCTION+23, // "v"
92,MIN_REDUCTION+23, // "c"
93,MIN_REDUCTION+23, // "f"
94,MIN_REDUCTION+23, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,MIN_REDUCTION+23, // "i"
96,MIN_REDUCTION+23, // "l"
97,MIN_REDUCTION+23, // "o"
98,MIN_REDUCTION+23, // "r"
99,MIN_REDUCTION+23, // "u"
100,MIN_REDUCTION+23, // "x"
101,MIN_REDUCTION+23, // "b"
102,MIN_REDUCTION+23, // "e"
103,MIN_REDUCTION+23, // "h"
104,MIN_REDUCTION+23, // "n"
105,MIN_REDUCTION+23, // "t"
106,MIN_REDUCTION+23, // "w"
108,MIN_REDUCTION+23, // {199..218 231..250}
109,MIN_REDUCTION+23, // {193..198 225..230}
116,MIN_REDUCTION+87, // "["
132,77, // "("
137,409, // "@"
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 239
2,658, // ws*
31,MIN_REDUCTION+208, // `[
116,MIN_REDUCTION+208, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 240
2,24, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 241
0x80000000|560, // match move
0x80000000|242, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 242
31,MIN_REDUCTION+242, // `[
116,MIN_REDUCTION+242, // "["
161,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 243
102,585, // "e"
  }
,
{ // state 244
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 245
16,390, // `(
21,777, // <exp>
33,188, // <stmt>
34,167, // <assign>
35,636, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 246
7,234, // ID
16,695, // `(
21,808, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 247
16,390, // `(
21,777, // <exp>
33,626, // <stmt>
34,167, // <assign>
35,636, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 248
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 249
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 250
90,327, // "s"
93,799, // "f"
95,690, // "i"
101,613, // "b"
104,251, // "n"
105,176, // "t"
106,368, // "w"
117,180, // "-"
133,554, // "+"
  }
,
{ // state 251
99,727, // "u"
102,119, // "e"
  }
,
{ // state 252
16,390, // `(
21,557, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 253
161,MIN_REDUCTION+108, // $NT
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 254
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 255
161,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 256
31,MIN_REDUCTION+78, // `[
116,MIN_REDUCTION+78, // "["
161,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 257
31,MIN_REDUCTION+25, // `[
116,MIN_REDUCTION+25, // "["
161,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 258
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 259
0x80000000|770, // match move
0x80000000|299, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
17,311, // `)
123,104, // ")"
  }
,
{ // state 261
2,658, // ws*
  }
,
{ // state 262
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 263
7,234, // ID
16,695, // `(
21,147, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 264
161,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 265
0x80000000|121, // match move
0x80000000|522, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 266
31,MIN_REDUCTION+79, // `[
116,MIN_REDUCTION+79, // "["
161,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 268
31,MIN_REDUCTION+81, // `[
116,MIN_REDUCTION+81, // "["
161,MIN_REDUCTION+81, // $NT
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 269
16,390, // `(
35,22, // <call exp>
57,779, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 270
0x80000000|545, // match move
0x80000000|708, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 271
10,53, // `}
139,86, // "}"
  }
,
{ // state 272
2,413, // ws*
  }
,
{ // state 273
22,678, // `;
127,792, // ";"
  }
,
{ // state 274
87,556, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,764, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
110,375, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,540, // digit128
114,37, // {176..185}
135,416, // "_"
145,682, // {223}
149,108, // $$0
156,628, // idChar
157,825, // idChar128
  }
,
{ // state 275
7,234, // ID
16,695, // `(
35,22, // <call exp>
57,450, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 276
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
64,462, // `-
66,126, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 277
119,641, // "|"
  }
,
{ // state 278
2,755, // ws*
161,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 279
2,755, // ws*
31,MIN_REDUCTION+130, // `[
116,MIN_REDUCTION+130, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 280
7,234, // ID
16,695, // `(
21,634, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 281
16,390, // `(
35,22, // <call exp>
57,115, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 282
0x80000000|165, // match move
0x80000000|703, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 283
0x80000000|702, // match move
0x80000000|391, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
161,MIN_REDUCTION+87, // $NT
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 285
16,390, // `(
35,22, // <call exp>
66,126, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 286
16,390, // `(
21,777, // <exp>
33,137, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 287
2,50, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 288
38,627, // `=
136,420, // "="
  }
,
{ // state 289
161,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 291
120,476, // " "
138,253, // {10}
147,445, // ws
161,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 292
31,MIN_REDUCTION+137, // `[
116,MIN_REDUCTION+137, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+137, // $NT
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 293
0x80000000|87, // match move
0x80000000|97, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 294
5,818, // <class decl>
6,831, // `class
121,331, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 295
2,35, // ws*
161,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 296
0x80000000|120, // match move
0x80000000|310, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 297
0x80000000|392, // match move
0x80000000|519, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 298
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 299
31,MIN_REDUCTION+96, // `[
116,MIN_REDUCTION+96, // "["
161,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 300
0x80000000|605, // match move
0x80000000|621, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 301
0x80000000|696, // match move
0x80000000|826, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 302
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 303
7,499, // ID
8,309, // `{
16,695, // `(
18,218, // <stmt>*
19,189, // <type>
20,722, // `return
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,168, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 304
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 305
2,523, // ws*
  }
,
{ // state 306
7,234, // ID
16,695, // `(
21,207, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 307
0x80000000|629, // match move
0x80000000|353, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 308
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 309
0x80000000|483, // match move
0x80000000|130, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 310
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 311
0x80000000|205, // match move
0x80000000|805, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 312
22,117, // `;
127,792, // ";"
  }
,
{ // state 313
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 314
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 315
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
63,31, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 316
2,345, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+150, // (default reduction)
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
{ // state 317
65,737, // `*
143,793, // "*"
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 318
31,MIN_REDUCTION+95, // `[
116,MIN_REDUCTION+95, // "["
161,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 319
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 320
16,811, // `(
132,77, // "("
  }
,
{ // state 321
2,757, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 323
16,390, // `(
21,479, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 324
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
64,462, // `-
70,771, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 325
7,234, // ID
16,695, // `(
21,370, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 326
31,MIN_REDUCTION+243, // `[
116,MIN_REDUCTION+243, // "["
161,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 327
99,692, // "u"
  }
,
{ // state 328
161,MIN_REDUCTION+253, // $NT
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 329
161,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 330
31,MIN_REDUCTION+253, // `[
116,MIN_REDUCTION+253, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+253, // $NT
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 331
92,503, // "c"
  }
,
{ // state 332
7,499, // ID
8,309, // `{
10,70, // `}
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
139,335, // "}"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 333
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 335
0x80000000|752, // match move
0x80000000|827, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 336
7,26, // ID
15,662, // `void
19,580, // <type>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,124, // "#"
  }
,
{ // state 337
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 339
7,499, // ID
8,309, // `{
10,254, // `}
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
139,86, // "}"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 340
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 341
161,MIN_REDUCTION+249, // $NT
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 342
16,742, // `(
132,77, // "("
  }
,
{ // state 343
17,454, // `)
123,104, // ")"
  }
,
{ // state 344
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
499, // ID
309, // `{
-1, // <decl in class>*
538, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
695, // `(
-1, // `)
725, // <stmt>*
189, // <type>
-1, // `return
777, // <exp>
740, // `;
-1, // <formal list>
-1, // <formal argument>*
-1, // <formal argument>
-1, // `,
485, // `int
43, // `boolean
753, // <instance type>
-1, // <empty bracket pair>
-1, // `[
-1, // `]
322, // <stmt>
508, // <assign>
533, // <call exp>
203, // `break
369, // <local var decl>
-1, // `=
780, // `++
142, // `--
112, // `if
-1, // `else
184, // `while
578, // `do
100, // `for
-1, // <for first>
-1, // <for third>
73, // <exp8>
-1, // `||
640, // <exp7>
-1, // `&&
175, // <exp6>
-1, // `!=
433, // <exp5>
-1, // `==
-1, // `>
701, // <exp4>
-1, // `>=
-1, // `<
-1, // `<=
-1, // `instanceof
529, // `+
317, // <exp3>
462, // `-
-1, // `*
774, // <exp2>
-1, // `/
-1, // `%
-1, // <cast exp>
356, // <unary exp>
431, // <exp1>
128, // `!
-1, // <exp list>
-1, // `.
486, // `super
-1, // <mult exp>*
-1, // <mult exp>
500, // `new
-1, // <empty bracket pair>*
300, // INTLIT
425, // CHARLIT
518, // STRINGLIT
790, // `null
223, // `true
259, // `false
366, // `this
7, // letter
298, // "a"
298, // "p"
298, // "s"
298, // "v"
298, // "c"
298, // "f"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
530, // letter128
654, // {199..218 231..250}
654, // {193..198 225..230}
-1, // digit
681, // {"1".."9"}
412, // "0"
123, // digit128
37, // {176..185}
-1, // any
-1, // "["
716, // "-"
-1, // "<"
-1, // "|"
-1, // " "
250, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
792, // ";"
-1, // ">"
209, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
77, // "("
817, // "+"
-1, // "."
-1, // "_"
-1, // "="
29, // "@"
-1, // {10}
335, // "}"
316, // "!"
362, // "'"
558, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 345
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 346
22,675, // `;
127,792, // ";"
  }
,
{ // state 347
10,101, // `}
139,86, // "}"
  }
,
{ // state 348
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,271, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 349
2,657, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 350
0x80000000|525, // match move
0x80000000|784, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 351
0x80000000|739, // match move
0x80000000|639, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 352
161,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 353
7,234, // ID
16,695, // `(
21,88, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 354
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 355
31,MIN_REDUCTION+251, // `[
116,MIN_REDUCTION+251, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+251, // $NT
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 357
2,38, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 358
161,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 359
120,834, // " "
138,823, // {10}
147,492, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 361
22,663, // `;
127,792, // ";"
  }
,
{ // state 362
88,481, // "a"
89,481, // "p"
90,481, // "s"
91,481, // "v"
92,481, // "c"
93,481, // "f"
94,481, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,481, // "i"
96,481, // "l"
97,481, // "o"
98,481, // "r"
99,481, // "u"
100,481, // "x"
101,481, // "b"
102,481, // "e"
103,481, // "h"
104,481, // "n"
105,481, // "t"
106,481, // "w"
111,481, // {"1".."9"}
112,481, // "0"
115,437, // any
116,481, // "["
117,481, // "-"
118,481, // "<"
119,481, // "|"
120,481, // " "
121,481, // "#"
122,481, // "&"
123,481, // ")"
124,481, // ","
125,481, // "]"
126,481, // "/"
127,481, // ";"
128,481, // ">"
129,481, // "{"
130,481, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
131,481, // "%"
132,481, // "("
133,481, // "+"
134,481, // "."
135,481, // "_"
136,481, // "="
137,481, // "@"
138,481, // {10}
139,481, // "}"
140,481, // "!"
141,481, // "'"
142,481, // '"'
143,481, // "*"
  }
,
{ // state 363
16,390, // `(
21,273, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 364
16,390, // `(
35,22, // <call exp>
57,450, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 365
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 366
0x80000000|139, // match move
0x80000000|236, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 367
121,178, // "#"
  }
,
{ // state 368
103,429, // "h"
  }
,
{ // state 369
22,617, // `;
127,792, // ";"
  }
,
{ // state 370
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 371
0x80000000|245, // match move
0x80000000|478, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 372
31,MIN_REDUCTION+209, // `[
116,MIN_REDUCTION+209, // "["
161,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 373
0x80000000|48, // match move
0x80000000|91, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 374
7,499, // ID
8,309, // `{
10,337, // `}
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
139,86, // "}"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 375
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 376
31,MIN_REDUCTION+249, // `[
116,MIN_REDUCTION+249, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+249, // $NT
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 377
31,MIN_REDUCTION+244, // `[
116,MIN_REDUCTION+244, // "["
161,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 378
16,390, // `(
21,346, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 379
16,390, // `(
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
73,512, // <exp list>
132,77, // "("
  }
,
{ // state 380
0x80000000|247, // match move
0x80000000|17, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 381
10,713, // `}
139,86, // "}"
  }
,
{ // state 382
0x80000000|602, // match move
0x80000000|263, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 383
161,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 384
2,465, // ws*
120,834, // " "
138,823, // {10}
147,837, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 385
7,499, // ID
8,394, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,296, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,698, // <stmt>
34,167, // <assign>
35,636, // <call exp>
36,510, // `break
37,14, // <local var decl>
39,780, // `++
40,142, // `--
41,534, // `if
43,546, // `while
44,721, // `do
45,193, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,215, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 386
88,202, // "a"
  }
,
{ // state 387
120,MIN_REDUCTION+108, // " "
138,MIN_REDUCTION+108, // {10}
147,MIN_REDUCTION+108, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 388
2,23, // ws*
31,MIN_REDUCTION+216, // `[
116,MIN_REDUCTION+216, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 389
0x80000000|650, // match move
0x80000000|547, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 390
7,26, // ID
19,3, // <type>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,608, // "#"
  }
,
{ // state 391
31,MIN_REDUCTION+161, // `[
116,MIN_REDUCTION+161, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 392
16,390, // `(
21,777, // <exp>
33,687, // <stmt>
34,167, // <assign>
35,636, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 393
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 394
0x80000000|496, // match move
0x80000000|344, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 395
0x80000000|1, // match move
0x80000000|349, // no-match move
// T-test match for "=":
136,
  }
,
{ // state 396
161,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 397
120,MIN_REDUCTION+243, // " "
138,MIN_REDUCTION+243, // {10}
147,MIN_REDUCTION+243, // ws
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 398
2,755, // ws*
  }
,
{ // state 399
65,737, // `*
143,793, // "*"
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 400
88,674, // "a"
89,674, // "p"
90,674, // "s"
91,674, // "v"
92,674, // "c"
93,674, // "f"
94,674, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,674, // "i"
96,674, // "l"
97,674, // "o"
98,674, // "r"
99,674, // "u"
100,674, // "x"
101,674, // "b"
102,674, // "e"
103,674, // "h"
104,674, // "n"
105,674, // "t"
106,674, // "w"
109,715, // {193..198 225..230}
111,674, // {"1".."9"}
112,674, // "0"
114,715, // {176..185}
153,152, // $$2
158,197, // hexDigit
159,693, // hexDigit128
  }
,
{ // state 401
7,234, // ID
16,695, // `(
21,606, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 402
16,390, // `(
18,612, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 403
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 404
0x80000000|555, // match move
0x80000000|145, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 405
9,173, // <decl in class>*
10,267, // `}
12,228, // <decl in class>
13,591, // <method decl>
14,336, // `public
121,635, // "#"
139,86, // "}"
  }
,
{ // state 406
120,MIN_REDUCTION+244, // " "
138,MIN_REDUCTION+244, // {10}
147,MIN_REDUCTION+244, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 407
16,390, // `(
21,777, // <exp>
33,154, // <stmt>
34,167, // <assign>
35,636, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 408
161,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 409
117,747, // "-"
118,240, // "<"
119,641, // "|"
122,726, // "&"
128,357, // ">"
133,321, // "+"
136,782, // "="
140,735, // "!"
  }
,
{ // state 410
31,MIN_REDUCTION+80, // `[
116,MIN_REDUCTION+80, // "["
161,MIN_REDUCTION+80, // $NT
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 411
35,22, // <call exp>
70,244, // <unary exp>
71,431, // <exp1>
  }
,
{ // state 412
88,674, // "a"
89,674, // "p"
90,674, // "s"
91,674, // "v"
92,674, // "c"
93,674, // "f"
94,674, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,674, // "i"
96,674, // "l"
97,674, // "o"
98,674, // "r"
99,674, // "u"
100,674, // "x"
101,674, // "b"
102,674, // "e"
103,674, // "h"
104,674, // "n"
105,674, // "t"
106,674, // "w"
109,715, // {193..198 225..230}
111,674, // {"1".."9"}
112,674, // "0"
114,715, // {176..185}
152,400, // hexDigit*
153,451, // $$2
158,211, // hexDigit
159,693, // hexDigit128
  }
,
{ // state 413
0x80000000|341, // match move
0x80000000|376, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 414
53,351, // `!=
55,548, // `==
137,532, // "@"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 415
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 416
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 417
0x80000000|402, // match move
0x80000000|820, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 418
0x80000000|60, // match move
0x80000000|292, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 419
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 420
2,333, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 421
16,390, // `(
21,230, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 422
26,389, // `,
77,72, // <mult exp>
124,731, // ","
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 423
31,MIN_REDUCTION+241, // `[
116,MIN_REDUCTION+241, // "["
161,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 424
0x80000000|836, // match move
0x80000000|670, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 425
0x80000000|514, // match move
0x80000000|551, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 426
2,413, // ws*
31,MIN_REDUCTION+250, // `[
116,MIN_REDUCTION+250, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+250, // $NT
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 427
7,632, // ID
30,340, // <empty bracket pair>
31,227, // `[
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
116,714, // "["
  }
,
{ // state 428
161,MIN_REDUCTION+80, // $NT
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 429
2,302, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 430
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 431
0x80000000|42, // match move
0x80000000|772, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 432
31,MIN_REDUCTION+205, // `[
116,MIN_REDUCTION+205, // "["
161,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 433
56,809, // `>
58,182, // `>=
59,572, // `<
60,633, // `<=
61,643, // `instanceof
68,98, // `%
118,440, // "<"
121,741, // "#"
128,395, // ">"
131,27, // "%"
137,61, // "@"
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 434
120,834, // " "
138,823, // {10}
147,492, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 435
97,787, // "o"
  }
,
{ // state 436
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 437
0x80000000|561, // match move
0x80000000|388, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
16,390, // `(
35,22, // <call exp>
63,31, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 439
2,291, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
161,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 440
2,308, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 441
0x80000000|506, // match move
0x80000000|181, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 442
7,618, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 443
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 444
0x80000000|278, // match move
0x80000000|279, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
161,MIN_REDUCTION+243, // $NT
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 446
161,MIN_REDUCTION+72, // $NT
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 447
7,499, // ID
16,695, // `(
19,427, // <type>
21,777, // <exp>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
34,403, // <assign>
35,55, // <call exp>
39,780, // `++
40,142, // `--
46,576, // <for first>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,516, // "#"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 448
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 449
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 450
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 451
0x80000000|475, // match move
0x80000000|164, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 452
0x80000000|524, // match move
0x80000000|246, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 453
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 454
0x80000000|352, // match move
0x80000000|266, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 455
0x80000000|597, // match move
0x80000000|280, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 456
31,MIN_REDUCTION+88, // `[
116,MIN_REDUCTION+88, // "["
161,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 457
0x80000000|224, // match move
0x80000000|185, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 458
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 459
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 460
0x80000000|378, // match move
0x80000000|601, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 461
42,515, // `else
121,178, // "#"
  }
,
{ // state 462
0x80000000|411, // match move
0x80000000|543, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 463
30,241, // <empty bracket pair>
31,187, // `[
79,102, // <empty bracket pair>*
116,714, // "["
161,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 464
2,283, // ws*
  }
,
{ // state 465
0x80000000|494, // match move
0x80000000|359, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 466
16,390, // `(
35,22, // <call exp>
63,399, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 467
7,234, // ID
16,695, // `(
35,22, // <call exp>
57,779, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 468
2,523, // ws*
31,MIN_REDUCTION+252, // `[
116,MIN_REDUCTION+252, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+252, // $NT
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 470
2,160, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 471
161,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 472
35,22, // <call exp>
70,785, // <unary exp>
71,431, // <exp1>
  }
,
{ // state 473
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
20,460, // `return
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,168, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 474
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 475
161,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 476
161,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 477
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 478
7,499, // ID
8,394, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,296, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,188, // <stmt>
34,167, // <assign>
35,636, // <call exp>
36,510, // `break
37,14, // <local var decl>
39,780, // `++
40,142, // `--
41,534, // `if
43,546, // `while
44,721, // `do
45,193, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,215, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 479
17,631, // `)
123,104, // ")"
  }
,
{ // state 480
31,MIN_REDUCTION+247, // `[
116,MIN_REDUCTION+247, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+247, // $NT
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 481
0x80000000|810, // match move
0x80000000|652, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 482
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,526, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 483
16,390, // `(
18,697, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 484
0x80000000|136, // match move
0x80000000|432, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 485
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 486
74,766, // `.
134,135, // "."
  }
,
{ // state 487
2,517, // ws*
31,MIN_REDUCTION+254, // `[
116,MIN_REDUCTION+254, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+254, // $NT
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 488
7,234, // ID
16,695, // `(
35,22, // <call exp>
57,170, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 489
31,MIN_REDUCTION+222, // `[
116,MIN_REDUCTION+222, // "["
161,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 490
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 491
16,390, // `(
21,777, // <exp>
33,526, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 492
0x80000000|443, // match move
0x80000000|397, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 493
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 495
7,234, // ID
16,695, // `(
21,479, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 496
16,390, // `(
18,725, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 497
161,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 498
0x80000000|760, // match move
0x80000000|348, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 499
0x80000000|92, // match move
0x80000000|237, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 500
7,583, // ID
19,32, // <type>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,608, // "#"
  }
,
{ // state 501
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 502
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 503
96,76, // "l"
  }
,
{ // state 504
7,234, // ID
16,695, // `(
35,22, // <call exp>
52,414, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 505
161,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 506
16,390, // `(
21,220, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 507
16,390, // `(
21,777, // <exp>
34,622, // <assign>
35,82, // <call exp>
47,807, // <for third>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 508
22,238, // `;
127,792, // ";"
  }
,
{ // state 509
9,795, // <decl in class>*
10,258, // `}
12,228, // <decl in class>
13,591, // <method decl>
14,336, // `public
121,635, // "#"
139,86, // "}"
  }
,
{ // state 510
22,712, // `;
127,215, // ";"
  }
,
{ // state 511
0x80000000|719, // match move
0x80000000|579, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 512
17,813, // `)
123,104, // ")"
  }
,
{ // state 513
161,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 514
161,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 515
0x80000000|491, // match move
0x80000000|482, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 516
90,327, // "s"
93,386, // "f"
95,690, // "i"
101,435, // "b"
104,251, // "n"
105,176, // "t"
  }
,
{ // state 517
0x80000000|328, // match move
0x80000000|330, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 518
0x80000000|289, // match move
0x80000000|114, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
7,499, // ID
8,394, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,296, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,687, // <stmt>
34,167, // <assign>
35,636, // <call exp>
36,510, // `break
37,14, // <local var decl>
39,780, // `++
40,142, // `--
41,534, // `if
43,546, // `while
44,721, // `do
45,193, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,215, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 520
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 521
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 522
7,234, // ID
16,695, // `(
17,683, // `)
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
73,229, // <exp list>
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
123,104, // ")"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 523
0x80000000|542, // match move
0x80000000|355, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
16,390, // `(
21,808, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 525
161,MIN_REDUCTION+82, // $NT
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 528
2,592, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 529
0x80000000|216, // match move
0x80000000|324, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 530
0x80000000|295, // match move
0x80000000|730, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
16,390, // `(
21,207, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 532
119,641, // "|"
122,726, // "&"
136,782, // "="
140,735, // "!"
  }
,
{ // state 533
0x80000000|1, // match move
0x80000000|587, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 534
16,452, // `(
132,77, // "("
  }
,
{ // state 535
17,297, // `)
123,74, // ")"
  }
,
{ // state 536
31,MIN_REDUCTION+98, // `[
116,MIN_REDUCTION+98, // "["
161,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 537
16,390, // `(
35,22, // <call exp>
69,446, // <cast exp>
71,293, // <exp1>
132,77, // "("
  }
,
{ // state 538
0x80000000|620, // match move
0x80000000|235, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 539
16,127, // `(
31,MIN_REDUCTION+87, // `[
116,MIN_REDUCTION+87, // "["
132,77, // "("
161,MIN_REDUCTION+87, // $NT
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 540
0x80000000|679, // match move
0x80000000|705, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
10,314, // `}
139,86, // "}"
  }
,
{ // state 542
161,MIN_REDUCTION+251, // $NT
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 543
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
64,462, // `-
70,244, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 544
56,809, // `>
58,182, // `>=
59,572, // `<
60,633, // `<=
61,643, // `instanceof
68,98, // `%
118,440, // "<"
121,741, // "#"
128,395, // ">"
131,27, // "%"
137,61, // "@"
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 545
16,390, // `(
21,777, // <exp>
33,502, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 546
16,732, // `(
132,77, // "("
  }
,
{ // state 547
7,234, // ID
16,695, // `(
21,614, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 548
0x80000000|706, // match move
0x80000000|559, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 549
7,234, // ID
16,695, // `(
35,22, // <call exp>
50,728, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
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
{ // state 550
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 551
31,MIN_REDUCTION+92, // `[
116,MIN_REDUCTION+92, // "["
161,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 552
8,417, // `{
129,209, // "{"
  }
,
{ // state 553
161,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 554
2,651, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 555
161,MIN_REDUCTION+213, // $NT
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 557
22,69, // `;
127,792, // ";"
  }
,
{ // state 558
88,448, // "a"
89,448, // "p"
90,448, // "s"
91,448, // "v"
92,448, // "c"
93,448, // "f"
94,448, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,448, // "i"
96,448, // "l"
97,448, // "o"
98,448, // "r"
99,448, // "u"
100,448, // "x"
101,448, // "b"
102,448, // "e"
103,448, // "h"
104,448, // "n"
105,448, // "t"
106,448, // "w"
108,841, // {199..218 231..250}
109,841, // {193..198 225..230}
111,448, // {"1".."9"}
112,448, // "0"
114,841, // {176..185}
115,718, // any
116,448, // "["
117,448, // "-"
118,448, // "<"
119,448, // "|"
120,448, // " "
121,448, // "#"
122,448, // "&"
123,448, // ")"
124,448, // ","
125,448, // "]"
126,448, // "/"
127,448, // ";"
128,448, // ">"
129,448, // "{"
130,448, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
131,448, // "%"
132,448, // "("
133,448, // "+"
134,448, // "."
135,448, // "_"
136,448, // "="
137,448, // "@"
138,448, // {10}
139,448, // "}"
140,448, // "!"
141,448, // "'"
142,448, // '"'
143,448, // "*"
144,99, // any128
145,841, // {223}
146,841, // {128..175 186..192 219..222 224 251..255}
154,219, // any*
155,68, // $$3
  }
,
{ // state 559
7,234, // ID
16,695, // `(
35,22, // <call exp>
54,751, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 560
161,MIN_REDUCTION+242, // $NT
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 561
2,23, // ws*
161,MIN_REDUCTION+216, // $NT
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 562
31,MIN_REDUCTION+104, // `[
116,MIN_REDUCTION+104, // "["
161,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 563
0x80000000|19, // match move
0x80000000|122, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 564
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 565
7,754, // ID
16,695, // `(
21,777, // <exp>
34,622, // <assign>
35,82, // <call exp>
39,780, // `++
40,142, // `--
47,807, // <for third>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 566
7,234, // ID
16,695, // `(
21,230, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 567
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 568
0x80000000|646, // match move
0x80000000|504, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 569
7,234, // ID
16,695, // `(
21,199, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 570
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 571
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 572
0x80000000|269, // match move
0x80000000|467, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 573
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 574
0x80000000|125, // match move
0x80000000|749, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 575
102,134, // "e"
  }
,
{ // state 576
22,382, // `;
127,792, // ";"
  }
,
{ // state 577
7,234, // ID
16,695, // `(
21,557, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 578
8,81, // `{
129,209, // "{"
  }
,
{ // state 579
7,234, // ID
16,695, // `(
21,9, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 580
7,342, // ID
30,340, // <empty bracket pair>
31,227, // `[
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
116,714, // "["
  }
,
{ // state 581
31,MIN_REDUCTION+215, // `[
116,MIN_REDUCTION+215, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 582
0x80000000|653, // match move
0x80000000|748, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 583
16,260, // `(
132,77, // "("
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 584
120,MIN_REDUCTION+107, // " "
138,MIN_REDUCTION+107, // {10}
147,MIN_REDUCTION+107, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 585
100,198, // "x"
  }
,
{ // state 586
161,MIN_REDUCTION+247, // $NT
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 587
22,109, // `;
31,MIN_REDUCTION+98, // `[
116,MIN_REDUCTION+98, // "["
127,792, // ";"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 588
16,390, // `(
35,22, // <call exp>
57,170, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 589
7,234, // ID
16,695, // `(
35,22, // <call exp>
57,115, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 590
2,842, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 591
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 592
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 593
2,707, // ws*
161,MIN_REDUCTION+134, // $NT
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 594
2,283, // ws*
161,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 595
2,656, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 596
17,789, // `)
123,74, // ")"
  }
,
{ // state 597
16,390, // `(
21,634, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 598
31,MIN_REDUCTION+90, // `[
79,102, // <empty bracket pair>*
116,MIN_REDUCTION+90, // "["
161,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 599
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 600
16,390, // `(
132,77, // "("
  }
,
{ // state 601
7,234, // ID
16,695, // `(
21,346, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 602
16,390, // `(
21,147, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 603
22,MIN_REDUCTION+46, // `;
31,MIN_REDUCTION+98, // `[
116,MIN_REDUCTION+98, // "["
127,MIN_REDUCTION+46, // ";"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 604
161,MIN_REDUCTION+222, // $NT
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 605
161,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 606
17,371, // `)
123,74, // ")"
  }
,
{ // state 607
2,418, // ws*
31,MIN_REDUCTION+138, // `[
116,MIN_REDUCTION+138, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+138, // $NT
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 608
95,690, // "i"
101,435, // "b"
  }
,
{ // state 609
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 611
161,MIN_REDUCTION+215, // $NT
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 612
0x80000000|783, // match move
0x80000000|85, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 613
97,787, // "o"
98,528, // "r"
  }
,
{ // state 614
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 615
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 616
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 617
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 618
8,509, // `{
129,209, // "{"
  }
,
{ // state 619
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 621
31,MIN_REDUCTION+91, // `[
116,MIN_REDUCTION+91, // "["
161,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 623
87,556, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,571, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
110,375, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,83, // digit128
114,319, // {176..185}
135,416, // "_"
145,801, // {223}
148,710, // idChar*
149,393, // $$0
156,6, // idChar
157,590, // idChar128
  }
,
{ // state 624
2,821, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 625
161,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 626
0x80000000|63, // match move
0x80000000|763, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 627
0x80000000|36, // match move
0x80000000|325, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 628
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 629
16,390, // `(
21,88, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 630
0x80000000|438, // match move
0x80000000|315, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 631
0x80000000|642, // match move
0x80000000|153, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 632
38,307, // `=
136,420, // "="
  }
,
{ // state 633
0x80000000|364, // match move
0x80000000|275, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 634
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 635
89,41, // "p"
  }
,
{ // state 636
0x80000000|1, // match move
0x80000000|172, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 637
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 638
2,96, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 639
7,234, // ID
16,695, // `(
35,22, // <call exp>
54,544, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 640
51,568, // `&&
137,756, // "@"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 641
2,248, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 642
161,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 643
7,26, // ID
29,20, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 644
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 645
0x80000000|169, // match move
0x80000000|58, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 646
16,390, // `(
35,22, // <call exp>
52,414, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 647
7,26, // ID
19,200, // <type>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,608, // "#"
  }
,
{ // state 648
161,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 649
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 650
16,390, // `(
21,614, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 651
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 652
31,MIN_REDUCTION+105, // `[
116,MIN_REDUCTION+105, // "["
161,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 654
0x80000000|107, // match move
0x80000000|759, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 655
16,390, // `(
18,829, // <stmt>*
21,777, // <exp>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 656
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 657
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 658
0x80000000|255, // match move
0x80000000|155, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 659
16,441, // `(
132,77, // "("
  }
,
{ // state 660
7,234, // ID
16,695, // `(
35,22, // <call exp>
57,677, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 661
161,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 662
7,232, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 663
0x80000000|252, // match move
0x80000000|577, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 664
22,347, // `;
127,792, // ";"
  }
,
{ // state 665
0x80000000|655, // match move
0x80000000|791, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 666
7,499, // ID
8,394, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,296, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,154, // <stmt>
34,167, // <assign>
35,636, // <call exp>
36,510, // `break
37,14, // <local var decl>
39,780, // `++
40,142, // `--
41,534, // `if
43,546, // `while
44,721, // `do
45,193, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,215, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 667
24,762, // <formal argument>*
25,430, // <formal argument>
26,647, // `,
124,731, // ","
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 668
31,MIN_REDUCTION+206, // `[
116,MIN_REDUCTION+206, // "["
161,MIN_REDUCTION+206, // $NT
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 669
0x80000000|838, // match move
0x80000000|549, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 670
7,499, // ID
16,695, // `(
19,427, // <type>
21,777, // <exp>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
34,403, // <assign>
35,55, // <call exp>
39,780, // `++
40,142, // `--
46,361, // <for first>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,516, // "#"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 671
0x80000000|383, // match move
0x80000000|10, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 672
16,265, // `(
132,77, // "("
  }
,
{ // state 673
0x80000000|573, // match move
0x80000000|143, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 674
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 675
10,18, // `}
139,86, // "}"
  }
,
{ // state 676
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 677
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 678
10,458, // `}
139,86, // "}"
  }
,
{ // state 679
161,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 680
16,390, // `(
21,777, // <exp>
34,403, // <assign>
35,55, // <call exp>
46,576, // <for first>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 681
110,54, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,800, // digit128
114,37, // {176..185}
150,717, // digit*
151,773, // $$1
  }
,
{ // state 682
0x80000000|604, // match move
0x80000000|489, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 683
0x80000000|428, // match move
0x80000000|410, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 684
16,390, // `(
21,777, // <exp>
33,698, // <stmt>
34,167, // <assign>
35,636, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 685
30,162, // <empty bracket pair>
31,187, // `[
116,714, // "["
  }
,
{ // state 686
0x80000000|586, // match move
0x80000000|480, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 687
0x80000000|798, // match move
0x80000000|803, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 688
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
63,399, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 689
161,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 690
105,287, // "t"
  }
,
{ // state 691
0x80000000|625, // match move
0x80000000|256, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 692
2,226, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 693
0x80000000|144, // match move
0x80000000|468, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 694
0x80000000|783, // match move
0x80000000|374, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 695
0x80000000|323, // match move
0x80000000|495, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 696
16,390, // `(
35,22, // <call exp>
66,338, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 697
0x80000000|783, // match move
0x80000000|339, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 698
0x80000000|262, // match move
0x80000000|839, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 699
161,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 701
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 702
161,MIN_REDUCTION+161, // $NT
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 703
7,234, // ID
16,695, // `(
21,664, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 704
31,MIN_REDUCTION+224, // `[
116,MIN_REDUCTION+224, // "["
161,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 705
31,MIN_REDUCTION+221, // `[
116,MIN_REDUCTION+221, // "["
161,MIN_REDUCTION+221, // $NT
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 706
16,390, // `(
35,22, // <call exp>
54,751, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 707
0x80000000|768, // match move
0x80000000|62, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 708
7,499, // ID
8,309, // `{
16,695, // `(
19,189, // <type>
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,502, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,250, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 709
161,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 710
87,556, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,571, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
110,375, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,83, // digit128
114,319, // {176..185}
135,416, // "_"
145,801, // {223}
149,469, // $$0
156,628, // idChar
157,590, // idChar128
  }
,
{ // state 711
0x80000000|421, // match move
0x80000000|566, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 712
0x80000000|131, // match move
0x80000000|47, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 713
43,192, // `while
121,140, // "#"
  }
,
{ // state 714
2,39, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 715
0x80000000|513, // match move
0x80000000|704, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 716
2,449, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 717
110,459, // digit
111,201, // {"1".."9"}
112,201, // "0"
113,800, // digit128
114,37, // {176..185}
151,484, // $$1
  }
,
{ // state 718
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 719
16,390, // `(
21,9, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 720
7,26, // ID
17,231, // `)
19,71, // <type>
23,804, // <formal list>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,608, // "#"
123,74, // ")"
  }
,
{ // state 721
8,498, // `{
129,209, // "{"
  }
,
{ // state 722
0x80000000|217, // match move
0x80000000|569, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 723
0x80000000|407, // match move
0x80000000|666, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 724
161,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 725
0x80000000|783, // match move
0x80000000|332, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 726
2,249, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 727
0x80000000|65, // match move
0x80000000|607, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 728
51,568, // `&&
137,756, // "@"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 729
31,227, // `[
116,714, // "["
  }
,
{ // state 730
2,35, // ws*
31,MIN_REDUCTION+202, // `[
116,MIN_REDUCTION+202, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 731
2,490, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 732
0x80000000|531, // match move
0x80000000|306, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 733
0x80000000|286, // match move
0x80000000|156, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 734
0x80000000|103, // match move
0x80000000|118, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 735
2,501, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 736
0x80000000|537, // match move
0x80000000|40, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 737
0x80000000|285, // match move
0x80000000|276, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 738
0x80000000|57, // match move
0x80000000|401, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 739
16,390, // `(
35,22, // <call exp>
54,544, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 740
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 741
95,190, // "i"
  }
,
{ // state 742
7,26, // ID
17,204, // `)
19,71, // <type>
23,596, // <formal list>
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
121,608, // "#"
123,74, // ")"
  }
,
{ // state 743
2,517, // ws*
161,MIN_REDUCTION+254, // $NT
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 744
31,MIN_REDUCTION+201, // `[
116,MIN_REDUCTION+201, // "["
120,671, // " "
138,21, // {10}
147,146, // ws
161,MIN_REDUCTION+201, // $NT
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 745
32,776, // `]
125,457, // "]"
  }
,
{ // state 746
31,MIN_REDUCTION+203, // `[
116,MIN_REDUCTION+203, // "["
161,MIN_REDUCTION+203, // $NT
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 747
2,28, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 748
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 749
7,234, // ID
16,695, // `(
21,745, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 750
2,78, // ws*
161,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 751
56,809, // `>
58,182, // `>=
59,572, // `<
60,633, // `<=
61,643, // `instanceof
68,98, // `%
118,440, // "<"
121,741, // "#"
128,395, // ">"
131,27, // "%"
137,61, // "@"
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 752
2,106, // ws*
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 753
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 754
0x80000000|1, // match move
0x80000000|843, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 755
0x80000000|648, // match move
0x80000000|133, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 756
119,641, // "|"
122,726, // "&"
  }
,
{ // state 757
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 758
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 759
31,MIN_REDUCTION+102, // `[
116,MIN_REDUCTION+102, // "["
161,MIN_REDUCTION+102, // $NT
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 760
16,390, // `(
21,777, // <exp>
33,271, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 761
2,113, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 762
25,84, // <formal argument>
26,647, // `,
124,731, // ","
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 763
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 764
0x80000000|264, // match move
0x80000000|833, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 765
16,390, // `(
21,89, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 766
7,320, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 767
7,234, // ID
16,695, // `(
21,89, // <exp>
32,497, // `]
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
125,802, // "]"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 768
161,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 769
2,23, // ws*
  }
,
{ // state 770
161,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 771
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 772
31,574, // `[
74,196, // `.
116,714, // "["
134,135, // "."
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 773
0x80000000|471, // match move
0x80000000|668, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 774
67,301, // `/
126,158, // "/"
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 775
2,658, // ws*
161,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 776
0x80000000|835, // match move
0x80000000|456, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 777
38,455, // `=
136,420, // "="
  }
,
{ // state 778
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 779
62,630, // `+
64,34, // `-
117,716, // "-"
133,817, // "+"
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 780
7,453, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 781
2,413, // ws*
161,MIN_REDUCTION+250, // $NT
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 782
2,8, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 783
16,390, // `(
21,777, // <exp>
33,66, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 784
31,MIN_REDUCTION+82, // `[
116,MIN_REDUCTION+82, // "["
161,MIN_REDUCTION+82, // $NT
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 785
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 786
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
64,462, // `-
70,785, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 787
2,474, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 788
160,MIN_REDUCTION+0, // $
  }
,
{ // state 789
8,665, // `{
129,209, // "{"
  }
,
{ // state 790
0x80000000|553, // match move
0x80000000|49, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 791
7,499, // ID
8,309, // `{
16,695, // `(
18,829, // <stmt>*
19,189, // <type>
20,151, // `return
21,777, // <exp>
22,740, // `;
27,485, // `int
28,43, // `boolean
29,753, // <instance type>
33,322, // <stmt>
34,508, // <assign>
35,533, // <call exp>
36,203, // `break
37,369, // <local var decl>
39,780, // `++
40,142, // `--
41,112, // `if
43,184, // `while
44,578, // `do
45,100, // `for
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,168, // "#"
127,792, // ";"
129,209, // "{"
132,77, // "("
133,817, // "+"
137,29, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 792
2,521, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 793
2,493, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 794
30,162, // <empty bracket pair>
31,187, // `[
116,714, // "["
161,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 795
10,610, // `}
12,615, // <decl in class>
13,591, // <method decl>
14,336, // `public
121,635, // "#"
139,86, // "}"
  }
,
{ // state 796
16,390, // `(
21,777, // <exp>
33,381, // <stmt>
34,508, // <assign>
35,533, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 797
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 798
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 799
88,202, // "a"
97,638, // "o"
  }
,
{ // state 800
0x80000000|781, // match move
0x80000000|426, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 801
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 802
2,2, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
161,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 804
17,552, // `)
123,74, // ")"
  }
,
{ // state 805
31,MIN_REDUCTION+99, // `[
116,MIN_REDUCTION+99, // "["
161,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 806
161,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 807
17,270, // `)
123,74, // ")"
  }
,
{ // state 808
17,723, // `)
123,74, // ")"
  }
,
{ // state 809
0x80000000|281, // match move
0x80000000|589, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 810
161,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 811
0x80000000|379, // match move
0x80000000|828, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 812
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 813
0x80000000|221, // match move
0x80000000|186, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 814
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 815
2,283, // ws*
31,MIN_REDUCTION+162, // `[
116,MIN_REDUCTION+162, // "["
120,671, // " "
138,21, // {10}
147,183, // ws
161,MIN_REDUCTION+162, // $NT
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 816
31,MIN_REDUCTION+106, // `[
116,MIN_REDUCTION+106, // "["
161,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 817
2,520, // ws*
120,476, // " "
138,253, // {10}
147,396, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 818
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 819
30,241, // <empty bracket pair>
31,187, // `[
79,102, // <empty bracket pair>*
116,714, // "["
  }
,
{ // state 820
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
499, // ID
309, // `{
-1, // <decl in class>*
304, // `}
-1, // `extends
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
695, // `(
-1, // `)
612, // <stmt>*
189, // <type>
-1, // `return
777, // <exp>
740, // `;
-1, // <formal list>
-1, // <formal argument>*
-1, // <formal argument>
-1, // `,
485, // `int
43, // `boolean
753, // <instance type>
-1, // <empty bracket pair>
-1, // `[
-1, // `]
322, // <stmt>
508, // <assign>
533, // <call exp>
203, // `break
369, // <local var decl>
-1, // `=
780, // `++
142, // `--
112, // `if
-1, // `else
184, // `while
578, // `do
100, // `for
-1, // <for first>
-1, // <for third>
73, // <exp8>
-1, // `||
640, // <exp7>
-1, // `&&
175, // <exp6>
-1, // `!=
433, // <exp5>
-1, // `==
-1, // `>
701, // <exp4>
-1, // `>=
-1, // `<
-1, // `<=
-1, // `instanceof
529, // `+
317, // <exp3>
462, // `-
-1, // `*
774, // <exp2>
-1, // `/
-1, // `%
-1, // <cast exp>
356, // <unary exp>
431, // <exp1>
128, // `!
-1, // <exp list>
-1, // `.
486, // `super
-1, // <mult exp>*
-1, // <mult exp>
500, // `new
-1, // <empty bracket pair>*
300, // INTLIT
425, // CHARLIT
518, // STRINGLIT
790, // `null
223, // `true
259, // `false
366, // `this
7, // letter
298, // "a"
298, // "p"
298, // "s"
298, // "v"
298, // "c"
298, // "f"
298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
298, // "i"
298, // "l"
298, // "o"
298, // "r"
298, // "u"
298, // "x"
298, // "b"
298, // "e"
298, // "h"
298, // "n"
298, // "t"
298, // "w"
530, // letter128
654, // {199..218 231..250}
654, // {193..198 225..230}
-1, // digit
681, // {"1".."9"}
412, // "0"
123, // digit128
37, // {176..185}
-1, // any
-1, // "["
716, // "-"
-1, // "<"
-1, // "|"
-1, // " "
250, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
792, // ";"
-1, // ">"
209, // "{"
-1, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
77, // "("
817, // "+"
-1, // "."
-1, // "_"
-1, // "="
29, // "@"
-1, // {10}
86, // "}"
316, // "!"
362, // "'"
558, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 821
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 822
2,78, // ws*
  }
,
{ // state 823
0x80000000|758, // match move
0x80000000|387, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 824
42,194, // `else
121,178, // "#"
  }
,
{ // state 825
0x80000000|212, // match move
0x80000000|157, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 826
7,234, // ID
16,695, // `(
35,22, // <call exp>
62,529, // `+
64,462, // `-
66,338, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 827
2,106, // ws*
120,834, // " "
138,823, // {10}
147,837, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 828
7,234, // ID
16,695, // `(
17,350, // `)
21,64, // <exp>
35,22, // <call exp>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
62,529, // `+
63,317, // <exp3>
64,462, // `-
66,774, // <exp2>
70,356, // <unary exp>
71,431, // <exp1>
72,128, // `!
73,512, // <exp list>
75,486, // `super
78,500, // `new
80,300, // INTLIT
81,425, // CHARLIT
82,518, // STRINGLIT
83,790, // `null
84,223, // `true
85,259, // `false
86,366, // `this
87,7, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,530, // letter128
108,654, // {199..218 231..250}
109,654, // {193..198 225..230}
111,681, // {"1".."9"}
112,412, // "0"
113,123, // digit128
114,37, // {176..185}
117,716, // "-"
121,95, // "#"
123,104, // ")"
132,77, // "("
133,817, // "+"
137,30, // "@"
140,316, // "!"
141,362, // "'"
142,558, // '"'
  }
,
{ // state 829
0x80000000|783, // match move
0x80000000|473, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 830
0x80000000|680, // match move
0x80000000|447, // no-match move
0x80000000|600, // NT-test-match state for <cast exp>
  }
,
{ // state 831
7,225, // ID
87,623, // letter
88,298, // "a"
89,298, // "p"
90,298, // "s"
91,298, // "v"
92,298, // "c"
93,298, // "f"
94,298, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
95,298, // "i"
96,298, // "l"
97,298, // "o"
98,298, // "r"
99,298, // "u"
100,298, // "x"
101,298, // "b"
102,298, // "e"
103,298, // "h"
104,298, // "n"
105,298, // "t"
106,298, // "w"
107,761, // letter128
108,111, // {199..218 231..250}
109,111, // {193..198 225..230}
  }
,
{ // state 832
96,439, // "l"
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
{ // state 833
31,MIN_REDUCTION+220, // `[
116,MIN_REDUCTION+220, // "["
161,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 834
0x80000000|527, // match move
0x80000000|584, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 835
161,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 836
16,390, // `(
21,777, // <exp>
34,403, // <assign>
35,55, // <call exp>
46,361, // <for first>
48,73, // <exp8>
50,640, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 837
0x80000000|700, // match move
0x80000000|406, // no-match move
0x80000000|367, // NT-test-match state for `else
  }
,
{ // state 838
16,390, // `(
35,22, // <call exp>
50,728, // <exp7>
52,175, // <exp6>
54,433, // <exp5>
57,701, // <exp4>
63,317, // <exp3>
66,774, // <exp2>
69,12, // <cast exp>
70,356, // <unary exp>
71,431, // <exp1>
132,77, // "("
  }
,
{ // state 839
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 840
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 841
0x80000000|699, // match move
0x80000000|816, // no-match move
0x80000000|729, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 842
120,476, // " "
138,253, // {10}
147,445, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 843
16,127, // `(
31,MIN_REDUCTION+87, // `[
39,415, // `++
40,334, // `--
116,MIN_REDUCTION+87, // "["
132,77, // "("
137,409, // "@"
MIN_REDUCTION+87, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[844][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <class decl> ::= `class ID `extends ID `{ <decl in class>* `}
(5<<16)+7,
// <class decl> ::= `class ID `extends ID `{ `}
(5<<16)+6,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <method decl> ::= `public <type> ID `( `) `{ <stmt>* `return <exp> `; `}
(13<<16)+11,
// <method decl> ::= `public <type> ID `( `) `{ `return <exp> `; `}
(13<<16)+10,
// <formal list> ::= <type> ID <formal argument>*
(23<<16)+3,
// <formal list> ::= <type> ID
(23<<16)+2,
// <formal argument> ::= `, <type> ID
(25<<16)+3,
// <method decl> ::= `public `void ID `( <formal list> `) `{ <stmt>* `}
(13<<16)+9,
// <method decl> ::= `public `void ID `( <formal list> `) `{ `}
(13<<16)+8,
// <method decl> ::= `public <type> ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}
(13<<16)+12,
// <method decl> ::= `public <type> ID `( <formal list> `) `{ `return <exp> `; `}
(13<<16)+11,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= <instance type>
(19<<16)+1,
// <instance type> ::= ID
(29<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(30<<16)+2,
// <stmt> ::= `;
(33<<16)+1,
// <stmt> ::= <assign> `;
(33<<16)+2,
// <stmt> ::= <call exp> `;
(33<<16)+2,
// <stmt> ::= `break `;
(33<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(33<<16)+3,
// <stmt> ::= `{ `}
(33<<16)+2,
// <stmt> ::= <local var decl> `;
(33<<16)+2,
// <assign> ::= <exp> `= <exp>
(34<<16)+3,
// <assign> ::= `++ ID
(34<<16)+2,
// <assign> ::= ID `++
(34<<16)+2,
// <assign> ::= `-- ID
(34<<16)+2,
// <assign> ::= ID `--
(34<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(37<<16)+4,
// <stmt> ::= `if `( <exp> `) <stmt> !`else
(33<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(33<<16)+7,
// <stmt> ::= `while `( <exp> `) <stmt>
(33<<16)+5,
// <stmt> ::= `do `{ <stmt> `} `while `( <exp> `) `;
(33<<16)+9,
// <stmt> ::= `for `( <for first> `; <exp> `; <for third> `) <stmt>
(33<<16)+9,
// <for first> ::= <type> ID `= <exp>
(46<<16)+4,
// <for first> ::= <assign>
(46<<16)+1,
// <for first> ::= <call exp>
(46<<16)+1,
// <for third> ::= <assign>
(47<<16)+1,
// <for third> ::= <call exp>
(47<<16)+1,
// <exp> ::= <exp8>
(21<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(48<<16)+3,
// <exp8> ::= <exp7>
(48<<16)+1,
// <exp7> ::= <exp7> `&& <exp6>
(50<<16)+3,
// <exp7> ::= <exp6>
(50<<16)+1,
// <exp6> ::= <exp6> `!= <exp5>
(52<<16)+3,
// <exp6> ::= <exp6> `== <exp5>
(52<<16)+3,
// <exp6> ::= <exp5>
(52<<16)+1,
// <exp5> ::= <exp5> `> <exp4>
(54<<16)+3,
// <exp5> ::= <exp5> `>= <exp4>
(54<<16)+3,
// <exp5> ::= <exp5> `< <exp4>
(54<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(54<<16)+3,
// <exp5> ::= <exp5> `instanceof <instance type>
(54<<16)+3,
// <exp5> ::= <exp4>
(54<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(57<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(57<<16)+3,
// <exp4> ::= <exp3>
(57<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(63<<16)+3,
// <exp3> ::= <exp2> `/ <exp2>
(63<<16)+3,
// <exp5> ::= <exp5> `% <exp4>
(54<<16)+3,
// <exp3> ::= <exp2>
(63<<16)+1,
// <exp2> ::= <cast exp>
(66<<16)+1,
// <exp2> ::= <unary exp>
(66<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(69<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(69<<16)+4,
// <unary exp> ::= `- <unary exp>
(70<<16)+2,
// <unary exp> ::= `+ <unary exp>
(70<<16)+2,
// <unary exp> ::= `! <unary exp>
(70<<16)+2,
// <unary exp> ::= <exp1>
(70<<16)+1,
// <call exp> ::= ID `( `)
(35<<16)+3,
// <call exp> ::= ID `( <exp list> `)
(35<<16)+4,
// <call exp> ::= <exp1> `. ID `( `)
(35<<16)+5,
// <call exp> ::= <exp1> `. ID `( <exp list> `)
(35<<16)+6,
// <call exp> ::= `super `. ID `( `)
(35<<16)+5,
// <call exp> ::= `super `. ID `( <exp list> `)
(35<<16)+6,
// <exp list> ::= <exp> <mult exp>*
(73<<16)+2,
// <exp list> ::= <exp>
(73<<16)+1,
// <mult exp> ::= `, <exp>
(77<<16)+2,
// <exp1> ::= ID
(71<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(71<<16)+4,
// <exp1> ::= `new <type> `[ <exp> `] <empty bracket pair>*
(71<<16)+6,
// <exp1> ::= `new <type> `[ <exp> `]
(71<<16)+5,
// <exp1> ::= INTLIT
(71<<16)+1,
// <exp1> ::= CHARLIT
(71<<16)+1,
// <exp1> ::= STRINGLIT
(71<<16)+1,
// <exp1> ::= `null
(71<<16)+1,
// <exp1> ::= `true
(71<<16)+1,
// <exp1> ::= `false
(71<<16)+1,
// <exp1> ::= `this
(71<<16)+1,
// <exp1> ::= <call exp>
(71<<16)+1,
// <exp1> ::= `new ID `( `)
(71<<16)+4,
// <exp1> ::= !<cast exp> `( <exp> `)
(71<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(87<<16)+1,
// letter128 ::= {193..218 225..250}
(107<<16)+1,
// digit ::= {"0".."9"}
(110<<16)+1,
// digit128 ::= {176..185}
(113<<16)+1,
// any ::= {0..127}
(115<<16)+1,
// any128 ::= {128..255}
(144<<16)+1,
// ws ::= " "
(147<<16)+1,
// ws ::= {10}
(147<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(28<<16)+4,
// `boolean ::= "#" "b" "o"
(28<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `extends ::= "#" "e" "x" ws*
(11<<16)+4,
// `extends ::= "#" "e" "x"
(11<<16)+3,
// `void ::= "#" "v" "o" ws*
(15<<16)+4,
// `void ::= "#" "v" "o"
(15<<16)+3,
// `int ::= "#" "i" "t" ws*
(27<<16)+4,
// `int ::= "#" "i" "t"
(27<<16)+3,
// `while ::= "#" "w" "h" ws*
(43<<16)+4,
// `while ::= "#" "w" "h"
(43<<16)+3,
// `if ::= "#" "+" ws*
(41<<16)+3,
// `if ::= "#" "+"
(41<<16)+2,
// `else ::= "#" "e" "l" ws*
(42<<16)+4,
// `else ::= "#" "e" "l"
(42<<16)+3,
// `for ::= "#" "f" "o" ws*
(45<<16)+4,
// `for ::= "#" "f" "o"
(45<<16)+3,
// `break ::= "#" "b" "r" ws*
(36<<16)+4,
// `break ::= "#" "b" "r"
(36<<16)+3,
// `this ::= "#" "t" "h" ws*
(86<<16)+4,
// `this ::= "#" "t" "h"
(86<<16)+3,
// `false ::= "#" "f" "a" ws*
(85<<16)+4,
// `false ::= "#" "f" "a"
(85<<16)+3,
// `true ::= "#" "t" "r" ws*
(84<<16)+4,
// `true ::= "#" "t" "r"
(84<<16)+3,
// `super ::= "#" "s" "u" ws*
(75<<16)+4,
// `super ::= "#" "s" "u"
(75<<16)+3,
// `null ::= "#" "n" "u" ws*
(83<<16)+4,
// `null ::= "#" "n" "u"
(83<<16)+3,
// `return ::= "#" "r" "e" ws*
(20<<16)+4,
// `return ::= "#" "r" "e"
(20<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(61<<16)+4,
// `instanceof ::= "#" "i" "n"
(61<<16)+3,
// `new ::= "#" "n" "e" ws*
(78<<16)+4,
// `new ::= "#" "n" "e"
(78<<16)+3,
// `do ::= "#" "-" ws*
(44<<16)+3,
// `do ::= "#" "-"
(44<<16)+2,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `! ::= "!" ws*
(72<<16)+2,
// `! ::= "!"
(72<<16)+1,
// `!= ::= "@" "!" ws*
(53<<16)+3,
// `!= ::= "@" "!"
(53<<16)+2,
// `% ::= "%" ws*
(68<<16)+2,
// `% ::= "%"
(68<<16)+1,
// `&& ::= "@" "&" ws*
(51<<16)+3,
// `&& ::= "@" "&"
(51<<16)+2,
// `* ::= "*" ws*
(65<<16)+2,
// `* ::= "*"
(65<<16)+1,
// `( ::= "(" ws*
(16<<16)+2,
// `( ::= "("
(16<<16)+1,
// `) ::= ")" ws*
(17<<16)+2,
// `) ::= ")"
(17<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(64<<16)+2,
// `- ::= "-"
(64<<16)+1,
// `+ ::= "+" ws*
(62<<16)+2,
// `+ ::= "+"
(62<<16)+1,
// `= ::= "=" ws*
(38<<16)+2,
// `= ::= "="
(38<<16)+1,
// `== ::= "@" "=" ws*
(55<<16)+3,
// `== ::= "@" "="
(55<<16)+2,
// `[ ::= "[" ws*
(31<<16)+2,
// `[ ::= "["
(31<<16)+1,
// `] ::= "]" ws*
(32<<16)+2,
// `] ::= "]"
(32<<16)+1,
// `|| ::= "@" "|" ws*
(49<<16)+3,
// `|| ::= "@" "|"
(49<<16)+2,
// `< ::= "<" ws*
(59<<16)+2,
// `< ::= "<"
(59<<16)+1,
// `<= ::= "@" "<" ws*
(60<<16)+3,
// `<= ::= "@" "<"
(60<<16)+2,
// `, ::= "," ws*
(26<<16)+2,
// `, ::= ","
(26<<16)+1,
// `> ::= ">" !"=" ws*
(56<<16)+2,
// `> ::= ">" !"="
(56<<16)+1,
// `>= ::= "@" ">" ws*
(58<<16)+3,
// `>= ::= "@" ">"
(58<<16)+2,
// `. ::= "." ws*
(74<<16)+2,
// `. ::= "."
(74<<16)+1,
// `; ::= ";" ws*
(22<<16)+2,
// `; ::= ";"
(22<<16)+1,
// `++ ::= "@" "+" ws*
(39<<16)+3,
// `++ ::= "@" "+"
(39<<16)+2,
// `-- ::= "@" "-" ws*
(40<<16)+3,
// `-- ::= "@" "-"
(40<<16)+2,
// `/ ::= "/" ws*
(67<<16)+2,
// `/ ::= "/"
(67<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(80<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(80<<16)+2,
// INTLIT ::= digit128 ws*
(80<<16)+2,
// INTLIT ::= digit128
(80<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(80<<16)+3,
// INTLIT ::= "0" $$2
(80<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(82<<16)+3,
// STRINGLIT ::= "@" '"'
(82<<16)+2,
// STRINGLIT ::= '"' any* $$3
(82<<16)+3,
// STRINGLIT ::= '"' $$3
(82<<16)+2,
// CHARLIT ::= "'" any ws*
(81<<16)+3,
// CHARLIT ::= "'" any
(81<<16)+2,
// idChar ::= letter
(156<<16)+1,
// idChar ::= digit
(156<<16)+1,
// idChar ::= "_"
(156<<16)+1,
// idChar128 ::= letter128
(157<<16)+1,
// idChar128 ::= digit128
(157<<16)+1,
// idChar128 ::= {223}
(157<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(158<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(159<<16)+1,
// digit* ::= digit* digit
(150<<16)+2,
// digit* ::= digit
(150<<16)+1,
// any* ::= any* any
(154<<16)+2,
// any* ::= any
(154<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(152<<16)+2,
// hexDigit* ::= hexDigit
(152<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(148<<16)+2,
// idChar* ::= idChar
(148<<16)+1,
// <formal argument>* ::= <formal argument>* <formal argument>
(24<<16)+2,
// <formal argument>* ::= <formal argument>
(24<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(79<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(79<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <mult exp>* ::= <mult exp>* <mult exp>
(76<<16)+2,
// <mult exp>* ::= <mult exp>
(76<<16)+1,
// $$0 ::= idChar128 ws*
(149<<16)+2,
// $$0 ::= idChar128
(149<<16)+1,
// $$1 ::= digit128 ws*
(151<<16)+2,
// $$1 ::= digit128
(151<<16)+1,
// $$2 ::= hexDigit128 ws*
(153<<16)+2,
// $$2 ::= hexDigit128
(153<<16)+1,
// $$3 ::= any128 ws*
(155<<16)+2,
// $$3 ::= any128
(155<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
130, // 0
130, // 1
130, // 2
130, // 3
130, // 4
130, // 5
130, // 6
130, // 7
130, // 8
130, // 9
138, // 10
130, // 11
130, // 12
130, // 13
130, // 14
130, // 15
130, // 16
130, // 17
130, // 18
130, // 19
130, // 20
130, // 21
130, // 22
130, // 23
130, // 24
130, // 25
130, // 26
130, // 27
130, // 28
130, // 29
130, // 30
130, // 31
120, // " "
140, // "!"
142, // '"'
121, // "#"
130, // "$"
131, // "%"
122, // "&"
141, // "'"
132, // "("
123, // ")"
143, // "*"
133, // "+"
124, // ","
117, // "-"
134, // "."
126, // "/"
112, // "0"
111, // "1"
111, // "2"
111, // "3"
111, // "4"
111, // "5"
111, // "6"
111, // "7"
111, // "8"
111, // "9"
130, // ":"
127, // ";"
118, // "<"
136, // "="
128, // ">"
130, // "?"
137, // "@"
94, // "A"
94, // "B"
94, // "C"
94, // "D"
94, // "E"
94, // "F"
94, // "G"
94, // "H"
94, // "I"
94, // "J"
94, // "K"
94, // "L"
94, // "M"
94, // "N"
94, // "O"
94, // "P"
94, // "Q"
94, // "R"
94, // "S"
94, // "T"
94, // "U"
94, // "V"
94, // "W"
94, // "X"
94, // "Y"
94, // "Z"
116, // "["
130, // "\"
125, // "]"
130, // "^"
135, // "_"
130, // "`"
88, // "a"
101, // "b"
92, // "c"
94, // "d"
102, // "e"
93, // "f"
94, // "g"
103, // "h"
95, // "i"
94, // "j"
94, // "k"
96, // "l"
94, // "m"
104, // "n"
97, // "o"
89, // "p"
94, // "q"
98, // "r"
90, // "s"
105, // "t"
99, // "u"
91, // "v"
106, // "w"
100, // "x"
94, // "y"
94, // "z"
129, // "{"
119, // "|"
139, // "}"
130, // "~"
130, // 127
146, // 128
146, // 129
146, // 130
146, // 131
146, // 132
146, // 133
146, // 134
146, // 135
146, // 136
146, // 137
146, // 138
146, // 139
146, // 140
146, // 141
146, // 142
146, // 143
146, // 144
146, // 145
146, // 146
146, // 147
146, // 148
146, // 149
146, // 150
146, // 151
146, // 152
146, // 153
146, // 154
146, // 155
146, // 156
146, // 157
146, // 158
146, // 159
146, // 160
146, // 161
146, // 162
146, // 163
146, // 164
146, // 165
146, // 166
146, // 167
146, // 168
146, // 169
146, // 170
146, // 171
146, // 172
146, // 173
146, // 174
146, // 175
114, // 176
114, // 177
114, // 178
114, // 179
114, // 180
114, // 181
114, // 182
114, // 183
114, // 184
114, // 185
146, // 186
146, // 187
146, // 188
146, // 189
146, // 190
146, // 191
146, // 192
109, // 193
109, // 194
109, // 195
109, // 196
109, // 197
109, // 198
108, // 199
108, // 200
108, // 201
108, // 202
108, // 203
108, // 204
108, // 205
108, // 206
108, // 207
108, // 208
108, // 209
108, // 210
108, // 211
108, // 212
108, // 213
108, // 214
108, // 215
108, // 216
108, // 217
108, // 218
146, // 219
146, // 220
146, // 221
146, // 222
145, // 223
146, // 224
109, // 225
109, // 226
109, // 227
109, // 228
109, // 229
109, // 230
108, // 231
108, // 232
108, // 233
108, // 234
108, // 235
108, // 236
108, // 237
108, // 238
108, // 239
108, // 240
108, // 241
108, // 242
108, // 243
108, // 244
108, // 245
108, // 246
108, // 247
108, // 248
108, // 249
108, // 250
146, // 251
146, // 252
146, // 253
146, // 254
146, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 6
"<class decl> ::= `class # ID `extends ID `{ <decl in class>* `}", // 7
"<decl in class> ::= <method decl>", // 8
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 9
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 10
"<method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `}", // 11
"<method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `}", // 12
"<formal list> ::= <type> ID # <formal argument>*", // 13
"<formal list> ::= <type> ID # <formal argument>*", // 14
"<formal argument> ::= # `, <type> ID", // 15
"<method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `}", // 16
"<method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `}", // 17
"<method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}", // 18
"<method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}", // 19
"<type> ::= # `int", // 20
"<type> ::= # `boolean", // 21
"<type> ::= <instance type>", // 22
"<instance type> ::= # ID", // 23
"<type> ::= # <type> <empty bracket pair>", // 24
"<empty bracket pair> ::= `[ `]", // 25
"<stmt> ::= # `;", // 26
"<stmt> ::= <assign> `;", // 27
"<stmt> ::= # <call exp> `;", // 28
"<stmt> ::= # `break `;", // 29
"<stmt> ::= # `{ <stmt>* `}", // 30
"<stmt> ::= # `{ <stmt>* `}", // 31
"<stmt> ::= <local var decl> `;", // 32
"<assign> ::= <exp> # `= <exp>", // 33
"<assign> ::= # `++ ID", // 34
"<assign> ::= # ID `++", // 35
"<assign> ::= # `-- ID", // 36
"<assign> ::= # ID `--", // 37
"<local var decl> ::= <type> # ID `= <exp>", // 38
"<stmt> ::= # `if `( <exp> `) <stmt> !`else", // 39
"<stmt> ::= # `if `( <exp> `) <stmt> `else <stmt>", // 40
"<stmt> ::= # `while `( <exp> `) <stmt>", // 41
"<stmt> ::= # `do `{ <stmt> `} `while `( <exp> `) `;", // 42
"<stmt> ::= # `for `( <for first> `; <exp> `; <for third> `) <stmt>", // 43
"<for first> ::= # <type> ID `= <exp>", // 44
"<for first> ::= # <assign>", // 45
"<for first> ::= # <call exp>", // 46
"<for third> ::= # <assign>", // 47
"<for third> ::= # <call exp>", // 48
"<exp> ::= <exp8>", // 49
"<exp8> ::= # <exp8> `|| <exp7>", // 50
"<exp8> ::= <exp7>", // 51
"<exp7> ::= # <exp7> `&& <exp6>", // 52
"<exp7> ::= <exp6>", // 53
"<exp6> ::= # <exp6> `!= <exp5>", // 54
"<exp6> ::= # <exp6> `== <exp5>", // 55
"<exp6> ::= <exp5>", // 56
"<exp5> ::= # <exp5> `> <exp4>", // 57
"<exp5> ::= # <exp5> `>= <exp4>", // 58
"<exp5> ::= # <exp5> `< <exp4>", // 59
"<exp5> ::= # <exp5> `<= <exp4>", // 60
"<exp5> ::= # <exp5> `instanceof <instance type>", // 61
"<exp5> ::= <exp4>", // 62
"<exp4> ::= <exp4> # `+ <exp3>", // 63
"<exp4> ::= <exp4> # `- <exp3>", // 64
"<exp4> ::= <exp3>", // 65
"<exp3> ::= <exp3> # `* <exp2>", // 66
"<exp3> ::= <exp2> # `/ <exp2>", // 67
"<exp5> ::= <exp5> # `% <exp4>", // 68
"<exp3> ::= <exp2>", // 69
"<exp2> ::= <cast exp>", // 70
"<exp2> ::= <unary exp>", // 71
"<cast exp> ::= # `( <type> `) <cast exp>", // 72
"<cast exp> ::= # `( <type> `) <exp1>", // 73
"<unary exp> ::= # `- <unary exp>", // 74
"<unary exp> ::= # `+ <unary exp>", // 75
"<unary exp> ::= # `! <unary exp>", // 76
"<unary exp> ::= <exp1>", // 77
"<call exp> ::= # ID `( `)", // 78
"<call exp> ::= # ID `( <exp list> `)", // 79
"<call exp> ::= # <exp1> `. ID `( `)", // 80
"<call exp> ::= # <exp1> `. ID `( <exp list> `)", // 81
"<call exp> ::= # `super `. ID `( `)", // 82
"<call exp> ::= # `super `. ID `( <exp list> `)", // 83
"<exp list> ::= # <exp> <mult exp>*", // 84
"<exp list> ::= # <exp> <mult exp>*", // 85
"<mult exp> ::= # `, <exp>", // 86
"<exp1> ::= # ID", // 87
"<exp1> ::= <exp1> !<empty bracket pair> # `[ <exp> `]", // 88
"<exp1> ::= `new <type> # `[ <exp> `] <empty bracket pair>*", // 89
"<exp1> ::= `new <type> # `[ <exp> `] <empty bracket pair>*", // 90
"<exp1> ::= # INTLIT", // 91
"<exp1> ::= # CHARLIT", // 92
"<exp1> ::= # STRINGLIT", // 93
"<exp1> ::= # `null", // 94
"<exp1> ::= # `true", // 95
"<exp1> ::= # `false", // 96
"<exp1> ::= # `this", // 97
"<exp1> ::= # <call exp>", // 98
"<exp1> ::= # `new ID `( `)", // 99
"<exp1> ::= # !<cast exp> `( <exp> `)", // 100
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 101
"letter128 ::= {193..218 225..250}", // 102
"digit ::= {\"0\"..\"9\"}", // 103
"digit128 ::= {176..185}", // 104
"any ::= {0..127}", // 105
"any128 ::= {128..255}", // 106
"ws ::= \" \"", // 107
"ws ::= {10} registerNewline", // 108
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 109
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 110
"`class ::= \"#\" \"c\" \"l\" ws*", // 111
"`class ::= \"#\" \"c\" \"l\" ws*", // 112
"`extends ::= \"#\" \"e\" \"x\" ws*", // 113
"`extends ::= \"#\" \"e\" \"x\" ws*", // 114
"`void ::= \"#\" \"v\" \"o\" ws*", // 115
"`void ::= \"#\" \"v\" \"o\" ws*", // 116
"`int ::= \"#\" \"i\" \"t\" ws*", // 117
"`int ::= \"#\" \"i\" \"t\" ws*", // 118
"`while ::= \"#\" \"w\" \"h\" ws*", // 119
"`while ::= \"#\" \"w\" \"h\" ws*", // 120
"`if ::= \"#\" \"+\" ws*", // 121
"`if ::= \"#\" \"+\" ws*", // 122
"`else ::= \"#\" \"e\" \"l\" ws*", // 123
"`else ::= \"#\" \"e\" \"l\" ws*", // 124
"`for ::= \"#\" \"f\" \"o\" ws*", // 125
"`for ::= \"#\" \"f\" \"o\" ws*", // 126
"`break ::= \"#\" \"b\" \"r\" ws*", // 127
"`break ::= \"#\" \"b\" \"r\" ws*", // 128
"`this ::= \"#\" \"t\" \"h\" ws*", // 129
"`this ::= \"#\" \"t\" \"h\" ws*", // 130
"`false ::= \"#\" \"f\" \"a\" ws*", // 131
"`false ::= \"#\" \"f\" \"a\" ws*", // 132
"`true ::= \"#\" \"t\" \"r\" ws*", // 133
"`true ::= \"#\" \"t\" \"r\" ws*", // 134
"`super ::= \"#\" \"s\" \"u\" ws*", // 135
"`super ::= \"#\" \"s\" \"u\" ws*", // 136
"`null ::= \"#\" \"n\" \"u\" ws*", // 137
"`null ::= \"#\" \"n\" \"u\" ws*", // 138
"`return ::= \"#\" \"r\" \"e\" ws*", // 139
"`return ::= \"#\" \"r\" \"e\" ws*", // 140
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 141
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 142
"`new ::= \"#\" \"n\" \"e\" ws*", // 143
"`new ::= \"#\" \"n\" \"e\" ws*", // 144
"`do ::= \"#\" \"-\" ws*", // 145
"`do ::= \"#\" \"-\" ws*", // 146
"`public ::= \"#\" \"p\" \"u\" ws*", // 147
"`public ::= \"#\" \"p\" \"u\" ws*", // 148
"`! ::= \"!\" ws*", // 149
"`! ::= \"!\" ws*", // 150
"`!= ::= \"@\" \"!\" ws*", // 151
"`!= ::= \"@\" \"!\" ws*", // 152
"`% ::= \"%\" ws*", // 153
"`% ::= \"%\" ws*", // 154
"`&& ::= \"@\" \"&\" ws*", // 155
"`&& ::= \"@\" \"&\" ws*", // 156
"`* ::= \"*\" ws*", // 157
"`* ::= \"*\" ws*", // 158
"`( ::= \"(\" ws*", // 159
"`( ::= \"(\" ws*", // 160
"`) ::= \")\" ws*", // 161
"`) ::= \")\" ws*", // 162
"`{ ::= \"{\" ws*", // 163
"`{ ::= \"{\" ws*", // 164
"`} ::= \"}\" ws*", // 165
"`} ::= \"}\" ws*", // 166
"`- ::= \"-\" ws*", // 167
"`- ::= \"-\" ws*", // 168
"`+ ::= \"+\" ws*", // 169
"`+ ::= \"+\" ws*", // 170
"`= ::= \"=\" ws*", // 171
"`= ::= \"=\" ws*", // 172
"`== ::= \"@\" \"=\" ws*", // 173
"`== ::= \"@\" \"=\" ws*", // 174
"`[ ::= \"[\" ws*", // 175
"`[ ::= \"[\" ws*", // 176
"`] ::= \"]\" ws*", // 177
"`] ::= \"]\" ws*", // 178
"`|| ::= \"@\" \"|\" ws*", // 179
"`|| ::= \"@\" \"|\" ws*", // 180
"`< ::= \"<\" ws*", // 181
"`< ::= \"<\" ws*", // 182
"`<= ::= \"@\" \"<\" ws*", // 183
"`<= ::= \"@\" \"<\" ws*", // 184
"`, ::= \",\" ws*", // 185
"`, ::= \",\" ws*", // 186
"`> ::= \">\" !\"=\" ws*", // 187
"`> ::= \">\" !\"=\" ws*", // 188
"`>= ::= \"@\" \">\" ws*", // 189
"`>= ::= \"@\" \">\" ws*", // 190
"`. ::= \".\" ws*", // 191
"`. ::= \".\" ws*", // 192
"`; ::= \";\" ws*", // 193
"`; ::= \";\" ws*", // 194
"`++ ::= \"@\" \"+\" ws*", // 195
"`++ ::= \"@\" \"+\" ws*", // 196
"`-- ::= \"@\" \"-\" ws*", // 197
"`-- ::= \"@\" \"-\" ws*", // 198
"`/ ::= \"/\" ws*", // 199
"`/ ::= \"/\" ws*", // 200
"ID ::= letter128 ws*", // 201
"ID ::= letter128 ws*", // 202
"ID ::= letter idChar* idChar128 ws*", // 203
"ID ::= letter idChar* idChar128 ws*", // 204
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 205
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 206
"INTLIT ::= digit128 ws*", // 207
"INTLIT ::= digit128 ws*", // 208
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 209
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 210
"STRINGLIT ::= \"@\" \'\"\' ws*", // 211
"STRINGLIT ::= \"@\" \'\"\' ws*", // 212
"STRINGLIT ::= \'\"\' any* any128 ws*", // 213
"STRINGLIT ::= \'\"\' any* any128 ws*", // 214
"CHARLIT ::= \"\'\" any ws*", // 215
"CHARLIT ::= \"\'\" any ws*", // 216
"idChar ::= letter", // 217
"idChar ::= digit", // 218
"idChar ::= \"_\"", // 219
"idChar128 ::= letter128", // 220
"idChar128 ::= digit128", // 221
"idChar128 ::= {223}", // 222
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 223
"hexDigit128 ::= {176..185 193..198 225..230}", // 224
"digit* ::= digit* digit", // 225
"digit* ::= digit* digit", // 226
"any* ::= any* any", // 227
"any* ::= any* any", // 228
"<decl in class>* ::= <decl in class>* <decl in class>", // 229
"<decl in class>* ::= <decl in class>* <decl in class>", // 230
"hexDigit* ::= hexDigit* hexDigit", // 231
"hexDigit* ::= hexDigit* hexDigit", // 232
"<stmt>* ::= <stmt>* <stmt>", // 233
"<stmt>* ::= <stmt>* <stmt>", // 234
"idChar* ::= idChar* idChar", // 235
"idChar* ::= idChar* idChar", // 236
"<formal argument>* ::= <formal argument>* <formal argument>", // 237
"<formal argument>* ::= <formal argument>* <formal argument>", // 238
"<class decl>+ ::= <class decl>", // 239
"<class decl>+ ::= <class decl>+ <class decl>", // 240
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 241
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 242
"ws* ::= ws* ws", // 243
"ws* ::= ws* ws", // 244
"<mult exp>* ::= <mult exp>* <mult exp>", // 245
"<mult exp>* ::= <mult exp>* <mult exp>", // 246
"", // 247
"", // 248
"", // 249
"", // 250
"", // 251
"", // 252
"", // 253
"", // 254
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class [#] ID `extends ID `{ <decl in class>* `} @createExtendedClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 7: <class decl> ::= `class [#] ID `extends ID `{ [<decl in class>*] `} @createExtendedClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public <type> [#] ID `( `) `{ <stmt>* `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <method decl> ::= `public <type> [#] ID `( `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <formal list> ::= <type> ID [#] <formal argument>* @createFormalList(Type,String,int,List<Integer>,List<Type>,List<String>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 14: <formal list> ::= <type> ID [#] [<formal argument>*] @createFormalList(Type,String,int,List<Integer>,List<Type>,List<String>)=>VarDeclList
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 15: <formal argument> ::= [#] `, <type> ID @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
    },
    { // 16: <method decl> ::= `public `void [#] ID `( <formal list> `) `{ <stmt>* `} @createFormalMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 17: <method decl> ::= `public `void [#] ID `( <formal list> `) `{ [<stmt>*] `} @createFormalMethodDeclVoid(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 18: <method decl> ::= `public <type> [#] ID `( <formal list> `) `{ <stmt>* `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 19: <method decl> ::= `public <type> [#] ID `( <formal list> `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 20: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 21: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 22: <type> ::= <instance type> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <instance type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 24: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 25: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 26: <stmt> ::= [#] `; @newBlank(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 27: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <stmt> ::= [#] <call exp> `; @newCallStmt(int,Call)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 29: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 30: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 34: <assign> ::= [#] `++ ID @prependAddition(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 35: <assign> ::= [#] ID `++ @appendAddition(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 36: <assign> ::= [#] `-- ID @prependSubstract(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 37: <assign> ::= [#] ID `-- @appendSubtract(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 38: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 39: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else @newIf(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <stmt> ::= [#] `if `( <exp> `) <stmt> `else <stmt> @newIfElse(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhile(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <stmt> ::= [#] `do `{ <stmt> `} `while `( <exp> `) `; @newDoWhile(int,Statement,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <stmt> ::= [#] `for `( <for first> `; <exp> `; <for third> `) <stmt> @newFor(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <for first> ::= [#] <type> ID `= <exp> @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 45: <for first> ::= [#] <assign> @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 46: <for first> ::= [#] <call exp> @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 47: <for third> ::= [#] <assign> @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 48: <for third> ::= [#] <call exp> @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 49: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: <exp8> ::= [#] <exp8> `|| <exp7> @newOr(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 51: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: <exp7> ::= [#] <exp7> `&& <exp6> @newAnd(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 53: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: <exp6> ::= [#] <exp6> `!= <exp5> @newNotEquals(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 55: <exp6> ::= [#] <exp6> `== <exp5> @newIsEqual(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 56: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: <exp5> ::= [#] <exp5> `> <exp4> @newGreaterThan(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 58: <exp5> ::= [#] <exp5> `>= <exp4> @newGreaterThanEqual(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 59: <exp5> ::= [#] <exp5> `< <exp4> @newLessThan(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 60: <exp5> ::= [#] <exp5> `<= <exp4> @newLessThanEqual(int,Exp,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 61: <exp5> ::= [#] <exp5> `instanceof <instance type> @newInstanceOf(int,Exp,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 62: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 63: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 64: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 65: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 66: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 67: <exp3> ::= <exp2> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 68: <exp5> ::= <exp5> [#] `% <exp4> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 69: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 70: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 71: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 72: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 73: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 74: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 75: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 76: <unary exp> ::= [#] `! <unary exp> @newNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 77: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 78: <call exp> ::= [#] ID `( `) @newCallExp(int,String)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 79: <call exp> ::= [#] ID `( <exp list> `) @newCallExpArgs(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 80: <call exp> ::= [#] <exp1> `. ID `( `) @newCallExpDot(int,Exp,String)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 81: <call exp> ::= [#] <exp1> `. ID `( <exp list> `) @newCallExpDotArgs(int,Exp,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 82: <call exp> ::= [#] `super `. ID `( `) @newSuper(int,String)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 83: <call exp> ::= [#] `super `. ID `( <exp list> `) @newSuperArgs(int,String,ExpList)=>Call
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 84: <exp list> ::= [#] <exp> <mult exp>* @newExpList(int,Exp,List<Integer>,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 85: <exp list> ::= [#] <exp> [<mult exp>*] @newExpList(int,Exp,List<Integer>,List<Exp>)=>ExpList
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 86: <mult exp> ::= [#] `, <exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
    },
    { // 87: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 88: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 89: <exp1> ::= `new <type> [#] `[ <exp> `] <empty bracket pair>* @newArrayLookType(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 90: <exp1> ::= `new <type> [#] `[ <exp> `] [<empty bracket pair>*] @newArrayLookType(Type,int,Exp,List<Object>)=>Exp
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 91: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 92: <exp1> ::= [#] CHARLIT @newCharacterLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 93: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 94: <exp1> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 95: <exp1> ::= [#] `true @newTrueLiteral(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 96: <exp1> ::= [#] `false @newFalseLiteral(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 97: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 98: <exp1> ::= [#] <call exp> @newCallExp1(int,Call)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 99: <exp1> ::= [#] `new ID `( `) @newId(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 100: <exp1> ::= !<cast exp> [#] `( <exp> `) @newParenthesesExp(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 101: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 102: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 103: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 104: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 105: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 107: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: ws ::= {10} [registerNewline] @void
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `extends ::= "#" "e" "x" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 122: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `for ::= "#" "f" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `for ::= "#" "f" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 132: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 133: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 134: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 135: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 136: `super ::= "#" "s" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 137: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 138: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 139: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 140: `return ::= "#" "r" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 141: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 142: `instanceof ::= "#" "i" "n" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 143: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 144: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 145: `do ::= "#" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 146: `do ::= "#" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 147: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 148: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 149: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 152: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 153: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 157: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 180: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 181: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 183: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 184: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 185: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `, ::= "," [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 188: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 190: `>= ::= "@" ">" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 191: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 192: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 194: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 196: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 197: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 198: `-- ::= "@" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 199: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 202: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 203: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 204: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 205: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 206: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 207: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 208: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 209: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 210: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 211: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 212: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 213: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 214: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 215: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 216: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 217: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 219: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 220: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 221: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 222: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 223: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 224: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 225: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 226: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 227: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 228: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 229: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 230: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 231: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 232: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 233: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 234: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 235: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 236: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 237: <formal argument>* ::= <formal argument>* <formal argument> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((3<<5)|0xb)/*append:3*/,
    },
    { // 238: <formal argument>* ::= [<formal argument>*] <formal argument> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x0)/*popToPushBack:3*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((3<<5)|0xb)/*append:3*/,
    },
    { // 239: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 240: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 241: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 242: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 243: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 245: <mult exp>* ::= <mult exp>* <mult exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((2<<5)|0xb)/*append:2*/,
    },
    { // 246: <mult exp>* ::= [<mult exp>*] <mult exp> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((2<<5)|0xb)/*append:2*/,
    },
    { // 247: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 248: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 249: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 250: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 251: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 252: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 253: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 254: $$3 ::= any128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<formal argument>* ::=", // <formal argument>*
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<empty bracket pair>* ::=", // <empty bracket pair>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "<mult exp>* ::=", // <mult exp>*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <formal argument>*
      ((3<<5)|0x9)/*emptyList:3*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <empty bracket pair>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <mult exp>*
      ((2<<5)|0x9)/*emptyList:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createExtendedClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Exp parm4 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 6: {
      Type parm0 = (Type)si.popPb();
      String parm1 = (String)si.popPb();
      int parm2 = (Integer)si.popPb();
      List<Integer> parm3 = (List<Integer>)si.popPb();
      List<Type> parm4 = (List<Type>)si.popPb();
      List<String> parm5 = (List<String>)si.popPb();
      VarDeclList result = actionObject.createFormalList(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Decl result = actionObject.createFormalMethodDeclVoid(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 8: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBlank(parm0);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Statement result = actionObject.newCallStmt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.prependAddition(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.appendAddition(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.prependSubstract(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.appendSubtract(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newIf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIfElse(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhile(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Statement parm1 = (Statement)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.newDoWhile(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newFor(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newIsEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Call result = actionObject.newCallExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Call result = actionObject.newCallExpArgs(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Call result = actionObject.newCallExpDot(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Call result = actionObject.newCallExpDotArgs(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Call result = actionObject.newSuper(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Call result = actionObject.newSuperArgs(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      List<Integer> parm2 = (List<Integer>)si.popPb();
      List<Exp> parm3 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 55: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArrayLookType(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharacterLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrueLiteral(parm0);
      si.pushPb(result);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalseLiteral(parm0);
      si.pushPb(result);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      Call parm1 = (Call)si.popPb();
      Exp result = actionObject.newCallExp1(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newId(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newParenthesesExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 66: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 67: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 68: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 69: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 70: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 71: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 72: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 73: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"ClassDecl createExtendedClassDecl(int,String,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)",
"VarDeclList createFormalList(Type,String,int,List<Integer>,List<Type>,List<String>)",
"Decl createFormalMethodDeclVoid(int,String,VarDeclList,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,VarDeclList,List<Statement>,Exp)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlank(int)",
"Statement newCallStmt(int,Call)",
"Statement newBreak(int)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement prependAddition(int,String)",
"Statement appendAddition(int,String)",
"Statement prependSubstract(int,String)",
"Statement appendSubtract(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newIf(int,Exp,Statement)",
"Statement newIfElse(int,Exp,Statement,Statement)",
"Statement newWhile(int,Exp,Statement)",
"Statement newDoWhile(int,Statement,Exp)",
"Statement newFor(int,Exp,Statement)",
"Exp newOr(int,Exp,Exp)",
"Exp newAnd(int,Exp,Exp)",
"Exp newNotEquals(int,Exp,Exp)",
"Exp newIsEqual(int,Exp,Exp)",
"Exp newGreaterThan(int,Exp,Exp)",
"Exp newGreaterThanEqual(int,Exp,Exp)",
"Exp newLessThan(int,Exp,Exp)",
"Exp newLessThanEqual(int,Exp,Exp)",
"Exp newInstanceOf(int,Exp,Type)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newNot(int,Exp)",
"Call newCallExp(int,String)",
"Call newCallExpArgs(int,String,ExpList)",
"Call newCallExpDot(int,Exp,String)",
"Call newCallExpDotArgs(int,Exp,String,ExpList)",
"Call newSuper(int,String)",
"Call newSuperArgs(int,String,ExpList)",
"ExpList newExpList(int,Exp,List<Integer>,List<Exp>)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newArrayLookType(Type,int,Exp,List<Object>)",
"Exp newIntegerLiteral(int,int)",
"Exp newCharacterLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newNull(int)",
"Exp newTrueLiteral(int)",
"Exp newFalseLiteral(int)",
"Exp newThis(int)",
"Exp newCallExp1(int,Call)",
"Exp newId(int,String)",
"Exp newParenthesesExp(int,Exp)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
4,1,
3,1,
5,1,
6,1,
4,1,
6,1,
1,1,
1,1,
2,1,
3,1,
1,1,
2,1,
1,1,
2,1,
3,1,
2,1,
2,1,
2,1,
2,1,
4,1,
3,1,
4,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
3,1,
3,1,
4,1,
2,1,
3,1,
4,1,
2,1,
3,1,
4,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
2,1,
2,1,
2,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
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
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    1,
    3,
    3,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
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
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    0,
    2,
    2,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
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
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
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
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
    case 2: return new Tuple2<Object,Object>(vec.get(0),vec.get(1));
    case 3: return new Tuple3<Object,Object,Object>(vec.get(0),vec.get(1),vec.get(2));
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
class Tuple2<T0,T1> {
    private T0 val0;
    private T1 val1;
    public Tuple2(T0 parm0 ,T1 parm1) {
        val0 = parm0;
        val1 = parm1;
    }
    public T0 getVal0() { return val0;}
    public T1 getVal1() { return val1;}
    public String toString() {
       return "<<"+val0+","+val1+">>";
    }
}
class Tuple3<T0,T1,T2> {
    private T0 val0;
    private T1 val1;
    private T2 val2;
    public Tuple3(T0 parm0 ,T1 parm1 ,T2 parm2) {
        val0 = parm0;
        val1 = parm1;
        val2 = parm2;
    }
    public T0 getVal0() { return val0;}
    public T1 getVal1() { return val1;}
    public T2 getVal2() { return val2;}
    public String toString() {
       return "<<"+val0+","+val1+","+val2+">>";
    }
}
