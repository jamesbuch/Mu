// Generated from c:\Users\james\OneDrive\Documents\GitHub\Mu\src\main\antlr4\mu\Mu.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, SCOL=16, ASSIGN=17, OPAR=18, 
		CPAR=19, OBRACE=20, CBRACE=21, TRUE=22, FALSE=23, NIL=24, IF=25, UNLESS=26, 
		ELSE=27, WHILE=28, LOG=29, ID=30, INT=31, FLOAT=32, STRING=33, COMMENT=34, 
		SPACE=35, DOLLAR=36, OTHER=37;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_stat = 2, RULE_assignment = 3, RULE_unless_stat = 4, 
		RULE_if_stat = 5, RULE_condition_block = 6, RULE_stat_block = 7, RULE_while_stat = 8, 
		RULE_log = 9, RULE_expr = 10, RULE_atom = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "stat", "assignment", "unless_stat", "if_stat", "condition_block", 
			"stat_block", "while_stat", "log", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", "'('", "')'", 
			"'{'", "'}'", "'true'", "'false'", "'nil'", "'if'", "'unless'", "'else'", 
			"'while'", "'log'", null, null, null, null, null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", 
			"OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "UNLESS", "ELSE", "WHILE", 
			"LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "DOLLAR", 
			"OTHER"
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
	public String getGrammarFileName() { return "Mu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MuParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			block();
			setState(25);
			match(EOF);
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << LOG) | (1L << ID) | (1L << OTHER))) != 0)) {
				{
				{
				setState(27);
				stat();
				}
				}
				setState(32);
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

	public static class StatContext extends ParserRuleContext {
		public Token OTHER;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Unless_statContext unless_stat() {
			return getRuleContext(Unless_statContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(MuParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				assignment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				while_stat();
				}
				break;
			case UNLESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				unless_stat();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				log();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MuParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ID);
			setState(43);
			match(ASSIGN);
			setState(44);
			expr(0);
			setState(45);
			match(SCOL);
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

	public static class Unless_statContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(MuParser.UNLESS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Unless_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_stat; }
	}

	public final Unless_statContext unless_stat() throws RecognitionException {
		Unless_statContext _localctx = new Unless_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unless_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(UNLESS);
			setState(48);
			expr(0);
			setState(49);
			stat_block();
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MuParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MuParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IF);
			setState(52);
			condition_block();
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(ELSE);
					setState(54);
					match(IF);
					setState(55);
					condition_block();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(61);
				match(ELSE);
				setState(62);
				stat_block();
				}
				break;
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

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			expr(0);
			setState(66);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(MuParser.OBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(MuParser.CBRACE, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat_block);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(OBRACE);
				setState(69);
				block();
				setState(70);
				match(CBRACE);
				}
				break;
			case IF:
			case UNLESS:
			case WHILE:
			case LOG:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				stat();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(WHILE);
			setState(76);
			expr(0);
			setState(77);
			stat_block();
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(MuParser.LOG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(MuParser.SCOL, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LOG);
			setState(80);
			expr(0);
			setState(81);
			match(SCOL);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MuParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MuParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MuParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MuParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(MuParser.OR, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MuParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MuParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MuParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(MuParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(MuParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(MuParser.LT, 0); }
		public TerminalNode GT() { return getToken(MuParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MuParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MuParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(MuParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84);
				match(MINUS);
				setState(85);
				expr(9);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(NOT);
				setState(87);
				expr(8);
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case DOLLAR:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(92);
						match(POW);
						setState(93);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(101);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(104);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(107);
						match(AND);
						setState(108);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(110);
						match(OR);
						setState(111);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MuParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(MuParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class DollarStringAtomContext extends AtomContext {
		public TerminalNode DOLLAR() { return getToken(MuParser.DOLLAR, 0); }
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public DollarStringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(OPAR);
				setState(118);
				expr(0);
				setState(119);
				match(CPAR);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(STRING);
				}
				break;
			case DOLLAR:
				_localctx = new DollarStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(DOLLAR);
				setState(126);
				match(STRING);
				}
				break;
			case NIL:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(NIL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fs\n\f\f\f\16\fv\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\r\2\3\26\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\b\3\2\r\17\3\2\13\f\3\2\7\n\3\2\5\6\3"+
		"\2!\"\3\2\30\31\2\u0090\2\32\3\2\2\2\4 \3\2\2\2\6*\3\2\2\2\b,\3\2\2\2"+
		"\n\61\3\2\2\2\f\65\3\2\2\2\16C\3\2\2\2\20K\3\2\2\2\22M\3\2\2\2\24Q\3\2"+
		"\2\2\26[\3\2\2\2\30\u0082\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2"+
		"\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5"+
		"\3\2\2\2\" \3\2\2\2#+\5\b\5\2$+\5\f\7\2%+\5\22\n\2&+\5\n\6\2\'+\5\24\13"+
		"\2()\7\'\2\2)+\b\4\1\2*#\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3\2"+
		"\2\2*(\3\2\2\2+\7\3\2\2\2,-\7 \2\2-.\7\23\2\2./\5\26\f\2/\60\7\22\2\2"+
		"\60\t\3\2\2\2\61\62\7\34\2\2\62\63\5\26\f\2\63\64\5\20\t\2\64\13\3\2\2"+
		"\2\65\66\7\33\2\2\66<\5\16\b\2\678\7\35\2\289\7\33\2\29;\5\16\b\2:\67"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=A\3\2\2\2><\3\2\2\2?@\7\35\2\2"+
		"@B\5\20\t\2A?\3\2\2\2AB\3\2\2\2B\r\3\2\2\2CD\5\26\f\2DE\5\20\t\2E\17\3"+
		"\2\2\2FG\7\26\2\2GH\5\4\3\2HI\7\27\2\2IL\3\2\2\2JL\5\6\4\2KF\3\2\2\2K"+
		"J\3\2\2\2L\21\3\2\2\2MN\7\36\2\2NO\5\26\f\2OP\5\20\t\2P\23\3\2\2\2QR\7"+
		"\37\2\2RS\5\26\f\2ST\7\22\2\2T\25\3\2\2\2UV\b\f\1\2VW\7\f\2\2W\\\5\26"+
		"\f\13XY\7\21\2\2Y\\\5\26\f\nZ\\\5\30\r\2[U\3\2\2\2[X\3\2\2\2[Z\3\2\2\2"+
		"\\t\3\2\2\2]^\f\f\2\2^_\7\20\2\2_s\5\26\f\f`a\f\t\2\2ab\t\2\2\2bs\5\26"+
		"\f\ncd\f\b\2\2de\t\3\2\2es\5\26\f\tfg\f\7\2\2gh\t\4\2\2hs\5\26\f\bij\f"+
		"\6\2\2jk\t\5\2\2ks\5\26\f\7lm\f\5\2\2mn\7\4\2\2ns\5\26\f\6op\f\4\2\2p"+
		"q\7\3\2\2qs\5\26\f\5r]\3\2\2\2r`\3\2\2\2rc\3\2\2\2rf\3\2\2\2ri\3\2\2\2"+
		"rl\3\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vt\3\2\2"+
		"\2wx\7\24\2\2xy\5\26\f\2yz\7\25\2\2z\u0083\3\2\2\2{\u0083\t\6\2\2|\u0083"+
		"\t\7\2\2}\u0083\7 \2\2~\u0083\7#\2\2\177\u0080\7&\2\2\u0080\u0083\7#\2"+
		"\2\u0081\u0083\7\32\2\2\u0082w\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082"+
		"}\3\2\2\2\u0082~\3\2\2\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\31"+
		"\3\2\2\2\13 *<AK[rt\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}