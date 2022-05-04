// Generated from /mnt/c/Users/chris/Desktop/P4-Concurrent-Arduino/compiler/lexerRules.g4 by ANTLR 4.10
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
public class lexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, PINDIGIT=2, INT=3, BOOL=4, CHAR=5, TYPEOPERATOR=6, PREFIXOPERATOR=7, 
		TYPE=8, COMMENTS=9, LINECOMMENTS=10, RETURN=11, WHILE=12, IT=13, FOR=14, 
		IN=15, WHEN=16, VOID=17, SETUP=18, ELSE=19, DEFINE=20, EVERY=21, TASK=22, 
		PINMODE=23, INPUT=24, OUTPUT=25, YIELD=26, ARDUINOFUNCTIONS=27, INPUT_PULLUP=28, 
		LED_BUILTIN=29, MULTI=30, DIVI=31, PLUS=32, MINUS=33, RELATIONEQOPERATORS=34, 
		RELATIONOPERATORS=35, AND=36, OR=37, NOT=38, XOR=39, IDENTIFIER=40, ASSIGNMENT=41, 
		SEPERATOR=42, STARTPARANTHESES=43, ENDPARANTHESES=44, STARTSQUAREBRACKET=45, 
		ENDSQUAREBRACKET=46, STARTCURLYBRACKET=47, ENDCURLYBRACKET=48, WS=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBER", "PINDIGIT", "INT", "DIGIT", "BOOL", "CHAR", "TYPEOPERATOR", 
			"PREFIXOPERATOR", "TYPE", "COMMENTS", "LINECOMMENTS", "RETURN", "WHILE", 
			"IT", "FOR", "IN", "WHEN", "VOID", "SETUP", "ELSE", "DEFINE", "EVERY", 
			"TASK", "PINMODE", "INPUT", "OUTPUT", "YIELD", "ARDUINOFUNCTIONS", "DIGITALREAD", 
			"DIGITALWRITE", "SLEEP", "ANALOGREAD", "ANALOGWRITE", "INPUT_PULLUP", 
			"LED_BUILTIN", "MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", 
			"RELATIONOPERATORS", "AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", 
			"SEPERATOR", "STARTPARANTHESES", "ENDPARANTHESES", "STARTSQUAREBRACKET", 
			"ENDSQUAREBRACKET", "STARTCURLYBRACKET", "ENDCURLYBRACKET", "ALPHA", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'[]'", "'mut '", null, null, null, 
			"'return'", "'while'", "'it'", "'for'", "'in'", "'when'", "'void'", "'setup'", 
			"'else'", "'define'", "'every'", "'task'", "'pinmode'", "'INPUT'", "'OUTPUT'", 
			"'yield'", null, "'INPUT_PULLUP'", "'LED_BUILTIN'", "'*'", "'/'", "'+'", 
			"'-'", null, null, "'and'", "'or'", "'not'", "'xor'", null, "'='", "','", 
			"'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "PINDIGIT", "INT", "BOOL", "CHAR", "TYPEOPERATOR", "PREFIXOPERATOR", 
			"TYPE", "COMMENTS", "LINECOMMENTS", "RETURN", "WHILE", "IT", "FOR", "IN", 
			"WHEN", "VOID", "SETUP", "ELSE", "DEFINE", "EVERY", "TASK", "PINMODE", 
			"INPUT", "OUTPUT", "YIELD", "ARDUINOFUNCTIONS", "INPUT_PULLUP", "LED_BUILTIN", 
			"MULTI", "DIVI", "PLUS", "MINUS", "RELATIONEQOPERATORS", "RELATIONOPERATORS", 
			"AND", "OR", "NOT", "XOR", "IDENTIFIER", "ASSIGNMENT", "SEPERATOR", "STARTPARANTHESES", 
			"ENDPARANTHESES", "STARTSQUAREBRACKET", "ENDSQUAREBRACKET", "STARTCURLYBRACKET", 
			"ENDCURLYBRACKET", "WS"
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


	public lexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lexerRules.g4"; }

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
		"\u0004\u00001\u01bb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"5\u00026\u00076\u00027\u00077\u0001\u0000\u0003\u0000s\b\u0000\u0001\u0000"+
		"\u0004\u0000v\b\u0000\u000b\u0000\f\u0000w\u0001\u0000\u0001\u0000\u0004"+
		"\u0000|\b\u0000\u000b\u0000\f\u0000}\u0003\u0000\u0080\b\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ab\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00b1\b\t"+
		"\n\t\f\t\u00b4\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0125\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%"+
		"\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0182\b"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0189\b(\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u019d\b-\n-\f-\u01a0\t-\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u0001"+
		"3\u00013\u00014\u00014\u00015\u00015\u00016\u00036\u01b3\b6\u00017\u0004"+
		"7\u01b6\b7\u000b7\f7\u01b7\u00017\u00017\u0002\u00b2\u00bf\u00008\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0000\t\u0004\u000b\u0005\r\u0006"+
		"\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d"+
		"\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016/"+
		"\u00171\u00183\u00195\u001a7\u001b9\u0000;\u0000=\u0000?\u0000A\u0000"+
		"C\u001cE\u001dG\u001eI\u001fK M!O\"Q#S$U%W&Y\'[(])_*a+c,e-g.i/k0m\u0000"+
		"o1\u0001\u0000\u0005\u0001\u000005\u0001\u000009\u0002\u0000<<>>\u0003"+
		"\u0000AZ__az\u0003\u0000\t\n\r\r  \u01c5\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0001r\u0001\u0000\u0000\u0000"+
		"\u0003\u0081\u0001\u0000\u0000\u0000\u0005\u0084\u0001\u0000\u0000\u0000"+
		"\u0007\u0086\u0001\u0000\u0000\u0000\t\u0091\u0001\u0000\u0000\u0000\u000b"+
		"\u0093\u0001\u0000\u0000\u0000\r\u0097\u0001\u0000\u0000\u0000\u000f\u009a"+
		"\u0001\u0000\u0000\u0000\u0011\u00aa\u0001\u0000\u0000\u0000\u0013\u00ac"+
		"\u0001\u0000\u0000\u0000\u0015\u00b9\u0001\u0000\u0000\u0000\u0017\u00c7"+
		"\u0001\u0000\u0000\u0000\u0019\u00ce\u0001\u0000\u0000\u0000\u001b\u00d4"+
		"\u0001\u0000\u0000\u0000\u001d\u00d7\u0001\u0000\u0000\u0000\u001f\u00db"+
		"\u0001\u0000\u0000\u0000!\u00de\u0001\u0000\u0000\u0000#\u00e3\u0001\u0000"+
		"\u0000\u0000%\u00e8\u0001\u0000\u0000\u0000\'\u00ee\u0001\u0000\u0000"+
		"\u0000)\u00f3\u0001\u0000\u0000\u0000+\u00fa\u0001\u0000\u0000\u0000-"+
		"\u0100\u0001\u0000\u0000\u0000/\u0105\u0001\u0000\u0000\u00001\u010d\u0001"+
		"\u0000\u0000\u00003\u0113\u0001\u0000\u0000\u00005\u011a\u0001\u0000\u0000"+
		"\u00007\u0124\u0001\u0000\u0000\u00009\u0126\u0001\u0000\u0000\u0000;"+
		"\u0132\u0001\u0000\u0000\u0000=\u013f\u0001\u0000\u0000\u0000?\u0145\u0001"+
		"\u0000\u0000\u0000A\u0150\u0001\u0000\u0000\u0000C\u015c\u0001\u0000\u0000"+
		"\u0000E\u0169\u0001\u0000\u0000\u0000G\u0175\u0001\u0000\u0000\u0000I"+
		"\u0177\u0001\u0000\u0000\u0000K\u0179\u0001\u0000\u0000\u0000M\u017b\u0001"+
		"\u0000\u0000\u0000O\u0181\u0001\u0000\u0000\u0000Q\u0188\u0001\u0000\u0000"+
		"\u0000S\u018a\u0001\u0000\u0000\u0000U\u018e\u0001\u0000\u0000\u0000W"+
		"\u0191\u0001\u0000\u0000\u0000Y\u0195\u0001\u0000\u0000\u0000[\u0199\u0001"+
		"\u0000\u0000\u0000]\u01a1\u0001\u0000\u0000\u0000_\u01a3\u0001\u0000\u0000"+
		"\u0000a\u01a5\u0001\u0000\u0000\u0000c\u01a7\u0001\u0000\u0000\u0000e"+
		"\u01a9\u0001\u0000\u0000\u0000g\u01ab\u0001\u0000\u0000\u0000i\u01ad\u0001"+
		"\u0000\u0000\u0000k\u01af\u0001\u0000\u0000\u0000m\u01b2\u0001\u0000\u0000"+
		"\u0000o\u01b5\u0001\u0000\u0000\u0000qs\u0005-\u0000\u0000rq\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0003"+
		"\u0007\u0003\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u007f\u0001\u0000"+
		"\u0000\u0000y{\u0005.\u0000\u0000z|\u0003\u0007\u0003\u0000{z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0002\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005A\u0000\u0000\u0082\u0083\u0007\u0000\u0000\u0000"+
		"\u0083\u0004\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0007\u0003\u0000"+
		"\u0085\u0006\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0001\u0000\u0000"+
		"\u0087\b\u0001\u0000\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089"+
		"\u008a\u0005r\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b\u0092\u0005"+
		"e\u0000\u0000\u008c\u008d\u0005f\u0000\u0000\u008d\u008e\u0005a\u0000"+
		"\u0000\u008e\u008f\u0005l\u0000\u0000\u008f\u0090\u0005s\u0000\u0000\u0090"+
		"\u0092\u0005e\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0092\n\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\"\u0000\u0000\u0094\u0095\t\u0000\u0000\u0000\u0095\u0096\u0005\"\u0000"+
		"\u0000\u0096\f\u0001\u0000\u0000\u0000\u0097\u0098\u0005[\u0000\u0000"+
		"\u0098\u0099\u0005]\u0000\u0000\u0099\u000e\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005m\u0000\u0000\u009b\u009c\u0005u\u0000\u0000\u009c\u009d\u0005"+
		"t\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u0010\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005n\u0000\u0000\u00a0\u00a1\u0005u\u0000\u0000\u00a1"+
		"\u00ab\u0005m\u0000\u0000\u00a2\u00a3\u0005b\u0000\u0000\u00a3\u00a4\u0005"+
		"o\u0000\u0000\u00a4\u00a5\u0005o\u0000\u0000\u00a5\u00ab\u0005l\u0000"+
		"\u0000\u00a6\u00a7\u0005c\u0000\u0000\u00a7\u00a8\u0005h\u0000\u0000\u00a8"+
		"\u00a9\u0005a\u0000\u0000\u00a9\u00ab\u0005r\u0000\u0000\u00aa\u009f\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u0012\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"/\u0000\u0000\u00ad\u00ae\u0005/\u0000\u0000\u00ae\u00b2\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\t\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\t\u0000\u0000\u00b8\u0014"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005/\u0000\u0000\u00ba\u00bb\u0005"+
		"*\u0000\u0000\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00be\t\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005*\u0000\u0000\u00c3\u00c4\u0005/\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0006\n\u0000\u0000\u00c6"+
		"\u0016\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005r\u0000\u0000\u00c8\u00c9"+
		"\u0005e\u0000\u0000\u00c9\u00ca\u0005t\u0000\u0000\u00ca\u00cb\u0005u"+
		"\u0000\u0000\u00cb\u00cc\u0005r\u0000\u0000\u00cc\u00cd\u0005n\u0000\u0000"+
		"\u00cd\u0018\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005w\u0000\u0000\u00cf"+
		"\u00d0\u0005h\u0000\u0000\u00d0\u00d1\u0005i\u0000\u0000\u00d1\u00d2\u0005"+
		"l\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3\u001a\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005i\u0000\u0000\u00d5\u00d6\u0005t\u0000\u0000\u00d6"+
		"\u001c\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005f\u0000\u0000\u00d8\u00d9"+
		"\u0005o\u0000\u0000\u00d9\u00da\u0005r\u0000\u0000\u00da\u001e\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005i\u0000\u0000\u00dc\u00dd\u0005n\u0000\u0000"+
		"\u00dd \u0001\u0000\u0000\u0000\u00de\u00df\u0005w\u0000\u0000\u00df\u00e0"+
		"\u0005h\u0000\u0000\u00e0\u00e1\u0005e\u0000\u0000\u00e1\u00e2\u0005n"+
		"\u0000\u0000\u00e2\"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005v\u0000"+
		"\u0000\u00e4\u00e5\u0005o\u0000\u0000\u00e5\u00e6\u0005i\u0000\u0000\u00e6"+
		"\u00e7\u0005d\u0000\u0000\u00e7$\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"s\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00ea\u00eb\u0005t\u0000"+
		"\u0000\u00eb\u00ec\u0005u\u0000\u0000\u00ec\u00ed\u0005p\u0000\u0000\u00ed"+
		"&\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005e\u0000\u0000\u00ef\u00f0\u0005"+
		"l\u0000\u0000\u00f0\u00f1\u0005s\u0000\u0000\u00f1\u00f2\u0005e\u0000"+
		"\u0000\u00f2(\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005d\u0000\u0000\u00f4"+
		"\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005f\u0000\u0000\u00f6\u00f7\u0005"+
		"i\u0000\u0000\u00f7\u00f8\u0005n\u0000\u0000\u00f8\u00f9\u0005e\u0000"+
		"\u0000\u00f9*\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005e\u0000\u0000\u00fb"+
		"\u00fc\u0005v\u0000\u0000\u00fc\u00fd\u0005e\u0000\u0000\u00fd\u00fe\u0005"+
		"r\u0000\u0000\u00fe\u00ff\u0005y\u0000\u0000\u00ff,\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005t\u0000\u0000\u0101\u0102\u0005a\u0000\u0000\u0102"+
		"\u0103\u0005s\u0000\u0000\u0103\u0104\u0005k\u0000\u0000\u0104.\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005p\u0000\u0000\u0106\u0107\u0005i\u0000"+
		"\u0000\u0107\u0108\u0005n\u0000\u0000\u0108\u0109\u0005m\u0000\u0000\u0109"+
		"\u010a\u0005o\u0000\u0000\u010a\u010b\u0005d\u0000\u0000\u010b\u010c\u0005"+
		"e\u0000\u0000\u010c0\u0001\u0000\u0000\u0000\u010d\u010e\u0005I\u0000"+
		"\u0000\u010e\u010f\u0005N\u0000\u0000\u010f\u0110\u0005P\u0000\u0000\u0110"+
		"\u0111\u0005U\u0000\u0000\u0111\u0112\u0005T\u0000\u0000\u01122\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0005O\u0000\u0000\u0114\u0115\u0005U\u0000"+
		"\u0000\u0115\u0116\u0005T\u0000\u0000\u0116\u0117\u0005P\u0000\u0000\u0117"+
		"\u0118\u0005U\u0000\u0000\u0118\u0119\u0005T\u0000\u0000\u01194\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0005y\u0000\u0000\u011b\u011c\u0005i\u0000"+
		"\u0000\u011c\u011d\u0005e\u0000\u0000\u011d\u011e\u0005l\u0000\u0000\u011e"+
		"\u011f\u0005d\u0000\u0000\u011f6\u0001\u0000\u0000\u0000\u0120\u0125\u0003"+
		";\u001d\u0000\u0121\u0125\u00039\u001c\u0000\u0122\u0125\u0003?\u001f"+
		"\u0000\u0123\u0125\u0003A \u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0124"+
		"\u0121\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u01258\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005D\u0000\u0000\u0127\u0128\u0005i\u0000\u0000\u0128\u0129\u0005g"+
		"\u0000\u0000\u0129\u012a\u0005i\u0000\u0000\u012a\u012b\u0005t\u0000\u0000"+
		"\u012b\u012c\u0005a\u0000\u0000\u012c\u012d\u0005l\u0000\u0000\u012d\u012e"+
		"\u0005R\u0000\u0000\u012e\u012f\u0005e\u0000\u0000\u012f\u0130\u0005a"+
		"\u0000\u0000\u0130\u0131\u0005d\u0000\u0000\u0131:\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005D\u0000\u0000\u0133\u0134\u0005i\u0000\u0000\u0134\u0135"+
		"\u0005g\u0000\u0000\u0135\u0136\u0005i\u0000\u0000\u0136\u0137\u0005t"+
		"\u0000\u0000\u0137\u0138\u0005a\u0000\u0000\u0138\u0139\u0005l\u0000\u0000"+
		"\u0139\u013a\u0005W\u0000\u0000\u013a\u013b\u0005r\u0000\u0000\u013b\u013c"+
		"\u0005i\u0000\u0000\u013c\u013d\u0005t\u0000\u0000\u013d\u013e\u0005e"+
		"\u0000\u0000\u013e<\u0001\u0000\u0000\u0000\u013f\u0140\u0005s\u0000\u0000"+
		"\u0140\u0141\u0005l\u0000\u0000\u0141\u0142\u0005e\u0000\u0000\u0142\u0143"+
		"\u0005e\u0000\u0000\u0143\u0144\u0005p\u0000\u0000\u0144>\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005A\u0000\u0000\u0146\u0147\u0005n\u0000\u0000"+
		"\u0147\u0148\u0005a\u0000\u0000\u0148\u0149\u0005l\u0000\u0000\u0149\u014a"+
		"\u0005o\u0000\u0000\u014a\u014b\u0005g\u0000\u0000\u014b\u014c\u0005R"+
		"\u0000\u0000\u014c\u014d\u0005e\u0000\u0000\u014d\u014e\u0005a\u0000\u0000"+
		"\u014e\u014f\u0005d\u0000\u0000\u014f@\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005A\u0000\u0000\u0151\u0152\u0005n\u0000\u0000\u0152\u0153\u0005a"+
		"\u0000\u0000\u0153\u0154\u0005l\u0000\u0000\u0154\u0155\u0005o\u0000\u0000"+
		"\u0155\u0156\u0005g\u0000\u0000\u0156\u0157\u0005W\u0000\u0000\u0157\u0158"+
		"\u0005r\u0000\u0000\u0158\u0159\u0005i\u0000\u0000\u0159\u015a\u0005t"+
		"\u0000\u0000\u015a\u015b\u0005e\u0000\u0000\u015bB\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005I\u0000\u0000\u015d\u015e\u0005N\u0000\u0000\u015e\u015f"+
		"\u0005P\u0000\u0000\u015f\u0160\u0005U\u0000\u0000\u0160\u0161\u0005T"+
		"\u0000\u0000\u0161\u0162\u0005_\u0000\u0000\u0162\u0163\u0005P\u0000\u0000"+
		"\u0163\u0164\u0005U\u0000\u0000\u0164\u0165\u0005L\u0000\u0000\u0165\u0166"+
		"\u0005L\u0000\u0000\u0166\u0167\u0005U\u0000\u0000\u0167\u0168\u0005P"+
		"\u0000\u0000\u0168D\u0001\u0000\u0000\u0000\u0169\u016a\u0005L\u0000\u0000"+
		"\u016a\u016b\u0005E\u0000\u0000\u016b\u016c\u0005D\u0000\u0000\u016c\u016d"+
		"\u0005_\u0000\u0000\u016d\u016e\u0005B\u0000\u0000\u016e\u016f\u0005U"+
		"\u0000\u0000\u016f\u0170\u0005I\u0000\u0000\u0170\u0171\u0005L\u0000\u0000"+
		"\u0171\u0172\u0005T\u0000\u0000\u0172\u0173\u0005I\u0000\u0000\u0173\u0174"+
		"\u0005N\u0000\u0000\u0174F\u0001\u0000\u0000\u0000\u0175\u0176\u0005*"+
		"\u0000\u0000\u0176H\u0001\u0000\u0000\u0000\u0177\u0178\u0005/\u0000\u0000"+
		"\u0178J\u0001\u0000\u0000\u0000\u0179\u017a\u0005+\u0000\u0000\u017aL"+
		"\u0001\u0000\u0000\u0000\u017b\u017c\u0005-\u0000\u0000\u017cN\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005=\u0000\u0000\u017e\u0182\u0005=\u0000\u0000"+
		"\u017f\u0180\u0005!\u0000\u0000\u0180\u0182\u0005=\u0000\u0000\u0181\u017d"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182P\u0001"+
		"\u0000\u0000\u0000\u0183\u0189\u0007\u0002\u0000\u0000\u0184\u0185\u0005"+
		"<\u0000\u0000\u0185\u0189\u0005=\u0000\u0000\u0186\u0187\u0005>\u0000"+
		"\u0000\u0187\u0189\u0005=\u0000\u0000\u0188\u0183\u0001\u0000\u0000\u0000"+
		"\u0188\u0184\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000"+
		"\u0189R\u0001\u0000\u0000\u0000\u018a\u018b\u0005a\u0000\u0000\u018b\u018c"+
		"\u0005n\u0000\u0000\u018c\u018d\u0005d\u0000\u0000\u018dT\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0005o\u0000\u0000\u018f\u0190\u0005r\u0000\u0000"+
		"\u0190V\u0001\u0000\u0000\u0000\u0191\u0192\u0005n\u0000\u0000\u0192\u0193"+
		"\u0005o\u0000\u0000\u0193\u0194\u0005t\u0000\u0000\u0194X\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0005x\u0000\u0000\u0196\u0197\u0005o\u0000\u0000"+
		"\u0197\u0198\u0005r\u0000\u0000\u0198Z\u0001\u0000\u0000\u0000\u0199\u019e"+
		"\u0003m6\u0000\u019a\u019d\u0003\u0007\u0003\u0000\u019b\u019d\u0003m"+
		"6\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\\\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005=\u0000\u0000\u01a2"+
		"^\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005,\u0000\u0000\u01a4`\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005(\u0000\u0000\u01a6b\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005)\u0000\u0000\u01a8d\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0005[\u0000\u0000\u01aaf\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005"+
		"]\u0000\u0000\u01ach\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005{\u0000"+
		"\u0000\u01aej\u0001\u0000\u0000\u0000\u01af\u01b0\u0005}\u0000\u0000\u01b0"+
		"l\u0001\u0000\u0000\u0000\u01b1\u01b3\u0007\u0003\u0000\u0000\u01b2\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b3n\u0001\u0000\u0000\u0000\u01b4\u01b6\u0007"+
		"\u0004\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0006"+
		"7\u0000\u0000\u01bap\u0001\u0000\u0000\u0000\u0010\u0000rw}\u007f\u0091"+
		"\u00aa\u00b2\u00bf\u0124\u0181\u0188\u019c\u019e\u01b2\u01b7\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}