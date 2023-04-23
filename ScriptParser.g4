parser grammar ScriptParser;

options {
    tokenVocab = ScriptLexer;
    language = Java;
}

@header {
    import java.util.ArrayList;
    import java.util.List;
}

@members {
    public static void main(String[] args) throws Exception {
        FunctionsLexer lex = new FunctionsLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream (lex);
        FunctionsParser parser = new FunctionsParser(tokens);
        ParseTree tree = parser.start();
        FunctionsVisitor visitor = new FunctionsVisitor();
        ast.Program p = (ast.Program) (visitor.visit(tree));
        p.execute();
    }
}

start
    : sequence EOF
    ;

sequence
    : (statement OPEND LF* )+
    ;

statement
    : expr                                                              #exprStatement
    | varaible_action                                                   #varaibleActionStatement
    | KW_IF LPAR logical_expr RPAR LF*
      SBLOCK LF*
      sequence
      EBLOCK LF*
      ( KW_ELSE LF*
        fb=sequence
      )?                                                                #ifStatement
    | KW_WHILE LPAR logical_expr RPAR LF*
      SBLOCK LF*
      sequence LF*
      EBLOCK LF*                                                        #whileStatement
    | KW_FOR LPAR varaible_action expr expr RPAR LF*
      SBLOCK LF*
      sequence LF*
      EBLOCK LF*                                                        #forStatement
    | KW_PRINT LPAR expr+ RPAR                                          #printStatement
    | KW_SCAN LPAR ID RPAR                                              #scanSingleStatement
    | KW_SCAN LPAR (ID OPLST)+ RPAR LF*                                 #scanManyStatement
    | KW_SWITCH LPAR ID RPAR LF*
      SBLOCK LF*
      (KW_CASE SZAM DOUBLE_DOT sequence)*
      KW_DEFAULT DOUBLE_DOT sequence
      EBLOCK                                                            #switchStatement
    ;

varaible_action
    : ID OPASSIGN expr                                                  #assignStatement
    | type = (KW_INT | KW_DOUBLE )  ID                                  #declarationStatement
    | KW_DEL ID                                                         #deleteStatement
    ;

expr
    : logical_expr
    | num_expr
    | dec_expr
    ;

dec_expr
    : logical_expr QMARK expr DOUBLE_DOT expr
    ;

logical_expr
    : logical_tag ( OPOR logical_tag )*
    ;

logical_tag
    : logical_fct ( OPAND logical_fct )*
    ;

logical_fct
    : rel=num_expr op=( OPEQ | OPREL ) rer=num_expr                     #relational
    | OPNOT logical_fct                                                 #logUnary
    | LPAR logical_expr RPAR                                            #logParens
    | variable                                                          #logVariable
    ;

num_expr
    : addop ( OPADD addop )*
    ;

addop
    : mulop ( OPMUL mulop )*
    ;

mulop
    : num_fct ( OPPWR mulop )?
    ;

num_fct
    : SZAM                                                              #numLiteral
    | TIME                                                              #timeLiteral
    | LPAR num_expr RPAR                                                #numParens
    | op=( OPADD | OPABS ) num_fct                                      #numUnary
    | variable                                                          #numVariable
    ;

variable
    : ID
    ;
