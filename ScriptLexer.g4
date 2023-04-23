lexer grammar ScriptLexer;

options {
    language = Java;
}

tokens { STRING }

LF       : '\n' ;
WS       : [ \t\r]+ ->skip ;
KW_DO    : 'do' ;
KW_ELSE  : 'else' ;
KW_END   : 'end' ;
KW_FOR   : 'for' ;
KW_FUNC  : 'function' ;
KW_IF    : 'if' ;
KW_IN    : 'in' ;
KW_PRINT : 'print' ;
KW_RET   : 'return' ;
KW_THEN  : 'then' ;
KW_VAR   : 'var' ;
KW_WHILE : 'while' ;
SZAM     : [0-9]+('.' [0-9]+)? ;
OPASSIGN : '=' ;
OPOR     : 'or' ;
OPAND    : 'and' ;
OPNOT    : 'not' ;
OPREL    : '<' | '<=' | '>' | '>=' ;
OPEQ     : '==' | '!=' ;
OPADD    : '+' | '-' ;
OPMUL    : '*' | '/' ;
OPPWR    : '^' ;
OPABS    : 'abs' ;
OPLST    : ',' ;
LPAR     : '(' ;
RPAR     : ')' ;
ID       : [A-Za-z][_0-9A-Za-z]* ;
COMMENT  : '#' (~[\n])* ->skip ;

STRABEG  : '\'' -> mode(ASTR), more ;
STRQBEG  : '"'  -> mode(QSTR), more ;

mode ASTR;
fragment STRA     : ~[\r\n\\']+ ;
fragment STRAESC  : '\\\\' | '\\\'' ;
STRAEND  : ( STRA | STRAESC )* '\'' ->type(STRING), mode(DEFAULT_MODE);

mode QSTR;
fragment STRQ     : ~[\r\n\\"]+ ;
fragment STRQESC  : '\\\\' | '\\"' ;
STRQEND  : ( STRQ | STRQESC )* '"' ->type(STRING), mode(DEFAULT_MODE);
