// Generated from d:\repos\fordprog\ScriptLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LF", "WS", "KW_IF", "KW_ELSE", "KW_FOR", "KW_WHILE", "KW_PRINT", "KW_SCAN", 
			"KW_THEN", "KW_INT", "KW_DOUBLE", "KW_DEL", "KW_SWITCH", "KW_CASE", "KW_DEFAULT", 
			"KW_BREAK", "SZAM", "OPASSIGN", "OPOR", "OPAND", "OPNOT", "OPREL", "OPEQ", 
			"OPADD", "OPMUL", "OPPWR", "OPLST", "OPABS", "LPAR", "RPAR", "SBLOCK", 
			"EBLOCK", "OPEND", "DOUBLE_DOT", "QMARK", "ID", "COMMENT", "TIME"
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


	public ScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\6\3S\n\3\r\3\16"+
		"\3T\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6"+
		"\22\u00a5\n\22\r\22\16\22\u00a6\3\22\3\22\6\22\u00ab\n\22\r\22\16\22\u00ac"+
		"\5\22\u00af\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c4\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u00ca\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\7"+
		"%\u00e8\n%\f%\16%\u00eb\13%\3&\3&\7&\u00ef\n&\f&\16&\u00f2\13&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\2\2(\3\4\5\5\7\6\t\7\13\b\r\t\17\n\21\13\23\f\25\r"+
		"\27\16\31\17\33\20\35\21\37\22!\23#\24%\25\'\26)\27+\30-\31/\32\61\33"+
		"\63\34\65\35\67\369\37; =!?\"A#C$E%G&I\'K(M)\3\2\t\5\2\13\13\17\17\"\""+
		"\3\2\62;\4\2--//\4\2,,\61\61\4\2C\\c|\6\2\62;C\\aac|\3\2\f\f\2\u0103\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5R\3\2\2\2\7X\3\2\2\2\t["+
		"\3\2\2\2\13`\3\2\2\2\rd\3\2\2\2\17j\3\2\2\2\21p\3\2\2\2\23u\3\2\2\2\25"+
		"z\3\2\2\2\27~\3\2\2\2\31\u0085\3\2\2\2\33\u0089\3\2\2\2\35\u0090\3\2\2"+
		"\2\37\u0095\3\2\2\2!\u009d\3\2\2\2#\u00a4\3\2\2\2%\u00b0\3\2\2\2\'\u00b2"+
		"\3\2\2\2)\u00b5\3\2\2\2+\u00b9\3\2\2\2-\u00c3\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u00cb\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3"+
		"\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd\3\2\2\2C"+
		"\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e5\3\2\2\2K\u00ec\3\2"+
		"\2\2M\u00f5\3\2\2\2OP\7\f\2\2P\4\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\3\2\2W\6\3\2\2\2XY\7k\2\2YZ\7h\2\2"+
		"Z\b\3\2\2\2[\\\7g\2\2\\]\7n\2\2]^\7u\2\2^_\7g\2\2_\n\3\2\2\2`a\7h\2\2"+
		"ab\7q\2\2bc\7t\2\2c\f\3\2\2\2de\7y\2\2ef\7j\2\2fg\7k\2\2gh\7n\2\2hi\7"+
		"g\2\2i\16\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7v\2\2o\20\3\2"+
		"\2\2pq\7u\2\2qr\7e\2\2rs\7c\2\2st\7p\2\2t\22\3\2\2\2uv\7v\2\2vw\7j\2\2"+
		"wx\7g\2\2xy\7p\2\2y\24\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7v\2\2}\26\3\2\2\2"+
		"~\177\7f\2\2\177\u0080\7q\2\2\u0080\u0081\7w\2\2\u0081\u0082\7d\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\30\3\2\2\2\u0085\u0086\7f\2\2\u0086"+
		"\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\32\3\2\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7y\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7j\2\2\u008f\34\3\2\2\2\u0090\u0091\7e\2\2\u0091\u0092\7"+
		"c\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7h\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7n\2\2\u009b\u009c\7v\2\2\u009c \3\2\2\2\u009d"+
		"\u009e\7d\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7m\2\2\u00a2\"\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00ae\3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00af\3\2\2\2\u00af$\3\2\2\2"+
		"\u00b0\u00b1\7?\2\2\u00b1&\3\2\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2"+
		"\2\u00b4(\3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7"+
		"f\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc"+
		"\7v\2\2\u00bc,\3\2\2\2\u00bd\u00c4\7>\2\2\u00be\u00bf\7>\2\2\u00bf\u00c4"+
		"\7?\2\2\u00c0\u00c4\7@\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c4\7?\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00ca\7?\2\2\u00c7\u00c8"+
		"\7#\2\2\u00c8\u00ca\7?\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\60\3\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce"+
		"\64\3\2\2\2\u00cf\u00d0\7`\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2"+
		"8\3\2\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7D\2\2\u00d5\u00d6\7U\2\2\u00d6"+
		":\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8<\3\2\2\2\u00d9\u00da\7+\2\2\u00da>"+
		"\3\2\2\2\u00db\u00dc\7}\2\2\u00dc@\3\2\2\2\u00dd\u00de\7\177\2\2\u00de"+
		"B\3\2\2\2\u00df\u00e0\7=\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2F"+
		"\3\2\2\2\u00e3\u00e4\7A\2\2\u00e4H\3\2\2\2\u00e5\u00e9\t\6\2\2\u00e6\u00e8"+
		"\t\7\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00eaJ\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7%\2\2\u00ed"+
		"\u00ef\n\b\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\b&\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7V\2\2\u00f6\u00f7\7K\2\2\u00f7"+
		"\u00f8\7O\2\2\u00f8\u00f9\7G\2\2\u00f9N\3\2\2\2\13\2T\u00a6\u00ac\u00ae"+
		"\u00c3\u00c9\u00e9\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}