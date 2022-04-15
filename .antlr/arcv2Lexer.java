// Generated from /Users/jamiehammer/Dev/P4-Concurrent-Arduino/arcv2.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, PINDIGIT=6, INT=7, BOOL=8, CHAR=9, 
		TYPE_TYPEOPERATOR=10, COMMENTS=11, LINECOMMENTS=12, RETURN=13, WHILE=14, 
		IT=15, FOR=16, IN=17, WHEN=18, VOID=19, SETUP=20, ELSE=21, DEFINE=22, 
		EVERY=23, TASK=24, PINMODE=25, INPUT=26, OUTPUT=27, YIELD=28, ARDUINOFUNCTIONS=29, 
		INPUT_PULLUP=30, LED_BUILTIN=31, MULTI=32, DIVI=33, PLUS=34, MINUS=35, 
		RELATIONEQOPERATORS=36, RELATIONOPERATORS=37, AND=38, OR=39, NOT=40, XOR=41, 
		IDENTIFIER=42, ASSIGNMENT=43, SEPERATOR=44, STARTPARANTHESES=45, ENDPARANTHESES=46, 
		STARTSQUAREBRACKET=47, ENDSQUAREBRACKET=48, STARTCURLYBRACKET=49, ENDCURLYBRACKET=50, 
		WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NUMBER", "PINDIGIT", "INT", "DIGIT", 
			"BOOL", "CHAR", "TYPE_TYPEOPERATOR", "TYPEOPERATOR", "PREFIXOPERATOR", 
			"TYPE", "COMMENTS", "LINECOMMENTS", "RETURN", "WHILE", "IT", "FOR", "IN", 
			"WHEN", "VOID", "SETUP", "ELSE", "DEFINE", "EVERY", "TASK", "PINMODE", 
			"INPUT", "OUTPUT", "YIELD", "ARDUINOFUNCTIONS", "DIGITALREAD", "DIGITALWRITE", 
			"SLEEP", "ANALOGREAD", "ANALOGWRITE", "INPUT_PULLUP", "LED_BUILTIN", 
			"MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", "RELATIONOPERATORS", 
			"AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", "SEPERATOR", "STARTPARANTHESES", 
			"ENDPARANTHESES", "STARTSQUAREBRACKET", "ENDSQUAREBRACKET", "STARTCURLYBRACKET", 
			"ENDCURLYBRACKET", "ALPHA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#'", "'pin'", "'if'", null, null, null, null, null, null, 
			null, null, "'return'", "'while'", "'it'", "'for'", "'in'", "'when'", 
			"'void'", "'setup'", "'else'", "'define'", "'every'", "'task'", "'pinmode'", 
			"'INPUT'", "'OUTPUT'", "'yield'", null, "'INPUT_PULLUP'", "'LED_BUILTIN'", 
			"'*'", "'/'", "'+'", "'-'", null, null, "'and'", "'or'", "'not'", "'xor'", 
			null, "'='", "','", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMBER", "PINDIGIT", "INT", "BOOL", "CHAR", 
			"TYPE_TYPEOPERATOR", "COMMENTS", "LINECOMMENTS", "RETURN", "WHILE", "IT", 
			"FOR", "IN", "WHEN", "VOID", "SETUP", "ELSE", "DEFINE", "EVERY", "TASK", 
			"PINMODE", "INPUT", "OUTPUT", "YIELD", "ARDUINOFUNCTIONS", "INPUT_PULLUP", 
			"LED_BUILTIN", "MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", 
			"RELATIONOPERATORS", "AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", 
			"SEPERATOR", "STARTPARANTHESES", "ENDPARANTHESES", "STARTSQUAREBRACKET", 
			"ENDSQUAREBRACKET", "STARTCURLYBRACKET", "ENDCURLYBRACKET", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\5\6\u008a\n\6"+
		"\3\6\6\6\u008d\n\6\r\6\16\6\u008e\3\6\3\6\6\6\u0093\n\6\r\6\16\6\u0094"+
		"\5\6\u0097\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13\3\13\3\f\5\f\u00b0\n\f\3\f\3\f\7"+
		"\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cc\n\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00d2\n\20\f\20\16\20\u00d5\13\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00df\n\21\f\21\16\21\u00e2\13\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0146\n\"\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\5.\u01a3"+
		"\n.\3/\3/\3/\3/\3/\5/\u01aa\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\7\64\u01be\n\64\f\64"+
		"\16\64\u01c1\13\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;"+
		"\3;\3<\3<\3=\5=\u01d4\n=\3>\6>\u01d7\n>\r>\16>\u01d8\3>\3>\4\u00d3\u00e0"+
		"\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\25\13\27\f\31\2\33\2\35\2"+
		"\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30\67\319\32;\33"+
		"=\34?\35A\36C\37E\2G\2I\2K\2M\2O Q!S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60"+
		"q\61s\62u\63w\64y\2{\65\3\2\7\3\2\62\67\3\2\62;\4\2>>@@\5\2C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u01e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177"+
		"\3\2\2\2\7\u0081\3\2\2\2\t\u0085\3\2\2\2\13\u0089\3\2\2\2\r\u0098\3\2"+
		"\2\2\17\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u00a8\3\2\2\2\25\u00aa\3\2\2"+
		"\2\27\u00af\3\2\2\2\31\u00b8\3\2\2\2\33\u00bb\3\2\2\2\35\u00cb\3\2\2\2"+
		"\37\u00cd\3\2\2\2!\u00da\3\2\2\2#\u00e8\3\2\2\2%\u00ef\3\2\2\2\'\u00f5"+
		"\3\2\2\2)\u00f8\3\2\2\2+\u00fc\3\2\2\2-\u00ff\3\2\2\2/\u0104\3\2\2\2\61"+
		"\u0109\3\2\2\2\63\u010f\3\2\2\2\65\u0114\3\2\2\2\67\u011b\3\2\2\29\u0121"+
		"\3\2\2\2;\u0126\3\2\2\2=\u012e\3\2\2\2?\u0134\3\2\2\2A\u013b\3\2\2\2C"+
		"\u0145\3\2\2\2E\u0147\3\2\2\2G\u0153\3\2\2\2I\u0160\3\2\2\2K\u0166\3\2"+
		"\2\2M\u0171\3\2\2\2O\u017d\3\2\2\2Q\u018a\3\2\2\2S\u0196\3\2\2\2U\u0198"+
		"\3\2\2\2W\u019a\3\2\2\2Y\u019c\3\2\2\2[\u01a2\3\2\2\2]\u01a9\3\2\2\2_"+
		"\u01ab\3\2\2\2a\u01af\3\2\2\2c\u01b2\3\2\2\2e\u01b6\3\2\2\2g\u01ba\3\2"+
		"\2\2i\u01c2\3\2\2\2k\u01c4\3\2\2\2m\u01c6\3\2\2\2o\u01c8\3\2\2\2q\u01ca"+
		"\3\2\2\2s\u01cc\3\2\2\2u\u01ce\3\2\2\2w\u01d0\3\2\2\2y\u01d3\3\2\2\2{"+
		"\u01d6\3\2\2\2}~\7=\2\2~\4\3\2\2\2\177\u0080\7%\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0082\7r\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\b\3\2\2\2\u0085"+
		"\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\n\3\2\2\2\u0088\u008a\7/\2\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\21"+
		"\t\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0096\3\2\2\2\u0090\u0092\7\60\2\2\u0091\u0093\5"+
		"\21\t\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\f\3\2\2\2\u0098\u0099\7C\2\2\u0099\u009a\t\2\2\2\u009a\16\3"+
		"\2\2\2\u009b\u009c\5\21\t\2\u009c\20\3\2\2\2\u009d\u009e\t\3\2\2\u009e"+
		"\22\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2"+
		"\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3"+
		"\3\2\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac\13\2\2\2\u00ac"+
		"\u00ad\7$\2\2\u00ad\26\3\2\2\2\u00ae\u00b0\5\33\16\2\u00af\u00ae\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b5\5\35\17\2\u00b2"+
		"\u00b4\5\31\r\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\30\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7]\2\2\u00b9\u00ba\7_\2\2\u00ba\32\3\2\2\2\u00bb\u00bc\7o\2\2\u00bc"+
		"\u00bd\7w\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7\"\2\2\u00bf\34\3\2\2\2"+
		"\u00c0\u00c1\7p\2\2\u00c1\u00c2\7w\2\2\u00c2\u00cc\7o\2\2\u00c3\u00c4"+
		"\7d\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7q\2\2\u00c6\u00cc\7n\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cc\7t\2\2"+
		"\u00cb\u00c0\3\2\2\2\u00cb\u00c3\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\36"+
		"\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d3\3\2\2\2"+
		"\u00d0\u00d2\13\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d7\7\f\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\20\2\2\u00d9 \3\2\2\2"+
		"\u00da\u00db\7\61\2\2\u00db\u00dc\7,\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df"+
		"\13\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4"+
		"\7,\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\21\2\2"+
		"\u00e7\"\3\2\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7v"+
		"\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7p\2\2\u00ee$\3"+
		"\2\2\2\u00ef\u00f0\7y\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7t\2\2\u00fb*\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe"+
		",\3\2\2\2\u00ff\u0100\7y\2\2\u0100\u0101\7j\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7p\2\2\u0103.\3\2\2\2\u0104\u0105\7x\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7f\2\2\u0108\60\3\2\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7g\2\2\u010b\u010c\7v\2\2\u010c\u010d\7w\2\2\u010d\u010e\7r\2\2"+
		"\u010e\62\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7"+
		"u\2\2\u0112\u0113\7g\2\2\u0113\64\3\2\2\2\u0114\u0115\7f\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7h\2\2\u0117\u0118\7k\2\2\u0118\u0119\7p\2\2\u0119"+
		"\u011a\7g\2\2\u011a\66\3\2\2\2\u011b\u011c\7g\2\2\u011c\u011d\7x\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u011f\7t\2\2\u011f\u0120\7{\2\2\u01208\3\2\2\2\u0121"+
		"\u0122\7v\2\2\u0122\u0123\7c\2\2\u0123\u0124\7u\2\2\u0124\u0125\7m\2\2"+
		"\u0125:\3\2\2\2\u0126\u0127\7r\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2"+
		"\2\u0129\u012a\7o\2\2\u012a\u012b\7q\2\2\u012b\u012c\7f\2\2\u012c\u012d"+
		"\7g\2\2\u012d<\3\2\2\2\u012e\u012f\7K\2\2\u012f\u0130\7P\2\2\u0130\u0131"+
		"\7R\2\2\u0131\u0132\7W\2\2\u0132\u0133\7V\2\2\u0133>\3\2\2\2\u0134\u0135"+
		"\7Q\2\2\u0135\u0136\7W\2\2\u0136\u0137\7V\2\2\u0137\u0138\7R\2\2\u0138"+
		"\u0139\7W\2\2\u0139\u013a\7V\2\2\u013a@\3\2\2\2\u013b\u013c\7{\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7g\2\2\u013e\u013f\7n\2\2\u013f\u0140\7f\2\2"+
		"\u0140B\3\2\2\2\u0141\u0146\5G$\2\u0142\u0146\5E#\2\u0143\u0146\5K&\2"+
		"\u0144\u0146\5M\'\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0144\3\2\2\2\u0146D\3\2\2\2\u0147\u0148\7F\2\2\u0148\u0149"+
		"\7k\2\2\u0149\u014a\7i\2\2\u014a\u014b\7k\2\2\u014b\u014c\7v\2\2\u014c"+
		"\u014d\7c\2\2\u014d\u014e\7n\2\2\u014e\u014f\7T\2\2\u014f\u0150\7g\2\2"+
		"\u0150\u0151\7c\2\2\u0151\u0152\7f\2\2\u0152F\3\2\2\2\u0153\u0154\7F\2"+
		"\2\u0154\u0155\7k\2\2\u0155\u0156\7i\2\2\u0156\u0157\7k\2\2\u0157\u0158"+
		"\7v\2\2\u0158\u0159\7c\2\2\u0159\u015a\7n\2\2\u015a\u015b\7Y\2\2\u015b"+
		"\u015c\7t\2\2\u015c\u015d\7k\2\2\u015d\u015e\7v\2\2\u015e\u015f\7g\2\2"+
		"\u015fH\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7n\2\2\u0162\u0163\7g\2"+
		"\2\u0163\u0164\7g\2\2\u0164\u0165\7r\2\2\u0165J\3\2\2\2\u0166\u0167\7"+
		"C\2\2\u0167\u0168\7p\2\2\u0168\u0169\7c\2\2\u0169\u016a\7n\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u016c\7i\2\2\u016c\u016d\7T\2\2\u016d\u016e\7g\2\2\u016e"+
		"\u016f\7c\2\2\u016f\u0170\7f\2\2\u0170L\3\2\2\2\u0171\u0172\7C\2\2\u0172"+
		"\u0173\7p\2\2\u0173\u0174\7c\2\2\u0174\u0175\7n\2\2\u0175\u0176\7q\2\2"+
		"\u0176\u0177\7i\2\2\u0177\u0178\7Y\2\2\u0178\u0179\7t\2\2\u0179\u017a"+
		"\7k\2\2\u017a\u017b\7v\2\2\u017b\u017c\7g\2\2\u017cN\3\2\2\2\u017d\u017e"+
		"\7K\2\2\u017e\u017f\7P\2\2\u017f\u0180\7R\2\2\u0180\u0181\7W\2\2\u0181"+
		"\u0182\7V\2\2\u0182\u0183\7a\2\2\u0183\u0184\7R\2\2\u0184\u0185\7W\2\2"+
		"\u0185\u0186\7N\2\2\u0186\u0187\7N\2\2\u0187\u0188\7W\2\2\u0188\u0189"+
		"\7R\2\2\u0189P\3\2\2\2\u018a\u018b\7N\2\2\u018b\u018c\7G\2\2\u018c\u018d"+
		"\7F\2\2\u018d\u018e\7a\2\2\u018e\u018f\7D\2\2\u018f\u0190\7W\2\2\u0190"+
		"\u0191\7K\2\2\u0191\u0192\7N\2\2\u0192\u0193\7V\2\2\u0193\u0194\7K\2\2"+
		"\u0194\u0195\7P\2\2\u0195R\3\2\2\2\u0196\u0197\7,\2\2\u0197T\3\2\2\2\u0198"+
		"\u0199\7\61\2\2\u0199V\3\2\2\2\u019a\u019b\7-\2\2\u019bX\3\2\2\2\u019c"+
		"\u019d\7/\2\2\u019dZ\3\2\2\2\u019e\u019f\7?\2\2\u019f\u01a3\7?\2\2\u01a0"+
		"\u01a1\7#\2\2\u01a1\u01a3\7?\2\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2\2"+
		"\2\u01a3\\\3\2\2\2\u01a4\u01aa\t\4\2\2\u01a5\u01a6\7>\2\2\u01a6\u01aa"+
		"\7?\2\2\u01a7\u01a8\7@\2\2\u01a8\u01aa\7?\2\2\u01a9\u01a4\3\2\2\2\u01a9"+
		"\u01a5\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa^\3\2\2\2\u01ab\u01ac\7c\2\2\u01ac"+
		"\u01ad\7p\2\2\u01ad\u01ae\7f\2\2\u01ae`\3\2\2\2\u01af\u01b0\7q\2\2\u01b0"+
		"\u01b1\7t\2\2\u01b1b\3\2\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7q\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5d\3\2\2\2\u01b6\u01b7\7z\2\2\u01b7\u01b8\7q\2\2\u01b8"+
		"\u01b9\7t\2\2\u01b9f\3\2\2\2\u01ba\u01bf\5y=\2\u01bb\u01be\5\21\t\2\u01bc"+
		"\u01be\5y=\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2"+
		"\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0h\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c3\7?\2\2\u01c3j\3\2\2\2\u01c4\u01c5\7.\2\2\u01c5l\3"+
		"\2\2\2\u01c6\u01c7\7*\2\2\u01c7n\3\2\2\2\u01c8\u01c9\7+\2\2\u01c9p\3\2"+
		"\2\2\u01ca\u01cb\7]\2\2\u01cbr\3\2\2\2\u01cc\u01cd\7_\2\2\u01cdt\3\2\2"+
		"\2\u01ce\u01cf\7}\2\2\u01cfv\3\2\2\2\u01d0\u01d1\7\177\2\2\u01d1x\3\2"+
		"\2\2\u01d2\u01d4\t\5\2\2\u01d3\u01d2\3\2\2\2\u01d4z\3\2\2\2\u01d5\u01d7"+
		"\t\6\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\b>\2\2\u01db|\3\2\2\2\24"+
		"\2\u0089\u008e\u0094\u0096\u00a8\u00af\u00b5\u00cb\u00d3\u00e0\u0145\u01a2"+
		"\u01a9\u01bd\u01bf\u01d3\u01d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}