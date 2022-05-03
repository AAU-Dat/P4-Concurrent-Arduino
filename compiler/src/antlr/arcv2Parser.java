// Generated from /mnt/c/Users/chris/Desktop/P4-Concurrent-Arduino/compiler/arcv2.g4 by ANTLR 4.10
package antlr;
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
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_expression = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "block", "statement", "expression"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << TASK))) != 0)) {
				{
				{
				setState(10);
				declaration();
				}
				}
				setState(15);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Variable_declarationContext extends DeclarationContext {
		public TerminalNode TYPE() { return getToken(arcv2Parser.TYPE, 0); }
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
		public TerminalNode PREFIXOPERATOR() { return getToken(arcv2Parser.PREFIXOPERATOR, 0); }
		public TerminalNode TYPEOPERATOR() { return getToken(arcv2Parser.TYPEOPERATOR, 0); }
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Variable_declarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Task_declarationContext extends DeclarationContext {
		public TerminalNode TASK() { return getToken(arcv2Parser.TASK, 0); }
		public List<TerminalNode> STARTPARANTHESES() { return getTokens(arcv2Parser.STARTPARANTHESES); }
		public TerminalNode STARTPARANTHESES(int i) {
			return getToken(arcv2Parser.STARTPARANTHESES, i);
		}
		public List<TerminalNode> ENDPARANTHESES() { return getTokens(arcv2Parser.ENDPARANTHESES); }
		public TerminalNode ENDPARANTHESES(int i) {
			return getToken(arcv2Parser.ENDPARANTHESES, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EVERY() { return getToken(arcv2Parser.EVERY, 0); }
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode WHEN() { return getToken(arcv2Parser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> TYPE() { return getTokens(arcv2Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(arcv2Parser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> PREFIXOPERATOR() { return getTokens(arcv2Parser.PREFIXOPERATOR); }
		public TerminalNode PREFIXOPERATOR(int i) {
			return getToken(arcv2Parser.PREFIXOPERATOR, i);
		}
		public List<TerminalNode> TYPEOPERATOR() { return getTokens(arcv2Parser.TYPEOPERATOR); }
		public TerminalNode TYPEOPERATOR(int i) {
			return getToken(arcv2Parser.TYPEOPERATOR, i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Task_declarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitTask_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pin_declarationContext extends DeclarationContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode SEPERATOR() { return getToken(arcv2Parser.SEPERATOR, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode PINDIGIT() { return getToken(arcv2Parser.PINDIGIT, 0); }
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode INPUT() { return getToken(arcv2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(arcv2Parser.OUTPUT, 0); }
		public Pin_declarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitPin_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_declarationContext extends DeclarationContext {
		public List<TerminalNode> TYPE() { return getTokens(arcv2Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(arcv2Parser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public List<TerminalNode> PREFIXOPERATOR() { return getTokens(arcv2Parser.PREFIXOPERATOR); }
		public TerminalNode PREFIXOPERATOR(int i) {
			return getToken(arcv2Parser.PREFIXOPERATOR, i);
		}
		public List<TerminalNode> TYPEOPERATOR() { return getTokens(arcv2Parser.TYPEOPERATOR); }
		public TerminalNode TYPEOPERATOR(int i) {
			return getToken(arcv2Parser.TYPEOPERATOR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Function_declarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			int _alt;
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Variable_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR) {
					{
					setState(16);
					match(PREFIXOPERATOR);
					}
				}

				setState(19);
				match(TYPE);
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPEOPERATOR) {
					{
					setState(20);
					match(TYPEOPERATOR);
					}
				}

				setState(23);
				match(IDENTIFIER);
				setState(24);
				match(ASSIGNMENT);
				setState(38);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(25);
					match(STARTSQUAREBRACKET);
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(26);
						expression(0);
						setState(31);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(27);
							match(SEPERATOR);
							setState(28);
							expression(0);
							}
							}
							setState(33);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(36);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case CHAR:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(37);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Function_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR) {
					{
					setState(41);
					match(PREFIXOPERATOR);
					}
				}

				setState(44);
				match(TYPE);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPEOPERATOR) {
					{
					setState(45);
					match(TYPEOPERATOR);
					}
				}

				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(STARTPARANTHESES);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR || _la==TYPE) {
					{
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PREFIXOPERATOR) {
						{
						setState(50);
						match(PREFIXOPERATOR);
						}
					}

					setState(53);
					match(TYPE);
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TYPEOPERATOR) {
						{
						setState(54);
						match(TYPEOPERATOR);
						}
					}

					setState(57);
					match(IDENTIFIER);
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(58);
						match(SEPERATOR);
						setState(60);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PREFIXOPERATOR) {
							{
							setState(59);
							match(PREFIXOPERATOR);
							}
						}

						setState(62);
						match(TYPE);
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TYPEOPERATOR) {
							{
							setState(63);
							match(TYPEOPERATOR);
							}
						}

						setState(66);
						match(IDENTIFIER);
						}
						}
						setState(71);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(74);
				match(ENDPARANTHESES);
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(75);
						statement();
						}
						} 
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new Pin_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(T__1);
				setState(82);
				match(T__2);
				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(STARTPARANTHESES);
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==PINDIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				match(SEPERATOR);
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==INPUT || _la==OUTPUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				match(ENDPARANTHESES);
				setState(89);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new Task_declarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(TASK);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTPARANTHESES) {
					{
					setState(91);
					match(STARTPARANTHESES);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PREFIXOPERATOR || _la==TYPE) {
						{
						setState(93);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==PREFIXOPERATOR) {
							{
							setState(92);
							match(PREFIXOPERATOR);
							}
						}

						setState(95);
						match(TYPE);
						setState(97);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TYPEOPERATOR) {
							{
							setState(96);
							match(TYPEOPERATOR);
							}
						}

						setState(99);
						match(IDENTIFIER);
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(100);
							match(SEPERATOR);
							setState(102);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==PREFIXOPERATOR) {
								{
								setState(101);
								match(PREFIXOPERATOR);
								}
							}

							setState(104);
							match(TYPE);
							setState(106);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==TYPEOPERATOR) {
								{
								setState(105);
								match(TYPEOPERATOR);
								}
							}

							setState(108);
							match(IDENTIFIER);
							}
							}
							setState(113);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(116);
					match(ENDPARANTHESES);
					}
				}

				setState(126);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVERY:
					{
					{
					setState(119);
					match(EVERY);
					setState(120);
					match(NUMBER);
					}
					}
					break;
				case WHEN:
					{
					{
					setState(121);
					match(WHEN);
					setState(122);
					match(STARTPARANTHESES);
					setState(123);
					expression(0);
					setState(124);
					match(ENDPARANTHESES);
					}
					}
					break;
				case EOF:
				case T__1:
				case T__3:
				case PREFIXOPERATOR:
				case TYPE:
				case RETURN:
				case WHILE:
				case FOR:
				case TASK:
				case ARDUINOFUNCTIONS:
				case IDENTIFIER:
				case STARTCURLYBRACKET:
					break;
				default:
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						statement();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(STARTCURLYBRACKET);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
				{
				{
				setState(137);
				statement();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(ENDCURLYBRACKET);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_else_statementContext extends StatementContext {
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(arcv2Parser.ELSE, 0); }
		public If_else_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitIf_else_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Variable_declaration_statementContext extends StatementContext {
		public TerminalNode TYPE() { return getToken(arcv2Parser.TYPE, 0); }
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
		public TerminalNode PREFIXOPERATOR() { return getToken(arcv2Parser.PREFIXOPERATOR, 0); }
		public TerminalNode TYPEOPERATOR() { return getToken(arcv2Parser.TYPEOPERATOR, 0); }
		public List<TerminalNode> SEPERATOR() { return getTokens(arcv2Parser.SEPERATOR); }
		public TerminalNode SEPERATOR(int i) {
			return getToken(arcv2Parser.SEPERATOR, i);
		}
		public Variable_declaration_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitVariable_declaration_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assignment_statementContext extends StatementContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(arcv2Parser.ASSIGNMENT, 0); }
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
		public Assignment_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_statementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forloop_statementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(arcv2Parser.FOR, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode TYPE() { return getToken(arcv2Parser.TYPE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(arcv2Parser.IN, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PREFIXOPERATOR() { return getToken(arcv2Parser.PREFIXOPERATOR, 0); }
		public TerminalNode TYPEOPERATOR() { return getToken(arcv2Parser.TYPEOPERATOR, 0); }
		public Forloop_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitForloop_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Whileloop_statementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(arcv2Parser.WHILE, 0); }
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Whileloop_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitWhileloop_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_call_statementContext extends StatementContext {
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ARDUINOFUNCTIONS() { return getToken(arcv2Parser.ARDUINOFUNCTIONS, 0); }
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
		public Function_call_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_statementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(arcv2Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				block();
				}
				break;
			case 2:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(RETURN);
				setState(147);
				expression(0);
				setState(148);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new If_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__3);
				setState(151);
				match(STARTPARANTHESES);
				setState(152);
				expression(0);
				setState(153);
				match(ENDPARANTHESES);
				setState(154);
				block();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155);
					match(ELSE);
					setState(156);
					block();
					}
				}

				}
				break;
			case 4:
				_localctx = new Forloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(FOR);
				setState(160);
				match(STARTPARANTHESES);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR) {
					{
					setState(161);
					match(PREFIXOPERATOR);
					}
				}

				setState(164);
				match(TYPE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPEOPERATOR) {
					{
					setState(165);
					match(TYPEOPERATOR);
					}
				}

				setState(168);
				match(IDENTIFIER);
				setState(169);
				match(IN);
				setState(170);
				match(IDENTIFIER);
				setState(171);
				match(ENDPARANTHESES);
				setState(172);
				block();
				}
				break;
			case 5:
				_localctx = new Whileloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(WHILE);
				setState(174);
				match(STARTPARANTHESES);
				setState(175);
				expression(0);
				setState(176);
				match(ENDPARANTHESES);
				setState(177);
				block();
				}
				break;
			case 6:
				_localctx = new Variable_declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR) {
					{
					setState(179);
					match(PREFIXOPERATOR);
					}
				}

				setState(182);
				match(TYPE);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPEOPERATOR) {
					{
					setState(183);
					match(TYPEOPERATOR);
					}
				}

				setState(186);
				match(IDENTIFIER);
				setState(187);
				match(ASSIGNMENT);
				setState(201);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(188);
					match(STARTSQUAREBRACKET);
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(189);
						expression(0);
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(190);
							match(SEPERATOR);
							setState(191);
							expression(0);
							}
							}
							setState(196);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(199);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case CHAR:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(200);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203);
				match(T__0);
				}
				}
				break;
			case 7:
				_localctx = new Assignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(IDENTIFIER);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTSQUAREBRACKET) {
					{
					setState(205);
					match(STARTSQUAREBRACKET);
					setState(206);
					match(NUMBER);
					setState(207);
					match(ENDSQUAREBRACKET);
					}
				}

				setState(210);
				match(ASSIGNMENT);
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(211);
					match(STARTSQUAREBRACKET);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(212);
						expression(0);
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(213);
							match(SEPERATOR);
							setState(214);
							expression(0);
							}
							}
							setState(219);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(222);
					match(ENDSQUAREBRACKET);
					}
					break;
				case NUMBER:
				case BOOL:
				case CHAR:
				case ARDUINOFUNCTIONS:
				case NOT:
				case IDENTIFIER:
				case STARTPARANTHESES:
					{
					setState(223);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new Function_call_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				match(STARTPARANTHESES);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(229);
					expression(0);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(230);
						match(SEPERATOR);
						setState(231);
						expression(0);
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(239);
				match(ENDPARANTHESES);
				setState(240);
				match(T__0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitRelational_equality_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitMultiplication_divide_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Terminal_expressionContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode BOOL() { return getToken(arcv2Parser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(arcv2Parser.CHAR, 0); }
		public Terminal_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitTerminal_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_negation_expressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(arcv2Parser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Unary_negation_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitUnary_negation_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitRelational_operator_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitParentheses_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Array_access_expressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode STARTSQUAREBRACKET() { return getToken(arcv2Parser.STARTSQUAREBRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(arcv2Parser.NUMBER, 0); }
		public TerminalNode ENDSQUAREBRACKET() { return getToken(arcv2Parser.ENDSQUAREBRACKET, 0); }
		public Array_access_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitArray_access_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Function_access_expressionContext extends ExpressionContext {
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(arcv2Parser.IDENTIFIER, 0); }
		public TerminalNode ARDUINOFUNCTIONS() { return getToken(arcv2Parser.ARDUINOFUNCTIONS, 0); }
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
		public Function_access_expressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitFunction_access_expression(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitPlus_minus_expression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				_localctx = new Terminal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << IDENTIFIER))) != 0)) ) {
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
				_localctx = new Function_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				match(STARTPARANTHESES);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(247);
					expression(0);
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(248);
						match(SEPERATOR);
						setState(249);
						expression(0);
						}
						}
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(257);
				match(ENDPARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new Array_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(IDENTIFIER);
				setState(259);
				match(STARTSQUAREBRACKET);
				setState(260);
				match(NUMBER);
				setState(261);
				match(ENDSQUAREBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new Parentheses_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				match(STARTPARANTHESES);
				setState(263);
				expression(0);
				setState(264);
				match(ENDPARANTHESES);
				}
				break;
			case 5:
				{
				_localctx = new Unary_negation_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(NOT);
				setState(267);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_divide_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(271);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIVI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Plus_minus_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(274);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Relational_equality_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(276);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(277);
						match(RELATIONEQOPERATORS);
						setState(278);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new Relational_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(280);
						match(RELATIONOPERATORS);
						setState(281);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new And_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(282);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(283);
						match(AND);
						setState(284);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new Or_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(286);
						match(OR);
						setState(287);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		case 4:
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
		"\u0004\u00015\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001=\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001"+
		"\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001\u0003\u0001I\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001^\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001b\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0005\u0001n\b\u0001\n\u0001\f"+
		"\u0001q\t\u0001\u0003\u0001s\b\u0001\u0001\u0001\u0003\u0001v\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u007f\b\u0001\u0001\u0001\u0005\u0001\u0082\b"+
		"\u0001\n\u0001\f\u0001\u0085\t\u0001\u0003\u0001\u0087\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u008b\b\u0002\n\u0002\f\u0002\u008e\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u009e\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00a3\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a7"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00b5\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b9"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00c1\b\u0003\n\u0003\f\u0003\u00c4\t\u0003\u0003\u0003"+
		"\u00c6\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ca\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d1"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00d8\b\u0003\n\u0003\f\u0003\u00db\t\u0003\u0003\u0003\u00dd\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e1\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00e9"+
		"\b\u0003\n\u0003\f\u0003\u00ec\t\u0003\u0003\u0003\u00ee\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00f2\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00fb"+
		"\b\u0004\n\u0004\f\u0004\u00fe\t\u0004\u0003\u0004\u0100\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u010d"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0121\b\u0004\n\u0004\f\u0004\u0124\t\u0004\u0001\u0004"+
		"\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0006\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\u001c\u001d\u0002\u0000\u001f\u001f,,\u0003\u0000"+
		"\u0005\u0005\b\t,,\u0001\u0000\"#\u0001\u0000$%\u015e\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002\u0086\u0001\u0000\u0000\u0000\u0004\u0088\u0001\u0000"+
		"\u0000\u0000\u0006\u00f1\u0001\u0000\u0000\u0000\b\u010c\u0001\u0000\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\u0005\u000b\u0000\u0000\u0011\u0010\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000"+
		"\u0000\u0000\u0013\u0015\u0005\f\u0000\u0000\u0014\u0016\u0005\n\u0000"+
		"\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0005,\u0000\u0000"+
		"\u0018&\u0005-\u0000\u0000\u0019\"\u00051\u0000\u0000\u001a\u001f\u0003"+
		"\b\u0004\u0000\u001b\u001c\u0005.\u0000\u0000\u001c\u001e\u0003\b\u0004"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000"+
		"\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"\u001a\u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\'\u00052\u0000\u0000%\'\u0003\b\u0004\u0000&\u0019\u0001\u0000\u0000"+
		"\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0087\u0005"+
		"\u0001\u0000\u0000)+\u0005\u000b\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0005\f\u0000\u0000"+
		"-/\u0005\n\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0005,\u0000\u00001H\u0005/\u0000\u00002"+
		"4\u0005\u000b\u0000\u000032\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000057\u0005\f\u0000\u000068\u0005\n\u0000"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009E\u0005,\u0000\u0000:<\u0005.\u0000\u0000;=\u0005\u000b\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>@\u0005\f\u0000\u0000?A\u0005\n\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0005"+
		",\u0000\u0000C:\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000H3\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JN\u00050\u0000\u0000KM\u0003\u0006\u0003"+
		"\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0087\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000QR\u0005\u0002\u0000\u0000RS\u0005\u0003\u0000"+
		"\u0000ST\u0005,\u0000\u0000TU\u0005/\u0000\u0000UV\u0007\u0000\u0000\u0000"+
		"VW\u0005.\u0000\u0000WX\u0007\u0001\u0000\u0000XY\u00050\u0000\u0000Y"+
		"\u0087\u0005\u0001\u0000\u0000Zu\u0005\u001a\u0000\u0000[r\u0005/\u0000"+
		"\u0000\\^\u0005\u000b\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0005\f\u0000\u0000`b\u0005\n"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000co\u0005,\u0000\u0000df\u0005.\u0000\u0000eg\u0005\u000b"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hj\u0005\f\u0000\u0000ik\u0005\n\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0005,\u0000\u0000md\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000r]\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u00050\u0000\u0000u[\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v~\u0001\u0000\u0000\u0000wx\u0005"+
		"\u0019\u0000\u0000x\u007f\u0005\u0005\u0000\u0000yz\u0005\u0014\u0000"+
		"\u0000z{\u0005/\u0000\u0000{|\u0003\b\u0004\u0000|}\u00050\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000~y\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0083\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0006\u0003\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000\u0000"+
		"\u0000\u0086*\u0001\u0000\u0000\u0000\u0086Q\u0001\u0000\u0000\u0000\u0086"+
		"Z\u0001\u0000\u0000\u0000\u0087\u0003\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u00053\u0000\u0000\u0089\u008b\u0003\u0006\u0003\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"4\u0000\u0000\u0090\u0005\u0001\u0000\u0000\u0000\u0091\u00f2\u0003\u0004"+
		"\u0002\u0000\u0092\u0093\u0005\u000f\u0000\u0000\u0093\u0094\u0003\b\u0004"+
		"\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u00f2\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0004\u0000\u0000\u0097\u0098\u0005/\u0000\u0000"+
		"\u0098\u0099\u0003\b\u0004\u0000\u0099\u009a\u00050\u0000\u0000\u009a"+
		"\u009d\u0003\u0004\u0002\u0000\u009b\u009c\u0005\u0017\u0000\u0000\u009c"+
		"\u009e\u0003\u0004\u0002\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u00f2\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0012\u0000\u0000\u00a0\u00a2\u0005/\u0000\u0000\u00a1\u00a3"+
		"\u0005\u000b\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6"+
		"\u0005\f\u0000\u0000\u00a5\u00a7\u0005\n\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005,\u0000\u0000\u00a9\u00aa\u0005\u0013"+
		"\u0000\u0000\u00aa\u00ab\u0005,\u0000\u0000\u00ab\u00ac\u00050\u0000\u0000"+
		"\u00ac\u00f2\u0003\u0004\u0002\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000"+
		"\u00ae\u00af\u0005/\u0000\u0000\u00af\u00b0\u0003\b\u0004\u0000\u00b0"+
		"\u00b1\u00050\u0000\u0000\u00b1\u00b2\u0003\u0004\u0002\u0000\u00b2\u00f2"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u000b\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005\f\u0000\u0000\u00b7\u00b9\u0005"+
		"\n\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005,\u0000"+
		"\u0000\u00bb\u00c9\u0005-\u0000\u0000\u00bc\u00c5\u00051\u0000\u0000\u00bd"+
		"\u00c2\u0003\b\u0004\u0000\u00be\u00bf\u0005.\u0000\u0000\u00bf\u00c1"+
		"\u0003\b\u0004\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00bd\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00ca\u0005"+
		"2\u0000\u0000\u00c8\u00ca\u0003\b\u0004\u0000\u00c9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00f2\u0005\u0001\u0000\u0000\u00cc\u00d0\u0005,\u0000"+
		"\u0000\u00cd\u00ce\u00051\u0000\u0000\u00ce\u00cf\u0005\u0005\u0000\u0000"+
		"\u00cf\u00d1\u00052\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2"+
		"\u00e0\u0005-\u0000\u0000\u00d3\u00dc\u00051\u0000\u0000\u00d4\u00d9\u0003"+
		"\b\u0004\u0000\u00d5\u00d6\u0005.\u0000\u0000\u00d6\u00d8\u0003\b\u0004"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1\u00052\u0000\u0000"+
		"\u00df\u00e1\u0003\b\u0004\u0000\u00e0\u00d3\u0001\u0000\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2"+
		"\u00f2\u0005\u0001\u0000\u0000\u00e3\u00e4\u0007\u0002\u0000\u0000\u00e4"+
		"\u00ed\u0005/\u0000\u0000\u00e5\u00ea\u0003\b\u0004\u0000\u00e6\u00e7"+
		"\u0005.\u0000\u0000\u00e7\u00e9\u0003\b\u0004\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u00050\u0000\u0000\u00f0\u00f2\u0005\u0001"+
		"\u0000\u0000\u00f1\u0091\u0001\u0000\u0000\u0000\u00f1\u0092\u0001\u0000"+
		"\u0000\u0000\u00f1\u0096\u0001\u0000\u0000\u0000\u00f1\u009f\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ad\u0001\u0000\u0000\u0000\u00f1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00f1\u00cc\u0001\u0000\u0000\u0000\u00f1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f2\u0007\u0001\u0000\u0000\u0000\u00f3\u00f4\u0006\u0004"+
		"\uffff\uffff\u0000\u00f4\u010d\u0007\u0003\u0000\u0000\u00f5\u00f6\u0007"+
		"\u0002\u0000\u0000\u00f6\u00ff\u0005/\u0000\u0000\u00f7\u00fc\u0003\b"+
		"\u0004\u0000\u00f8\u00f9\u0005.\u0000\u0000\u00f9\u00fb\u0003\b\u0004"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u010d\u00050\u0000\u0000"+
		"\u0102\u0103\u0005,\u0000\u0000\u0103\u0104\u00051\u0000\u0000\u0104\u0105"+
		"\u0005\u0005\u0000\u0000\u0105\u010d\u00052\u0000\u0000\u0106\u0107\u0005"+
		"/\u0000\u0000\u0107\u0108\u0003\b\u0004\u0000\u0108\u0109\u00050\u0000"+
		"\u0000\u0109\u010d\u0001\u0000\u0000\u0000\u010a\u010b\u0005*\u0000\u0000"+
		"\u010b\u010d\u0003\b\u0004\u0007\u010c\u00f3\u0001\u0000\u0000\u0000\u010c"+
		"\u00f5\u0001\u0000\u0000\u0000\u010c\u0102\u0001\u0000\u0000\u0000\u010c"+
		"\u0106\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d"+
		"\u0122\u0001\u0000\u0000\u0000\u010e\u010f\n\u0006\u0000\u0000\u010f\u0110"+
		"\u0007\u0004\u0000\u0000\u0110\u0121\u0003\b\u0004\u0007\u0111\u0112\n"+
		"\u0005\u0000\u0000\u0112\u0113\u0007\u0005\u0000\u0000\u0113\u0121\u0003"+
		"\b\u0004\u0006\u0114\u0115\n\u0004\u0000\u0000\u0115\u0116\u0005&\u0000"+
		"\u0000\u0116\u0121\u0003\b\u0004\u0005\u0117\u0118\n\u0003\u0000\u0000"+
		"\u0118\u0119\u0005\'\u0000\u0000\u0119\u0121\u0003\b\u0004\u0004\u011a"+
		"\u011b\n\u0002\u0000\u0000\u011b\u011c\u0005(\u0000\u0000\u011c\u0121"+
		"\u0003\b\u0004\u0003\u011d\u011e\n\u0001\u0000\u0000\u011e\u011f\u0005"+
		")\u0000\u0000\u011f\u0121\u0003\b\u0004\u0002\u0120\u010e\u0001\u0000"+
		"\u0000\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u0114\u0001\u0000"+
		"\u0000\u0000\u0120\u0117\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000"+
		"\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\t\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000.\r\u0011\u0015\u001f\"&*.37<@EHN]afjoru~\u0083\u0086\u008c\u009d"+
		"\u00a2\u00a6\u00b4\u00b8\u00c2\u00c5\u00c9\u00d0\u00d9\u00dc\u00e0\u00ea"+
		"\u00ed\u00f1\u00fc\u00ff\u010c\u0120\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}