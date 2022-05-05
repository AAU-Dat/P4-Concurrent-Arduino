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
		RULE_start = 0, RULE_declaration = 1, RULE_typing = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_expression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "typing", "block", "statement", "expression"
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
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << TASK))) != 0)) {
				{
				{
				setState(12);
				declaration();
				}
				}
				setState(17);
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
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
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
		public Variable_declarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Task_declarationContext extends DeclarationContext {
		public TerminalNode TASK() { return getToken(arcv2Parser.TASK, 0); }
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
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
		public List<TypingContext> typing() {
			return getRuleContexts(TypingContext.class);
		}
		public TypingContext typing(int i) {
			return getRuleContext(TypingContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
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
		public List<TypingContext> typing() {
			return getRuleContexts(TypingContext.class);
		}
		public TypingContext typing(int i) {
			return getRuleContext(TypingContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode STARTPARANTHESES() { return getToken(arcv2Parser.STARTPARANTHESES, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public TerminalNode STARTCURLYBRACKET() { return getToken(arcv2Parser.STARTCURLYBRACKET, 0); }
		public TerminalNode ENDCURLYBRACKET() { return getToken(arcv2Parser.ENDCURLYBRACKET, 0); }
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Variable_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				typing();
				setState(19);
				match(IDENTIFIER);
				setState(20);
				match(ASSIGNMENT);
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(21);
					match(STARTSQUAREBRACKET);
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(22);
						expression(0);
						setState(27);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(23);
							match(SEPERATOR);
							setState(24);
							expression(0);
							}
							}
							setState(29);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(32);
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
					setState(33);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(36);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Function_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				typing();
				setState(39);
				match(IDENTIFIER);
				setState(40);
				match(STARTPARANTHESES);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PREFIXOPERATOR || _la==TYPE) {
					{
					setState(41);
					typing();
					setState(42);
					match(IDENTIFIER);
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(43);
						match(SEPERATOR);
						setState(44);
						typing();
						setState(45);
						match(IDENTIFIER);
						}
						}
						setState(51);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(54);
				match(ENDPARANTHESES);
				setState(55);
				match(STARTCURLYBRACKET);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
					{
					{
					setState(56);
					statement();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(ENDCURLYBRACKET);
				}
				break;
			case 3:
				_localctx = new Pin_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(T__1);
				setState(65);
				match(T__2);
				setState(66);
				match(IDENTIFIER);
				setState(67);
				match(STARTPARANTHESES);
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==PINDIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(69);
				match(SEPERATOR);
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==INPUT || _la==OUTPUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				match(ENDPARANTHESES);
				setState(72);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new Task_declarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(TASK);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTPARANTHESES) {
					{
					setState(74);
					match(STARTPARANTHESES);
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PREFIXOPERATOR || _la==TYPE) {
						{
						setState(75);
						typing();
						setState(76);
						match(IDENTIFIER);
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(77);
							match(SEPERATOR);
							setState(78);
							typing();
							setState(79);
							match(IDENTIFIER);
							}
							}
							setState(85);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(88);
					match(ENDPARANTHESES);
					}
				}

				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVERY:
					{
					{
					setState(91);
					match(EVERY);
					setState(92);
					match(NUMBER);
					}
					}
					break;
				case WHEN:
					{
					{
					setState(93);
					match(WHEN);
					setState(94);
					match(STARTPARANTHESES);
					setState(95);
					expression(0);
					setState(96);
					match(ENDPARANTHESES);
					}
					}
					break;
				case STARTCURLYBRACKET:
					break;
				default:
					break;
				}
				setState(100);
				match(STARTCURLYBRACKET);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
					{
					{
					setState(101);
					statement();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(ENDCURLYBRACKET);
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

	public static class TypingContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(arcv2Parser.TYPE, 0); }
		public TerminalNode PREFIXOPERATOR() { return getToken(arcv2Parser.PREFIXOPERATOR, 0); }
		public TerminalNode TYPEOPERATOR() { return getToken(arcv2Parser.TYPEOPERATOR, 0); }
		public TypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arcv2Visitor ) return ((arcv2Visitor<? extends T>)visitor).visitTyping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypingContext typing() throws RecognitionException {
		TypingContext _localctx = new TypingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREFIXOPERATOR) {
				{
				setState(110);
				match(PREFIXOPERATOR);
				}
			}

			setState(113);
			match(TYPE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEOPERATOR) {
				{
				setState(114);
				match(TYPEOPERATOR);
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
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(STARTCURLYBRACKET);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
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
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
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
		public TypingContext typing() {
			return getRuleContext(TypingContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(arcv2Parser.IN, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				block();
				}
				break;
			case 2:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(RETURN);
				setState(128);
				expression(0);
				setState(129);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new If_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__3);
				setState(132);
				match(STARTPARANTHESES);
				setState(133);
				expression(0);
				setState(134);
				match(ENDPARANTHESES);
				setState(135);
				block();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(136);
					match(ELSE);
					setState(137);
					block();
					}
				}

				}
				break;
			case 4:
				_localctx = new Forloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(FOR);
				setState(141);
				match(STARTPARANTHESES);
				setState(142);
				typing();
				setState(143);
				match(IDENTIFIER);
				setState(144);
				match(IN);
				setState(145);
				match(IDENTIFIER);
				setState(146);
				match(ENDPARANTHESES);
				setState(147);
				block();
				}
				break;
			case 5:
				_localctx = new Whileloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(WHILE);
				setState(150);
				match(STARTPARANTHESES);
				setState(151);
				expression(0);
				setState(152);
				match(ENDPARANTHESES);
				setState(153);
				block();
				}
				break;
			case 6:
				_localctx = new Variable_declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(155);
				typing();
				setState(156);
				match(IDENTIFIER);
				setState(157);
				match(ASSIGNMENT);
				setState(171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(158);
					match(STARTSQUAREBRACKET);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(159);
						expression(0);
						setState(164);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(160);
							match(SEPERATOR);
							setState(161);
							expression(0);
							}
							}
							setState(166);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(169);
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
					setState(170);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(173);
				match(T__0);
				}
				}
				break;
			case 7:
				_localctx = new Assignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(IDENTIFIER);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTSQUAREBRACKET) {
					{
					setState(176);
					match(STARTSQUAREBRACKET);
					setState(177);
					match(NUMBER);
					setState(178);
					match(ENDSQUAREBRACKET);
					}
				}

				setState(181);
				match(ASSIGNMENT);
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(182);
					match(STARTSQUAREBRACKET);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(183);
						expression(0);
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(184);
							match(SEPERATOR);
							setState(185);
							expression(0);
							}
							}
							setState(190);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(193);
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
					setState(194);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new Function_call_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(STARTPARANTHESES);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(200);
					expression(0);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(201);
						match(SEPERATOR);
						setState(202);
						expression(0);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(ENDPARANTHESES);
				setState(211);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new Terminal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(215);
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
				setState(216);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(217);
				match(STARTPARANTHESES);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(218);
					expression(0);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(219);
						match(SEPERATOR);
						setState(220);
						expression(0);
						}
						}
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(228);
				match(ENDPARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new Array_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				match(IDENTIFIER);
				setState(230);
				match(STARTSQUAREBRACKET);
				setState(231);
				match(NUMBER);
				setState(232);
				match(ENDSQUAREBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new Parentheses_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(STARTPARANTHESES);
				setState(234);
				expression(0);
				setState(235);
				match(ENDPARANTHESES);
				}
				break;
			case 5:
				{
				_localctx = new Unary_negation_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(NOT);
				setState(238);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_divide_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIVI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(243);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Plus_minus_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(244);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(245);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(246);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Relational_equality_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(247);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(248);
						match(RELATIONEQOPERATORS);
						setState(249);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new Relational_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(250);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(251);
						match(RELATIONOPERATORS);
						setState(252);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new And_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(254);
						match(AND);
						setState(255);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new Or_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(257);
						match(OR);
						setState(258);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(263);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
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
		"\u0004\u00015\u0109\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001\u0003\u00015\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001R\b\u0001\n\u0001\f\u0001U\t\u0001\u0003"+
		"\u0001W\b\u0001\u0001\u0001\u0003\u0001Z\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"c\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001g\b\u0001\n\u0001\f\u0001"+
		"j\t\u0001\u0001\u0001\u0003\u0001m\b\u0001\u0001\u0002\u0003\u0002p\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002t\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003x\b\u0003\n\u0003\f\u0003{\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u008b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00a3\b\u0004\n\u0004\f\u0004\u00a6\t\u0004\u0003\u0004"+
		"\u00a8\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00b4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00bb\b\u0004\n\u0004\f\u0004\u00be\t\u0004\u0003\u0004"+
		"\u00c0\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c4\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00cc\b\u0004\n\u0004\f\u0004\u00cf\t\u0004\u0003\u0004\u00d1\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d5\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00de\b\u0005\n\u0005\f\u0005\u00e1\t\u0005\u0003\u0005\u00e3\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0104\b\u0005\n\u0005\f\u0005\u0107\t\u0005"+
		"\u0001\u0005\u0000\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0006"+
		"\u0001\u0000\u0005\u0006\u0001\u0000\u001c\u001d\u0002\u0000\u001f\u001f"+
		",,\u0003\u0000\u0005\u0005\b\t,,\u0001\u0000\"#\u0001\u0000$%\u0132\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000\u0004o\u0001"+
		"\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\b\u00d4\u0001\u0000"+
		"\u0000\u0000\n\u00ef\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001"+
		"\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0001\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012"+
		"\u0013\u0003\u0004\u0002\u0000\u0013\u0014\u0005,\u0000\u0000\u0014\""+
		"\u0005-\u0000\u0000\u0015\u001e\u00051\u0000\u0000\u0016\u001b\u0003\n"+
		"\u0005\u0000\u0017\u0018\u0005.\u0000\u0000\u0018\u001a\u0003\n\u0005"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u0016\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 #\u00052\u0000\u0000!#\u0003\n\u0005"+
		"\u0000\"\u0015\u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%m\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0004\u0002\u0000\'(\u0005,\u0000\u0000(4\u0005/\u0000\u0000"+
		")*\u0003\u0004\u0002\u0000*1\u0005,\u0000\u0000+,\u0005.\u0000\u0000,"+
		"-\u0003\u0004\u0002\u0000-.\u0005,\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/+\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u00004)\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u00050\u0000\u00007;\u00053\u0000\u00008:\u0003\b"+
		"\u0004\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=;\u0001\u0000\u0000\u0000>?\u00054\u0000\u0000?m\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0002\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0005,\u0000\u0000"+
		"CD\u0005/\u0000\u0000DE\u0007\u0000\u0000\u0000EF\u0005.\u0000\u0000F"+
		"G\u0007\u0001\u0000\u0000GH\u00050\u0000\u0000Hm\u0005\u0001\u0000\u0000"+
		"IY\u0005\u001a\u0000\u0000JV\u0005/\u0000\u0000KL\u0003\u0004\u0002\u0000"+
		"LS\u0005,\u0000\u0000MN\u0005.\u0000\u0000NO\u0003\u0004\u0002\u0000O"+
		"P\u0005,\u0000\u0000PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VK\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0005"+
		"0\u0000\u0000YJ\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zb\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0019\u0000\u0000\\c\u0005\u0005\u0000\u0000"+
		"]^\u0005\u0014\u0000\u0000^_\u0005/\u0000\u0000_`\u0003\n\u0005\u0000"+
		"`a\u00050\u0000\u0000ac\u0001\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000"+
		"b]\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000dh\u00053\u0000\u0000eg\u0003\b\u0004\u0000fe\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000km\u0005"+
		"4\u0000\u0000l\u0012\u0001\u0000\u0000\u0000l&\u0001\u0000\u0000\u0000"+
		"l@\u0001\u0000\u0000\u0000lI\u0001\u0000\u0000\u0000m\u0003\u0001\u0000"+
		"\u0000\u0000np\u0005\u000b\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005\f\u0000\u0000rt\u0005"+
		"\n\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0005"+
		"\u0001\u0000\u0000\u0000uy\u00053\u0000\u0000vx\u0003\b\u0004\u0000wv"+
		"\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u00054\u0000\u0000}\u0007\u0001\u0000\u0000\u0000~\u00d5"+
		"\u0003\u0006\u0003\u0000\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081"+
		"\u0003\n\u0005\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u00d5\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0004\u0000\u0000\u0084\u0085\u0005"+
		"/\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u00050\u0000"+
		"\u0000\u0087\u008a\u0003\u0006\u0003\u0000\u0088\u0089\u0005\u0017\u0000"+
		"\u0000\u0089\u008b\u0003\u0006\u0003\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u00d5\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u008e\u0005/\u0000\u0000"+
		"\u008e\u008f\u0003\u0004\u0002\u0000\u008f\u0090\u0005,\u0000\u0000\u0090"+
		"\u0091\u0005\u0013\u0000\u0000\u0091\u0092\u0005,\u0000\u0000\u0092\u0093"+
		"\u00050\u0000\u0000\u0093\u0094\u0003\u0006\u0003\u0000\u0094\u00d5\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u0097\u0005"+
		"/\u0000\u0000\u0097\u0098\u0003\n\u0005\u0000\u0098\u0099\u00050\u0000"+
		"\u0000\u0099\u009a\u0003\u0006\u0003\u0000\u009a\u00d5\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0003\u0004\u0002\u0000\u009c\u009d\u0005,\u0000\u0000"+
		"\u009d\u00ab\u0005-\u0000\u0000\u009e\u00a7\u00051\u0000\u0000\u009f\u00a4"+
		"\u0003\n\u0005\u0000\u00a0\u00a1\u0005.\u0000\u0000\u00a1\u00a3\u0003"+
		"\n\u0005\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u009f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ac\u00052\u0000"+
		"\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u009e\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u00d5\u0001\u0000\u0000\u0000"+
		"\u00af\u00b3\u0005,\u0000\u0000\u00b0\u00b1\u00051\u0000\u0000\u00b1\u00b2"+
		"\u0005\u0005\u0000\u0000\u00b2\u00b4\u00052\u0000\u0000\u00b3\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00c3\u0005-\u0000\u0000\u00b6\u00bf\u00051\u0000"+
		"\u0000\u00b7\u00bc\u0003\n\u0005\u0000\u00b8\u00b9\u0005.\u0000\u0000"+
		"\u00b9\u00bb\u0003\n\u0005\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb"+
		"\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u00052\u0000\u0000\u00c2\u00c4\u0003\n\u0005\u0000\u00c3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00d5\u0005\u0001\u0000\u0000\u00c6\u00c7"+
		"\u0007\u0002\u0000\u0000\u00c7\u00d0\u0005/\u0000\u0000\u00c8\u00cd\u0003"+
		"\n\u0005\u0000\u00c9\u00ca\u0005.\u0000\u0000\u00ca\u00cc\u0003\n\u0005"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u00050\u0000\u0000"+
		"\u00d3\u00d5\u0005\u0001\u0000\u0000\u00d4~\u0001\u0000\u0000\u0000\u00d4"+
		"\u007f\u0001\u0000\u0000\u0000\u00d4\u0083\u0001\u0000\u0000\u0000\u00d4"+
		"\u008c\u0001\u0000\u0000\u0000\u00d4\u0095\u0001\u0000\u0000\u0000\u00d4"+
		"\u009b\u0001\u0000\u0000\u0000\u00d4\u00af\u0001\u0000\u0000\u0000\u00d4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00d5\t\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0006\u0005\uffff\uffff\u0000\u00d7\u00f0\u0007\u0003\u0000\u0000\u00d8"+
		"\u00d9\u0007\u0002\u0000\u0000\u00d9\u00e2\u0005/\u0000\u0000\u00da\u00df"+
		"\u0003\n\u0005\u0000\u00db\u00dc\u0005.\u0000\u0000\u00dc\u00de\u0003"+
		"\n\u0005\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00da\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00f0\u00050\u0000"+
		"\u0000\u00e5\u00e6\u0005,\u0000\u0000\u00e6\u00e7\u00051\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0005\u0000\u0000\u00e8\u00f0\u00052\u0000\u0000\u00e9\u00ea"+
		"\u0005/\u0000\u0000\u00ea\u00eb\u0003\n\u0005\u0000\u00eb\u00ec\u0005"+
		"0\u0000\u0000\u00ec\u00f0\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005*\u0000"+
		"\u0000\u00ee\u00f0\u0003\n\u0005\u0007\u00ef\u00d6\u0001\u0000\u0000\u0000"+
		"\u00ef\u00d8\u0001\u0000\u0000\u0000\u00ef\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u0105\u0001\u0000\u0000\u0000\u00f1\u00f2\n\u0006\u0000\u0000\u00f2"+
		"\u00f3\u0007\u0004\u0000\u0000\u00f3\u0104\u0003\n\u0005\u0007\u00f4\u00f5"+
		"\n\u0005\u0000\u0000\u00f5\u00f6\u0007\u0005\u0000\u0000\u00f6\u0104\u0003"+
		"\n\u0005\u0006\u00f7\u00f8\n\u0004\u0000\u0000\u00f8\u00f9\u0005&\u0000"+
		"\u0000\u00f9\u0104\u0003\n\u0005\u0005\u00fa\u00fb\n\u0003\u0000\u0000"+
		"\u00fb\u00fc\u0005\'\u0000\u0000\u00fc\u0104\u0003\n\u0005\u0004\u00fd"+
		"\u00fe\n\u0002\u0000\u0000\u00fe\u00ff\u0005(\u0000\u0000\u00ff\u0104"+
		"\u0003\n\u0005\u0003\u0100\u0101\n\u0001\u0000\u0000\u0101\u0102\u0005"+
		")\u0000\u0000\u0102\u0104\u0003\n\u0005\u0002\u0103\u00f1\u0001\u0000"+
		"\u0000\u0000\u0103\u00f4\u0001\u0000\u0000\u0000\u0103\u00f7\u0001\u0000"+
		"\u0000\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fd\u0001\u0000"+
		"\u0000\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000"+
		"\u0000\u0000\u0106\u000b\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000 \u000f\u001b\u001e\"14;SVYbhlosy\u008a\u00a4\u00a7\u00ab"+
		"\u00b3\u00bc\u00bf\u00c3\u00cd\u00d0\u00d4\u00df\u00e2\u00ef\u0103\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}