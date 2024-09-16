grammar Mu;

// Top-level program: at least one function_def or non-empty block
program: (function_def | nonEmptyBlock)+ EOF;

// Block of statements that can be empty
block: stat*;

// Non-empty block (used only at the top level)
nonEmptyBlock: stat+;

stat:
	assignment
	| if_stat
	| while_stat
	| for_stat
	| print_func
	| read_func
	| function_def
	| expr_stat
	| unless_expr
	| OTHER {System.err.println("unknown char: " + $OTHER.text);};

read_func: ID ASSIGN READLN OPAR CPAR;

assignment:
	ID COLON TYPE ASSIGN expr	# assignmentWithType
	| ID ASSIGN expr			# simpleAssignment;

if_stat:
	IF expr THEN stat_block (ELSE IF expr THEN stat_block)* (
		ELSE stat_block
	)? END IF;

stat_block: block | stat;

while_stat: WHILE expr stat_block END;

for_stat:
	FOR ID ASSIGN arith_atom TO (arith_atom | ID) stat_block NEXT;

unless_expr: 'do' stat_block 'unless' expr # unlessExpr;

print_func: PRINTLN OPAR expr CPAR | PRINT OPAR expr CPAR;

function_def:
	'func' ID '(' parameter_list ')' (':' TYPE)? stat_block return_stmt? 'end';

return_stmt: 'return' expr;

parameter_list: (ID ':' TYPE (',' ID ':' TYPE)*)?;

function_call: ID '(' expr_list? ')';

expr_list: expr (',' expr)*;

expr:
	<assoc = right> expr POW expr					# powExpr
	| <assoc = right> MINUS expr					# unaryMinusExpr
	| <assoc = right> NOT expr						# notExpr
	| expr op = (MULT | DIV | MOD) expr				# multiplicationExpr
	| expr op = (PLUS | MINUS) expr					# additiveExpr
	| expr op = (LTEQ | GTEQ | LT | GT) expr		# relationalExpr
	| expr op = (EQ | NEQ) expr						# equalityExpr
	| expr AND expr									# andExpr
	| expr OR expr									# orExpr
	| STRING (REGEX_MATCH | REGEX_NOT_MATCH) STRING	# regexExpr
	| atom											# atomExpr;

atom:
	OPAR expr CPAR		# parExpr
	| arith_atom		# arithAtom
	| (TRUE | FALSE)	# booleanAtom
	| ID				# idAtom
	| STRING			# stringAtom
	| DOLLAR STRING		# dollarStringAtom
	| NIL				# nilAtom
	| function_call		# funcCallAtom; // | ID '(' expr_list? ')'  #funcCallAtom

expr_stat: expr;

arith_atom: integer_atom | float_atom;

integer_atom: INT # integerAtom;

float_atom: FLOAT # floatAtom;

OR: '||' | 'or';
AND: '&&' | 'and';
EQ: '==' | 'eq';
NEQ: '!=' | 'ne';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
POW: '^';
REGEX_MATCH: '=~';
REGEX_NOT_MATCH: '!~';
NOT: '!' | 'not';
COLON: ':';
ASSIGN: '=';
OPAR: '(';
CPAR: ')';
TRUE: 'true';
FALSE: 'false';
NIL: 'nil';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
TO: 'to';
END: 'end';
NEXT: 'next';
PRINTLN: 'println';
PRINT: 'print';
READLN: 'readln';

TYPE: 'integer' | 'float' | 'boolean' | 'string' | 'void';

ID: [a-zA-Z_] [a-zA-Z_0-9]*;

INT: [0-9]+;

FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;

STRING: '"' (~["\r\n] | '""')* '"';

COMMENT: '#' ~[\r\n]* -> skip;

SPACE: [ \t\r\n] -> skip;

DOLLAR: '$';

OTHER: .;