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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> STARTPARANTHESES() { return getTokens(arcv2Parser.STARTPARANTHESES); }
		public TerminalNode STARTPARANTHESES(int i) {
			return getToken(arcv2Parser.STARTPARANTHESES, i);
		}
		public List<TerminalNode> ENDPARANTHESES() { return getTokens(arcv2Parser.ENDPARANTHESES); }
		public TerminalNode ENDPARANTHESES(int i) {
			return getToken(arcv2Parser.ENDPARANTHESES, i);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
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
				block();
				}
				break;
			case 3:
				_localctx = new Pin_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(T__1);
				setState(58);
				match(T__2);
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(STARTPARANTHESES);
				setState(61);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==PINDIGIT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(62);
				match(SEPERATOR);
				setState(63);
				_la = _input.LA(1);
				if ( !(_la==INPUT || _la==OUTPUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(64);
				match(ENDPARANTHESES);
				setState(65);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new Task_declarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(TASK);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTPARANTHESES) {
					{
					setState(67);
					match(STARTPARANTHESES);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PREFIXOPERATOR || _la==TYPE) {
						{
						setState(68);
						typing();
						setState(69);
						match(IDENTIFIER);
						setState(76);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(70);
							match(SEPERATOR);
							setState(71);
							typing();
							setState(72);
							match(IDENTIFIER);
							}
							}
							setState(78);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(81);
					match(ENDPARANTHESES);
					}
				}

				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVERY:
					{
					{
					setState(84);
					match(EVERY);
					setState(85);
					match(NUMBER);
					}
					}
					break;
				case WHEN:
					{
					{
					setState(86);
					match(WHEN);
					setState(87);
					match(STARTPARANTHESES);
					setState(88);
					expression(0);
					setState(89);
					match(ENDPARANTHESES);
					}
					}
					break;
				case STARTCURLYBRACKET:
					break;
				default:
					break;
				}
				setState(93);
				block();
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PREFIXOPERATOR) {
				{
				setState(96);
				match(PREFIXOPERATOR);
				}
			}

			setState(99);
			match(TYPE);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEOPERATOR) {
				{
				setState(100);
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
			setState(103);
			match(STARTCURLYBRACKET);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << PREFIXOPERATOR) | (1L << TYPE) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
				{
				{
				setState(104);
				statement();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				block();
				}
				break;
			case 2:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(RETURN);
				setState(114);
				expression(0);
				setState(115);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new If_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__3);
				setState(118);
				match(STARTPARANTHESES);
				setState(119);
				expression(0);
				setState(120);
				match(ENDPARANTHESES);
				setState(121);
				block();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(122);
					match(ELSE);
					setState(123);
					block();
					}
				}

				}
				break;
			case 4:
				_localctx = new Forloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(FOR);
				setState(127);
				match(STARTPARANTHESES);
				setState(128);
				typing();
				setState(129);
				match(IDENTIFIER);
				setState(130);
				match(IN);
				setState(131);
				match(IDENTIFIER);
				setState(132);
				match(ENDPARANTHESES);
				setState(133);
				block();
				}
				break;
			case 5:
				_localctx = new Whileloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(WHILE);
				setState(136);
				match(STARTPARANTHESES);
				setState(137);
				expression(0);
				setState(138);
				match(ENDPARANTHESES);
				setState(139);
				block();
				}
				break;
			case 6:
				_localctx = new Variable_declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(141);
				typing();
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
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
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
				case CHAR:
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
				}
				break;
			case 7:
				_localctx = new Assignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(IDENTIFIER);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTSQUAREBRACKET) {
					{
					setState(162);
					match(STARTSQUAREBRACKET);
					setState(163);
					match(NUMBER);
					setState(164);
					match(ENDSQUAREBRACKET);
					}
				}

				setState(167);
				match(ASSIGNMENT);
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(168);
					match(STARTSQUAREBRACKET);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(169);
						expression(0);
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(170);
							match(SEPERATOR);
							setState(171);
							expression(0);
							}
							}
							setState(176);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(179);
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
					setState(180);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new Function_call_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
				match(STARTPARANTHESES);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(186);
					expression(0);
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(187);
						match(SEPERATOR);
						setState(188);
						expression(0);
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(196);
				match(ENDPARANTHESES);
				setState(197);
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
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Terminal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(201);
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
				setState(202);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(203);
				match(STARTPARANTHESES);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(204);
					expression(0);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(205);
						match(SEPERATOR);
						setState(206);
						expression(0);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(214);
				match(ENDPARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new Array_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(IDENTIFIER);
				setState(216);
				match(STARTSQUAREBRACKET);
				setState(217);
				match(NUMBER);
				setState(218);
				match(ENDSQUAREBRACKET);
				}
				break;
			case 4:
				{
				_localctx = new Parentheses_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(STARTPARANTHESES);
				setState(220);
				expression(0);
				setState(221);
				match(ENDPARANTHESES);
				}
				break;
			case 5:
				{
				_localctx = new Unary_negation_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(NOT);
				setState(224);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_divide_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(228);
						_la = _input.LA(1);
						if ( !(_la==MULTI || _la==DIVI) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Plus_minus_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Relational_equality_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(234);
						match(RELATIONEQOPERATORS);
						setState(235);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new Relational_operator_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(237);
						match(RELATIONOPERATORS);
						setState(238);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new And_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240);
						match(AND);
						setState(241);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new Or_expressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(243);
						match(OR);
						setState(244);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		"\u0004\u00015\u00fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000"+
		"\u0011\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001\f\u0001\u001d"+
		"\t\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00010\b\u0001\n\u0001\f\u00013\t\u0001\u0003\u00015\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001K\b\u0001\n\u0001\f\u0001N\t\u0001\u0003"+
		"\u0001P\b\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\\\b\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0002\u0003\u0002b\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002f\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003j\b\u0003\n\u0003\f\u0003m\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004}\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098\t\u0004\u0003\u0004"+
		"\u009a\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00ad\b\u0004\n\u0004\f\u0004\u00b0\t\u0004\u0003\u0004"+
		"\u00b2\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b6\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00be\b\u0004\n\u0004\f\u0004\u00c1\t\u0004\u0003\u0004\u00c3\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c7\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3\t\u0005\u0003\u0005\u00d5\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00e2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00f6\b\u0005\n\u0005\f\u0005\u00f9\t\u0005"+
		"\u0001\u0005\u0000\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0006"+
		"\u0001\u0000\u0005\u0006\u0001\u0000\u001c\u001d\u0002\u0000\u001f\u001f"+
		",,\u0003\u0000\u0005\u0005\b\t,,\u0001\u0000\"#\u0001\u0000$%\u0122\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004a\u0001"+
		"\u0000\u0000\u0000\u0006g\u0001\u0000\u0000\u0000\b\u00c6\u0001\u0000"+
		"\u0000\u0000\n\u00e1\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001"+
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
		"\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%_\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0004\u0002\u0000\'(\u0005,\u0000\u0000(4\u0005/\u0000\u0000"+
		")*\u0003\u0004\u0002\u0000*1\u0005,\u0000\u0000+,\u0005.\u0000\u0000,"+
		"-\u0003\u0004\u0002\u0000-.\u0005,\u0000\u0000.0\u0001\u0000\u0000\u0000"+
		"/+\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u00004)\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u00050\u0000\u000078\u0003\u0006\u0003\u00008_\u0001"+
		"\u0000\u0000\u00009:\u0005\u0002\u0000\u0000:;\u0005\u0003\u0000\u0000"+
		";<\u0005,\u0000\u0000<=\u0005/\u0000\u0000=>\u0007\u0000\u0000\u0000>"+
		"?\u0005.\u0000\u0000?@\u0007\u0001\u0000\u0000@A\u00050\u0000\u0000A_"+
		"\u0005\u0001\u0000\u0000BR\u0005\u001a\u0000\u0000CO\u0005/\u0000\u0000"+
		"DE\u0003\u0004\u0002\u0000EL\u0005,\u0000\u0000FG\u0005.\u0000\u0000G"+
		"H\u0003\u0004\u0002\u0000HI\u0005,\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JF\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OD\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u00050\u0000\u0000RC\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S[\u0001\u0000\u0000\u0000TU\u0005\u0019\u0000\u0000"+
		"U\\\u0005\u0005\u0000\u0000VW\u0005\u0014\u0000\u0000WX\u0005/\u0000\u0000"+
		"XY\u0003\n\u0005\u0000YZ\u00050\u0000\u0000Z\\\u0001\u0000\u0000\u0000"+
		"[T\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]_\u0003\u0006\u0003\u0000^\u0012\u0001"+
		"\u0000\u0000\u0000^&\u0001\u0000\u0000\u0000^9\u0001\u0000\u0000\u0000"+
		"^B\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`b\u0005\u000b"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001"+
		"\u0000\u0000\u0000ce\u0005\f\u0000\u0000df\u0005\n\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0005\u0001\u0000\u0000"+
		"\u0000gk\u00053\u0000\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005"+
		"4\u0000\u0000o\u0007\u0001\u0000\u0000\u0000p\u00c7\u0003\u0006\u0003"+
		"\u0000qr\u0005\u000f\u0000\u0000rs\u0003\n\u0005\u0000st\u0005\u0001\u0000"+
		"\u0000t\u00c7\u0001\u0000\u0000\u0000uv\u0005\u0004\u0000\u0000vw\u0005"+
		"/\u0000\u0000wx\u0003\n\u0005\u0000xy\u00050\u0000\u0000y|\u0003\u0006"+
		"\u0003\u0000z{\u0005\u0017\u0000\u0000{}\u0003\u0006\u0003\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u00c7\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0080\u0005/\u0000\u0000\u0080"+
		"\u0081\u0003\u0004\u0002\u0000\u0081\u0082\u0005,\u0000\u0000\u0082\u0083"+
		"\u0005\u0013\u0000\u0000\u0083\u0084\u0005,\u0000\u0000\u0084\u0085\u0005"+
		"0\u0000\u0000\u0085\u0086\u0003\u0006\u0003\u0000\u0086\u00c7\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0089\u0005/\u0000"+
		"\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b\u00050\u0000\u0000"+
		"\u008b\u008c\u0003\u0006\u0003\u0000\u008c\u00c7\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u008f\u0005,\u0000\u0000\u008f"+
		"\u009d\u0005-\u0000\u0000\u0090\u0099\u00051\u0000\u0000\u0091\u0096\u0003"+
		"\n\u0005\u0000\u0092\u0093\u0005.\u0000\u0000\u0093\u0095\u0003\n\u0005"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009e\u00052\u0000\u0000"+
		"\u009c\u009e\u0003\n\u0005\u0000\u009d\u0090\u0001\u0000\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0001\u0000\u0000\u00a0\u00c7\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a5\u0005,\u0000\u0000\u00a2\u00a3\u00051\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0005\u0000\u0000\u00a4\u00a6\u00052\u0000\u0000\u00a5\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00b5\u0005-\u0000\u0000\u00a8\u00b1\u00051\u0000\u0000"+
		"\u00a9\u00ae\u0003\n\u0005\u0000\u00aa\u00ab\u0005.\u0000\u0000\u00ab"+
		"\u00ad\u0003\n\u0005\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6"+
		"\u00052\u0000\u0000\u00b4\u00b6\u0003\n\u0005\u0000\u00b5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00c7\u0005\u0001\u0000\u0000\u00b8\u00b9\u0007"+
		"\u0002\u0000\u0000\u00b9\u00c2\u0005/\u0000\u0000\u00ba\u00bf\u0003\n"+
		"\u0005\u0000\u00bb\u00bc\u0005.\u0000\u0000\u00bc\u00be\u0003\n\u0005"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00ba\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u00050\u0000\u0000"+
		"\u00c5\u00c7\u0005\u0001\u0000\u0000\u00c6p\u0001\u0000\u0000\u0000\u00c6"+
		"q\u0001\u0000\u0000\u0000\u00c6u\u0001\u0000\u0000\u0000\u00c6~\u0001"+
		"\u0000\u0000\u0000\u00c6\u0087\u0001\u0000\u0000\u0000\u00c6\u008d\u0001"+
		"\u0000\u0000\u0000\u00c6\u00a1\u0001\u0000\u0000\u0000\u00c6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c7\t\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0005"+
		"\uffff\uffff\u0000\u00c9\u00e2\u0007\u0003\u0000\u0000\u00ca\u00cb\u0007"+
		"\u0002\u0000\u0000\u00cb\u00d4\u0005/\u0000\u0000\u00cc\u00d1\u0003\n"+
		"\u0005\u0000\u00cd\u00ce\u0005.\u0000\u0000\u00ce\u00d0\u0003\n\u0005"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00e2\u00050\u0000\u0000"+
		"\u00d7\u00d8\u0005,\u0000\u0000\u00d8\u00d9\u00051\u0000\u0000\u00d9\u00da"+
		"\u0005\u0005\u0000\u0000\u00da\u00e2\u00052\u0000\u0000\u00db\u00dc\u0005"+
		"/\u0000\u0000\u00dc\u00dd\u0003\n\u0005\u0000\u00dd\u00de\u00050\u0000"+
		"\u0000\u00de\u00e2\u0001\u0000\u0000\u0000\u00df\u00e0\u0005*\u0000\u0000"+
		"\u00e0\u00e2\u0003\n\u0005\u0007\u00e1\u00c8\u0001\u0000\u0000\u0000\u00e1"+
		"\u00ca\u0001\u0000\u0000\u0000\u00e1\u00d7\u0001\u0000\u0000\u0000\u00e1"+
		"\u00db\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00f7\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u0006\u0000\u0000\u00e4\u00e5"+
		"\u0007\u0004\u0000\u0000\u00e5\u00f6\u0003\n\u0005\u0007\u00e6\u00e7\n"+
		"\u0005\u0000\u0000\u00e7\u00e8\u0007\u0005\u0000\u0000\u00e8\u00f6\u0003"+
		"\n\u0005\u0006\u00e9\u00ea\n\u0004\u0000\u0000\u00ea\u00eb\u0005&\u0000"+
		"\u0000\u00eb\u00f6\u0003\n\u0005\u0005\u00ec\u00ed\n\u0003\u0000\u0000"+
		"\u00ed\u00ee\u0005\'\u0000\u0000\u00ee\u00f6\u0003\n\u0005\u0004\u00ef"+
		"\u00f0\n\u0002\u0000\u0000\u00f0\u00f1\u0005(\u0000\u0000\u00f1\u00f6"+
		"\u0003\n\u0005\u0003\u00f2\u00f3\n\u0001\u0000\u0000\u00f3\u00f4\u0005"+
		")\u0000\u0000\u00f4\u00f6\u0003\n\u0005\u0002\u00f5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00e6\u0001\u0000\u0000\u0000\u00f5\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f5\u00ec\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000"+
		"\u0000\u0000\u00f8\u000b\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u001e\u000f\u001b\u001e\"14LOR[^aek|\u0096\u0099\u009d\u00a5"+
		"\u00ae\u00b1\u00b5\u00bf\u00c2\u00c6\u00d1\u00d4\u00e1\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}