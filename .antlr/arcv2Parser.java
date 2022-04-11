// Generated from /home/runge/semester-project/P4-Concurrent-Arduino/arcv2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arcv2Parser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_declarations = 1, RULE_statements = 2, RULE_expression = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declarations", "statements", "expression"
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

	@Override
	public String getGrammarFileName() { return "arcv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public arcv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			declarations();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Variable_declarationContext extends DeclarationsContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode TYPE_TYPEOPERATOR() { return getToken(arcv2Parser.TYPE_TYPEOPERATOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(arcv2Parser.ASSIGNMENT, 0); }
		public TerminalNode STARTSQUAREBRACKET() { return getToken(arcv2Parser.STARTSQUAREBRACKET, 0); }
		public TerminalNode ENDSQUAREBRACKET() { return getToken(arcv2Parser.ENDSQUAREBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Variable_declarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitVariable_declaration(this);
		}
	}
	public static class Pin_declarationContext extends DeclarationsContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode PINDIGIT() { return getToken(arcv2Parser.PINDIGIT, 0); }
		public TerminalNode SEPERATOR() { return getToken(arcv2Parser.SEPERATOR, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(arcv2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(arcv2Parser.OUTPUT, 0); }
		public Pin_declarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterPin_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitPin_declaration(this);
		}
	}
	public static class Empty_declarationContext extends DeclarationsContext {
		public Empty_declarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterEmpty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitEmpty_declaration(this);
		}
	}
	public static class Task_declarationsContext extends DeclarationsContext {
		public List<TerminalNode> TASK() { return getTokens(arcv2Parser.TASK); }
		public TerminalNode TASK(int i) {
			return getToken(arcv2Parser.TASK, i);
		}
		public List<TerminalNode> STARTCURLYBRACKET() { return getTokens(arcv2Parser.STARTCURLYBRACKET); }
		public TerminalNode STARTCURLYBRACKET(int i) {
			return getToken(arcv2Parser.STARTCURLYBRACKET, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> ENDCURLYBRACKET() { return getTokens(arcv2Parser.ENDCURLYBRACKET); }
		public TerminalNode ENDCURLYBRACKET(int i) {
			return getToken(arcv2Parser.ENDCURLYBRACKET, i);
		}
		public List<TerminalNode> STARTPARANTHESES() { return getTokens(arcv2Parser.STARTPARANTHESES); }
		public TerminalNode STARTPARANTHESES(int i) {
			return getToken(arcv2Parser.STARTPARANTHESES, i);
		}
		public List<TerminalNode> ENDPARANTHESES() { return getTokens(arcv2Parser.ENDPARANTHESES); }
		public TerminalNode ENDPARANTHESES(int i) {
			return getToken(arcv2Parser.ENDPARANTHESES, i);
		}
		public List<TerminalNode> EVERY() { return getTokens(arcv2Parser.EVERY); }
		public TerminalNode EVERY(int i) {
			return getToken(arcv2Parser.EVERY, i);
		}
		public List<TerminalNode> INT() { return getTokens(arcv2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(arcv2Parser.INT, i);
		}
		public List<TerminalNode> WHEN() { return getTokens(arcv2Parser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(arcv2Parser.WHEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> TYPE_TYPEOPERATOR() { return getTokens(arcv2Parser.TYPE_TYPEOPERATOR); }
		public TerminalNode TYPE_TYPEOPERATOR(int i) {
			return getToken(arcv2Parser.TYPE_TYPEOPERATOR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Task_declarationsContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterTask_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitTask_declarations(this);
		}
	}
	public static class Function_declarationContext extends DeclarationsContext {
		public List<TerminalNode> TYPE_TYPEOPERATOR() { return getTokens(arcv2Parser.TYPE_TYPEOPERATOR); }
		public TerminalNode TYPE_TYPEOPERATOR(int i) {
			return getToken(arcv2Parser.TYPE_TYPEOPERATOR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Function_declarationContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitFunction_declaration(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Function_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(TYPE_TYPEOPERATOR);
				setState(11);
				match(IDENTIFIER);
				setState(12);
				match(STARTPARANTHESES);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_TYPEOPERATOR) {
					{
					setState(13);
					match(TYPE_TYPEOPERATOR);
					setState(14);
					match(IDENTIFIER);
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(15);
						match(SEPERATOR);
						setState(16);
						match(TYPE_TYPEOPERATOR);
						setState(17);
						match(IDENTIFIER);
						}
						}
						setState(22);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(25);
				match(ENDPARANTHESES);
				setState(26);
				match(STARTCURLYBRACKET);
				setState(27);
				statements();
				setState(28);
				match(ENDCURLYBRACKET);
				setState(29);
				declarations();
				}
				break;
			case 2:
				_localctx = new Variable_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(31);
				match(TYPE_TYPEOPERATOR);
				setState(32);
				match(IDENTIFIER);
				setState(33);
				match(ASSIGNMENT);
				setState(47);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(34);
					match(STARTSQUAREBRACKET);
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(35);
						expression(0);
						setState(40);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(36);
							match(SEPERATOR);
							setState(37);
							expression(0);
							}
							}
							setState(42);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(45);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(46);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49);
				match(T__0);
				}
				setState(51);
				declarations();
				}
				break;
			case 3:
				_localctx = new Pin_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(T__1);
				setState(53);
				match(T__2);
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(STARTPARANTHESES);
				setState(56);
				match(PINDIGIT);
				setState(57);
				match(SEPERATOR);
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==INPUT || _la==OUTPUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				match(ENDPARANTHESES);
				setState(60);
				declarations();
				}
				break;
			case 4:
				_localctx = new Task_declarationsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TASK) {
					{
					{
					setState(61);
					match(TASK);
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==STARTPARANTHESES) {
						{
						setState(62);
						match(STARTPARANTHESES);
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TYPE_TYPEOPERATOR) {
							{
							setState(63);
							match(TYPE_TYPEOPERATOR);
							setState(64);
							match(IDENTIFIER);
							setState(70);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==SEPERATOR) {
								{
								{
								setState(65);
								match(SEPERATOR);
								setState(66);
								match(TYPE_TYPEOPERATOR);
								setState(67);
								match(IDENTIFIER);
								}
								}
								setState(72);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(75);
						match(ENDPARANTHESES);
						}
					}

					setState(85);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case EVERY:
						{
						{
						setState(78);
						match(EVERY);
						setState(79);
						match(INT);
						}
						}
						break;
					case WHEN:
						{
						{
						setState(80);
						match(WHEN);
						setState(81);
						match(STARTPARANTHESES);
						setState(82);
						expression(0);
						setState(83);
						match(ENDPARANTHESES);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(87);
					match(STARTCURLYBRACKET);
					setState(88);
					statements();
					setState(89);
					match(ENDCURLYBRACKET);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new Empty_declarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_else_statementContext extends StatementsContext {
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public List<TerminalNode> STARTCURLYBRACKET() { return getTokens(arcv2Parser.STARTCURLYBRACKET); }
		public TerminalNode STARTCURLYBRACKET(int i) {
			return getToken(arcv2Parser.STARTCURLYBRACKET, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> ENDCURLYBRACKET() { return getTokens(arcv2Parser.ENDCURLYBRACKET); }
		public TerminalNode ENDCURLYBRACKET(int i) {
			return getToken(arcv2Parser.ENDCURLYBRACKET, i);
		}
		public TerminalNode ELSE() { return getToken(arcv2Parser.ELSE, 0); }
		public If_else_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterIf_else_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitIf_else_statement(this);
		}
	}
	public static class Variable_declaration_statementContext extends StatementsContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode TYPE_TYPEOPERATOR() { return getToken(arcv2Parser.TYPE_TYPEOPERATOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(arcv2Parser.ASSIGNMENT, 0); }
		public TerminalNode STARTSQUAREBRACKET() { return getToken(arcv2Parser.STARTSQUAREBRACKET, 0); }
		public TerminalNode ENDSQUAREBRACKET() { return getToken(arcv2Parser.ENDSQUAREBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Variable_declaration_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterVariable_declaration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitVariable_declaration_statement(this);
		}
	}
	public static class Assignment_statementContext extends StatementsContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(arcv2Parser.ASSIGNMENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> STARTSQUAREBRACKET() { return getTokens(arcv2Parser.STARTSQUAREBRACKET); }
		public TerminalNode STARTSQUAREBRACKET(int i) {
			return getToken(arcv2Parser.STARTSQUAREBRACKET, i);
		}
		public List<TerminalNode> ENDSQUAREBRACKET() { return getTokens(arcv2Parser.ENDSQUAREBRACKET); }
		public TerminalNode ENDSQUAREBRACKET(int i) {
			return getToken(arcv2Parser.ENDSQUAREBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Assignment_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitAssignment_statement(this);
		}
	}
	public static class Forloop_statementContext extends StatementsContext {
		public TerminalNode FOR() { return getToken(arcv2Parser.FOR, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode TYPE_TYPEOPERATOR() { return getToken(arcv2Parser.TYPE_TYPEOPERATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(arcv2Parser.IN, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
		public Forloop_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterForloop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitForloop_statement(this);
		}
	}
	public static class Whileloop_statementContext extends StatementsContext {
		public TerminalNode WHILE() { return getToken(arcv2Parser.WHILE, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
		public Whileloop_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterWhileloop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitWhileloop_statement(this);
		}
	}
	public static class Return_statementContext extends StatementsContext {
		public TerminalNode RETURN() { return getToken(arcv2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Return_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitReturn_statement(this);
		}
	}
	public static class Empty_statementContext extends StatementsContext {
		public Empty_statementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterEmpty_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitEmpty_statement(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(RETURN);
				setState(100);
				expression(0);
				setState(101);
				match(T__0);
				setState(102);
				statements();
				}
				break;
			case T__3:
				_localctx = new If_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__3);
				setState(105);
				match(STARTPARANTHESES);
				setState(106);
				expression(0);
				setState(107);
				match(ENDPARANTHESES);
				setState(108);
				match(STARTCURLYBRACKET);
				setState(109);
				statements();
				setState(110);
				match(ENDCURLYBRACKET);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(111);
					match(ELSE);
					setState(112);
					match(STARTCURLYBRACKET);
					setState(113);
					statements();
					setState(114);
					match(ENDCURLYBRACKET);
					}
				}

				setState(118);
				statements();
				}
				break;
			case FOR:
				_localctx = new Forloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(FOR);
				setState(121);
				match(STARTPARANTHESES);
				setState(122);
				match(TYPE_TYPEOPERATOR);
				setState(123);
				match(IDENTIFIER);
				setState(124);
				match(IN);
				setState(125);
				match(IDENTIFIER);
				setState(126);
				match(ENDPARANTHESES);
				setState(127);
				match(STARTCURLYBRACKET);
				setState(128);
				statements();
				setState(129);
				match(ENDCURLYBRACKET);
				setState(130);
				statements();
				}
				break;
			case WHILE:
				_localctx = new Whileloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(WHILE);
				setState(133);
				match(STARTPARANTHESES);
				setState(134);
				expression(0);
				setState(135);
				match(ENDPARANTHESES);
				setState(136);
				match(STARTCURLYBRACKET);
				setState(137);
				statements();
				setState(138);
				match(ENDCURLYBRACKET);
				setState(139);
				statements();
				}
				break;
			case TYPE_TYPEOPERATOR:
				_localctx = new Variable_declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(141);
				match(TYPE_TYPEOPERATOR);
				setState(142);
				match(IDENTIFIER);
				setState(143);
				match(ASSIGNMENT);
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(144);
					match(STARTSQUAREBRACKET);
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(145);
						expression(0);
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(146);
							match(SEPERATOR);
							setState(147);
							expression(0);
							}
							}
							setState(152);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(155);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(156);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				match(T__0);
				}
				setState(161);
				statements();
				}
				break;
			case IDENTIFIER:
				_localctx = new Assignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(IDENTIFIER);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTSQUAREBRACKET) {
					{
					setState(163);
					match(STARTSQUAREBRACKET);
					setState(164);
					match(NUMBER);
					setState(165);
					match(ENDSQUAREBRACKET);
					}
				}

				setState(168);
				match(ASSIGNMENT);
				setState(182);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(169);
					match(STARTSQUAREBRACKET);
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(170);
						expression(0);
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(171);
							match(SEPERATOR);
							setState(172);
							expression(0);
							}
							}
							setState(177);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(180);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(181);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(184);
				match(T__0);
				setState(185);
				statements();
				}
				break;
			case ENDCURLYBRACKET:
				_localctx = new Empty_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Relational_equality_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELATIONEQOPERATORS() { return getToken(arcv2Parser.RELATIONEQOPERATORS, 0); }
		public Relational_equality_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterRelational_equality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitRelational_equality_expression(this);
		}
	}
	public static class Multiplication_divide_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(arcv2Parser.MULTI, 0); }
		public TerminalNode DIVI() { return getToken(arcv2Parser.DIVI, 0); }
		public Multiplication_divide_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterMultiplication_divide_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitMultiplication_divide_expression(this);
		}
	}
	public static class Or_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(arcv2Parser.OR, 0); }
		public Or_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitOr_expression(this);
		}
	}
	public static class Function_or_array_access_expressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode STARTSQUAREBRACKET() { return getToken(arcv2Parser.STARTSQUAREBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode ENDSQUAREBRACKET() { return getToken(arcv2Parser.ENDSQUAREBRACKET, 0); }
		public TerminalNode ARDUINOFUNCTIONS() { return getToken(arcv2Parser.ARDUINOFUNCTIONS, 0); }
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Function_or_array_access_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterFunction_or_array_access_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitFunction_or_array_access_expression(this);
		}
	}
	public static class Terminal_expressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(arcv2Parser.BOOL, 0); }
		public Terminal_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterTerminal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitTerminal_expression(this);
		}
	}
	public static class And_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(arcv2Parser.AND, 0); }
		public And_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitAnd_expression(this);
		}
	}
	public static class Unary_negation_expressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(arcv2Parser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_negation_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterUnary_negation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitUnary_negation_expression(this);
		}
	}
	public static class Relational_operator_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RELATIONOPERATORS() { return getToken(arcv2Parser.RELATIONOPERATORS, 0); }
		public Relational_operator_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterRelational_operator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitRelational_operator_expression(this);
		}
	}
	public static class Parentheses_expressionContext extends ExpressionContext {
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public Parentheses_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterParentheses_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitParentheses_expression(this);
		}
	}
	public static class Plus_minus_expressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(arcv2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(arcv2Parser.MINUS, 0); }
		public Plus_minus_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).enterPlus_minus_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arcv2Listener ) ((arcv2Listener)listener).exitPlus_minus_expression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new Terminal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << IDENTIFIER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new Function_or_array_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(191);
					match(IDENTIFIER);
					setState(192);
					match(STARTPARANTHESES);
					setState(193);
					expression(0);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(194);
						match(SEPERATOR);
						setState(195);
						expression(0);
						}
						}
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(201);
					match(ENDPARANTHESES);
					}
					break;
				case 2:
					{
					setState(203);
					match(IDENTIFIER);
					setState(204);
					match(STARTSQUAREBRACKET);
					setState(205);
					match(NUMBER);
					setState(206);
					match(ENDSQUAREBRACKET);
					}
					break;
				case 3:
					{
					setState(207);
					match(ARDUINOFUNCTIONS);
					setState(208);
					match(STARTPARANTHESES);
					setState(209);
					expression(0);
					setState(210);
					match(ENDPARANTHESES);
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new Parentheses_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(STARTPARANTHESES);
				setState(215);
				expression(0);
				setState(216);
				match(ENDPARANTHESES);
				}
				break;
			case 4:
				{
				_localctx = new Unary_negation_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(NOT);
				setState(219);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_divide_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIVI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Plus_minus_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(226);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Relational_equality_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(229);
						match(RELATIONEQOPERATORS);
						setState(230);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new Relational_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232);
						match(RELATIONOPERATORS);
						setState(233);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new And_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235);
						match(AND);
						setState(236);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new Or_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238);
						match(OR);
						setState(239);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00f8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\25"+
		"\n\3\f\3\16\3\30\13\3\5\3\32\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\5\3.\n\3\3\3\3\3\5\3\62\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3G\n\3\f\3\16\3J\13\3\5\3L\n\3\3\3\5\3O\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3X\n\3\3\3\3\3\3\3\3\3\7\3^\n\3\f\3\16\3a\13\3\3\3\5\3d\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"w\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0097\n\4"+
		"\f\4\16\4\u009a\13\4\5\4\u009c\n\4\3\4\3\4\5\4\u00a0\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u00a9\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u00b0\n\4\f\4\16"+
		"\4\u00b3\13\4\5\4\u00b5\n\4\3\4\3\4\5\4\u00b9\n\4\3\4\3\4\3\4\5\4\u00be"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c7\n\5\f\5\16\5\u00ca\13\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d7\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u00df\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f3\n\5\f\5\16\5\u00f6\13\5\3\5\2\3\b\6"+
		"\2\4\6\b\2\6\3\2\35\36\5\2\b\b\13\13..\3\2$%\3\2&\'\2\u011b\2\n\3\2\2"+
		"\2\4c\3\2\2\2\6\u00bd\3\2\2\2\b\u00de\3\2\2\2\n\13\5\4\3\2\13\3\3\2\2"+
		"\2\f\r\7\f\2\2\r\16\7.\2\2\16\31\7\61\2\2\17\20\7\f\2\2\20\26\7.\2\2\21"+
		"\22\7\60\2\2\22\23\7\f\2\2\23\25\7.\2\2\24\21\3\2\2\2\25\30\3\2\2\2\26"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\31\17\3\2\2\2\31"+
		"\32\3\2\2\2\32\33\3\2\2\2\33\34\7\62\2\2\34\35\7\65\2\2\35\36\5\6\4\2"+
		"\36\37\7\66\2\2\37 \5\4\3\2 d\3\2\2\2!\"\7\f\2\2\"#\7.\2\2#\61\7/\2\2"+
		"$-\7\63\2\2%*\5\b\5\2&\'\7\60\2\2\')\5\b\5\2(&\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-%\3\2\2\2-.\3\2\2\2./\3\2\2\2/\62\7"+
		"\64\2\2\60\62\5\b\5\2\61$\3\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\64\7"+
		"\3\2\2\64\65\3\2\2\2\65d\5\4\3\2\66\67\7\4\2\2\678\7\5\2\289\7.\2\29:"+
		"\7\61\2\2:;\7\t\2\2;<\7\60\2\2<=\t\2\2\2=>\7\62\2\2>d\5\4\3\2?N\7\33\2"+
		"\2@K\7\61\2\2AB\7\f\2\2BH\7.\2\2CD\7\60\2\2DE\7\f\2\2EG\7.\2\2FC\3\2\2"+
		"\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2KA\3\2\2\2KL\3\2\2"+
		"\2LM\3\2\2\2MO\7\62\2\2N@\3\2\2\2NO\3\2\2\2OW\3\2\2\2PQ\7\32\2\2QX\7\n"+
		"\2\2RS\7\25\2\2ST\7\61\2\2TU\5\b\5\2UV\7\62\2\2VX\3\2\2\2WP\3\2\2\2WR"+
		"\3\2\2\2XY\3\2\2\2YZ\7\65\2\2Z[\5\6\4\2[\\\7\66\2\2\\^\3\2\2\2]?\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`d\3\2\2\2a_\3\2\2\2bd\3\2\2\2c\f\3\2"+
		"\2\2c!\3\2\2\2c\66\3\2\2\2c_\3\2\2\2cb\3\2\2\2d\5\3\2\2\2ef\7\20\2\2f"+
		"g\5\b\5\2gh\7\3\2\2hi\5\6\4\2i\u00be\3\2\2\2jk\7\6\2\2kl\7\61\2\2lm\5"+
		"\b\5\2mn\7\62\2\2no\7\65\2\2op\5\6\4\2pv\7\66\2\2qr\7\30\2\2rs\7\65\2"+
		"\2st\5\6\4\2tu\7\66\2\2uw\3\2\2\2vq\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\6"+
		"\4\2y\u00be\3\2\2\2z{\7\23\2\2{|\7\61\2\2|}\7\f\2\2}~\7.\2\2~\177\7\24"+
		"\2\2\177\u0080\7.\2\2\u0080\u0081\7\62\2\2\u0081\u0082\7\65\2\2\u0082"+
		"\u0083\5\6\4\2\u0083\u0084\7\66\2\2\u0084\u0085\5\6\4\2\u0085\u00be\3"+
		"\2\2\2\u0086\u0087\7\21\2\2\u0087\u0088\7\61\2\2\u0088\u0089\5\b\5\2\u0089"+
		"\u008a\7\62\2\2\u008a\u008b\7\65\2\2\u008b\u008c\5\6\4\2\u008c\u008d\7"+
		"\66\2\2\u008d\u008e\5\6\4\2\u008e\u00be\3\2\2\2\u008f\u0090\7\f\2\2\u0090"+
		"\u0091\7.\2\2\u0091\u009f\7/\2\2\u0092\u009b\7\63\2\2\u0093\u0098\5\b"+
		"\5\2\u0094\u0095\7\60\2\2\u0095\u0097\5\b\5\2\u0096\u0094\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\7\64\2\2\u009e\u00a0\5\b\5\2\u009f\u0092\3"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\3\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00be\5\6\4\2\u00a4\u00a8\7.\2\2\u00a5\u00a6\7\63"+
		"\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\7\64\2\2\u00a8\u00a5\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b8\7/\2\2\u00ab\u00b4\7\63"+
		"\2\2\u00ac\u00b1\5\b\5\2\u00ad\u00ae\7\60\2\2\u00ae\u00b0\5\b\5\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\7\64\2\2\u00b7\u00b9\5"+
		"\b\5\2\u00b8\u00ab\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\7\3\2\2\u00bb\u00be\5\6\4\2\u00bc\u00be\3\2\2\2\u00bde\3\2\2\2"+
		"\u00bdj\3\2\2\2\u00bdz\3\2\2\2\u00bd\u0086\3\2\2\2\u00bd\u008f\3\2\2\2"+
		"\u00bd\u00a4\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\7\3\2\2\2\u00bf\u00c0\b"+
		"\5\1\2\u00c0\u00df\t\3\2\2\u00c1\u00c2\7.\2\2\u00c2\u00c3\7\61\2\2\u00c3"+
		"\u00c8\5\b\5\2\u00c4\u00c5\7\60\2\2\u00c5\u00c7\5\b\5\2\u00c6\u00c4\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\62\2\2\u00cc\u00d7\3"+
		"\2\2\2\u00cd\u00ce\7.\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0\7\b\2\2\u00d0"+
		"\u00d7\7\64\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\5"+
		"\b\5\2\u00d4\u00d5\7\62\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c1\3\2\2\2\u00d6"+
		"\u00cd\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\u00df\3\2\2\2\u00d8\u00d9\7\61"+
		"\2\2\u00d9\u00da\5\b\5\2\u00da\u00db\7\62\2\2\u00db\u00df\3\2\2\2\u00dc"+
		"\u00dd\7,\2\2\u00dd\u00df\5\b\5\t\u00de\u00bf\3\2\2\2\u00de\u00d6\3\2"+
		"\2\2\u00de\u00d8\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00f4\3\2\2\2\u00e0"+
		"\u00e1\f\b\2\2\u00e1\u00e2\t\4\2\2\u00e2\u00f3\5\b\5\t\u00e3\u00e4\f\7"+
		"\2\2\u00e4\u00e5\t\5\2\2\u00e5\u00f3\5\b\5\b\u00e6\u00e7\f\6\2\2\u00e7"+
		"\u00e8\7(\2\2\u00e8\u00f3\5\b\5\7\u00e9\u00ea\f\5\2\2\u00ea\u00eb\7)\2"+
		"\2\u00eb\u00f3\5\b\5\6\u00ec\u00ed\f\4\2\2\u00ed\u00ee\7*\2\2\u00ee\u00f3"+
		"\5\b\5\5\u00ef\u00f0\f\3\2\2\u00f0\u00f1\7+\2\2\u00f1\u00f3\5\b\5\4\u00f2"+
		"\u00e0\3\2\2\2\u00f2\u00e3\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00e9\3\2"+
		"\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\t\3\2\2\2\u00f6\u00f4\3\2\2\2"+
		"\33\26\31*-\61HKNW_cv\u0098\u009b\u009f\u00a8\u00b1\u00b4\u00b8\u00bd"+
		"\u00c8\u00d6\u00de\u00f2\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}