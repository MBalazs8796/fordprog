lexer grammar ScriptLexer;

options {
    language = Java;
}

tokens { STRING }

LF         : '\n' ;
WS         : [ \t\r]+ ->skip ;
KW_IF      : 'if' ;
KW_ELSE    : 'else' ;
KW_FOR     : 'for' ;
KW_WHILE   : 'while' ;
KW_PRINT   : 'print' ;
KW_SCAN    : 'scan';
KW_THEN    : 'then' ;
KW_INT     : 'int' ;
KW_DOUBLE  : 'double';
KW_DEL     : 'del' ;
KW_SWITCH  : 'switch' ;
KW_CASE    : 'case' ;
KW_DEFAULT : 'default';
KW_BREAK   : 'break' ;
SZAM       : [0-9]+('.' [0-9]+)? ;
OPASSIGN   : '=' ;
OPOR       : 'or' ;
OPAND      : 'and' ;
OPNOT      : 'not' ;
OPREL      : '<' | '<=' | '>' | '>=' ;
OPEQ       : '==' | '!=' ;
OPADD      : '+' | '-' ;
OPMUL      : '*' | '/' ;
OPPWR      : '^' ;
OPLST      : ',' ;
OPABS      : 'ABS' ;
LPAR       : '(' ;
RPAR       : ')' ;
SBLOCK     : '{' ;
EBLOCK     : '}' ;
OPEND      : ';' ;
DOUBLE_DOT : ':' ;
QMARK      : '?' ;
ID         : [A-Za-z][_0-9A-Za-z]* ;
COMMENT    : '#' (~[\n])* ->skip ;
TIME       : 'TIME' ;