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

        if (args.length > 1 && "--generate".equals(args[1])) {
            System.out.println(p);
        } else {
            p.execute();
        }
    }
}

start
    : sequence EOF
    ;

sequence
    : (statement LF+ )+
    ;

statement
    : expr                                                              #exprStatement
    | ID OPASSIGN expr                                                  #assignStatement
    | KW_IF logical_expr LF*
      KW_THEN LF* tb=sequence LF*
      ( KW_ELSE LF*
        fb=sequence LF*
      )?
      KW_END                                                            #ifStatement
    | KW_WHILE logical_expr LF*
      KW_DO LF*
      sequence LF*
      KW_END                                                            #whileStatement
    | KW_FOR ID KW_IN LPAR beg=expr OPLST end=expr RPAR LF*
      KW_DO LF* sequence LF*
      KW_END                                                            #forStatement
    | KW_RET expr                                                       #returnStatement
    | KW_VAR ID                                                         #declarationStatement
    | KW_FUNC ID LPAR parlist RPAR LF
      sequence
      KW_END                                                            #functionStatement
    | KW_PRINT LPAR expr RPAR                                           #printStatement
    ;

parlist
    : ( ID ( OPLST ID )* )?
    ;

expr
    : logical_expr
    | num_expr
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
    | functioncall                                                      #logFunctionCall
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
    | STRING                                                            #strLiteral
    | LPAR num_expr RPAR                                                #numParens
    | op=( OPADD | OPABS ) num_fct                                      #numUnary
    | variable                                                          #numVariable
    | functioncall                                                      #numFunctionCall
    ;

variable
    : ID
    ;

functioncall
    : ID LPAR arglist RPAR
    ;

arglist
    : ( expr ( OPLST expr )* )?
    ;
