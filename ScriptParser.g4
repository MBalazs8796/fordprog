parser grammar ScriptParser;

options {
    tokenVocab = ScriptLexer;
    language = Java;
}

@header {
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;
    import java.util.LinkedHashMap;
}

@members {
    public static void main(String[] args) throws Exception {
        ScriptLexer lex = new ScriptLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream (lex);
        ScriptParser parser = new ScriptParser(tokens);
        parser.start(args.length > 1 && "--generate".equals(args[1]));
    }
}

start [ boolean genSrc ]
    @init{ ast.Program p = new ast.Program(); }
    @after{  if (genSrc) {
                System.out.println(p);
             } else {
                 p.execute();
             }
          }
    : sequence[p] { p.addStatements($sequence.node); } EOF
    ;

sequence [ ast.Program prog ] returns [ ast.Sequence node ]
    : { $node = new ast.Sequence(prog); } (LF* statement[prog] OPEND LF* { $node.addStatement($statement.node); })+
    ;

statement [ ast.Program prog ] returns [ ast.Statement node ]
    : expr
        { $node = new ast.ExprStmt($prog, $expr.node); }
    | ID OPASSIGN expr
       { $node = new ast.Assignment($prog, $ID.text, $expr.node); }
    | { ast.Sequence if_elseSubSeq_node = null; }
      KW_IF LPAR if_logic=logical_expr RPAR LF*
      SBLOCK LF*
      if_mainSubSeq=sequence[prog]
      EBLOCK LF*
      ( KW_ELSE SBLOCK LF*
        if_elseSubSeq=sequence[prog]
        EBLOCK LF*
        { if_elseSubSeq_node = $if_elseSubSeq.node; }
      )?
        { $node = new ast.If($prog, $if_logic.node, $if_mainSubSeq.node, if_elseSubSeq_node); }
    | KW_WHILE LPAR while_logic=logical_expr RPAR LF*
      SBLOCK LF*
      while_body=sequence[prog] LF*
      EBLOCK LF*
        { $node = new ast.While($prog, $while_logic.node, $while_body.node); }
    | KW_FOR LPAR (ID OPASSIGN expr { $node = new ast.Assignment($prog, $ID.text, $expr.node); })? OPEND for_logic=logical_expr OPEND for_incr=statement[prog] RPAR LF*
      SBLOCK LF*
      for_body=sequence[prog] LF*
      EBLOCK
        { $node = new ast.For($prog, $for_logic.node, $for_incr.node, $for_body.node); }
    | KW_PRINT LPAR top_print=expr { $node = new ast.Print($prog, $top_print.node); }
        (OPLST sub_print=expr { $node = new ast.Print($prog, $sub_print.node); })* RPAR
    | KW_SCAN LPAR ID { $node = new ast.Scan($prog, $ID.text); }
        (OPLST ID { $node = new ast.Scan($prog, $ID.text); } )* RPAR LF*
    | {
    Map<ast.Const, ast.Sequence> cases = new LinkedHashMap<>();}
      KW_SWITCH LPAR target=ID RPAR LF*
      SBLOCK LF*
      (KW_CASE SZAM DOUBLE_DOT case_body=sequence[prog]
        {cases.put(new ast.Const($SZAM.text), $case_body.node);}
      )*
      KW_DEFAULT DOUBLE_DOT def_seq=sequence[prog]
      EBLOCK
      { $node = new ast.Switch($prog, $target.text, $def_seq.node, cases); }
    | type = (KW_INT | KW_DOUBLE )  ID
        { $node = new ast.VarDecl($prog, $ID.text, $type.text);}
    | KW_DEL ID
        { $node = new ast.Delete($prog, $ID.text); }
    | KW_BREAK
        { $node = new ast.Break($prog); }
    ;

expr returns [ ast.Expression node ]
    : logical_expr { $node=$logical_expr.node;}
    | num_expr { $node=$num_expr.node; }
    | dec_expr { $node=$dec_expr.node; }
    ;

dec_expr returns [ ast.Expression node ]
    : logic=logical_expr QMARK true_b=expr DOUBLE_DOT false_b=expr
        { $node = new ast.Ternary($logic.node, $true_b.node, $false_b.node); }
    ;

logical_expr returns [ ast.Expression node ]
    : or_top=logical_tag { $node = $or_top.node; }
        ( OPOR or_next=logical_tag { $node = new ast.Binary($OPOR.text, $node, $or_next.node); } )*
    ;

logical_tag returns [ ast.Expression node ]
    : and_top=logical_fct { $node = $and_top.node; }
        ( OPAND and_next=logical_fct { $node = new ast.Binary($OPAND.text, $node, $and_next.node); } )*
    ;

logical_fct returns [ ast.Expression node ]
    : rel=num_expr op=( OPEQ | OPREL ) rer=num_expr { $node = new ast.Binary($op.text, $rel.node, $rer.node); }
    | OPNOT logical_fct { $node = new ast.Unary($OPNOT.text, $logical_fct.node); }
    | LPAR logical_expr RPAR { $node = new ast.Parens($logical_expr.node); }
    | vr=variable { $node = $vr.node; }
    ;

num_expr returns [ ast.Expression node ]
    : add_top=addop { $node = $add_top.node; }
        ( OPADD add_next=addop { $node = new ast.Binary($OPADD.text, $node, $add_next.node); } )*
    ;

addop returns [ ast.Expression node ]
    : mul_top=mulop { $node = $mul_top.node; }
        ( OPMUL mul_next=mulop { $node = new ast.Binary($OPMUL.text, $node, $mul_next.node); } )*
    ;

mulop returns [ ast.Expression node ]
    : pwr_top=num_fct { $node = $pwr_top.node; }
    (OPPWR pwr_next=mulop { $node = new ast.Binary($OPPWR.text, $node, $pwr_next.node); })?
    ;

num_fct returns [ ast.Expression node ]
    : SZAM { $node = new ast.Const($SZAM.text); }
    | TIME { $node = new ast.Const($TIME.text); }
    | LPAR num_expr { $node = new ast.Parens($num_expr.node); } RPAR
    | op=( OPADD | OPABS ) num_fct { $node = new ast.Unary($op.text, $num_fct.node); }
    | vr=variable { $node = $vr.node; }
    ;

variable returns [ ast.Expression node ]
    : ID { $node = new ast.Variable($ID.text); }
    ;
