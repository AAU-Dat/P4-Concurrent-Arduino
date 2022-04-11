// Generated from /home/runge/semester-project/P4-Concurrent-Arduino/arcv2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arcv2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, NUMBER=6, PINDIGIT=7, INT=8, BOOL=9, 
		TYPE_TYPEOPERATOR=10, PARAMETER_DECLARATION=11, COMMENTS=12, LINECOMMENTS=13, 
		RETURN=14, WHILE=15, IT=16, FOR=17, IN=18, WHEN=19, VOID=20, SETUP=21, 
		ELSE=22, DEFINE=23, EVERY=24, TASK=25, PINMODE=26, INPUT=27, OUTPUT=28, 
		SLEEP=29, YIELD=30, ARDUINOFUNCTIONS=31, INPUT_PULLUP=32, LED_BUILTIN=33, 
		MULTI=34, DIVI=35, PLUS=36, MINUS=37, RELATIONEQOPERATORS=38, RELATIONOPERATORS=39, 
		AND=40, OR=41, NOT=42, XOR=43, IDENTIFIER=44, ASSIGNMENT=45, SEPERATOR=46, 
		STARTPARANTHESES=47, ENDPARANTHESES=48, STARTSQUAREBRACKET=49, ENDSQUAREBRACKET=50, 
		STARTCURLYBRACKET=51, ENDCURLYBRACKET=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "WS", "NUMBER", "PINDIGIT", "INT", "DIGIT", 
			"BOOL", "TYPE_TYPEOPERATOR", "PARAMETER_DECLARATION", "TYPEOPERATOR", 
			"PREFIXOPERATOR", "TYPE", "COMMENTS", "LINECOMMENTS", "RETURN", "WHILE", 
			"IT", "FOR", "IN", "WHEN", "VOID", "SETUP", "ELSE", "DEFINE", "EVERY", 
			"TASK", "PINMODE", "INPUT", "OUTPUT", "SLEEP", "YIELD", "ARDUINOFUNCTIONS", 
			"DIGITALREAD", "DIGITALWRITE", "ANALOGREAD", "ANALOGWRITE", "INPUT_PULLUP", 
			"LED_BUILTIN", "MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", 
			"RELATIONOPERATORS", "AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", 
			"SEPERATOR", "STARTPARANTHESES", "ENDPARANTHESES", "STARTSQUAREBRACKET", 
			"ENDSQUAREBRACKET", "STARTCURLYBRACKET", "ENDCURLYBRACKET", "ALPHA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#'", "'pin'", "'if'", null, null, null, null, null, null, 
			null, null, null, "'return'", "'while'", "'it'", "'for'", "'in'", "'when'", 
			"'void'", "'setup'", "'else'", "'define'", "'every'", "'task'", "'pinmode'", 
			"'INPUT'", "'OUTPUT'", "'sleep'", "'yield'", null, "'INPUT_PULLUP'", 
			"'LED_BUILTIN'", "'*'", "'/'", "'+'", "'-'", null, null, "'and'", "'or'", 
			"'not'", "'xor'", null, "'='", "','", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "NUMBER", "PINDIGIT", "INT", "BOOL", 
			"TYPE_TYPEOPERATOR", "PARAMETER_DECLARATION", "COMMENTS", "LINECOMMENTS", 
			"RETURN", "WHILE", "IT", "FOR", "IN", "WHEN", "VOID", "SETUP", "ELSE", 
			"DEFINE", "EVERY", "TASK", "PINMODE", "INPUT", "OUTPUT", "SLEEP", "YIELD", 
			"ARDUINOFUNCTIONS", "INPUT_PULLUP", "LED_BUILTIN", "MULTI", "DIVI", "PLUS", 
			"MINUS", "RELATIONEQOPERATORS", "RELATIONOPERATORS", "AND", "OR", "NOT", 
			"XOR", "IDENTIFIER", "ASSIGNMENT", "SEPERATOR", "STARTPARANTHESES", "ENDPARANTHESES", 
			"STARTSQUAREBRACKET", "ENDSQUAREBRACKET", "STARTCURLYBRACKET", "ENDCURLYBRACKET"
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


	public arcv2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arcv2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\6\6\u008a\n\6"+
		"\r\6\16\6\u008b\3\6\3\6\3\7\5\7\u0091\n\7\3\7\6\7\u0094\n\7\r\7\16\7\u0095"+
		"\3\7\3\7\6\7\u009a\n\7\r\7\16\7\u009b\5\7\u009e\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00a5\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b4\n\13\3\f\5\f\u00b7\n\f\3\f\3\f\7\f\u00bb\n\f\f\f\16"+
		"\f\u00be\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1\n\20\3\21\3\21\3\21\3\21"+
		"\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00f4\n\22\f\22\16\22\u00f7\13\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\5$\u0161\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3/\3/\5/\u01b8\n/\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u01bf\n\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u01d3\n\65\f\65\16\65\u01d6\13\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\5>\u01e9\n"+
		">\4\u00e8\u00f5\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f"+
		"\31\r\33\2\35\2\37\2!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30"+
		"\67\319\32;\33=\34?\35A\36C\37E G!I\2K\2M\2O\2Q\"S#U$W%Y&[\'](_)a*c+e"+
		",g-i.k/m\60o\61q\62s\63u\64w\65y\66{\2\3\2\b\5\2\13\f\17\17\"\"\3\2\62"+
		"\65\3\2\62\67\3\2\62;\4\2>>@@\5\2C\\aac|\2\u01f9\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0081\3\2\2\2\t\u0085"+
		"\3\2\2\2\13\u0089\3\2\2\2\r\u0090\3\2\2\2\17\u00a4\3\2\2\2\21\u00a6\3"+
		"\2\2\2\23\u00a8\3\2\2\2\25\u00b3\3\2\2\2\27\u00b6\3\2\2\2\31\u00bf\3\2"+
		"\2\2\33\u00c2\3\2\2\2\35\u00c5\3\2\2\2\37\u00e0\3\2\2\2!\u00e2\3\2\2\2"+
		"#\u00ef\3\2\2\2%\u00fd\3\2\2\2\'\u0104\3\2\2\2)\u010a\3\2\2\2+\u010d\3"+
		"\2\2\2-\u0111\3\2\2\2/\u0114\3\2\2\2\61\u0119\3\2\2\2\63\u011e\3\2\2\2"+
		"\65\u0124\3\2\2\2\67\u0129\3\2\2\29\u0130\3\2\2\2;\u0136\3\2\2\2=\u013b"+
		"\3\2\2\2?\u0143\3\2\2\2A\u0149\3\2\2\2C\u0150\3\2\2\2E\u0156\3\2\2\2G"+
		"\u0160\3\2\2\2I\u0162\3\2\2\2K\u016e\3\2\2\2M\u017b\3\2\2\2O\u0186\3\2"+
		"\2\2Q\u0192\3\2\2\2S\u019f\3\2\2\2U\u01ab\3\2\2\2W\u01ad\3\2\2\2Y\u01af"+
		"\3\2\2\2[\u01b1\3\2\2\2]\u01b7\3\2\2\2_\u01be\3\2\2\2a\u01c0\3\2\2\2c"+
		"\u01c4\3\2\2\2e\u01c7\3\2\2\2g\u01cb\3\2\2\2i\u01cf\3\2\2\2k\u01d7\3\2"+
		"\2\2m\u01d9\3\2\2\2o\u01db\3\2\2\2q\u01dd\3\2\2\2s\u01df\3\2\2\2u\u01e1"+
		"\3\2\2\2w\u01e3\3\2\2\2y\u01e5\3\2\2\2{\u01e8\3\2\2\2}~\7=\2\2~\4\3\2"+
		"\2\2\177\u0080\7%\2\2\u0080\6\3\2\2\2\u0081\u0082\7r\2\2\u0082\u0083\7"+
		"k\2\2\u0083\u0084\7p\2\2\u0084\b\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7h\2\2\u0087\n\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\b\6\2\2\u008e\f\3\2\2\2\u008f\u0091\7/\2\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0094\5\23\n\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u009d\3\2\2\2\u0097\u0099\7\60\2\2\u0098\u009a\5\23\n\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\16\3\2\2\2\u009f\u00a5\5\23\n\2\u00a0\u00a1\7\63\2\2\u00a1\u00a5\t\3"+
		"\2\2\u00a2\u00a3\7C\2\2\u00a3\u00a5\t\4\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\5\23\n"+
		"\2\u00a7\22\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7"+
		"v\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00b4\7g\2\2\u00ae\u00af"+
		"\7h\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b4\7g\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\26\3\2\2\2"+
		"\u00b5\u00b7\5\35\17\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00bc\5\37\20\2\u00b9\u00bb\5\33\16\2\u00ba\u00b9\3\2\2"+
		"\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\30"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5\27\f\2\u00c0\u00c1\5i\65\2"+
		"\u00c1\32\3\2\2\2\u00c2\u00c3\7]\2\2\u00c3\u00c4\7_\2\2\u00c4\34\3\2\2"+
		"\2\u00c5\u00c6\7o\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9"+
		"\7\"\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7w\2\2\u00cc"+
		"\u00e1\7o\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7z\2\2"+
		"\u00d0\u00e1\7v\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00e1\7n\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7j\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00e1\7t\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7o\2\2\u00dc\u00e1\7g\2\2\u00dd\u00de\7r\2\2\u00de\u00df"+
		"\7k\2\2\u00df\u00e1\7p\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0"+
		"\u00d1\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00dd\3\2"+
		"\2\2\u00e1 \3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e8"+
		"\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\21\2\2"+
		"\u00ee\"\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5\3"+
		"\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\22\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2"+
		"\u0103&\3\2\2\2\u0104\u0105\7y\2\2\u0105\u0106\7j\2\2\u0106\u0107\7k\2"+
		"\2\u0107\u0108\7n\2\2\u0108\u0109\7g\2\2\u0109(\3\2\2\2\u010a\u010b\7"+
		"k\2\2\u010b\u010c\7v\2\2\u010c*\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7t\2\2\u0110,\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113"+
		"\7p\2\2\u0113.\3\2\2\2\u0114\u0115\7y\2\2\u0115\u0116\7j\2\2\u0116\u0117"+
		"\7g\2\2\u0117\u0118\7p\2\2\u0118\60\3\2\2\2\u0119\u011a\7x\2\2\u011a\u011b"+
		"\7q\2\2\u011b\u011c\7k\2\2\u011c\u011d\7f\2\2\u011d\62\3\2\2\2\u011e\u011f"+
		"\7u\2\2\u011f\u0120\7g\2\2\u0120\u0121\7v\2\2\u0121\u0122\7w\2\2\u0122"+
		"\u0123\7r\2\2\u0123\64\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126"+
		"\u0127\7u\2\2\u0127\u0128\7g\2\2\u0128\66\3\2\2\2\u0129\u012a\7f\2\2\u012a"+
		"\u012b\7g\2\2\u012b\u012c\7h\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2"+
		"\u012e\u012f\7g\2\2\u012f8\3\2\2\2\u0130\u0131\7g\2\2\u0131\u0132\7x\2"+
		"\2\u0132\u0133\7g\2\2\u0133\u0134\7t\2\2\u0134\u0135\7{\2\2\u0135:\3\2"+
		"\2\2\u0136\u0137\7v\2\2\u0137\u0138\7c\2\2\u0138\u0139\7u\2\2\u0139\u013a"+
		"\7m\2\2\u013a<\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7k\2\2\u013d\u013e"+
		"\7p\2\2\u013e\u013f\7o\2\2\u013f\u0140\7q\2\2\u0140\u0141\7f\2\2\u0141"+
		"\u0142\7g\2\2\u0142>\3\2\2\2\u0143\u0144\7K\2\2\u0144\u0145\7P\2\2\u0145"+
		"\u0146\7R\2\2\u0146\u0147\7W\2\2\u0147\u0148\7V\2\2\u0148@\3\2\2\2\u0149"+
		"\u014a\7Q\2\2\u014a\u014b\7W\2\2\u014b\u014c\7V\2\2\u014c\u014d\7R\2\2"+
		"\u014d\u014e\7W\2\2\u014e\u014f\7V\2\2\u014fB\3\2\2\2\u0150\u0151\7u\2"+
		"\2\u0151\u0152\7n\2\2\u0152\u0153\7g\2\2\u0153\u0154\7g\2\2\u0154\u0155"+
		"\7r\2\2\u0155D\3\2\2\2\u0156\u0157\7{\2\2\u0157\u0158\7k\2\2\u0158\u0159"+
		"\7g\2\2\u0159\u015a\7n\2\2\u015a\u015b\7f\2\2\u015bF\3\2\2\2\u015c\u0161"+
		"\5K&\2\u015d\u0161\5I%\2\u015e\u0161\5M\'\2\u015f\u0161\5O(\2\u0160\u015c"+
		"\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161"+
		"H\3\2\2\2\u0162\u0163\7F\2\2\u0163\u0164\7k\2\2\u0164\u0165\7i\2\2\u0165"+
		"\u0166\7k\2\2\u0166\u0167\7v\2\2\u0167\u0168\7c\2\2\u0168\u0169\7n\2\2"+
		"\u0169\u016a\7T\2\2\u016a\u016b\7g\2\2\u016b\u016c\7c\2\2\u016c\u016d"+
		"\7f\2\2\u016dJ\3\2\2\2\u016e\u016f\7F\2\2\u016f\u0170\7k\2\2\u0170\u0171"+
		"\7i\2\2\u0171\u0172\7k\2\2\u0172\u0173\7v\2\2\u0173\u0174\7c\2\2\u0174"+
		"\u0175\7n\2\2\u0175\u0176\7Y\2\2\u0176\u0177\7t\2\2\u0177\u0178\7k\2\2"+
		"\u0178\u0179\7v\2\2\u0179\u017a\7g\2\2\u017aL\3\2\2\2\u017b\u017c\7c\2"+
		"\2\u017c\u017d\7p\2\2\u017d\u017e\7c\2\2\u017e\u017f\7n\2\2\u017f\u0180"+
		"\7q\2\2\u0180\u0181\7i\2\2\u0181\u0182\7T\2\2\u0182\u0183\7g\2\2\u0183"+
		"\u0184\7c\2\2\u0184\u0185\7f\2\2\u0185N\3\2\2\2\u0186\u0187\7c\2\2\u0187"+
		"\u0188\7p\2\2\u0188\u0189\7c\2\2\u0189\u018a\7n\2\2\u018a\u018b\7q\2\2"+
		"\u018b\u018c\7i\2\2\u018c\u018d\7Y\2\2\u018d\u018e\7t\2\2\u018e\u018f"+
		"\7k\2\2\u018f\u0190\7v\2\2\u0190\u0191\7g\2\2\u0191P\3\2\2\2\u0192\u0193"+
		"\7K\2\2\u0193\u0194\7P\2\2\u0194\u0195\7R\2\2\u0195\u0196\7W\2\2\u0196"+
		"\u0197\7V\2\2\u0197\u0198\7a\2\2\u0198\u0199\7R\2\2\u0199\u019a\7W\2\2"+
		"\u019a\u019b\7N\2\2\u019b\u019c\7N\2\2\u019c\u019d\7W\2\2\u019d\u019e"+
		"\7R\2\2\u019eR\3\2\2\2\u019f\u01a0\7N\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2"+
		"\7F\2\2\u01a2\u01a3\7a\2\2\u01a3\u01a4\7D\2\2\u01a4\u01a5\7W\2\2\u01a5"+
		"\u01a6\7K\2\2\u01a6\u01a7\7N\2\2\u01a7\u01a8\7V\2\2\u01a8\u01a9\7K\2\2"+
		"\u01a9\u01aa\7P\2\2\u01aaT\3\2\2\2\u01ab\u01ac\7,\2\2\u01acV\3\2\2\2\u01ad"+
		"\u01ae\7\61\2\2\u01aeX\3\2\2\2\u01af\u01b0\7-\2\2\u01b0Z\3\2\2\2\u01b1"+
		"\u01b2\7/\2\2\u01b2\\\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4\u01b8\7?\2\2\u01b5"+
		"\u01b6\7#\2\2\u01b6\u01b8\7?\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b5\3\2\2"+
		"\2\u01b8^\3\2\2\2\u01b9\u01bf\t\6\2\2\u01ba\u01bb\7>\2\2\u01bb\u01bf\7"+
		"?\2\2\u01bc\u01bd\7@\2\2\u01bd\u01bf\7?\2\2\u01be\u01b9\3\2\2\2\u01be"+
		"\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf`\3\2\2\2\u01c0\u01c1\7c\2\2\u01c1"+
		"\u01c2\7p\2\2\u01c2\u01c3\7f\2\2\u01c3b\3\2\2\2\u01c4\u01c5\7q\2\2\u01c5"+
		"\u01c6\7t\2\2\u01c6d\3\2\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7q\2\2\u01c9"+
		"\u01ca\7v\2\2\u01caf\3\2\2\2\u01cb\u01cc\7z\2\2\u01cc\u01cd\7q\2\2\u01cd"+
		"\u01ce\7t\2\2\u01ceh\3\2\2\2\u01cf\u01d4\5{>\2\u01d0\u01d3\5\23\n\2\u01d1"+
		"\u01d3\5{>\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2"+
		"\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5j\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01d8\7?\2\2\u01d8l\3\2\2\2\u01d9\u01da\7.\2\2\u01dan\3"+
		"\2\2\2\u01db\u01dc\7*\2\2\u01dcp\3\2\2\2\u01dd\u01de\7+\2\2\u01der\3\2"+
		"\2\2\u01df\u01e0\7]\2\2\u01e0t\3\2\2\2\u01e1\u01e2\7_\2\2\u01e2v\3\2\2"+
		"\2\u01e3\u01e4\7}\2\2\u01e4x\3\2\2\2\u01e5\u01e6\7\177\2\2\u01e6z\3\2"+
		"\2\2\u01e7\u01e9\t\7\2\2\u01e8\u01e7\3\2\2\2\u01e9|\3\2\2\2\25\2\u008b"+
		"\u0090\u0095\u009b\u009d\u00a4\u00b3\u00b6\u00bc\u00e0\u00e8\u00f5\u0160"+
		"\u01b7\u01be\u01d2\u01d4\u01e8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}