// Generated from d:\repos\fordprog\ScriptParser.g4 by ANTLR 4.9.2

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
			null, null, "'\n'", null, "'if'", "'else'", "'for'", "'while'", "'print'", 
			"'scan'", "'then'", "'int'", "'double'", "'del'", "'switch'", "'case'", 
			"'default'", "'break'", null, "'='", "'or'", "'and'", "'not'", null, 
			null, null, null, "'^'", "','", "'ABS'", "'('", "')'", "'{'", "'}'", 
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
			setState(46); 
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
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(38);
							match(LF);
							}
							} 
						}
						setState(43);
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
				setState(48); 
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

	public static class StatementContext extends ParserRuleContext {
		public ast.Program prog;
		public ast.Statement node;
		public ExprContext expr;
		public Token ID;
		public Logical_exprContext if_logic;
		public SequenceContext if_mainSubSeq;
		public Logical_exprContext else_if_logic;
		public SequenceContext else_if_mainSubSeq;
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
		public List<TerminalNode> OPEND() { return getTokens(ScriptParser.OPEND); }
		public TerminalNode OPEND(int i) {
			return getToken(ScriptParser.OPEND, i);
		}
		public List<TerminalNode> KW_IF() { return getTokens(ScriptParser.KW_IF); }
		public TerminalNode KW_IF(int i) {
			return getToken(ScriptParser.KW_IF, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(ScriptParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ScriptParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ScriptParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ScriptParser.RPAR, i);
		}
		public List<TerminalNode> SBLOCK() { return getTokens(ScriptParser.SBLOCK); }
		public TerminalNode SBLOCK(int i) {
			return getToken(ScriptParser.SBLOCK, i);
		}
		public List<TerminalNode> EBLOCK() { return getTokens(ScriptParser.EBLOCK); }
		public TerminalNode EBLOCK(int i) {
			return getToken(ScriptParser.EBLOCK, i);
		}
		public List<Logical_exprContext> logical_expr() {
			return getRuleContexts(Logical_exprContext.class);
		}
		public Logical_exprContext logical_expr(int i) {
			return getRuleContext(Logical_exprContext.class,i);
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
		public List<TerminalNode> KW_ELSE() { return getTokens(ScriptParser.KW_ELSE); }
		public TerminalNode KW_ELSE(int i) {
			return getToken(ScriptParser.KW_ELSE, i);
		}
		public TerminalNode KW_WHILE() { return getToken(ScriptParser.KW_WHILE, 0); }
		public TerminalNode KW_FOR() { return getToken(ScriptParser.KW_FOR, 0); }
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((StatementContext)_localctx).expr = expr();
				 ((StatementContext)_localctx).node =  new ast.ExprStmt(_localctx.prog, ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				((StatementContext)_localctx).ID = match(ID);
				setState(54);
				match(OPASSIGN);
				setState(55);
				((StatementContext)_localctx).expr = expr();
				setState(56);
				match(OPEND);
				 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 ast.Sequence if_elseSubSeq_node = null;
				        List<ast.LogicBodyPair> elseifs = new ArrayList(); 
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
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(79);
						match(LF);
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						match(KW_ELSE);
						setState(86);
						match(KW_IF);
						setState(87);
						match(LPAR);
						setState(88);
						((StatementContext)_localctx).else_if_logic = logical_expr();
						setState(89);
						match(RPAR);
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==LF) {
							{
							{
							setState(90);
							match(LF);
							}
							}
							setState(95);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(96);
						match(SBLOCK);
						setState(100);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(97);
								match(LF);
								}
								} 
							}
							setState(102);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
						}
						setState(103);
						((StatementContext)_localctx).else_if_mainSubSeq = sequence(prog);
						setState(104);
						match(EBLOCK);
						setState(108);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(105);
								match(LF);
								}
								} 
							}
							setState(110);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						}

						      elseifs.add(new ast.LogicBodyPair(((StatementContext)_localctx).else_if_logic.node, ((StatementContext)_localctx).else_if_mainSubSeq.node));
						      
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KW_ELSE) {
					{
					setState(118);
					match(KW_ELSE);
					setState(119);
					match(SBLOCK);
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(120);
							match(LF);
							}
							} 
						}
						setState(125);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
					}
					setState(126);
					((StatementContext)_localctx).if_elseSubSeq = sequence(prog);
					setState(127);
					match(EBLOCK);
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(128);
							match(LF);
							}
							} 
						}
						setState(133);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					 if_elseSubSeq_node = ((StatementContext)_localctx).if_elseSubSeq.node; 
					}
				}

				 ((StatementContext)_localctx).node =  new ast.If(_localctx.prog, ((StatementContext)_localctx).if_logic.node, ((StatementContext)_localctx).if_mainSubSeq.node, if_elseSubSeq_node, elseifs); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(KW_WHILE);
				setState(141);
				match(LPAR);
				setState(142);
				((StatementContext)_localctx).while_logic = logical_expr();
				setState(143);
				match(RPAR);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(144);
					match(LF);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(SBLOCK);
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						match(LF);
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(157);
				((StatementContext)_localctx).while_body = sequence(prog);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(158);
					match(LF);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(EBLOCK);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(165);
						match(LF);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				 ((StatementContext)_localctx).node =  new ast.While(_localctx.prog, ((StatementContext)_localctx).while_logic.node, ((StatementContext)_localctx).while_body.node); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(KW_FOR);
				setState(174);
				match(LPAR);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(175);
					((StatementContext)_localctx).ID = match(ID);
					setState(176);
					match(OPASSIGN);
					setState(177);
					((StatementContext)_localctx).expr = expr();
					 ((StatementContext)_localctx).node =  new ast.Assignment(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expr.node); 
					}
				}

				setState(182);
				match(OPEND);
				setState(183);
				((StatementContext)_localctx).for_logic = logical_expr();
				setState(184);
				match(OPEND);
				setState(185);
				((StatementContext)_localctx).for_incr = statement(prog);
				setState(186);
				match(RPAR);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(187);
					match(LF);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(SBLOCK);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						match(LF);
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(200);
				((StatementContext)_localctx).for_body = sequence(prog);
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
				match(EBLOCK);
				 ((StatementContext)_localctx).node =  new ast.For(_localctx.prog, ((StatementContext)_localctx).for_logic.node, ((StatementContext)_localctx).for_incr.node, ((StatementContext)_localctx).for_body.node); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(KW_PRINT);
				setState(211);
				match(LPAR);
				setState(212);
				((StatementContext)_localctx).top_print = expr();
				 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, ((StatementContext)_localctx).top_print.node); 
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(214);
					match(OPLST);
					setState(215);
					((StatementContext)_localctx).sub_print = expr();
					 ((StatementContext)_localctx).node =  new ast.Print(_localctx.prog, _localctx.node, ((StatementContext)_localctx).sub_print.node); 
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(RPAR);
				setState(224);
				match(OPEND);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226);
				match(KW_SCAN);
				setState(227);
				match(LPAR);
				setState(228);
				((StatementContext)_localctx).ID = match(ID);
				 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPLST) {
					{
					{
					setState(230);
					match(OPLST);
					setState(231);
					((StatementContext)_localctx).ID = match(ID);
					 ((StatementContext)_localctx).node =  new ast.Scan(_localctx.prog, _localctx.node, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(RPAR);
				setState(239);
				match(OPEND);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{

				    Map<ast.Const, ast.Sequence> cases = new LinkedHashMap<>();
				setState(241);
				match(KW_SWITCH);
				setState(242);
				match(LPAR);
				setState(243);
				((StatementContext)_localctx).target = match(ID);
				setState(244);
				match(RPAR);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(245);
					match(LF);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(SBLOCK);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LF) {
					{
					{
					setState(252);
					match(LF);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KW_CASE) {
					{
					{
					setState(258);
					match(KW_CASE);
					setState(259);
					((StatementContext)_localctx).SZAM = match(SZAM);
					setState(260);
					match(DOUBLE_DOT);
					setState(261);
					((StatementContext)_localctx).case_body = sequence(prog);
					cases.put(new ast.Const((((StatementContext)_localctx).SZAM!=null?((StatementContext)_localctx).SZAM.getText():null)), ((StatementContext)_localctx).case_body.node);
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(KW_DEFAULT);
				setState(270);
				match(DOUBLE_DOT);
				setState(271);
				((StatementContext)_localctx).def_seq = sequence(prog);
				setState(272);
				match(EBLOCK);
				 ((StatementContext)_localctx).node =  new ast.Switch(_localctx.prog, (((StatementContext)_localctx).target!=null?((StatementContext)_localctx).target.getText():null), ((StatementContext)_localctx).def_seq.node, cases); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(275);
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
				setState(276);
				((StatementContext)_localctx).ID = match(ID);
				setState(277);
				match(OPEND);
				 ((StatementContext)_localctx).node =  new ast.VarDecl(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), (((StatementContext)_localctx).type!=null?((StatementContext)_localctx).type.getText():null));
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(279);
				match(KW_DEL);
				setState(280);
				((StatementContext)_localctx).ID = match(ID);
				setState(281);
				match(OPEND);
				 ((StatementContext)_localctx).node =  new ast.Delete(_localctx.prog, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				match(KW_BREAK);
				setState(284);
				match(OPEND);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((ExprContext)_localctx).logical_expr = logical_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).logical_expr.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((ExprContext)_localctx).num_expr = num_expr();
				 ((ExprContext)_localctx).node = ((ExprContext)_localctx).num_expr.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
			setState(299);
			((Dec_exprContext)_localctx).logic = logical_expr();
			setState(300);
			match(QMARK);
			setState(301);
			((Dec_exprContext)_localctx).true_b = expr();
			setState(302);
			match(DOUBLE_DOT);
			setState(303);
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
			setState(306);
			((Logical_exprContext)_localctx).or_top = logical_tag();
			 ((Logical_exprContext)_localctx).node =  ((Logical_exprContext)_localctx).or_top.node; 
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPOR) {
				{
				{
				setState(308);
				((Logical_exprContext)_localctx).OPOR = match(OPOR);
				setState(309);
				((Logical_exprContext)_localctx).or_next = logical_tag();
				 ((Logical_exprContext)_localctx).node =  new ast.Binary((((Logical_exprContext)_localctx).OPOR!=null?((Logical_exprContext)_localctx).OPOR.getText():null), _localctx.node, ((Logical_exprContext)_localctx).or_next.node); 
				}
				}
				setState(316);
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
		enterRule(_localctx, 12, RULE_logical_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((Logical_tagContext)_localctx).and_top = logical_fct();
			 ((Logical_tagContext)_localctx).node =  ((Logical_tagContext)_localctx).and_top.node; 
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPAND) {
				{
				{
				setState(319);
				((Logical_tagContext)_localctx).OPAND = match(OPAND);
				setState(320);
				((Logical_tagContext)_localctx).and_next = logical_fct();
				 ((Logical_tagContext)_localctx).node =  new ast.Binary((((Logical_tagContext)_localctx).OPAND!=null?((Logical_tagContext)_localctx).OPAND.getText():null), _localctx.node, ((Logical_tagContext)_localctx).and_next.node); 
				}
				}
				setState(327);
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
		enterRule(_localctx, 14, RULE_logical_fct);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((Logical_fctContext)_localctx).rel = num_expr();
				setState(329);
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
				setState(330);
				((Logical_fctContext)_localctx).rer = num_expr();
				 ((Logical_fctContext)_localctx).node =  new ast.Binary((((Logical_fctContext)_localctx).op!=null?((Logical_fctContext)_localctx).op.getText():null), ((Logical_fctContext)_localctx).rel.node, ((Logical_fctContext)_localctx).rer.node); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				((Logical_fctContext)_localctx).OPNOT = match(OPNOT);
				setState(334);
				((Logical_fctContext)_localctx).logical_fct = logical_fct();
				 ((Logical_fctContext)_localctx).node =  new ast.Unary((((Logical_fctContext)_localctx).OPNOT!=null?((Logical_fctContext)_localctx).OPNOT.getText():null), ((Logical_fctContext)_localctx).logical_fct.node); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(LPAR);
				setState(338);
				((Logical_fctContext)_localctx).logical_expr = logical_expr();
				setState(339);
				match(RPAR);
				 ((Logical_fctContext)_localctx).node =  new ast.Parens(((Logical_fctContext)_localctx).logical_expr.node); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
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
		enterRule(_localctx, 16, RULE_num_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			((Num_exprContext)_localctx).add_top = addop();
			 ((Num_exprContext)_localctx).node =  ((Num_exprContext)_localctx).add_top.node; 
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					((Num_exprContext)_localctx).OPADD = match(OPADD);
					setState(350);
					((Num_exprContext)_localctx).add_next = addop();
					 ((Num_exprContext)_localctx).node =  new ast.Binary((((Num_exprContext)_localctx).OPADD!=null?((Num_exprContext)_localctx).OPADD.getText():null), _localctx.node, ((Num_exprContext)_localctx).add_next.node); 
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 18, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((AddopContext)_localctx).mul_top = mulop();
			 ((AddopContext)_localctx).node =  ((AddopContext)_localctx).mul_top.node; 
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPMUL) {
				{
				{
				setState(360);
				((AddopContext)_localctx).OPMUL = match(OPMUL);
				setState(361);
				((AddopContext)_localctx).mul_next = mulop();
				 ((AddopContext)_localctx).node =  new ast.Binary((((AddopContext)_localctx).OPMUL!=null?((AddopContext)_localctx).OPMUL.getText():null), _localctx.node, ((AddopContext)_localctx).mul_next.node); 
				}
				}
				setState(368);
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
		enterRule(_localctx, 20, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			((MulopContext)_localctx).pwr_top = num_fct();
			 ((MulopContext)_localctx).node =  ((MulopContext)_localctx).pwr_top.node; 
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPPWR) {
				{
				setState(371);
				((MulopContext)_localctx).OPPWR = match(OPPWR);
				setState(372);
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
		public Token OPADD;
		public Num_fctContext num_fct;
		public Token OPABS;
		public VariableContext vr;
		public TerminalNode SZAM() { return getToken(ScriptParser.SZAM, 0); }
		public TerminalNode TIME() { return getToken(ScriptParser.TIME, 0); }
		public TerminalNode LPAR() { return getToken(ScriptParser.LPAR, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptParser.RPAR, 0); }
		public TerminalNode OPADD() { return getToken(ScriptParser.OPADD, 0); }
		public Num_fctContext num_fct() {
			return getRuleContext(Num_fctContext.class,0);
		}
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
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SZAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((Num_fctContext)_localctx).SZAM = match(SZAM);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).SZAM!=null?((Num_fctContext)_localctx).SZAM.getText():null)); 
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				((Num_fctContext)_localctx).TIME = match(TIME);
				 ((Num_fctContext)_localctx).node =  new ast.Const((((Num_fctContext)_localctx).TIME!=null?((Num_fctContext)_localctx).TIME.getText():null)); 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(LPAR);
				setState(382);
				((Num_fctContext)_localctx).num_expr = num_expr();
				 ((Num_fctContext)_localctx).node =  new ast.Parens(((Num_fctContext)_localctx).num_expr.node); 
				setState(384);
				match(RPAR);
				}
				break;
			case OPADD:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				((Num_fctContext)_localctx).OPADD = match(OPADD);
				setState(387);
				((Num_fctContext)_localctx).num_fct = num_fct();
				 ((Num_fctContext)_localctx).node =  new ast.Unary((((Num_fctContext)_localctx).OPADD!=null?((Num_fctContext)_localctx).OPADD.getText():null), ((Num_fctContext)_localctx).num_fct.node); 
				}
				break;
			case OPABS:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				((Num_fctContext)_localctx).OPABS = match(OPABS);
				setState(391);
				match(LPAR);
				setState(392);
				((Num_fctContext)_localctx).num_fct = num_fct();
				setState(393);
				match(RPAR);
				((Num_fctContext)_localctx).node =  new ast.Unary((((Num_fctContext)_localctx).OPABS!=null?((Num_fctContext)_localctx).OPABS.getText():null), ((Num_fctContext)_localctx).num_fct.node);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
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
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0197\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\6\3\61\n\3\r\3\16\3\62"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4D\n\4"+
		"\f\4\16\4G\13\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\3\4\3\4\7\4S\n\4\f"+
		"\4\16\4V\13\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\4\3\4"+
		"\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\3\4\7\4m\n\4\f\4\16\4p\13\4\3\4\3\4\7"+
		"\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4"+
		"\3\4\7\4\u0084\n\4\f\4\16\4\u0087\13\4\3\4\3\4\5\4\u008b\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\u0094\n\4\f\4\16\4\u0097\13\4\3\4\3\4\7\4\u009b"+
		"\n\4\f\4\16\4\u009e\13\4\3\4\3\4\7\4\u00a2\n\4\f\4\16\4\u00a5\13\4\3\4"+
		"\3\4\7\4\u00a9\n\4\f\4\16\4\u00ac\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00b7\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00bf\n\4\f\4\16\4\u00c2"+
		"\13\4\3\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3\4\3\4\7\4\u00cd\n\4"+
		"\f\4\16\4\u00d0\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00dd"+
		"\n\4\f\4\16\4\u00e0\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00ec"+
		"\n\4\f\4\16\4\u00ef\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00f9\n\4"+
		"\f\4\16\4\u00fc\13\4\3\4\3\4\7\4\u0100\n\4\f\4\16\4\u0103\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u010b\n\4\f\4\16\4\u010e\13\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0121\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u012c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u013b\n\7\f\7\16\7\u013e\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u0146\n\b\f\b\16\b\u0149\13\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u015c\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u0164\n\n\f\n\16\n\u0167\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u016f\n\13\f\13\16\13\u0172\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u017a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0192\n\r\3\16\3\16\3\16\3\16\2\2\17"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\r\16\3\2\31\32\2\u01bc\2\34"+
		"\3\2\2\2\4 \3\2\2\2\6\u0120\3\2\2\2\b\u012b\3\2\2\2\n\u012d\3\2\2\2\f"+
		"\u0134\3\2\2\2\16\u013f\3\2\2\2\20\u015b\3\2\2\2\22\u015d\3\2\2\2\24\u0168"+
		"\3\2\2\2\26\u0173\3\2\2\2\30\u0191\3\2\2\2\32\u0193\3\2\2\2\34\35\5\4"+
		"\3\2\35\36\b\2\1\2\36\37\7\2\2\3\37\3\3\2\2\2 \60\b\3\1\2!#\7\4\2\2\""+
		"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\5\6\4"+
		"\2(*\7\4\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2"+
		"\2./\b\3\1\2/\61\3\2\2\2\60$\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\b\4\1\2\66\u0121\3\2\2\2\67"+
		"8\7\'\2\289\7\25\2\29:\5\b\5\2:;\7$\2\2;<\b\4\1\2<\u0121\3\2\2\2=>\b\4"+
		"\1\2>?\7\6\2\2?@\7 \2\2@A\5\f\7\2AE\7!\2\2BD\7\4\2\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\7\"\2\2IK\7\4\2\2JI\3\2\2"+
		"\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\4\3\2PT\7#\2"+
		"\2QS\7\4\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2Uu\3\2\2\2VT\3\2\2"+
		"\2WX\7\7\2\2XY\7\6\2\2YZ\7 \2\2Z[\5\f\7\2[_\7!\2\2\\^\7\4\2\2]\\\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7\"\2\2ce\7\4\2"+
		"\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\5\4\3"+
		"\2jn\7#\2\2km\7\4\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2"+
		"\2pn\3\2\2\2qr\b\4\1\2rt\3\2\2\2sW\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2v\u008a\3\2\2\2wu\3\2\2\2xy\7\7\2\2y}\7\"\2\2z|\7\4\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\5"+
		"\4\3\2\u0081\u0085\7#\2\2\u0082\u0084\7\4\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\4\1\2\u0089\u008b\3\2\2\2\u008a"+
		"x\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\4\1\2"+
		"\u008d\u0121\3\2\2\2\u008e\u008f\7\t\2\2\u008f\u0090\7 \2\2\u0090\u0091"+
		"\5\f\7\2\u0091\u0095\7!\2\2\u0092\u0094\7\4\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009c\7\"\2\2\u0099\u009b\7\4\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a3\5\4\3\2\u00a0"+
		"\u00a2\7\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00aa\7#\2\2\u00a7\u00a9\7\4\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\b\4\1\2\u00ae\u0121\3\2\2\2\u00af\u00b0\7\b"+
		"\2\2\u00b0\u00b6\7 \2\2\u00b1\u00b2\7\'\2\2\u00b2\u00b3\7\25\2\2\u00b3"+
		"\u00b4\5\b\5\2\u00b4\u00b5\b\4\1\2\u00b5\u00b7\3\2\2\2\u00b6\u00b1\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9"+
		"\u00ba\5\f\7\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\5\6\4\2\u00bc\u00c0\7!\2"+
		"\2\u00bd\u00bf\7\4\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c7\7\"\2\2\u00c4\u00c6\7\4\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00ce\5\4\3\2\u00cb\u00cd\7\4\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3\b\4"+
		"\1\2\u00d3\u0121\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00d6\7 \2\2\u00d6"+
		"\u00d7\5\b\5\2\u00d7\u00de\b\4\1\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\5"+
		"\b\5\2\u00da\u00db\b\4\1\2\u00db\u00dd\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7!\2\2\u00e2\u00e3\7$\2\2\u00e3\u0121"+
		"\3\2\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7\7\'\2\2\u00e7"+
		"\u00ed\b\4\1\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\7\'\2\2\u00ea\u00ec\b"+
		"\4\1\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7!"+
		"\2\2\u00f1\u0121\7$\2\2\u00f2\u00f3\b\4\1\2\u00f3\u00f4\7\20\2\2\u00f4"+
		"\u00f5\7 \2\2\u00f5\u00f6\7\'\2\2\u00f6\u00fa\7!\2\2\u00f7\u00f9\7\4\2"+
		"\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0101\7\"\2\2\u00fe"+
		"\u0100\7\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u010c\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\7\21\2\2\u0105\u0106\7\24\2\2\u0106\u0107\7%\2\2\u0107\u0108\5"+
		"\4\3\2\u0108\u0109\b\4\1\2\u0109\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\22\2\2\u0110\u0111\7%\2\2\u0111"+
		"\u0112\5\4\3\2\u0112\u0113\7#\2\2\u0113\u0114\b\4\1\2\u0114\u0121\3\2"+
		"\2\2\u0115\u0116\t\2\2\2\u0116\u0117\7\'\2\2\u0117\u0118\7$\2\2\u0118"+
		"\u0121\b\4\1\2\u0119\u011a\7\17\2\2\u011a\u011b\7\'\2\2\u011b\u011c\7"+
		"$\2\2\u011c\u0121\b\4\1\2\u011d\u011e\7\23\2\2\u011e\u011f\7$\2\2\u011f"+
		"\u0121\b\4\1\2\u0120\64\3\2\2\2\u0120\67\3\2\2\2\u0120=\3\2\2\2\u0120"+
		"\u008e\3\2\2\2\u0120\u00af\3\2\2\2\u0120\u00d4\3\2\2\2\u0120\u00e4\3\2"+
		"\2\2\u0120\u00f2\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0119\3\2\2\2\u0120"+
		"\u011d\3\2\2\2\u0121\7\3\2\2\2\u0122\u0123\5\f\7\2\u0123\u0124\b\5\1\2"+
		"\u0124\u012c\3\2\2\2\u0125\u0126\5\22\n\2\u0126\u0127\b\5\1\2\u0127\u012c"+
		"\3\2\2\2\u0128\u0129\5\n\6\2\u0129\u012a\b\5\1\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0122\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0128\3\2\2\2\u012c\t\3\2\2\2"+
		"\u012d\u012e\5\f\7\2\u012e\u012f\7&\2\2\u012f\u0130\5\b\5\2\u0130\u0131"+
		"\7%\2\2\u0131\u0132\5\b\5\2\u0132\u0133\b\6\1\2\u0133\13\3\2\2\2\u0134"+
		"\u0135\5\16\b\2\u0135\u013c\b\7\1\2\u0136\u0137\7\26\2\2\u0137\u0138\5"+
		"\16\b\2\u0138\u0139\b\7\1\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\r\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\5\20\t\2\u0140\u0147\b\b\1\2\u0141\u0142"+
		"\7\27\2\2\u0142\u0143\5\20\t\2\u0143\u0144\b\b\1\2\u0144\u0146\3\2\2\2"+
		"\u0145\u0141\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\17\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5\22\n\2\u014b"+
		"\u014c\t\3\2\2\u014c\u014d\5\22\n\2\u014d\u014e\b\t\1\2\u014e\u015c\3"+
		"\2\2\2\u014f\u0150\7\30\2\2\u0150\u0151\5\20\t\2\u0151\u0152\b\t\1\2\u0152"+
		"\u015c\3\2\2\2\u0153\u0154\7 \2\2\u0154\u0155\5\f\7\2\u0155\u0156\7!\2"+
		"\2\u0156\u0157\b\t\1\2\u0157\u015c\3\2\2\2\u0158\u0159\5\32\16\2\u0159"+
		"\u015a\b\t\1\2\u015a\u015c\3\2\2\2\u015b\u014a\3\2\2\2\u015b\u014f\3\2"+
		"\2\2\u015b\u0153\3\2\2\2\u015b\u0158\3\2\2\2\u015c\21\3\2\2\2\u015d\u015e"+
		"\5\24\13\2\u015e\u0165\b\n\1\2\u015f\u0160\7\33\2\2\u0160\u0161\5\24\13"+
		"\2\u0161\u0162\b\n\1\2\u0162\u0164\3\2\2\2\u0163\u015f\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\23\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u0169\5\26\f\2\u0169\u0170\b\13\1\2\u016a\u016b\7"+
		"\34\2\2\u016b\u016c\5\26\f\2\u016c\u016d\b\13\1\2\u016d\u016f\3\2\2\2"+
		"\u016e\u016a\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\25\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5\30\r\2\u0174"+
		"\u0179\b\f\1\2\u0175\u0176\7\35\2\2\u0176\u0177\5\26\f\2\u0177\u0178\b"+
		"\f\1\2\u0178\u017a\3\2\2\2\u0179\u0175\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\27\3\2\2\2\u017b\u017c\7\24\2\2\u017c\u0192\b\r\1\2\u017d\u017e\7)\2"+
		"\2\u017e\u0192\b\r\1\2\u017f\u0180\7 \2\2\u0180\u0181\5\22\n\2\u0181\u0182"+
		"\b\r\1\2\u0182\u0183\7!\2\2\u0183\u0192\3\2\2\2\u0184\u0185\7\33\2\2\u0185"+
		"\u0186\5\30\r\2\u0186\u0187\b\r\1\2\u0187\u0192\3\2\2\2\u0188\u0189\7"+
		"\37\2\2\u0189\u018a\7 \2\2\u018a\u018b\5\30\r\2\u018b\u018c\7!\2\2\u018c"+
		"\u018d\b\r\1\2\u018d\u0192\3\2\2\2\u018e\u018f\5\32\16\2\u018f\u0190\b"+
		"\r\1\2\u0190\u0192\3\2\2\2\u0191\u017b\3\2\2\2\u0191\u017d\3\2\2\2\u0191"+
		"\u017f\3\2\2\2\u0191\u0184\3\2\2\2\u0191\u0188\3\2\2\2\u0191\u018e\3\2"+
		"\2\2\u0192\31\3\2\2\2\u0193\u0194\7\'\2\2\u0194\u0195\b\16\1\2\u0195\33"+
		"\3\2\2\2%$+\62ELT_fnu}\u0085\u008a\u0095\u009c\u00a3\u00aa\u00b6\u00c0"+
		"\u00c7\u00ce\u00de\u00ed\u00fa\u0101\u010c\u0120\u012b\u013c\u0147\u015b"+
		"\u0165\u0170\u0179\u0191";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}