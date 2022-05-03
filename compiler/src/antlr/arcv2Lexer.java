// Generated from /mnt/c/Users/chris/Desktop/P4-Concurrent-Arduino/compiler/arcv2.g4 by ANTLR 4.10
package antlr;
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
	static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, PINDIGIT=6, INT=7, BOOL=8, CHAR=9, 
		TYPEOPERATOR=10, PREFIXOPERATOR=11, TYPE=12, COMMENTS=13, LINECOMMENTS=14, 
		RETURN=15, WHILE=16, IT=17, FOR=18, IN=19, WHEN=20, VOID=21, SETUP=22, 
		ELSE=23, DEFINE=24, EVERY=25, TASK=26, PINMODE=27, INPUT=28, OUTPUT=29, 
		YIELD=30, ARDUINOFUNCTIONS=31, INPUT_PULLUP=32, LED_BUILTIN=33, MULTI=34, 
		DIVI=35, PLUS=36, MINUS=37, RELATIONEQOPERATORS=38, RELATIONOPERATORS=39, 
		AND=40, OR=41, NOT=42, XOR=43, IDENTIFIER=44, ASSIGNMENT=45, SEPERATOR=46, 
		STARTPARANTHESES=47, ENDPARANTHESES=48, STARTSQUAREBRACKET=49, ENDSQUAREBRACKET=50, 
		STARTCURLYBRACKET=51, ENDCURLYBRACKET=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NUMBER", "PINDIGIT", "INT", "DIGIT", 
			"BOOL", "CHAR", "TYPEOPERATOR", "PREFIXOPERATOR", "TYPE", "COMMENTS", 
			"LINECOMMENTS", "RETURN", "WHILE", "IT", "FOR", "IN", "WHEN", "VOID", 
			"SETUP", "ELSE", "DEFINE", "EVERY", "TASK", "PINMODE", "INPUT", "OUTPUT", 
			"YIELD", "ARDUINOFUNCTIONS", "DIGITALREAD", "DIGITALWRITE", "SLEEP", 
			"ANALOGREAD", "ANALOGWRITE", "INPUT_PULLUP", "LED_BUILTIN", "MULTI", 
			"DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", "RELATIONOPERATORS", 
			"AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", "SEPERATOR", "STARTPARANTHESES", 
			"ENDPARANTHESES", "STARTSQUAREBRACKET", "ENDSQUAREBRACKET", "STARTCURLYBRACKET", 
			"ENDCURLYBRACKET", "ALPHA", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'#'", "'pin'", "'if'", null, null, null, null, null, "'[]'", 
			"'mut '", null, null, null, "'return'", "'while'", "'it'", "'for'", "'in'", 
			"'when'", "'void'", "'setup'", "'else'", "'define'", "'every'", "'task'", 
			"'pinmode'", "'INPUT'", "'OUTPUT'", "'yield'", null, "'INPUT_PULLUP'", 
			"'LED_BUILTIN'", "'*'", "'/'", "'+'", "'-'", null, null, "'and'", "'or'", 
			"'not'", "'xor'", null, "'='", "','", "'('", "')'", "'['", "']'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMBER", "PINDIGIT", "INT", "BOOL", "CHAR", 
			"TYPEOPERATOR", "PREFIXOPERATOR", "TYPE", "COMMENTS", "LINECOMMENTS", 
			"RETURN", "WHILE", "IT", "FOR", "IN", "WHEN", "VOID", "SETUP", "ELSE", 
			"DEFINE", "EVERY", "TASK", "PINMODE", "INPUT", "OUTPUT", "YIELD", "ARDUINOFUNCTIONS", 
			"INPUT_PULLUP", "LED_BUILTIN", "MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", 
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
		"\u0004\u00005\u01ce\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0004\u0004\u0004\u0089"+
		"\b\u0004\u000b\u0004\f\u0004\u008a\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u008f\b\u0004\u000b\u0004\f\u0004\u0090\u0003\u0004\u0093\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00a5\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00be\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00c4\b\r\n\r\f\r\u00c7\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00d1\b\u000e\n\u000e"+
		"\f\u000e\u00d4\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0138\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u0195\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u019c"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00051\u01b0"+
		"\b1\n1\f1\u01b3\t1\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0003"+
		":\u01c6\b:\u0001;\u0004;\u01c9\b;\u000b;\f;\u01ca\u0001;\u0001;\u0002"+
		"\u00c5\u00d2\u0000<\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011\b\u0013\t\u0015\n\u0017\u000b"+
		"\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013"+
		")\u0014+\u0015-\u0016/\u00171\u00183\u00195\u001a7\u001b9\u001c;\u001d"+
		"=\u001e?\u001fA\u0000C\u0000E\u0000G\u0000I\u0000K M!O\"Q#S$U%W&Y\'[("+
		"])_*a+c,e-g.i/k0m1o2q3s4u\u0000w5\u0001\u0000\u0005\u0001\u000005\u0001"+
		"\u000009\u0002\u0000<<>>\u0003\u0000AZ__az\u0003\u0000\t\n\r\r  \u01d8"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000"+
		"a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001"+
		"\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000"+
		"\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000"+
		"o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001"+
		"\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0001y\u0001\u0000\u0000"+
		"\u0000\u0003{\u0001\u0000\u0000\u0000\u0005}\u0001\u0000\u0000\u0000\u0007"+
		"\u0081\u0001\u0000\u0000\u0000\t\u0085\u0001\u0000\u0000\u0000\u000b\u0094"+
		"\u0001\u0000\u0000\u0000\r\u0097\u0001\u0000\u0000\u0000\u000f\u0099\u0001"+
		"\u0000\u0000\u0000\u0011\u00a4\u0001\u0000\u0000\u0000\u0013\u00a6\u0001"+
		"\u0000\u0000\u0000\u0015\u00aa\u0001\u0000\u0000\u0000\u0017\u00ad\u0001"+
		"\u0000\u0000\u0000\u0019\u00bd\u0001\u0000\u0000\u0000\u001b\u00bf\u0001"+
		"\u0000\u0000\u0000\u001d\u00cc\u0001\u0000\u0000\u0000\u001f\u00da\u0001"+
		"\u0000\u0000\u0000!\u00e1\u0001\u0000\u0000\u0000#\u00e7\u0001\u0000\u0000"+
		"\u0000%\u00ea\u0001\u0000\u0000\u0000\'\u00ee\u0001\u0000\u0000\u0000"+
		")\u00f1\u0001\u0000\u0000\u0000+\u00f6\u0001\u0000\u0000\u0000-\u00fb"+
		"\u0001\u0000\u0000\u0000/\u0101\u0001\u0000\u0000\u00001\u0106\u0001\u0000"+
		"\u0000\u00003\u010d\u0001\u0000\u0000\u00005\u0113\u0001\u0000\u0000\u0000"+
		"7\u0118\u0001\u0000\u0000\u00009\u0120\u0001\u0000\u0000\u0000;\u0126"+
		"\u0001\u0000\u0000\u0000=\u012d\u0001\u0000\u0000\u0000?\u0137\u0001\u0000"+
		"\u0000\u0000A\u0139\u0001\u0000\u0000\u0000C\u0145\u0001\u0000\u0000\u0000"+
		"E\u0152\u0001\u0000\u0000\u0000G\u0158\u0001\u0000\u0000\u0000I\u0163"+
		"\u0001\u0000\u0000\u0000K\u016f\u0001\u0000\u0000\u0000M\u017c\u0001\u0000"+
		"\u0000\u0000O\u0188\u0001\u0000\u0000\u0000Q\u018a\u0001\u0000\u0000\u0000"+
		"S\u018c\u0001\u0000\u0000\u0000U\u018e\u0001\u0000\u0000\u0000W\u0194"+
		"\u0001\u0000\u0000\u0000Y\u019b\u0001\u0000\u0000\u0000[\u019d\u0001\u0000"+
		"\u0000\u0000]\u01a1\u0001\u0000\u0000\u0000_\u01a4\u0001\u0000\u0000\u0000"+
		"a\u01a8\u0001\u0000\u0000\u0000c\u01ac\u0001\u0000\u0000\u0000e\u01b4"+
		"\u0001\u0000\u0000\u0000g\u01b6\u0001\u0000\u0000\u0000i\u01b8\u0001\u0000"+
		"\u0000\u0000k\u01ba\u0001\u0000\u0000\u0000m\u01bc\u0001\u0000\u0000\u0000"+
		"o\u01be\u0001\u0000\u0000\u0000q\u01c0\u0001\u0000\u0000\u0000s\u01c2"+
		"\u0001\u0000\u0000\u0000u\u01c5\u0001\u0000\u0000\u0000w\u01c8\u0001\u0000"+
		"\u0000\u0000yz\u0005;\u0000\u0000z\u0002\u0001\u0000\u0000\u0000{|\u0005"+
		"#\u0000\u0000|\u0004\u0001\u0000\u0000\u0000}~\u0005p\u0000\u0000~\u007f"+
		"\u0005i\u0000\u0000\u007f\u0080\u0005n\u0000\u0000\u0080\u0006\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005i\u0000\u0000\u0082\u0083\u0005f\u0000\u0000"+
		"\u0083\b\u0001\u0000\u0000\u0000\u0084\u0086\u0005-\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0089\u0003\u000f\u0007\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0092\u0001\u0000\u0000\u0000\u008c\u008e\u0005.\u0000\u0000\u008d\u008f"+
		"\u0003\u000f\u0007\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008c"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\n\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005A\u0000\u0000\u0095\u0096\u0007\u0000"+
		"\u0000\u0000\u0096\f\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u000f\u0007"+
		"\u0000\u0098\u000e\u0001\u0000\u0000\u0000\u0099\u009a\u0007\u0001\u0000"+
		"\u0000\u009a\u0010\u0001\u0000\u0000\u0000\u009b\u009c\u0005t\u0000\u0000"+
		"\u009c\u009d\u0005r\u0000\u0000\u009d\u009e\u0005u\u0000\u0000\u009e\u00a5"+
		"\u0005e\u0000\u0000\u009f\u00a0\u0005f\u0000\u0000\u00a0\u00a1\u0005a"+
		"\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u00a3\u0005s\u0000\u0000"+
		"\u00a3\u00a5\u0005e\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4"+
		"\u009f\u0001\u0000\u0000\u0000\u00a5\u0012\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\"\u0000\u0000\u00a7\u00a8\t\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\"\u0000\u0000\u00a9\u0014\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"[\u0000\u0000\u00ab\u00ac\u0005]\u0000\u0000\u00ac\u0016\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005m\u0000\u0000\u00ae\u00af\u0005u\u0000\u0000\u00af"+
		"\u00b0\u0005t\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u0018\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005n\u0000\u0000\u00b3\u00b4\u0005u\u0000"+
		"\u0000\u00b4\u00be\u0005m\u0000\u0000\u00b5\u00b6\u0005b\u0000\u0000\u00b6"+
		"\u00b7\u0005o\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00be\u0005"+
		"l\u0000\u0000\u00b9\u00ba\u0005c\u0000\u0000\u00ba\u00bb\u0005h\u0000"+
		"\u0000\u00bb\u00bc\u0005a\u0000\u0000\u00bc\u00be\u0005r\u0000\u0000\u00bd"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00be\u001a\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005/\u0000\u0000\u00c0\u00c1\u0005/\u0000\u0000\u00c1\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\t\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\n\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\r\u0000\u0000"+
		"\u00cb\u001c\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd"+
		"\u00ce\u0005*\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf\u00d1"+
		"\t\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005*\u0000\u0000\u00d6\u00d7\u0005/\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0006\u000e\u0000"+
		"\u0000\u00d9\u001e\u0001\u0000\u0000\u0000\u00da\u00db\u0005r\u0000\u0000"+
		"\u00db\u00dc\u0005e\u0000\u0000\u00dc\u00dd\u0005t\u0000\u0000\u00dd\u00de"+
		"\u0005u\u0000\u0000\u00de\u00df\u0005r\u0000\u0000\u00df\u00e0\u0005n"+
		"\u0000\u0000\u00e0 \u0001\u0000\u0000\u0000\u00e1\u00e2\u0005w\u0000\u0000"+
		"\u00e2\u00e3\u0005h\u0000\u0000\u00e3\u00e4\u0005i\u0000\u0000\u00e4\u00e5"+
		"\u0005l\u0000\u0000\u00e5\u00e6\u0005e\u0000\u0000\u00e6\"\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005i\u0000\u0000\u00e8\u00e9\u0005t\u0000\u0000"+
		"\u00e9$\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005f\u0000\u0000\u00eb\u00ec"+
		"\u0005o\u0000\u0000\u00ec\u00ed\u0005r\u0000\u0000\u00ed&\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005i\u0000\u0000\u00ef\u00f0\u0005n\u0000\u0000"+
		"\u00f0(\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005w\u0000\u0000\u00f2\u00f3"+
		"\u0005h\u0000\u0000\u00f3\u00f4\u0005e\u0000\u0000\u00f4\u00f5\u0005n"+
		"\u0000\u0000\u00f5*\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005v\u0000\u0000"+
		"\u00f7\u00f8\u0005o\u0000\u0000\u00f8\u00f9\u0005i\u0000\u0000\u00f9\u00fa"+
		"\u0005d\u0000\u0000\u00fa,\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005s"+
		"\u0000\u0000\u00fc\u00fd\u0005e\u0000\u0000\u00fd\u00fe\u0005t\u0000\u0000"+
		"\u00fe\u00ff\u0005u\u0000\u0000\u00ff\u0100\u0005p\u0000\u0000\u0100."+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0005e\u0000\u0000\u0102\u0103\u0005"+
		"l\u0000\u0000\u0103\u0104\u0005s\u0000\u0000\u0104\u0105\u0005e\u0000"+
		"\u0000\u01050\u0001\u0000\u0000\u0000\u0106\u0107\u0005d\u0000\u0000\u0107"+
		"\u0108\u0005e\u0000\u0000\u0108\u0109\u0005f\u0000\u0000\u0109\u010a\u0005"+
		"i\u0000\u0000\u010a\u010b\u0005n\u0000\u0000\u010b\u010c\u0005e\u0000"+
		"\u0000\u010c2\u0001\u0000\u0000\u0000\u010d\u010e\u0005e\u0000\u0000\u010e"+
		"\u010f\u0005v\u0000\u0000\u010f\u0110\u0005e\u0000\u0000\u0110\u0111\u0005"+
		"r\u0000\u0000\u0111\u0112\u0005y\u0000\u0000\u01124\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005t\u0000\u0000\u0114\u0115\u0005a\u0000\u0000\u0115"+
		"\u0116\u0005s\u0000\u0000\u0116\u0117\u0005k\u0000\u0000\u01176\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005p\u0000\u0000\u0119\u011a\u0005i\u0000"+
		"\u0000\u011a\u011b\u0005n\u0000\u0000\u011b\u011c\u0005m\u0000\u0000\u011c"+
		"\u011d\u0005o\u0000\u0000\u011d\u011e\u0005d\u0000\u0000\u011e\u011f\u0005"+
		"e\u0000\u0000\u011f8\u0001\u0000\u0000\u0000\u0120\u0121\u0005I\u0000"+
		"\u0000\u0121\u0122\u0005N\u0000\u0000\u0122\u0123\u0005P\u0000\u0000\u0123"+
		"\u0124\u0005U\u0000\u0000\u0124\u0125\u0005T\u0000\u0000\u0125:\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005O\u0000\u0000\u0127\u0128\u0005U\u0000"+
		"\u0000\u0128\u0129\u0005T\u0000\u0000\u0129\u012a\u0005P\u0000\u0000\u012a"+
		"\u012b\u0005U\u0000\u0000\u012b\u012c\u0005T\u0000\u0000\u012c<\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005y\u0000\u0000\u012e\u012f\u0005i\u0000"+
		"\u0000\u012f\u0130\u0005e\u0000\u0000\u0130\u0131\u0005l\u0000\u0000\u0131"+
		"\u0132\u0005d\u0000\u0000\u0132>\u0001\u0000\u0000\u0000\u0133\u0138\u0003"+
		"C!\u0000\u0134\u0138\u0003A \u0000\u0135\u0138\u0003G#\u0000\u0136\u0138"+
		"\u0003I$\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000"+
		"\u0000\u0000\u0138@\u0001\u0000\u0000\u0000\u0139\u013a\u0005D\u0000\u0000"+
		"\u013a\u013b\u0005i\u0000\u0000\u013b\u013c\u0005g\u0000\u0000\u013c\u013d"+
		"\u0005i\u0000\u0000\u013d\u013e\u0005t\u0000\u0000\u013e\u013f\u0005a"+
		"\u0000\u0000\u013f\u0140\u0005l\u0000\u0000\u0140\u0141\u0005R\u0000\u0000"+
		"\u0141\u0142\u0005e\u0000\u0000\u0142\u0143\u0005a\u0000\u0000\u0143\u0144"+
		"\u0005d\u0000\u0000\u0144B\u0001\u0000\u0000\u0000\u0145\u0146\u0005D"+
		"\u0000\u0000\u0146\u0147\u0005i\u0000\u0000\u0147\u0148\u0005g\u0000\u0000"+
		"\u0148\u0149\u0005i\u0000\u0000\u0149\u014a\u0005t\u0000\u0000\u014a\u014b"+
		"\u0005a\u0000\u0000\u014b\u014c\u0005l\u0000\u0000\u014c\u014d\u0005W"+
		"\u0000\u0000\u014d\u014e\u0005r\u0000\u0000\u014e\u014f\u0005i\u0000\u0000"+
		"\u014f\u0150\u0005t\u0000\u0000\u0150\u0151\u0005e\u0000\u0000\u0151D"+
		"\u0001\u0000\u0000\u0000\u0152\u0153\u0005s\u0000\u0000\u0153\u0154\u0005"+
		"l\u0000\u0000\u0154\u0155\u0005e\u0000\u0000\u0155\u0156\u0005e\u0000"+
		"\u0000\u0156\u0157\u0005p\u0000\u0000\u0157F\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0005A\u0000\u0000\u0159\u015a\u0005n\u0000\u0000\u015a\u015b\u0005"+
		"a\u0000\u0000\u015b\u015c\u0005l\u0000\u0000\u015c\u015d\u0005o\u0000"+
		"\u0000\u015d\u015e\u0005g\u0000\u0000\u015e\u015f\u0005R\u0000\u0000\u015f"+
		"\u0160\u0005e\u0000\u0000\u0160\u0161\u0005a\u0000\u0000\u0161\u0162\u0005"+
		"d\u0000\u0000\u0162H\u0001\u0000\u0000\u0000\u0163\u0164\u0005A\u0000"+
		"\u0000\u0164\u0165\u0005n\u0000\u0000\u0165\u0166\u0005a\u0000\u0000\u0166"+
		"\u0167\u0005l\u0000\u0000\u0167\u0168\u0005o\u0000\u0000\u0168\u0169\u0005"+
		"g\u0000\u0000\u0169\u016a\u0005W\u0000\u0000\u016a\u016b\u0005r\u0000"+
		"\u0000\u016b\u016c\u0005i\u0000\u0000\u016c\u016d\u0005t\u0000\u0000\u016d"+
		"\u016e\u0005e\u0000\u0000\u016eJ\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"I\u0000\u0000\u0170\u0171\u0005N\u0000\u0000\u0171\u0172\u0005P\u0000"+
		"\u0000\u0172\u0173\u0005U\u0000\u0000\u0173\u0174\u0005T\u0000\u0000\u0174"+
		"\u0175\u0005_\u0000\u0000\u0175\u0176\u0005P\u0000\u0000\u0176\u0177\u0005"+
		"U\u0000\u0000\u0177\u0178\u0005L\u0000\u0000\u0178\u0179\u0005L\u0000"+
		"\u0000\u0179\u017a\u0005U\u0000\u0000\u017a\u017b\u0005P\u0000\u0000\u017b"+
		"L\u0001\u0000\u0000\u0000\u017c\u017d\u0005L\u0000\u0000\u017d\u017e\u0005"+
		"E\u0000\u0000\u017e\u017f\u0005D\u0000\u0000\u017f\u0180\u0005_\u0000"+
		"\u0000\u0180\u0181\u0005B\u0000\u0000\u0181\u0182\u0005U\u0000\u0000\u0182"+
		"\u0183\u0005I\u0000\u0000\u0183\u0184\u0005L\u0000\u0000\u0184\u0185\u0005"+
		"T\u0000\u0000\u0185\u0186\u0005I\u0000\u0000\u0186\u0187\u0005N\u0000"+
		"\u0000\u0187N\u0001\u0000\u0000\u0000\u0188\u0189\u0005*\u0000\u0000\u0189"+
		"P\u0001\u0000\u0000\u0000\u018a\u018b\u0005/\u0000\u0000\u018bR\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005+\u0000\u0000\u018dT\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0005-\u0000\u0000\u018fV\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005=\u0000\u0000\u0191\u0195\u0005=\u0000\u0000\u0192\u0193\u0005"+
		"!\u0000\u0000\u0193\u0195\u0005=\u0000\u0000\u0194\u0190\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195X\u0001\u0000\u0000\u0000"+
		"\u0196\u019c\u0007\u0002\u0000\u0000\u0197\u0198\u0005<\u0000\u0000\u0198"+
		"\u019c\u0005=\u0000\u0000\u0199\u019a\u0005>\u0000\u0000\u019a\u019c\u0005"+
		"=\u0000\u0000\u019b\u0196\u0001\u0000\u0000\u0000\u019b\u0197\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019cZ\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0005a\u0000\u0000\u019e\u019f\u0005n\u0000\u0000\u019f"+
		"\u01a0\u0005d\u0000\u0000\u01a0\\\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005o\u0000\u0000\u01a2\u01a3\u0005r\u0000\u0000\u01a3^\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0005n\u0000\u0000\u01a5\u01a6\u0005o\u0000\u0000"+
		"\u01a6\u01a7\u0005t\u0000\u0000\u01a7`\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005x\u0000\u0000\u01a9\u01aa\u0005o\u0000\u0000\u01aa\u01ab\u0005r"+
		"\u0000\u0000\u01abb\u0001\u0000\u0000\u0000\u01ac\u01b1\u0003u:\u0000"+
		"\u01ad\u01b0\u0003\u000f\u0007\u0000\u01ae\u01b0\u0003u:\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2d\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0005=\u0000\u0000\u01b5f\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b7\u0005,\u0000\u0000\u01b7h\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005(\u0000\u0000\u01b9j\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005"+
		")\u0000\u0000\u01bbl\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005[\u0000"+
		"\u0000\u01bdn\u0001\u0000\u0000\u0000\u01be\u01bf\u0005]\u0000\u0000\u01bf"+
		"p\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005{\u0000\u0000\u01c1r\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0005}\u0000\u0000\u01c3t\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0007\u0003\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c6v\u0001\u0000\u0000\u0000\u01c7\u01c9\u0007\u0004\u0000\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0006;\u0000\u0000\u01cd"+
		"x\u0001\u0000\u0000\u0000\u0010\u0000\u0085\u008a\u0090\u0092\u00a4\u00bd"+
		"\u00c5\u00d2\u0137\u0194\u019b\u01af\u01b1\u01c5\u01ca\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}