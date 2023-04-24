// Generated from D:/repos/fordprog\ScriptParser.g4 by ANTLR 4.12.0

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;
    import java.util.LinkedHashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		RULE_dec_expr = 4, RULE_logical_expr = 5, RULE_logical_tag = 6, RULE_logical_fct = 7, 
		RULE_num_expr = 8, RULE_addop = 9, RULE_mulop = 10, RULE_num_fct = 11, 
		RULE_variable = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sequence", "statement", "expr", "dec_expr", "logical_expr", 
			"logical_tag", "logical_fct", "num_expr", "addop", "mulop", "num_fct", 
			"variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\n'", null, "'if'", "'else'", "'for'", "'while'", "'print'", 
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(26);
			((StartContext)_localctx).sequence = sequence(p);
			 p.addStatements(((StartContext)_localctx).sequence.node); 
			setState(28);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LF) {
						{
						{
						setState(31);
						match(LF);
						}
						}
						setState(36);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(37);
					((SequenceContext)_localctx).statement = statement(prog);
					setState(38);
					match(OPEND);
					setState(42);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(39);
							match(LF);
							}
							} 
						}
						setState(44);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					 _localctx.node.addStatement(((SequenceContext)_localctx).statement.node); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
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
		public Token target;
		public Token SZAM;
		public SequenceContext case_body;
		public SequenceContext def_seq;
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
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((StatementContext)_localctx).expr = expr();
				 ((StatementContext)_localctx).node =  new ast.ExprStmt(_localctx.prog, ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				((StatementContext)_localctx).ID = match(ID);
				setState(55);
				match(OPASSIGN);
				setState(56);
				((StatementContext)_localctx).expr = expr();
				 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ast.Sequence if_elseSubSeq_node = null; 
				setState(60);
				match(KW_IF);
				setState(61);
				match(LPAR);
				setState(62);
				((StatementContext)_localctx).if_logic = logical_expr();
				setState(63);
				match(RPAR);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(64);
					match(LF);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(SBLOCK);
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						match(LF);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(77);
				((StatementContext)_localctx).if_mainSubSeq = sequence(prog);
				setState(78);
				match(EBLOCK);
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
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(85);
					match(KW_ELSE);
					setState(86);
					match(SBLOCK);
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(87);
							match(LF);
							}
							} 
						}
						setState(92);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
					}
					setState(93);
					((StatementContext)_localctx).if_elseSubSeq = sequence(prog);
					setState(94);
					match(EBLOCK);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==LF) {
						{
						{
						setState(95);
						match(LF);
						}
						}
						setState(100);
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
				setState(107);
				match(KW_WHILE);
				setState(108);
				match(LPAR);
				setState(109);
				((StatementContext)_localctx).while_logic = logical_expr();
				setState(110);
				match(RPAR);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(111);
					match(LF);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(SBLOCK);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(118);
						match(LF);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(124);
				((StatementContext)_localctx).while_body = sequence(prog);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(125);
					match(LF);
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(EBLOCK);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(132);
					match(LF);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((StatementContext)_localctx).node =  new ast.While(_localctx.prog, ((StatementContext)_localctx).while_logic.node, ((StatementContext)_localctx).while_body.node); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(KW_FOR);
				setState(141);
				match(LPAR);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(142);
					((StatementContext)_localctx).ID = match(ID);
					setState(143);
					match(OPASSIGN);
					setState(144);
					((StatementContext)_localctx).expr = expr();
					 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
					}
				}

				setState(149);
				match(OPEND);
				setState(150);
				((StatementContext)_localctx).for_logic = logical_expr();
				setState(151);
				match(OPEND);
				setState(152);
				((StatementContext)_localctx).for_incr = statement(prog);
				setState(153);
				match(RPAR);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(154);
					match(LF);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(SBLOCK);
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						match(LF);
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(167);
				((StatementContext)_localctx).for_body = sequence(prog);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(168);
					match(LF);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(EBLOCK);
				 ((StatementContext)_localctx).node =  new ast.For(_localctx.prog, ((StatementContext)_localctx).for_logic.node, ((StatementContext)_localctx).for_incr.node, ((StatementContext)_localctx).for_body.node); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(KW_PRINT);
				setState(178);
				match(LPAR);
				setState(179);
				((StatementContext)_localctx).top_print = expr();
				 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, ((StatementContext)_localctx).top_print.node); 
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(181);
					match(OPLST);
					setState(182);
					((StatementContext)_localctx).sub_print = expr();
					 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, ((StatementContext)_localctx).sub_print.node); 
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(RPAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(192);
				match(KW_SCAN);
				setState(193);
				match(LPAR);
				setState(194);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(196);
					match(OPLST);
					setState(197);
					((StatementContext)_localctx).ID = match(ID);
					 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(RPAR);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(205);
					match(LF);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{

				    Map<ast.Const, ast.Sequence> cases = new LinkedHashMap<>();
				setState(212);
				match(KW_SWITCH);
				setState(213);
				match(LPAR);
				setState(214);
				((StatementContext)_localctx).target = match(ID);
				setState(215);
				match(RPAR);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(216);
					match(LF);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(SBLOCK);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(223);
					match(LF);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_CASE) {
					{
					{
					setState(229);
					match(KW_CASE);
					setState(230);
					((StatementContext)_localctx).SZAM = match(SZAM);
					setState(231);
					match(DOUBLE_DOT);
					setState(232);
					((StatementContext)_localctx).case_body = sequence(prog);
					cases.put(new ast.Const((((StatementContext)_localctx).SZAM!=null?((StatementContext)_localctx).SZAM.getText():null)), ((StatementContext)_localctx).case_body.node);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(KW_DEFAULT);
				setState(241);
				match(DOUBLE_DOT);
				setState(242);
				((StatementContext)_localctx).def_seq = sequence(prog);
				setState(243);
				match(EBLOCK);
				 ((StatementContext)_localctx).node =  new ast.Switch(_localctx.prog, (((StatementContext)_localctx).target!=null?((StatementContext)_localctx).target.getText():null), ((StatementContext)_localctx).def_seq.node, cases); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
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
				setState(247);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.VarDecl(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).type!=null?((StatementContext)_localctx).type.getText():null));
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(249);
				match(KW_DEL);
				setState(250);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.Delete(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ast.Expression node;
		public Logical_exprContext logical_expr;
		public Num_exprContext num_expr;
		public Dec_exprContext dec_expr;
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Dec_exprContext dec_expr() {
			return getRuleContext(Dec_exprContext.class,0);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((ExprContext)_localctx).logical_expr = logical_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).logical_expr.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				((ExprContext)_localctx).num_expr = num_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).num_expr.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				((ExprContext)_localctx).dec_expr = dec_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).dec_expr.node; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_exprContext extends ParserRuleContext {
		public ast.Expression node;
		public Logical_exprContext logic;
		public ExprContext true_b;
		public ExprContext false_b;
		public TerminalNode QMARK() { return getToken(ScriptParser.QMARK, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(ScriptParser.DOUBLE_DOT, 0); }
		public Logical_exprContext logical_expr() {
			return getRuleContext(Logical_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Dec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_expr; }
	}

	public final Dec_exprContext dec_expr() throws RecognitionException {
		Dec_exprContext _localctx = new Dec_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dec_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((Dec_exprContext)_localctx).logic = logical_expr();
			setState(268);
			match(QMARK);
			setState(269);
			((Dec_exprContext)_localctx).true_b = expr();
			setState(270);
			match(DOUBLE_DOT);
			setState(271);
			((Dec_exprContext)_localctx).false_b = expr();
			 ((Dec_exprContext)_localctx).node =  new ast.Ternary(((Dec_exprContext)_localctx).logic.node, ((Dec_exprContext)_localctx).true_b.node, ((Dec_exprContext)_localctx).false_b.node); 
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 10, RULE_logical_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((Logical_exprContext)_localctx).or_top = logical_tag();
			 ((Logical_exprContext)_localctx).node =  ((Logical_exprContext)_localctx).or_top.node; 
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPOR) {
				{
				{
				setState(276);
				((Logical_exprContext)_localctx).OPOR = match(OPOR);
				setState(277);
				((Logical_exprContext)_localctx).or_next = logical_tag();
				 ((Logical_exprContext)_localctx).node =  new ast.Binary((((Logical_exprContext)_localctx).OPOR!=null?((Logical_exprContext)_localctx).OPOR.getText():null), _localctx.node, ((Logical_exprContext)_localctx).or_next.node); 
				}
				}
				setState(284);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 12, RULE_logical_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((Logical_tagContext)_localctx).and_top = logical_fct();
			 ((Logical_tagContext)_localctx).node =  ((Logical_tagContext)_localctx).and_top.node; 
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAND) {
				{
				{
				setState(287);
				((Logical_tagContext)_localctx).OPAND = match(OPAND);
				setState(288);
				((Logical_tagContext)_localctx).and_next = logical_fct();
				 ((Logical_tagContext)_localctx).node =  new ast.Binary((((Logical_tagContext)_localctx).OPAND!=null?((Logical_tagContext)_localctx).OPAND.getText():null), _localctx.node, ((Logical_tagContext)_localctx).and_next.node); 
				}
				}
				setState(295);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 14, RULE_logical_fct);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				((Logical_fctContext)_localctx).rel = num_expr();
				setState(297);
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
				setState(298);
				((Logical_fctContext)_localctx).rer = num_expr();
				 ((Logical_fctContext)_localctx).node =  new ast.Binary((((Logical_fctContext)_localctx).op!=null?((Logical_fctContext)_localctx).op.getText():null), ((Logical_fctContext)_localctx).rel.node, ((Logical_fctContext)_localctx).rer.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				((Logical_fctContext)_localctx).OPNOT = match(OPNOT);
				setState(302);
				((Logical_fctContext)_localctx).logical_fct = logical_fct();
				 ((Logical_fctContext)_localctx).node =  new ast.Unary((((Logical_fctContext)_localctx).OPNOT!=null?((Logical_fctContext)_localctx).OPNOT.getText():null), ((Logical_fctContext)_localctx).logical_fct.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(LPAR);
				setState(306);
				((Logical_fctContext)_localctx).logical_expr = logical_expr();
				setState(307);
				match(RPAR);
				 ((Logical_fctContext)_localctx).node =  new ast.Parens(((Logical_fctContext)_localctx).logical_expr.node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 16, RULE_num_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			((Num_exprContext)_localctx).add_top = addop();
			 ((Num_exprContext)_localctx).node =  ((Num_exprContext)_localctx).add_top.node; 
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPADD) {
				{
				{
				setState(317);
				((Num_exprContext)_localctx).OPADD = match(OPADD);
				setState(318);
				((Num_exprContext)_localctx).add_next = addop();
				 ((Num_exprContext)_localctx).node =  new ast.Binary((((Num_exprContext)_localctx).OPADD!=null?((Num_exprContext)_localctx).OPADD.getText():null), _localctx.node, ((Num_exprContext)_localctx).add_next.node); 
				}
				}
				setState(325);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 18, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			((AddopContext)_localctx).mul_top = mulop();
			 ((AddopContext)_localctx).node =  ((AddopContext)_localctx).mul_top.node; 
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(328);
				((AddopContext)_localctx).OPMUL = match(OPMUL);
				setState(329);
				((AddopContext)_localctx).mul_next = mulop();
				 ((AddopContext)_localctx).node =  new ast.Binary((((AddopContext)_localctx).OPMUL!=null?((AddopContext)_localctx).OPMUL.getText():null), _localctx.node, ((AddopContext)_localctx).mul_next.node); 
				}
				}
				setState(336);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 20, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((MulopContext)_localctx).pwr_top = num_fct();
			 ((MulopContext)_localctx).node =  ((MulopContext)_localctx).pwr_top.node; 
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(339);
				((MulopContext)_localctx).OPPWR = match(OPPWR);
				setState(340);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 22, RULE_num_fct);
		int _la;
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SZAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((Num_fctContext)_localctx).SZAM = match(SZAM);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).SZAM!=null?((Num_fctContext)_localctx).SZAM.getText():null)); 
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				((Num_fctContext)_localctx).TIME = match(TIME);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).TIME!=null?((Num_fctContext)_localctx).TIME.getText():null)); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(LPAR);
				setState(350);
				((Num_fctContext)_localctx).num_expr = num_expr();
				 ((Num_fctContext)_localctx).node =  new ast.Parens(((Num_fctContext)_localctx).num_expr.node); 
				setState(352);
				match(RPAR);
				}
				break;
			case OPADD:
			case OPABS:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
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
				setState(355);
				((Num_fctContext)_localctx).num_fct = num_fct();
				 ((Num_fctContext)_localctx).node =  new ast.Unary((((Num_fctContext)_localctx).op!=null?((Num_fctContext)_localctx).op.getText():null), ((Num_fctContext)_localctx).num_fct.node); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		"\u0004\u0001\'\u016f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u00010\b\u0001\u000b\u0001\f\u00011\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002Q\b\u0002\n\u0002\f\u0002T\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002"+
		"\f\u0002\\\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002a\b"+
		"\u0002\n\u0002\f\u0002d\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002q\b\u0002\n\u0002\f\u0002t\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002\f\u0002{\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u007f\b\u0002\n\u0002\f\u0002\u0082\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u0086\b\u0002\n\u0002\f\u0002\u0089"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0094\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u009c\b\u0002\n\u0002\f\u0002\u009f\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u00a3\b\u0002\n\u0002\f\u0002\u00a6\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00aa\b\u0002\n\u0002\f\u0002\u00ad\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ba\b\u0002"+
		"\n\u0002\f\u0002\u00bd\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u00c8\b\u0002\n\u0002\f\u0002\u00cb\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u00cf\b\u0002\n\u0002\f\u0002\u00d2\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00da"+
		"\b\u0002\n\u0002\f\u0002\u00dd\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u00e1\b\u0002\n\u0002\f\u0002\u00e4\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ec\b\u0002\n"+
		"\u0002\f\u0002\u00ef\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ff"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u010a\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0119\b\u0005\n\u0005\f\u0005\u011c\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u0124\b\u0006\n\u0006\f\u0006\u0127\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u013a\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0142\b\b\n\b\f\b\u0145\t\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u014d\b\t\n\t"+
		"\f\t\u0150\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u0158\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u016a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001"+
		"\u0000\u000b\f\u0001\u0000\u0017\u0018\u0002\u0000\u0019\u0019\u001d\u001d"+
		"\u0190\u0000\u001a\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000"+
		"\u0000\u0004\u00fe\u0001\u0000\u0000\u0000\u0006\u0109\u0001\u0000\u0000"+
		"\u0000\b\u010b\u0001\u0000\u0000\u0000\n\u0112\u0001\u0000\u0000\u0000"+
		"\f\u011d\u0001\u0000\u0000\u0000\u000e\u0139\u0001\u0000\u0000\u0000\u0010"+
		"\u013b\u0001\u0000\u0000\u0000\u0012\u0146\u0001\u0000\u0000\u0000\u0014"+
		"\u0151\u0001\u0000\u0000\u0000\u0016\u0169\u0001\u0000\u0000\u0000\u0018"+
		"\u016b\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b"+
		"\u001c\u0006\u0000\uffff\uffff\u0000\u001c\u001d\u0005\u0000\u0000\u0001"+
		"\u001d\u0001\u0001\u0000\u0000\u0000\u001e/\u0006\u0001\uffff\uffff\u0000"+
		"\u001f!\u0005\u0002\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0003\u0004\u0002"+
		"\u0000&*\u0005\"\u0000\u0000\')\u0005\u0002\u0000\u0000(\'\u0001\u0000"+
		"\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		"-.\u0006\u0001\uffff\uffff\u0000.0\u0001\u0000\u0000\u0000/\"\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0003\u0006\u0003"+
		"\u000045\u0006\u0002\uffff\uffff\u00005\u00ff\u0001\u0000\u0000\u0000"+
		"67\u0005%\u0000\u000078\u0005\u0013\u0000\u000089\u0003\u0006\u0003\u0000"+
		"9:\u0006\u0002\uffff\uffff\u0000:\u00ff\u0001\u0000\u0000\u0000;<\u0006"+
		"\u0002\uffff\uffff\u0000<=\u0005\u0004\u0000\u0000=>\u0005\u001e\u0000"+
		"\u0000>?\u0003\n\u0005\u0000?C\u0005\u001f\u0000\u0000@B\u0005\u0002\u0000"+
		"\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FJ\u0005 \u0000\u0000GI\u0005\u0002\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000MN\u0003\u0002\u0001\u0000NR\u0005!\u0000\u0000OQ\u0005\u0002\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000Sg\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0005\u0000\u0000VZ\u0005 \u0000\u0000WY\u0005"+
		"\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003\u0002\u0001\u0000^b\u0005!\u0000"+
		"\u0000_a\u0005\u0002\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0006\u0002\uffff\uffff"+
		"\u0000fh\u0001\u0000\u0000\u0000gU\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006\u0002\uffff\uffff\u0000"+
		"j\u00ff\u0001\u0000\u0000\u0000kl\u0005\u0007\u0000\u0000lm\u0005\u001e"+
		"\u0000\u0000mn\u0003\n\u0005\u0000nr\u0005\u001f\u0000\u0000oq\u0005\u0002"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uy\u0005 \u0000\u0000vx\u0005\u0002\u0000\u0000"+
		"wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u0080\u0003\u0002\u0001\u0000}\u007f\u0005\u0002\u0000\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0087"+
		"\u0005!\u0000\u0000\u0084\u0086\u0005\u0002\u0000\u0000\u0085\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0006"+
		"\u0002\uffff\uffff\u0000\u008b\u00ff\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0006\u0000\u0000\u008d\u0093\u0005\u001e\u0000\u0000\u008e\u008f"+
		"\u0005%\u0000\u0000\u008f\u0090\u0005\u0013\u0000\u0000\u0090\u0091\u0003"+
		"\u0006\u0003\u0000\u0091\u0092\u0006\u0002\uffff\uffff\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\"\u0000\u0000\u0096\u0097\u0003\n\u0005\u0000\u0097\u0098\u0005"+
		"\"\u0000\u0000\u0098\u0099\u0003\u0004\u0002\u0000\u0099\u009d\u0005\u001f"+
		"\u0000\u0000\u009a\u009c\u0005\u0002\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a4\u0005 \u0000"+
		"\u0000\u00a1\u00a3\u0005\u0002\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00ab\u0003\u0002\u0001"+
		"\u0000\u00a8\u00aa\u0005\u0002\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000"+
		"\u00af\u00b0\u0006\u0002\uffff\uffff\u0000\u00b0\u00ff\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000\u0000"+
		"\u00b3\u00b4\u0003\u0006\u0003\u0000\u00b4\u00bb\u0006\u0002\uffff\uffff"+
		"\u0000\u00b5\u00b6\u0005\u001c\u0000\u0000\u00b6\u00b7\u0003\u0006\u0003"+
		"\u0000\u00b7\u00b8\u0006\u0002\uffff\uffff\u0000\u00b8\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\u001f\u0000\u0000\u00bf\u00ff\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\t\u0000\u0000\u00c1\u00c2\u0005\u001e\u0000"+
		"\u0000\u00c2\u00c3\u0005%\u0000\u0000\u00c3\u00c9\u0006\u0002\uffff\uffff"+
		"\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000\u00c5\u00c6\u0005%\u0000\u0000"+
		"\u00c6\u00c8\u0006\u0002\uffff\uffff\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00d0\u0005\u001f\u0000"+
		"\u0000\u00cd\u00cf\u0005\u0002\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00ff\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0006\u0002\uffff"+
		"\uffff\u0000\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5\u00d6\u0005\u001e"+
		"\u0000\u0000\u00d6\u00d7\u0005%\u0000\u0000\u00d7\u00db\u0005\u001f\u0000"+
		"\u0000\u00d8\u00da\u0005\u0002\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e2\u0005 \u0000\u0000"+
		"\u00df\u00e1\u0005\u0002\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00ed\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u000f\u0000\u0000"+
		"\u00e6\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8"+
		"\u00e9\u0003\u0002\u0001\u0000\u00e9\u00ea\u0006\u0002\uffff\uffff\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000"+
		"\u00f1\u00f2\u0005#\u0000\u0000\u00f2\u00f3\u0003\u0002\u0001\u0000\u00f3"+
		"\u00f4\u0005!\u0000\u0000\u00f4\u00f5\u0006\u0002\uffff\uffff\u0000\u00f5"+
		"\u00ff\u0001\u0000\u0000\u0000\u00f6\u00f7\u0007\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005%\u0000\u0000\u00f8\u00ff\u0006\u0002\uffff\uffff\u0000\u00f9"+
		"\u00fa\u0005\r\u0000\u0000\u00fa\u00fb\u0005%\u0000\u0000\u00fb\u00ff"+
		"\u0006\u0002\uffff\uffff\u0000\u00fc\u00fd\u0005\u0011\u0000\u0000\u00fd"+
		"\u00ff\u0006\u0002\uffff\uffff\u0000\u00fe3\u0001\u0000\u0000\u0000\u00fe"+
		"6\u0001\u0000\u0000\u0000\u00fe;\u0001\u0000\u0000\u0000\u00fek\u0001"+
		"\u0000\u0000\u0000\u00fe\u008c\u0001\u0000\u0000\u0000\u00fe\u00b1\u0001"+
		"\u0000\u0000\u0000\u00fe\u00c0\u0001\u0000\u0000\u0000\u00fe\u00d3\u0001"+
		"\u0000\u0000\u0000\u00fe\u00f6\u0001\u0000\u0000\u0000\u00fe\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0005\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0003\n\u0005\u0000\u0101\u0102\u0006\u0003"+
		"\uffff\uffff\u0000\u0102\u010a\u0001\u0000\u0000\u0000\u0103\u0104\u0003"+
		"\u0010\b\u0000\u0104\u0105\u0006\u0003\uffff\uffff\u0000\u0105\u010a\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0003\b\u0004\u0000\u0107\u0108\u0006\u0003"+
		"\uffff\uffff\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0100\u0001"+
		"\u0000\u0000\u0000\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0106\u0001"+
		"\u0000\u0000\u0000\u010a\u0007\u0001\u0000\u0000\u0000\u010b\u010c\u0003"+
		"\n\u0005\u0000\u010c\u010d\u0005$\u0000\u0000\u010d\u010e\u0003\u0006"+
		"\u0003\u0000\u010e\u010f\u0005#\u0000\u0000\u010f\u0110\u0003\u0006\u0003"+
		"\u0000\u0110\u0111\u0006\u0004\uffff\uffff\u0000\u0111\t\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0003\f\u0006\u0000\u0113\u011a\u0006\u0005\uffff\uffff"+
		"\u0000\u0114\u0115\u0005\u0014\u0000\u0000\u0115\u0116\u0003\f\u0006\u0000"+
		"\u0116\u0117\u0006\u0005\uffff\uffff\u0000\u0117\u0119\u0001\u0000\u0000"+
		"\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u000b\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0003\u000e\u0007\u0000\u011e\u0125\u0006\u0006\uffff"+
		"\uffff\u0000\u011f\u0120\u0005\u0015\u0000\u0000\u0120\u0121\u0003\u000e"+
		"\u0007\u0000\u0121\u0122\u0006\u0006\uffff\uffff\u0000\u0122\u0124\u0001"+
		"\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0124\u0127\u0001"+
		"\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\r\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0003\u0010\b\u0000\u0129\u012a\u0007\u0001\u0000"+
		"\u0000\u012a\u012b\u0003\u0010\b\u0000\u012b\u012c\u0006\u0007\uffff\uffff"+
		"\u0000\u012c\u013a\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0016\u0000"+
		"\u0000\u012e\u012f\u0003\u000e\u0007\u0000\u012f\u0130\u0006\u0007\uffff"+
		"\uffff\u0000\u0130\u013a\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001e"+
		"\u0000\u0000\u0132\u0133\u0003\n\u0005\u0000\u0133\u0134\u0005\u001f\u0000"+
		"\u0000\u0134\u0135\u0006\u0007\uffff\uffff\u0000\u0135\u013a\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0003\u0018\f\u0000\u0137\u0138\u0006\u0007\uffff"+
		"\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0128\u0001\u0000"+
		"\u0000\u0000\u0139\u012d\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000"+
		"\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u000f\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0003\u0012\t\u0000\u013c\u0143\u0006\b\uffff"+
		"\uffff\u0000\u013d\u013e\u0005\u0019\u0000\u0000\u013e\u013f\u0003\u0012"+
		"\t\u0000\u013f\u0140\u0006\b\uffff\uffff\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0011\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0003\u0014\n\u0000\u0147\u014e\u0006\t\uffff"+
		"\uffff\u0000\u0148\u0149\u0005\u001a\u0000\u0000\u0149\u014a\u0003\u0014"+
		"\n\u0000\u014a\u014b\u0006\t\uffff\uffff\u0000\u014b\u014d\u0001\u0000"+
		"\u0000\u0000\u014c\u0148\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0013\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0003\u0016\u000b\u0000\u0152\u0157\u0006\n\uffff"+
		"\uffff\u0000\u0153\u0154\u0005\u001b\u0000\u0000\u0154\u0155\u0003\u0014"+
		"\n\u0000\u0155\u0156\u0006\n\uffff\uffff\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0153\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0015\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0012"+
		"\u0000\u0000\u015a\u016a\u0006\u000b\uffff\uffff\u0000\u015b\u015c\u0005"+
		"\'\u0000\u0000\u015c\u016a\u0006\u000b\uffff\uffff\u0000\u015d\u015e\u0005"+
		"\u001e\u0000\u0000\u015e\u015f\u0003\u0010\b\u0000\u015f\u0160\u0006\u000b"+
		"\uffff\uffff\u0000\u0160\u0161\u0005\u001f\u0000\u0000\u0161\u016a\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0007\u0002\u0000\u0000\u0163\u0164\u0003"+
		"\u0016\u000b\u0000\u0164\u0165\u0006\u000b\uffff\uffff\u0000\u0165\u016a"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0003\u0018\f\u0000\u0167\u0168\u0006"+
		"\u000b\uffff\uffff\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u0159"+
		"\u0001\u0000\u0000\u0000\u0169\u015b\u0001\u0000\u0000\u0000\u0169\u015d"+
		"\u0001\u0000\u0000\u0000\u0169\u0162\u0001\u0000\u0000\u0000\u0169\u0166"+
		"\u0001\u0000\u0000\u0000\u016a\u0017\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005%\u0000\u0000\u016c\u016d\u0006\f\uffff\uffff\u0000\u016d\u0019"+
		"\u0001\u0000\u0000\u0000 \"*1CJRZbgry\u0080\u0087\u0093\u009d\u00a4\u00ab"+
		"\u00bb\u00c9\u00d0\u00db\u00e2\u00ed\u00fe\u0109\u011a\u0125\u0139\u0143"+
		"\u014e\u0157\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}