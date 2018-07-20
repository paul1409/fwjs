grammar FeatherweightJavaScript;

@header { package edu.sjsu.fwjs.parser; }

// Reserved words
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FUNCTION: 'function';
VAR: 'var';
PRINT: 'print';

// Literals
INT: [1-9][0-9]* | '0';
BOOL: 'true' | 'false';
NULL: 'null';

// Symbols
MUL: '*';
DIV: '/';
SEPARATOR: ';';
ADD: '+';
SUB: '-';
MOD: '%';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
SET: '=';
ARGSEP: ',';

// Identifiers
ID: [a-zA-Z|_][a-zA-Z|0-9|_]*;

// Whitespace and comments
NEWLINE: '\r'? '\n' -> skip;
LINE_COMMENT: '//' ~[\n\r]* -> skip;
WS: [ \t]+ -> skip; // ignore whitespace

// ***Paring rules ***

/** The start rule */
prog: stat+;

stat:
	expr SEPARATOR						# bareExpr
	| IF '(' expr ')' block ELSE block	# ifThenElse
	| IF '(' expr ')' block				# ifThen;

expr:
	expr op = ('*' | '/' | '%') expr	# MulDivMod
	| INT								# int
	| '(' expr ')'						# parens;

block: '{' stat* '}' # fullBlock | stat # simpBlock;

