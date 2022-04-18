// Generated from /home/runge/semester-project/P4-Concurrent-Arduino/compiler/arcv2.g4 by ANTLR 4.10
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
		TYPE_TYPEOPERATOR=10, COMMENTS=11, LINECOMMENTS=12, RETURN=13, WHILE=14, 
		IT=15, FOR=16, IN=17, WHEN=18, VOID=19, SETUP=20, ELSE=21, DEFINE=22, 
		EVERY=23, TASK=24, PINMODE=25, INPUT=26, OUTPUT=27, YIELD=28, ARDUINOFUNCTIONS=29, 
		INPUT_PULLUP=30, LED_BUILTIN=31, MULTI=32, DIVI=33, PLUS=34, MINUS=35, 
		RELATIONEQOPERATORS=36, RELATIONOPERATORS=37, AND=38, OR=39, NOT=40, XOR=41, 
		IDENTIFIER=42, ASSIGNMENT=43, SEPERATOR=44, STARTPARANTHESES=45, ENDPARANTHESES=46, 
		STARTSQUAREBRACKET=47, ENDSQUAREBRACKET=48, STARTCURLYBRACKET=49, ENDCURLYBRACKET=50, 
		WS=51;
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << TYPE_TYPEOPERATOR) | (1L << TASK))) != 0)) {
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new Variable_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(TYPE_TYPEOPERATOR);
				setState(17);
				match(IDENTIFIER);
				setState(18);
				match(ASSIGNMENT);
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(19);
					match(STARTSQUAREBRACKET);
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(20);
						expression(0);
						setState(25);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(21);
							match(SEPERATOR);
							setState(22);
							expression(0);
							}
							}
							setState(27);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(30);
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
					setState(31);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new Function_declarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(TYPE_TYPEOPERATOR);
				setState(36);
				match(IDENTIFIER);
				setState(37);
				match(STARTPARANTHESES);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_TYPEOPERATOR) {
					{
					setState(38);
					match(TYPE_TYPEOPERATOR);
					setState(39);
					match(IDENTIFIER);
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(40);
						match(SEPERATOR);
						setState(41);
						match(TYPE_TYPEOPERATOR);
						setState(42);
						match(IDENTIFIER);
						}
						}
						setState(47);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(50);
				match(ENDPARANTHESES);
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(51);
						statement();
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
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
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTPARANTHESES) {
					{
					setState(67);
					match(STARTPARANTHESES);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TYPE_TYPEOPERATOR) {
						{
						setState(68);
						match(TYPE_TYPEOPERATOR);
						setState(69);
						match(IDENTIFIER);
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(70);
							match(SEPERATOR);
							setState(71);
							match(TYPE_TYPEOPERATOR);
							setState(72);
							match(IDENTIFIER);
							}
							}
							setState(77);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(80);
					match(ENDPARANTHESES);
					}
				}

				setState(90);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EVERY:
					{
					{
					setState(83);
					match(EVERY);
					setState(84);
					match(NUMBER);
					}
					}
					break;
				case WHEN:
					{
					{
					setState(85);
					match(WHEN);
					setState(86);
					match(STARTPARANTHESES);
					setState(87);
					expression(0);
					setState(88);
					match(ENDPARANTHESES);
					}
					}
					break;
				case EOF:
				case T__1:
				case T__3:
				case TYPE_TYPEOPERATOR:
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
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						statement();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(100);
			match(STARTCURLYBRACKET);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TYPE_TYPEOPERATOR) | (1L << RETURN) | (1L << WHILE) | (1L << FOR) | (1L << ARDUINOFUNCTIONS) | (1L << IDENTIFIER) | (1L << STARTCURLYBRACKET))) != 0)) {
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		public TerminalNode TYPE_TYPEOPERATOR() { return getToken(arcv2Parser.TYPE_TYPEOPERATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(arcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(arcv2Parser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(arcv2Parser.IN, 0); }
		public TerminalNode ENDPARANTHESES() { return getToken(arcv2Parser.ENDPARANTHESES, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Block_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				block();
				}
				break;
			case 2:
				_localctx = new Return_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(RETURN);
				setState(111);
				expression(0);
				setState(112);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new If_else_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__3);
				setState(115);
				match(STARTPARANTHESES);
				setState(116);
				expression(0);
				setState(117);
				match(ENDPARANTHESES);
				setState(118);
				statement();
				setState(121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(119);
					match(ELSE);
					setState(120);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Forloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(FOR);
				setState(124);
				match(STARTPARANTHESES);
				setState(125);
				match(TYPE_TYPEOPERATOR);
				setState(126);
				match(IDENTIFIER);
				setState(127);
				match(IN);
				setState(128);
				match(IDENTIFIER);
				setState(129);
				match(ENDPARANTHESES);
				setState(130);
				statement();
				}
				break;
			case 5:
				_localctx = new Whileloop_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(WHILE);
				setState(132);
				match(STARTPARANTHESES);
				setState(133);
				expression(0);
				setState(134);
				match(ENDPARANTHESES);
				setState(135);
				statement();
				}
				break;
			case 6:
				_localctx = new Variable_declaration_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(137);
				match(TYPE_TYPEOPERATOR);
				setState(138);
				match(IDENTIFIER);
				setState(139);
				match(ASSIGNMENT);
				setState(153);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(140);
					match(STARTSQUAREBRACKET);
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(141);
						expression(0);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(142);
							match(SEPERATOR);
							setState(143);
							expression(0);
							}
							}
							setState(148);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(151);
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
					setState(152);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155);
				match(T__0);
				}
				}
				break;
			case 7:
				_localctx = new Assignment_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(IDENTIFIER);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STARTSQUAREBRACKET) {
					{
					setState(157);
					match(STARTSQUAREBRACKET);
					setState(158);
					match(NUMBER);
					setState(159);
					match(ENDSQUAREBRACKET);
					}
				}

				setState(162);
				match(ASSIGNMENT);
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STARTSQUAREBRACKET:
					{
					setState(163);
					match(STARTSQUAREBRACKET);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
						{
						setState(164);
						expression(0);
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEPERATOR) {
							{
							{
							setState(165);
							match(SEPERATOR);
							setState(166);
							expression(0);
							}
							}
							setState(171);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(174);
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
					setState(175);
					expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				match(T__0);
				}
				break;
			case 8:
				_localctx = new Function_call_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(STARTPARANTHESES);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(181);
					expression(0);
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(182);
						match(SEPERATOR);
						setState(183);
						expression(0);
						}
						}
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(191);
				match(ENDPARANTHESES);
				setState(192);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new Terminal_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
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
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==ARDUINOFUNCTIONS || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				match(STARTPARANTHESES);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << CHAR) | (1L << ARDUINOFUNCTIONS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << STARTPARANTHESES))) != 0)) {
					{
					setState(199);
					expression(0);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEPERATOR) {
						{
						{
						setState(200);
						match(SEPERATOR);
						setState(201);
						expression(0);
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(209);
				match(ENDPARANTHESES);
				}
				break;
			case 3:
				{
				_localctx = new Array_access_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(IDENTIFIER);
				setState(211);
				match(STARTSQUAREBRACKET);
				setState(212);
				match(NUMBER);
				setState(213);
				match(ENDSQUAREBRACKET);
				}
				break;
			case 4:
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
			case 5:
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
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
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
		"\u0004\u00013\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0003\u0001\u001d"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0003"+
		"\u00011\b\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f"+
		"\u00018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001J\b\u0001\n\u0001\f\u0001M\t\u0001\u0003\u0001O\b\u0001\u0001\u0001"+
		"\u0003\u0001R\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001[\b\u0001\u0001\u0001"+
		"\u0005\u0001^\b\u0001\n\u0001\f\u0001a\t\u0001\u0003\u0001c\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002g\b\u0002\n\u0002\f\u0002j\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003z\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0091\b\u0003\n\u0003\f\u0003\u0094\t\u0003\u0003\u0003"+
		"\u0096\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a1"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00a8\b\u0003\n\u0003\f\u0003\u00ab\t\u0003\u0003\u0003\u00ad\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b1\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b9"+
		"\b\u0003\n\u0003\f\u0003\u00bc\t\u0003\u0003\u0003\u00be\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00c2\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00cb"+
		"\b\u0004\n\u0004\f\u0004\u00ce\t\u0004\u0003\u0004\u00d0\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00dd"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00f1\b\u0004\n\u0004\f\u0004\u00f4\t\u0004\u0001\u0004"+
		"\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0006\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\u001a\u001b\u0002\u0000\u001d\u001d**\u0003\u0000"+
		"\u0005\u0005\b\t**\u0001\u0000 !\u0001\u0000\"#\u011e\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0002b\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000"+
		"\u0006\u00c1\u0001\u0000\u0000\u0000\b\u00dc\u0001\u0000\u0000\u0000\n"+
		"\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000"+
		"\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0005\n\u0000\u0000\u0011\u0012\u0005*\u0000\u0000"+
		"\u0012 \u0005+\u0000\u0000\u0013\u001c\u0005/\u0000\u0000\u0014\u0019"+
		"\u0003\b\u0004\u0000\u0015\u0016\u0005,\u0000\u0000\u0016\u0018\u0003"+
		"\b\u0004\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000"+
		"\u0000\u0000\u001c\u0014\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e!\u00050\u0000\u0000"+
		"\u001f!\u0003\b\u0004\u0000 \u0013\u0001\u0000\u0000\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"c\u0005\u0001\u0000\u0000"+
		"#$\u0005\n\u0000\u0000$%\u0005*\u0000\u0000%0\u0005-\u0000\u0000&\'\u0005"+
		"\n\u0000\u0000\'-\u0005*\u0000\u0000()\u0005,\u0000\u0000)*\u0005\n\u0000"+
		"\u0000*,\u0005*\u0000\u0000+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u00000&\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000026\u0005.\u0000\u000035\u0003"+
		"\u0006\u0003\u000043\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007c\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u00009:\u0005\u0002\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0005*\u0000\u0000<=\u0005-\u0000\u0000=>\u0007\u0000\u0000"+
		"\u0000>?\u0005,\u0000\u0000?@\u0007\u0001\u0000\u0000@A\u0005.\u0000\u0000"+
		"Ac\u0005\u0001\u0000\u0000BQ\u0005\u0018\u0000\u0000CN\u0005-\u0000\u0000"+
		"DE\u0005\n\u0000\u0000EK\u0005*\u0000\u0000FG\u0005,\u0000\u0000GH\u0005"+
		"\n\u0000\u0000HJ\u0005*\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0005.\u0000"+
		"\u0000QC\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RZ\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0017\u0000\u0000T[\u0005\u0005\u0000\u0000UV\u0005"+
		"\u0012\u0000\u0000VW\u0005-\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005"+
		".\u0000\u0000Y[\u0001\u0000\u0000\u0000ZS\u0001\u0000\u0000\u0000ZU\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[_\u0001\u0000\u0000\u0000"+
		"\\^\u0003\u0006\u0003\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000b\u0010\u0001\u0000\u0000\u0000"+
		"b#\u0001\u0000\u0000\u0000b9\u0001\u0000\u0000\u0000bB\u0001\u0000\u0000"+
		"\u0000c\u0003\u0001\u0000\u0000\u0000dh\u00051\u0000\u0000eg\u0003\u0006"+
		"\u0003\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u00052\u0000\u0000l\u0005\u0001\u0000\u0000"+
		"\u0000m\u00c2\u0003\u0004\u0002\u0000no\u0005\r\u0000\u0000op\u0003\b"+
		"\u0004\u0000pq\u0005\u0001\u0000\u0000q\u00c2\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0004\u0000\u0000st\u0005-\u0000\u0000tu\u0003\b\u0004\u0000"+
		"uv\u0005.\u0000\u0000vy\u0003\u0006\u0003\u0000wx\u0005\u0015\u0000\u0000"+
		"xz\u0003\u0006\u0003\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z\u00c2\u0001\u0000\u0000\u0000{|\u0005\u0010\u0000\u0000|}\u0005"+
		"-\u0000\u0000}~\u0005\n\u0000\u0000~\u007f\u0005*\u0000\u0000\u007f\u0080"+
		"\u0005\u0011\u0000\u0000\u0080\u0081\u0005*\u0000\u0000\u0081\u0082\u0005"+
		".\u0000\u0000\u0082\u00c2\u0003\u0006\u0003\u0000\u0083\u0084\u0005\u000e"+
		"\u0000\u0000\u0084\u0085\u0005-\u0000\u0000\u0085\u0086\u0003\b\u0004"+
		"\u0000\u0086\u0087\u0005.\u0000\u0000\u0087\u0088\u0003\u0006\u0003\u0000"+
		"\u0088\u00c2\u0001\u0000\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a"+
		"\u008b\u0005*\u0000\u0000\u008b\u0099\u0005+\u0000\u0000\u008c\u0095\u0005"+
		"/\u0000\u0000\u008d\u0092\u0003\b\u0004\u0000\u008e\u008f\u0005,\u0000"+
		"\u0000\u008f\u0091\u0003\b\u0004\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u00050\u0000\u0000\u0098\u009a\u0003\b\u0004\u0000\u0099"+
		"\u008c\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u00c2\u0005\u0001\u0000\u0000\u009c"+
		"\u00a0\u0005*\u0000\u0000\u009d\u009e\u0005/\u0000\u0000\u009e\u009f\u0005"+
		"\u0005\u0000\u0000\u009f\u00a1\u00050\u0000\u0000\u00a0\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00b0\u0005+\u0000\u0000\u00a3\u00ac\u0005/\u0000\u0000"+
		"\u00a4\u00a9\u0003\b\u0004\u0000\u00a5\u00a6\u0005,\u0000\u0000\u00a6"+
		"\u00a8\u0003\b\u0004\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u00050\u0000\u0000\u00af\u00b1\u0003\b\u0004\u0000\u00b0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00c2\u0005\u0001\u0000\u0000\u00b3\u00b4\u0007"+
		"\u0002\u0000\u0000\u00b4\u00bd\u0005-\u0000\u0000\u00b5\u00ba\u0003\b"+
		"\u0004\u0000\u00b6\u00b7\u0005,\u0000\u0000\u00b7\u00b9\u0003\b\u0004"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005.\u0000\u0000"+
		"\u00c0\u00c2\u0005\u0001\u0000\u0000\u00c1m\u0001\u0000\u0000\u0000\u00c1"+
		"n\u0001\u0000\u0000\u0000\u00c1r\u0001\u0000\u0000\u0000\u00c1{\u0001"+
		"\u0000\u0000\u0000\u00c1\u0083\u0001\u0000\u0000\u0000\u00c1\u0089\u0001"+
		"\u0000\u0000\u0000\u00c1\u009c\u0001\u0000\u0000\u0000\u00c1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00c2\u0007\u0001\u0000\u0000\u0000\u00c3\u00c4\u0006"+
		"\u0004\uffff\uffff\u0000\u00c4\u00dd\u0007\u0003\u0000\u0000\u00c5\u00c6"+
		"\u0007\u0002\u0000\u0000\u00c6\u00cf\u0005-\u0000\u0000\u00c7\u00cc\u0003"+
		"\b\u0004\u0000\u00c8\u00c9\u0005,\u0000\u0000\u00c9\u00cb\u0003\b\u0004"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00dd\u0005.\u0000\u0000"+
		"\u00d2\u00d3\u0005*\u0000\u0000\u00d3\u00d4\u0005/\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0005\u0000\u0000\u00d5\u00dd\u00050\u0000\u0000\u00d6\u00d7\u0005"+
		"-\u0000\u0000\u00d7\u00d8\u0003\b\u0004\u0000\u00d8\u00d9\u0005.\u0000"+
		"\u0000\u00d9\u00dd\u0001\u0000\u0000\u0000\u00da\u00db\u0005(\u0000\u0000"+
		"\u00db\u00dd\u0003\b\u0004\u0007\u00dc\u00c3\u0001\u0000\u0000\u0000\u00dc"+
		"\u00c5\u0001\u0000\u0000\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d6\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00f2\u0001\u0000\u0000\u0000\u00de\u00df\n\u0006\u0000\u0000\u00df\u00e0"+
		"\u0007\u0004\u0000\u0000\u00e0\u00f1\u0003\b\u0004\u0007\u00e1\u00e2\n"+
		"\u0005\u0000\u0000\u00e2\u00e3\u0007\u0005\u0000\u0000\u00e3\u00f1\u0003"+
		"\b\u0004\u0006\u00e4\u00e5\n\u0004\u0000\u0000\u00e5\u00e6\u0005$\u0000"+
		"\u0000\u00e6\u00f1\u0003\b\u0004\u0005\u00e7\u00e8\n\u0003\u0000\u0000"+
		"\u00e8\u00e9\u0005%\u0000\u0000\u00e9\u00f1\u0003\b\u0004\u0004\u00ea"+
		"\u00eb\n\u0002\u0000\u0000\u00eb\u00ec\u0005&\u0000\u0000\u00ec\u00f1"+
		"\u0003\b\u0004\u0003\u00ed\u00ee\n\u0001\u0000\u0000\u00ee\u00ef\u0005"+
		"\'\u0000\u0000\u00ef\u00f1\u0003\b\u0004\u0002\u00f0\u00de\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e1\u0001\u0000\u0000\u0000\u00f0\u00e4\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e7\u0001\u0000\u0000\u0000\u00f0\u00ea\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\t\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u001e\r\u0019\u001c -06KNQZ_bhy\u0092\u0095\u0099\u00a0\u00a9\u00ac"+
		"\u00b0\u00ba\u00bd\u00c1\u00cc\u00cf\u00dc\u00f0\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}