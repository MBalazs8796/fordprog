// Generated from d:\repos\fordprog\ScriptParser.g4 by ANTLR 4.9.2

    import java.util.ArrayList;
    import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, LF=2, WS=3, KW_IF=4, KW_ELSE=5, KW_FOR=6, KW_WHILE=7, KW_PRINT=8, 
		KW_SCAN=9, KW_THEN=10, KW_INT=11, KW_DOUBLE=12, KW_DEL=13, KW_SWITCH=14, 
		KW_CASE=15, KW_DEFAULT=16, KW_BREAK=17, SZAM=18, OPASSIGN=19, OPOR=20, 
		OPAND=21, OPNOT=22, OPREL=23, OPEQ=24, OPADD=25, OPMUL=26, OPPWR=27, OPLST=28, 
		OPABS=29, LPAR=30, RPAR=31, SBLOCK=32, EBLOCK=33, OPEND=34, DOUBLE_DOT=35, 
		QMARK=36, ID=37, COMMENT=38, TIME=39;
	public static final int
		RULE_start = 0, RULE_sequence = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_logical_expr = 4, RULE_logical_tag = 5, RULE_logical_fct = 6, RULE_num_expr = 7, 
		RULE_addop = 8, RULE_mulop = 9, RULE_num_fct = 10, RULE_variable = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sequence", "statement", "expr", "logical_expr", "logical_tag", 
			"logical_fct", "num_expr", "addop", "mulop", "num_fct", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\n'", null, "'if'", "'else'", "'for'", "'while'", "'print'", 
			"'scan'", "'then'", "'int'", "'double'", "'del'", "'switch'", "'case'", 
			"'default'", "'break'", null, "'='", "'or'", "'and'", "'not'", null, 
			null, null, null, "'^'", "','", "'abs'", "'('", "')'", "'{'", "'}'", 
			"';'", "':'", "'?'", null, null, "'TIME'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "LF", "WS", "KW_IF", "KW_ELSE", "KW_FOR", "KW_WHILE", 
			"KW_PRINT", "KW_SCAN", "KW_THEN", "KW_INT", "KW_DOUBLE", "KW_DEL", "KW_SWITCH", 
			"KW_CASE", "KW_DEFAULT", "KW_BREAK", "SZAM", "OPASSIGN", "OPOR", "OPAND", 
			"OPNOT", "OPREL", "OPEQ", "OPADD", "OPMUL", "OPPWR", "OPLST", "OPABS", 
			"LPAR", "RPAR", "SBLOCK", "EBLOCK", "OPEND", "DOUBLE_DOT", "QMARK", "ID", 
			"COMMENT", "TIME"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    public static void main(String[] args) throws Exception {
	        ScriptLexer lex = new ScriptLexer(CharStreams.fromFileName(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream (lex);
	        ScriptParser parser = new ScriptParser(tokens);
	        parser.start(args.length > 1 && "--generate".equals(args[1]));
	    }

	public ScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public boolean genSrc;
		public SequenceContext sequence;
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ScriptParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartContext(ParserRuleContext parent, int invokingState, boolean genSrc) {
			super(parent, invokingState);
			this.genSrc = genSrc;
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start(boolean genSrc) throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState(), genSrc);
		enterRule(_localctx, 0, RULE_start);
		 ast.Program p = new ast.Program(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((StartContext)_localctx).sequence = sequence(p);
			 p.addStatements(((StartContext)_localctx).sequence.node); 
			setState(26);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);
			  if (genSrc) {
			                System.out.println(p);
			             } else {
			                 p.execute();
			             }
			          
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public ast.Program prog;
		public ast.Sequence node;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> OPEND() { return getTokens(ScriptParser.OPEND); }
		public TerminalNode OPEND(int i) {
			return getToken(ScriptParser.OPEND, i);
		}
		public List<TerminalNode> LF() { return getTokens(ScriptParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(ScriptParser.LF, i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SequenceContext(ParserRuleContext parent, int invokingState, ast.Program prog) {
			super(parent, invokingState);
			this.prog = prog;
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
	}

	public final SequenceContext sequence(ast.Program prog) throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState(), prog);
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((SequenceContext)_localctx).node =  new ast.Sequence(prog); 
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				((SequenceContext)_localctx).statement = statement(prog);
				setState(30);
				match(OPEND);
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(31);
						match(LF);
						}
						} 
					}
					setState(36);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				 _localctx.node.addStatement(((SequenceContext)_localctx).statement.node); 
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_IF) | (1L << KW_FOR) | (1L << KW_WHILE) | (1L << KW_PRINT) | (1L << KW_SCAN) | (1L << KW_INT) | (1L << KW_DOUBLE) | (1L << KW_DEL) | (1L << KW_SWITCH) | (1L << KW_BREAK) | (1L << SZAM) | (1L << OPNOT) | (1L << OPADD) | (1L << OPABS) | (1L << LPAR) | (1L << ID) | (1L << TIME))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ast.Program prog;
		public ast.Statement node;
		public ExprContext expr;
		public Token ID;
		public Logical_exprContext if_logic;
		public SequenceContext if_mainSubSeq;
		public SequenceContext if_elseSubSeq;
		public Logical_exprContext while_logic;
		public SequenceContext while_body;
		public Logical_exprContext for_logic;
		public StatementContext for_incr;
		public SequenceContext for_body;
		public ExprContext top_print;
		public ExprContext sub_print;
		public Token type;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ScriptParser.ID, i);
		}
		public TerminalNode OPASSIGN() { return getToken(ScriptParser.OPASSIGN, 0); }
		public TerminalNode KW_IF() { return getToken(ScriptParser.KW_IF, 0); }
		public TerminalNode LPAR() { return getToken(ScriptParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ScriptParser.RPAR, 0); }
		public List<TerminalNode> SBLOCK() { return getTokens(ScriptParser.SBLOCK); }
		public TerminalNode SBLOCK(int i) {
			return getToken(ScriptParser.SBLOCK, i);
		}
		public List<TerminalNode> EBLOCK() { return getTokens(ScriptParser.EBLOCK); }
		public TerminalNode EBLOCK(int i) {
			return getToken(ScriptParser.EBLOCK, i);
		}
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public List<SequenceContext> sequence() {
			return getRuleContexts(SequenceContext.class);
		}
		public SequenceContext sequence(int i) {
			return getRuleContext(SequenceContext.class,i);
		}
		public List<TerminalNode> LF() { return getTokens(ScriptParser.LF); }
		public TerminalNode LF(int i) {
			return getToken(ScriptParser.LF, i);
		}
		public TerminalNode KW_ELSE() { return getToken(ScriptParser.KW_ELSE, 0); }
		public TerminalNode KW_WHILE() { return getToken(ScriptParser.KW_WHILE, 0); }
		public TerminalNode KW_FOR() { return getToken(ScriptParser.KW_FOR, 0); }
		public List<TerminalNode> OPEND() { return getTokens(ScriptParser.OPEND); }
		public TerminalNode OPEND(int i) {
			return getToken(ScriptParser.OPEND, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode KW_PRINT() { return getToken(ScriptParser.KW_PRINT, 0); }
		public List<TerminalNode> OPLST() { return getTokens(ScriptParser.OPLST); }
		public TerminalNode OPLST(int i) {
			return getToken(ScriptParser.OPLST, i);
		}
		public TerminalNode KW_SCAN() { return getToken(ScriptParser.KW_SCAN, 0); }
		public TerminalNode KW_SWITCH() { return getToken(ScriptParser.KW_SWITCH, 0); }
		public TerminalNode KW_DEFAULT() { return getToken(ScriptParser.KW_DEFAULT, 0); }
		public List<TerminalNode> DOUBLE_DOT() { return getTokens(ScriptParser.DOUBLE_DOT); }
		public TerminalNode DOUBLE_DOT(int i) {
			return getToken(ScriptParser.DOUBLE_DOT, i);
		}
		public List<TerminalNode> KW_CASE() { return getTokens(ScriptParser.KW_CASE); }
		public TerminalNode KW_CASE(int i) {
			return getToken(ScriptParser.KW_CASE, i);
		}
		public List<TerminalNode> SZAM() { return getTokens(ScriptParser.SZAM); }
		public TerminalNode SZAM(int i) {
			return getToken(ScriptParser.SZAM, i);
		}
		public TerminalNode KW_INT() { return getToken(ScriptParser.KW_INT, 0); }
		public TerminalNode KW_DOUBLE() { return getToken(ScriptParser.KW_DOUBLE, 0); }
		public TerminalNode KW_DEL() { return getToken(ScriptParser.KW_DEL, 0); }
		public TerminalNode KW_BREAK() { return getToken(ScriptParser.KW_BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, ast.Program prog) {
			super(parent, invokingState);
			this.prog = prog;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement(ast.Program prog) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), prog);
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((StatementContext)_localctx).expr = expr();
				 ((StatementContext)_localctx).node =  new ast.ExprStmt(_localctx.prog, ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((StatementContext)_localctx).ID = match(ID);
				setState(47);
				match(OPASSIGN);
				setState(48);
				((StatementContext)_localctx).expr = expr();
				 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ast.Sequence if_elseSubSeq_node = null; 
				setState(52);
				match(KW_IF);
				setState(53);
				match(LPAR);
				setState(54);
				((StatementContext)_localctx).if_logic = logical_expr();
				setState(55);
				match(RPAR);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(56);
					match(LF);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(SBLOCK);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(63);
					match(LF);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				((StatementContext)_localctx).if_mainSubSeq = sequence(prog);
				setState(70);
				match(EBLOCK);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(71);
					match(LF);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(77);
					match(KW_ELSE);
					setState(78);
					match(SBLOCK);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LF) {
						{
						{
						setState(79);
						match(LF);
						}
						}
						setState(84);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(85);
					((StatementContext)_localctx).if_elseSubSeq = sequence(prog);
					setState(86);
					match(EBLOCK);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LF) {
						{
						{
						setState(87);
						match(LF);
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					 if_elseSubSeq_node = ((StatementContext)_localctx).if_elseSubSeq.node; 
					}
				}

				 ((StatementContext)_localctx).node =  new ast.If(_localctx.prog, ((StatementContext)_localctx).if_logic.node, ((StatementContext)_localctx).if_mainSubSeq.node, if_elseSubSeq_node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(KW_WHILE);
				setState(100);
				match(LPAR);
				setState(101);
				((StatementContext)_localctx).while_logic = logical_expr();
				setState(102);
				match(RPAR);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(103);
					match(LF);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(SBLOCK);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(110);
					match(LF);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				((StatementContext)_localctx).while_body = sequence(prog);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(117);
					match(LF);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(EBLOCK);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(124);
					match(LF);
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).node =  new ast.While(_localctx.prog, ((StatementContext)_localctx).while_logic.node, ((StatementContext)_localctx).while_body.node); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(KW_FOR);
				setState(133);
				match(LPAR);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(134);
					((StatementContext)_localctx).ID = match(ID);
					setState(135);
					match(OPASSIGN);
					setState(136);
					((StatementContext)_localctx).expr = expr();
					 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
					}
				}

				setState(141);
				match(OPEND);
				setState(142);
				((StatementContext)_localctx).for_logic = logical_expr();
				setState(143);
				match(OPEND);
				setState(144);
				((StatementContext)_localctx).for_incr = statement(prog);
				setState(145);
				match(RPAR);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(146);
					match(LF);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(SBLOCK);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(153);
					match(LF);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				((StatementContext)_localctx).for_body = sequence(prog);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(160);
					match(LF);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(EBLOCK);
				 ((StatementContext)_localctx).node =  new ast.For(_localctx.prog, ((StatementContext)_localctx).for_logic.node, ((StatementContext)_localctx).for_incr.node, ((StatementContext)_localctx).for_body.node); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(KW_PRINT);
				setState(170);
				match(LPAR);
				setState(171);
				((StatementContext)_localctx).top_print = expr();
				 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, ((StatementContext)_localctx).top_print.node); 
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(173);
					match(OPLST);
					setState(174);
					((StatementContext)_localctx).sub_print = expr();
					 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, ((StatementContext)_localctx).sub_print.node); 
					}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(KW_SCAN);
				setState(185);
				match(LPAR);
				setState(186);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(188);
					match(OPLST);
					setState(189);
					((StatementContext)_localctx).ID = match(ID);
					 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RPAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(KW_SWITCH);
				setState(198);
				match(LPAR);
				setState(199);
				match(ID);
				setState(200);
				match(RPAR);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(201);
					match(LF);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(SBLOCK);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(208);
					match(LF);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_CASE) {
					{
					{
					setState(214);
					match(KW_CASE);
					setState(215);
					match(SZAM);
					setState(216);
					match(DOUBLE_DOT);
					setState(217);
					sequence(prog);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(KW_DEFAULT);
				setState(224);
				match(DOUBLE_DOT);
				setState(225);
				sequence(prog);
				setState(226);
				match(EBLOCK);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				((StatementContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==KW_INT || _la==KW_DOUBLE) ) {
					((StatementContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(229);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.VarDecl(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).type!=null?((StatementContext)_localctx).type.getText():null));
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
				match(KW_DEL);
				setState(232);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.Delete(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(234);
				match(KW_BREAK);
				 ((StatementContext)_localctx).node =  new ast.Break(_localctx.prog); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ast.Expression node;
		public Logical_exprContext logical_expr;
		public Num_exprContext num_expr;
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((ExprContext)_localctx).logical_expr = logical_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).logical_expr.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((ExprContext)_localctx).num_expr = num_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).num_expr.node; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_exprContext extends ParserRuleContext {
		public ast.Expression node;
		public Logical_tagContext or_top;
		public Token OPOR;
		public Logical_tagContext or_next;
		public List<Logical_tagContext> logical_tag() {
			return getRuleContexts(Logical_tagContext.class);
		}
		public Logical_tagContext logical_tag(int i) {
			return getRuleContext(Logical_tagContext.class,i);
		}
		public List<TerminalNode> OPOR() { return getTokens(ScriptParser.OPOR); }
		public TerminalNode OPOR(int i) {
			return getToken(ScriptParser.OPOR, i);
		}
		public Logical_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expr; }
	}

	public final Logical_exprContext logical_expr() throws RecognitionException {
		Logical_exprContext _localctx = new Logical_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logical_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((Logical_exprContext)_localctx).or_top = logical_tag();
			 ((Logical_exprContext)_localctx).node =  ((Logical_exprContext)_localctx).or_top.node; 
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPOR) {
				{
				{
				setState(248);
				((Logical_exprContext)_localctx).OPOR = match(OPOR);
				setState(249);
				((Logical_exprContext)_localctx).or_next = logical_tag();
				 ((Logical_exprContext)_localctx).node =  new ast.Binary((((Logical_exprContext)_localctx).OPOR!=null?((Logical_exprContext)_localctx).OPOR.getText():null), _localctx.node, ((Logical_exprContext)_localctx).or_next.node); 
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_tagContext extends ParserRuleContext {
		public ast.Expression node;
		public Logical_fctContext and_top;
		public Token OPAND;
		public Logical_fctContext and_next;
		public List<Logical_fctContext> logical_fct() {
			return getRuleContexts(Logical_fctContext.class);
		}
		public Logical_fctContext logical_fct(int i) {
			return getRuleContext(Logical_fctContext.class,i);
		}
		public List<TerminalNode> OPAND() { return getTokens(ScriptParser.OPAND); }
		public TerminalNode OPAND(int i) {
			return getToken(ScriptParser.OPAND, i);
		}
		public Logical_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_tag; }
	}

	public final Logical_tagContext logical_tag() throws RecognitionException {
		Logical_tagContext _localctx = new Logical_tagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logical_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((Logical_tagContext)_localctx).and_top = logical_fct();
			 ((Logical_tagContext)_localctx).node =  ((Logical_tagContext)_localctx).and_top.node; 
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAND) {
				{
				{
				setState(259);
				((Logical_tagContext)_localctx).OPAND = match(OPAND);
				setState(260);
				((Logical_tagContext)_localctx).and_next = logical_fct();
				 ((Logical_tagContext)_localctx).node =  new ast.Binary((((Logical_tagContext)_localctx).OPAND!=null?((Logical_tagContext)_localctx).OPAND.getText():null), _localctx.node, ((Logical_tagContext)_localctx).and_next.node); 
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_fctContext extends ParserRuleContext {
		public ast.Expression node;
		public Num_exprContext rel;
		public Token op;
		public Num_exprContext rer;
		public Token OPNOT;
		public Logical_fctContext logical_fct;
		public Logical_exprContext logical_expr;
		public VariableContext vr;
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode OPEQ() { return getToken(ScriptParser.OPEQ, 0); }
		public TerminalNode OPREL() { return getToken(ScriptParser.OPREL, 0); }
		public TerminalNode OPNOT() { return getToken(ScriptParser.OPNOT, 0); }
		public Logical_fctContext logical_fct() {
			return getRuleContext(Logical_fctContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ScriptParser.LPAR, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptParser.RPAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Logical_fctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_fct; }
	}

	public final Logical_fctContext logical_fct() throws RecognitionException {
		Logical_fctContext _localctx = new Logical_fctContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logical_fct);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				((Logical_fctContext)_localctx).rel = num_expr();
				setState(269);
				((Logical_fctContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPREL || _la==OPEQ) ) {
					((Logical_fctContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				((Logical_fctContext)_localctx).rer = num_expr();
				 ((Logical_fctContext)_localctx).node =  new ast.Binary((((Logical_fctContext)_localctx).op!=null?((Logical_fctContext)_localctx).op.getText():null), ((Logical_fctContext)_localctx).rel.node, ((Logical_fctContext)_localctx).rer.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((Logical_fctContext)_localctx).OPNOT = match(OPNOT);
				setState(274);
				((Logical_fctContext)_localctx).logical_fct = logical_fct();
				 ((Logical_fctContext)_localctx).node =  new ast.Unary((((Logical_fctContext)_localctx).OPNOT!=null?((Logical_fctContext)_localctx).OPNOT.getText():null), ((Logical_fctContext)_localctx).logical_fct.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(LPAR);
				setState(278);
				((Logical_fctContext)_localctx).logical_expr = logical_expr();
				setState(279);
				match(RPAR);
				 ((Logical_fctContext)_localctx).node =  new ast.Parens(((Logical_fctContext)_localctx).logical_expr.node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				((Logical_fctContext)_localctx).vr = variable();
				 ((Logical_fctContext)_localctx).node =  ((Logical_fctContext)_localctx).vr.node; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_exprContext extends ParserRuleContext {
		public ast.Expression node;
		public AddopContext add_top;
		public Token OPADD;
		public AddopContext add_next;
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public List<TerminalNode> OPADD() { return getTokens(ScriptParser.OPADD); }
		public TerminalNode OPADD(int i) {
			return getToken(ScriptParser.OPADD, i);
		}
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
	}

	public final Num_exprContext num_expr() throws RecognitionException {
		Num_exprContext _localctx = new Num_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_num_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			((Num_exprContext)_localctx).add_top = addop();
			 ((Num_exprContext)_localctx).node =  ((Num_exprContext)_localctx).add_top.node; 
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPADD) {
				{
				{
				setState(289);
				((Num_exprContext)_localctx).OPADD = match(OPADD);
				setState(290);
				((Num_exprContext)_localctx).add_next = addop();
				 ((Num_exprContext)_localctx).node =  new ast.Binary((((Num_exprContext)_localctx).OPADD!=null?((Num_exprContext)_localctx).OPADD.getText():null), _localctx.node, ((Num_exprContext)_localctx).add_next.node); 
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public ast.Expression node;
		public MulopContext mul_top;
		public Token OPMUL;
		public MulopContext mul_next;
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public List<TerminalNode> OPMUL() { return getTokens(ScriptParser.OPMUL); }
		public TerminalNode OPMUL(int i) {
			return getToken(ScriptParser.OPMUL, i);
		}
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((AddopContext)_localctx).mul_top = mulop();
			 ((AddopContext)_localctx).node =  ((AddopContext)_localctx).mul_top.node; 
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(300);
				((AddopContext)_localctx).OPMUL = match(OPMUL);
				setState(301);
				((AddopContext)_localctx).mul_next = mulop();
				 ((AddopContext)_localctx).node =  new ast.Binary((((AddopContext)_localctx).OPMUL!=null?((AddopContext)_localctx).OPMUL.getText():null), _localctx.node, ((AddopContext)_localctx).mul_next.node); 
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public ast.Expression node;
		public Num_fctContext pwr_top;
		public Token OPPWR;
		public MulopContext pwr_next;
		public Num_fctContext num_fct() {
			return getRuleContext(Num_fctContext.class,0);
		}
		public TerminalNode OPPWR() { return getToken(ScriptParser.OPPWR, 0); }
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((MulopContext)_localctx).pwr_top = num_fct();
			 ((MulopContext)_localctx).node =  ((MulopContext)_localctx).pwr_top.node; 
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(311);
				((MulopContext)_localctx).OPPWR = match(OPPWR);
				setState(312);
				((MulopContext)_localctx).pwr_next = mulop();
				 ((MulopContext)_localctx).node =  new ast.Binary((((MulopContext)_localctx).OPPWR!=null?((MulopContext)_localctx).OPPWR.getText():null), _localctx.node, ((MulopContext)_localctx).pwr_next.node); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_fctContext extends ParserRuleContext {
		public ast.Expression node;
		public Token SZAM;
		public Token TIME;
		public Num_exprContext num_expr;
		public Token op;
		public Num_fctContext num_fct;
		public VariableContext vr;
		public TerminalNode SZAM() { return getToken(ScriptParser.SZAM, 0); }
		public TerminalNode TIME() { return getToken(ScriptParser.TIME, 0); }
		public TerminalNode LPAR() { return getToken(ScriptParser.LPAR, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptParser.RPAR, 0); }
		public Num_fctContext num_fct() {
			return getRuleContext(Num_fctContext.class,0);
		}
		public TerminalNode OPADD() { return getToken(ScriptParser.OPADD, 0); }
		public TerminalNode OPABS() { return getToken(ScriptParser.OPABS, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Num_fctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_fct; }
	}

	public final Num_fctContext num_fct() throws RecognitionException {
		Num_fctContext _localctx = new Num_fctContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_num_fct);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SZAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((Num_fctContext)_localctx).SZAM = match(SZAM);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).SZAM!=null?((Num_fctContext)_localctx).SZAM.getText():null)); 
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((Num_fctContext)_localctx).TIME = match(TIME);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).TIME!=null?((Num_fctContext)_localctx).TIME.getText():null)); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(LPAR);
				setState(322);
				((Num_fctContext)_localctx).num_expr = num_expr();
				 ((Num_fctContext)_localctx).node =  new ast.Parens(((Num_fctContext)_localctx).num_expr.node); 
				setState(324);
				match(RPAR);
				}
				break;
			case OPADD:
			case OPABS:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				((Num_fctContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPADD || _la==OPABS) ) {
					((Num_fctContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				((Num_fctContext)_localctx).num_fct = num_fct();
				 ((Num_fctContext)_localctx).node =  new ast.Unary((((Num_fctContext)_localctx).op!=null?((Num_fctContext)_localctx).op.getText():null), ((Num_fctContext)_localctx).num_fct.node); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				((Num_fctContext)_localctx).vr = variable();
				 ((Num_fctContext)_localctx).node =  ((Num_fctContext)_localctx).vr.node; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public ast.Expression node;
		public Token ID;
		public TerminalNode ID() { return getToken(ScriptParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((VariableContext)_localctx).ID = match(ID);
			 ((VariableContext)_localctx).node =  new ast.Variable((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\3\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\7\4C\n\4\f\4\16\4"+
		"F\13\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\7\4S\n\4\f\4\16"+
		"\4V\13\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\5\4b\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4k\n\4\f\4\16\4n\13\4\3\4\3\4\7\4r\n\4\f\4\16\4"+
		"u\13\4\3\4\3\4\7\4y\n\4\f\4\16\4|\13\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4"+
		"\u0083\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u008e\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u0096\n\4\f\4\16\4\u0099\13\4\3\4\3\4\7\4\u009d\n"+
		"\4\f\4\16\4\u00a0\13\4\3\4\3\4\7\4\u00a4\n\4\f\4\16\4\u00a7\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00b4\n\4\f\4\16\4\u00b7\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00c2\n\4\f\4\16\4\u00c5\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00cd\n\4\f\4\16\4\u00d0\13\4\3\4\3\4\7"+
		"\4\u00d4\n\4\f\4\16\4\u00d7\13\4\3\4\3\4\3\4\3\4\7\4\u00dd\n\4\f\4\16"+
		"\4\u00e0\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00ef\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f7\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u00ff\n\6\f\6\16\6\u0102\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u010a"+
		"\n\7\f\7\16\7\u010d\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0120\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0128"+
		"\n\t\f\t\16\t\u012b\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0133\n\n\f\n\16"+
		"\n\u0136\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u013e\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0150\n\f\3"+
		"\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\r\16\3\2\31"+
		"\32\4\2\33\33\37\37\2\u0174\2\32\3\2\2\2\4\36\3\2\2\2\6\u00ee\3\2\2\2"+
		"\b\u00f6\3\2\2\2\n\u00f8\3\2\2\2\f\u0103\3\2\2\2\16\u011f\3\2\2\2\20\u0121"+
		"\3\2\2\2\22\u012c\3\2\2\2\24\u0137\3\2\2\2\26\u014f\3\2\2\2\30\u0151\3"+
		"\2\2\2\32\33\5\4\3\2\33\34\b\2\1\2\34\35\7\2\2\3\35\3\3\2\2\2\36)\b\3"+
		"\1\2\37 \5\6\4\2 $\7$\2\2!#\7\4\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%"+
		"\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\3\1\2(*\3\2\2\2)\37\3\2\2\2*+\3\2\2"+
		"\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-.\5\b\5\2./\b\4\1\2/\u00ef\3\2\2\2\60"+
		"\61\7\'\2\2\61\62\7\25\2\2\62\63\5\b\5\2\63\64\b\4\1\2\64\u00ef\3\2\2"+
		"\2\65\66\b\4\1\2\66\67\7\6\2\2\678\7 \2\289\5\n\6\29=\7!\2\2:<\7\4\2\2"+
		";:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\7\"\2\2"+
		"AC\7\4\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\5\4\3\2HL\7#\2\2IK\7\4\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2"+
		"Ma\3\2\2\2NL\3\2\2\2OP\7\7\2\2PT\7\"\2\2QS\7\4\2\2RQ\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5\4\3\2X\\\7#\2\2Y[\7\4\2\2"+
		"ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\b\4"+
		"\1\2`b\3\2\2\2aO\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\4\1\2d\u00ef\3\2\2\2"+
		"ef\7\t\2\2fg\7 \2\2gh\5\n\6\2hl\7!\2\2ik\7\4\2\2ji\3\2\2\2kn\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2os\7\"\2\2pr\7\4\2\2qp\3\2\2\2"+
		"ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vz\5\4\3\2wy\7\4\2\2"+
		"xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0081\7"+
		"#\2\2~\u0080\7\4\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085"+
		"\b\4\1\2\u0085\u00ef\3\2\2\2\u0086\u0087\7\b\2\2\u0087\u008d\7 \2\2\u0088"+
		"\u0089\7\'\2\2\u0089\u008a\7\25\2\2\u008a\u008b\5\b\5\2\u008b\u008c\b"+
		"\4\1\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\7$\2\2\u0090\u0091\5\n\6\2\u0091\u0092\7$\2"+
		"\2\u0092\u0093\5\6\4\2\u0093\u0097\7!\2\2\u0094\u0096\7\4\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009e\7\"\2\2\u009b\u009d\7\4"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5\5\4"+
		"\3\2\u00a2\u00a4\7\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\b\4\1\2\u00aa\u00ef\3\2\2\2\u00ab"+
		"\u00ac\7\n\2\2\u00ac\u00ad\7 \2\2\u00ad\u00ae\5\b\5\2\u00ae\u00b5\b\4"+
		"\1\2\u00af\u00b0\7\36\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\b\4\1\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7!\2\2\u00b9\u00ef\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\7 "+
		"\2\2\u00bc\u00bd\7\'\2\2\u00bd\u00c3\b\4\1\2\u00be\u00bf\7\36\2\2\u00bf"+
		"\u00c0\7\'\2\2\u00c0\u00c2\b\4\1\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00ef\7!\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00c9\7 "+
		"\2\2\u00c9\u00ca\7\'\2\2\u00ca\u00ce\7!\2\2\u00cb\u00cd\7\4\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7\"\2\2\u00d2"+
		"\u00d4\7\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00de\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\7\21\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\7%\2\2\u00db\u00dd\5"+
		"\4\3\2\u00dc\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7\22"+
		"\2\2\u00e2\u00e3\7%\2\2\u00e3\u00e4\5\4\3\2\u00e4\u00e5\7#\2\2\u00e5\u00ef"+
		"\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7\u00e8\7\'\2\2\u00e8\u00ef\b\4\1\2\u00e9"+
		"\u00ea\7\17\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ef\b\4\1\2\u00ec\u00ed\7"+
		"\23\2\2\u00ed\u00ef\b\4\1\2\u00ee-\3\2\2\2\u00ee\60\3\2\2\2\u00ee\65\3"+
		"\2\2\2\u00eee\3\2\2\2\u00ee\u0086\3\2\2\2\u00ee\u00ab\3\2\2\2\u00ee\u00ba"+
		"\3\2\2\2\u00ee\u00c7\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\7\3\2\2\2\u00f0\u00f1\5\n\6\2\u00f1\u00f2\b\5\1\2"+
		"\u00f2\u00f7\3\2\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\b\5\1\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\t\3\2\2\2\u00f8"+
		"\u00f9\5\f\7\2\u00f9\u0100\b\6\1\2\u00fa\u00fb\7\26\2\2\u00fb\u00fc\5"+
		"\f\7\2\u00fc\u00fd\b\6\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\13\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0103\u0104\5\16\b\2\u0104\u010b\b\7\1\2\u0105"+
		"\u0106\7\27\2\2\u0106\u0107\5\16\b\2\u0107\u0108\b\7\1\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0105\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\r\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5\20\t"+
		"\2\u010f\u0110\t\3\2\2\u0110\u0111\5\20\t\2\u0111\u0112\b\b\1\2\u0112"+
		"\u0120\3\2\2\2\u0113\u0114\7\30\2\2\u0114\u0115\5\16\b\2\u0115\u0116\b"+
		"\b\1\2\u0116\u0120\3\2\2\2\u0117\u0118\7 \2\2\u0118\u0119\5\n\6\2\u0119"+
		"\u011a\7!\2\2\u011a\u011b\b\b\1\2\u011b\u0120\3\2\2\2\u011c\u011d\5\30"+
		"\r\2\u011d\u011e\b\b\1\2\u011e\u0120\3\2\2\2\u011f\u010e\3\2\2\2\u011f"+
		"\u0113\3\2\2\2\u011f\u0117\3\2\2\2\u011f\u011c\3\2\2\2\u0120\17\3\2\2"+
		"\2\u0121\u0122\5\22\n\2\u0122\u0129\b\t\1\2\u0123\u0124\7\33\2\2\u0124"+
		"\u0125\5\22\n\2\u0125\u0126\b\t\1\2\u0126\u0128\3\2\2\2\u0127\u0123\3"+
		"\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\21\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\5\24\13\2\u012d\u0134\b\n"+
		"\1\2\u012e\u012f\7\34\2\2\u012f\u0130\5\24\13\2\u0130\u0131\b\n\1\2\u0131"+
		"\u0133\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0135\3\2\2\2\u0135\23\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138"+
		"\5\26\f\2\u0138\u013d\b\13\1\2\u0139\u013a\7\35\2\2\u013a\u013b\5\24\13"+
		"\2\u013b\u013c\b\13\1\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\25\3\2\2\2\u013f\u0140\7\24\2\2\u0140\u0150\b\f\1"+
		"\2\u0141\u0142\7)\2\2\u0142\u0150\b\f\1\2\u0143\u0144\7 \2\2\u0144\u0145"+
		"\5\20\t\2\u0145\u0146\b\f\1\2\u0146\u0147\7!\2\2\u0147\u0150\3\2\2\2\u0148"+
		"\u0149\t\4\2\2\u0149\u014a\5\26\f\2\u014a\u014b\b\f\1\2\u014b\u0150\3"+
		"\2\2\2\u014c\u014d\5\30\r\2\u014d\u014e\b\f\1\2\u014e\u0150\3\2\2\2\u014f"+
		"\u013f\3\2\2\2\u014f\u0141\3\2\2\2\u014f\u0143\3\2\2\2\u014f\u0148\3\2"+
		"\2\2\u014f\u014c\3\2\2\2\u0150\27\3\2\2\2\u0151\u0152\7\'\2\2\u0152\u0153"+
		"\b\r\1\2\u0153\31\3\2\2\2 $+=DLT\\alsz\u0081\u008d\u0097\u009e\u00a5\u00b5"+
		"\u00c3\u00ce\u00d5\u00de\u00ee\u00f6\u0100\u010b\u011f\u0129\u0134\u013d"+
		"\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}