// Generated from /Volumes/externalssd/Development/Mu/src/main/antlr4/mu/Mu.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OR=6, AND=7, EQ=8, NEQ=9, GT=10, 
		LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, DIV=17, MOD=18, POW=19, 
		REGEX_MATCH=20, REGEX_NOT_MATCH=21, NOT=22, COLON=23, ASSIGN=24, OPAR=25, 
		CPAR=26, TRUE=27, FALSE=28, NIL=29, IF=30, THEN=31, ELSE=32, WHILE=33, 
		FOR=34, TO=35, END=36, NEXT=37, TYPE=38, ID=39, INT=40, FLOAT=41, STRING=42, 
		COMMENT=43, SPACE=44, DOLLAR=45, OTHER=46;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_nonEmptyBlock = 2, RULE_stat = 3, 
		RULE_assignment = 4, RULE_if_stat = 5, RULE_stat_block = 6, RULE_while_stat = 7, 
		RULE_for_stat = 8, RULE_unless_expr = 9, RULE_function_def = 10, RULE_return_stmt = 11, 
		RULE_parameter_list = 12, RULE_function_call = 13, RULE_expr_list = 14, 
		RULE_expr = 15, RULE_atom = 16, RULE_expr_stat = 17, RULE_arith_atom = 18, 
		RULE_integer_atom = 19, RULE_float_atom = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "nonEmptyBlock", "stat", "assignment", "if_stat", 
			"stat_block", "while_stat", "for_stat", "unless_expr", "function_def", 
			"return_stmt", "parameter_list", "function_call", "expr_list", "expr", 
			"atom", "expr_stat", "arith_atom", "integer_atom", "float_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'do'", "'unless'", "'func'", "'return'", "','", null, null, null, 
			null, "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'^'", "'=~'", "'!~'", null, "':'", "'='", "'('", "')'", "'true'", "'false'", 
			"'nil'", "'if'", "'then'", "'else'", "'while'", "'for'", "'to'", "'end'", 
			"'next'", null, null, null, null, null, null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OR", "AND", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "POW", "REGEX_MATCH", 
			"REGEX_NOT_MATCH", "NOT", "COLON", "ASSIGN", "OPAR", "CPAR", "TRUE", 
			"FALSE", "NIL", "IF", "THEN", "ELSE", "WHILE", "FOR", "TO", "END", "NEXT", 
			"TYPE", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "DOLLAR", 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MuParser.EOF, 0); }
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<NonEmptyBlockContext> nonEmptyBlock() {
			return getRuleContexts(NonEmptyBlockContext.class);
		}
		public NonEmptyBlockContext nonEmptyBlock(int i) {
			return getRuleContext(NonEmptyBlockContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					function_def();
					}
					break;
				case 2:
					{
					setState(43);
					nonEmptyBlock();
					}
					break;
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 113827274326026L) != 0) );
			setState(48);
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

	@SuppressWarnings("CheckReturnValue")
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 113827274326026L) != 0)) {
				{
				{
				setState(50);
				stat();
				}
				}
				setState(55);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NonEmptyBlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public NonEmptyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEmptyBlock; }
	}

	public final NonEmptyBlockContext nonEmptyBlock() throws RecognitionException {
		NonEmptyBlockContext _localctx = new NonEmptyBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonEmptyBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					stat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
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
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Expr_statContext expr_stat() {
			return getRuleContext(Expr_statContext.class,0);
		}
		public Unless_exprContext unless_expr() {
			return getRuleContext(Unless_exprContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(MuParser.OTHER, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				if_stat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				while_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				function_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				expr_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				unless_expr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				((StatContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown char: " + (((StatContext)_localctx).OTHER!=null?((StatContext)_localctx).OTHER.getText():null));
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentWithTypeContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MuParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentWithTypeContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignmentContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignmentWithTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				setState(73);
				match(COLON);
				setState(74);
				match(TYPE);
				setState(75);
				match(ASSIGN);
				setState(76);
				expr(0);
				}
				break;
			case 2:
				_localctx = new SimpleAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(ID);
				setState(78);
				match(ASSIGN);
				setState(79);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(MuParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(MuParser.IF, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(MuParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(MuParser.THEN, i);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public TerminalNode END() { return getToken(MuParser.END, 0); }
		public List<TerminalNode> ELSE() { return getTokens(MuParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MuParser.ELSE, i);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			expr(0);
			setState(84);
			match(THEN);
			setState(85);
			stat_block();
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(ELSE);
					setState(87);
					match(IF);
					setState(88);
					expr(0);
					setState(89);
					match(THEN);
					setState(90);
					stat_block();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(97);
				match(ELSE);
				setState(98);
				stat_block();
				}
			}

			setState(101);
			match(END);
			setState(102);
			match(IF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Stat_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_stat_block);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(MuParser.END, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHILE);
			setState(109);
			expr(0);
			setState(110);
			stat_block();
			setState(111);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MuParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(MuParser.ASSIGN, 0); }
		public List<Arith_atomContext> arith_atom() {
			return getRuleContexts(Arith_atomContext.class);
		}
		public Arith_atomContext arith_atom(int i) {
			return getRuleContext(Arith_atomContext.class,i);
		}
		public TerminalNode TO() { return getToken(MuParser.TO, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(MuParser.NEXT, 0); }
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(FOR);
			setState(114);
			match(ID);
			setState(115);
			match(ASSIGN);
			setState(116);
			arith_atom();
			setState(117);
			match(TO);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				{
				setState(118);
				arith_atom();
				}
				break;
			case ID:
				{
				setState(119);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			stat_block();
			setState(123);
			match(NEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unless_exprContext extends ParserRuleContext {
		public Unless_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_expr; }
	 
		public Unless_exprContext() { }
		public void copyFrom(Unless_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnlessExprContext extends Unless_exprContext {
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnlessExprContext(Unless_exprContext ctx) { copyFrom(ctx); }
	}

	public final Unless_exprContext unless_expr() throws RecognitionException {
		Unless_exprContext _localctx = new Unless_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unless_expr);
		try {
			_localctx = new UnlessExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__0);
			setState(126);
			stat_block();
			setState(127);
			match(T__1);
			setState(128);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode END() { return getToken(MuParser.END, 0); }
		public TerminalNode COLON() { return getToken(MuParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(MuParser.TYPE, 0); }
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__2);
			setState(131);
			match(ID);
			setState(132);
			match(OPAR);
			setState(133);
			parameter_list();
			setState(134);
			match(CPAR);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(135);
				match(COLON);
				setState(136);
				match(TYPE);
				}
			}

			setState(139);
			stat_block();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(140);
				return_stmt();
				}
			}

			setState(143);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__3);
			setState(146);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MuParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MuParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MuParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MuParser.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(MuParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(MuParser.TYPE, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(148);
				match(ID);
				setState(149);
				match(COLON);
				setState(150);
				match(TYPE);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(151);
					match(T__4);
					setState(152);
					match(ID);
					setState(153);
					match(COLON);
					setState(154);
					match(TYPE);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(OPAR);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 43431686602752L) != 0)) {
				{
				setState(164);
				expr_list();
				}
			}

			setState(167);
			match(CPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			expr(0);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(170);
				match(T__4);
				setState(171);
				expr(0);
				}
				}
				setState(176);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MuParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MuParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class RegexExprContext extends ExprContext {
		public List<TerminalNode> STRING() { return getTokens(MuParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MuParser.STRING, i);
		}
		public TerminalNode REGEX_MATCH() { return getToken(MuParser.REGEX_MATCH, 0); }
		public TerminalNode REGEX_NOT_MATCH() { return getToken(MuParser.REGEX_NOT_MATCH, 0); }
		public RegexExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				match(MINUS);
				setState(179);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(NOT);
				setState(181);
				expr(9);
				}
				break;
			case 3:
				{
				_localctx = new RegexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(STRING);
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==REGEX_MATCH || _la==REGEX_NOT_MATCH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						match(POW);
						setState(190);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(192);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(195);
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
						setState(196);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(198);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(201);
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
						setState(202);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						match(AND);
						setState(205);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						match(OR);
						setState(208);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ArithAtomContext extends AtomContext {
		public Arith_atomContext arith_atom() {
			return getRuleContext(Arith_atomContext.class,0);
		}
		public ArithAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParExprContext extends AtomContext {
		public TerminalNode OPAR() { return getToken(MuParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(MuParser.CPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(MuParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MuParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(MuParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallAtomContext extends AtomContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncCallAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(MuParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DollarStringAtomContext extends AtomContext {
		public TerminalNode DOLLAR() { return getToken(MuParser.DOLLAR, 0); }
		public TerminalNode STRING() { return getToken(MuParser.STRING, 0); }
		public DollarStringAtomContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(OPAR);
				setState(215);
				expr(0);
				setState(216);
				match(CPAR);
				}
				break;
			case 2:
				_localctx = new ArithAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				arith_atom();
				}
				break;
			case 3:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
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
			case 4:
				_localctx = new FuncCallAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				function_call();
				}
				break;
			case 5:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(ID);
				}
				break;
			case 6:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(STRING);
				}
				break;
			case 7:
				_localctx = new DollarStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(223);
				match(DOLLAR);
				setState(224);
				match(STRING);
				}
				break;
			case 8:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(225);
				match(NIL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stat; }
	}

	public final Expr_statContext expr_stat() throws RecognitionException {
		Expr_statContext _localctx = new Expr_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_atomContext extends ParserRuleContext {
		public Integer_atomContext integer_atom() {
			return getRuleContext(Integer_atomContext.class,0);
		}
		public Float_atomContext float_atom() {
			return getRuleContext(Float_atomContext.class,0);
		}
		public Arith_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_atom; }
	}

	public final Arith_atomContext arith_atom() throws RecognitionException {
		Arith_atomContext _localctx = new Arith_atomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arith_atom);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				integer_atom();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				float_atom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_atomContext extends ParserRuleContext {
		public Integer_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_atom; }
	 
		public Integer_atomContext() { }
		public void copyFrom(Integer_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerAtomContext extends Integer_atomContext {
		public TerminalNode INT() { return getToken(MuParser.INT, 0); }
		public IntegerAtomContext(Integer_atomContext ctx) { copyFrom(ctx); }
	}

	public final Integer_atomContext integer_atom() throws RecognitionException {
		Integer_atomContext _localctx = new Integer_atomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integer_atom);
		try {
			_localctx = new IntegerAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Float_atomContext extends ParserRuleContext {
		public Float_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_atom; }
	 
		public Float_atomContext() { }
		public void copyFrom(Float_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatAtomContext extends Float_atomContext {
		public TerminalNode FLOAT() { return getToken(MuParser.FLOAT, 0); }
		public FloatAtomContext(Float_atomContext ctx) { copyFrom(ctx); }
	}

	public final Float_atomContext float_atom() throws RecognitionException {
		Float_atomContext _localctx = new Float_atomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_float_atom);
		try {
			_localctx = new FloatAtomContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FLOAT);
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
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0002\u0004"+
		"\u0002:\b\u0002\u000b\u0002\f\u0002;\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005]\b\u0005"+
		"\n\u0005\f\u0005`\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005d\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"k\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\by\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008a\b\n\u0001"+
		"\n\u0001\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u009c\b\f\n\f\f\f\u009f\t\f\u0003\f\u00a1\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00a6\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00ad\b\u000e\n\u000e\f\u000e\u00b0\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00bb\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00d2\b\u000f\n\u000f\f\u000f\u00d5\t\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00e3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0000\u0001\u001e\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0006\u0001\u0000\u0014"+
		"\u0015\u0001\u0000\u0010\u0012\u0001\u0000\u000e\u000f\u0001\u0000\n\r"+
		"\u0001\u0000\b\t\u0001\u0000\u001b\u001c\u0101\u0000,\u0001\u0000\u0000"+
		"\u0000\u00025\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"F\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000"+
		"\u0000\fj\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"q\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u0082\u0001"+
		"\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u00a0\u0001"+
		"\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000\u0000\u001c\u00a9\u0001"+
		"\u0000\u0000\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00e2\u0001\u0000"+
		"\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$\u00e8\u0001\u0000\u0000"+
		"\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00ec\u0001\u0000\u0000\u0000*"+
		"-\u0003\u0014\n\u0000+-\u0003\u0004\u0002\u0000,*\u0001\u0000\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0005\u0000"+
		"\u0000\u00011\u0001\u0001\u0000\u0000\u000024\u0003\u0006\u0003\u0000"+
		"32\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u00008:\u0003\u0006\u0003\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u0005\u0001\u0000\u0000\u0000=G\u0003\b\u0004\u0000>G\u0003\n"+
		"\u0005\u0000?G\u0003\u000e\u0007\u0000@G\u0003\u0010\b\u0000AG\u0003\u0014"+
		"\n\u0000BG\u0003\"\u0011\u0000CG\u0003\u0012\t\u0000DE\u0005.\u0000\u0000"+
		"EG\u0006\u0003\uffff\uffff\u0000F=\u0001\u0000\u0000\u0000F>\u0001\u0000"+
		"\u0000\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FA\u0001"+
		"\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005\'\u0000"+
		"\u0000IJ\u0005\u0017\u0000\u0000JK\u0005&\u0000\u0000KL\u0005\u0018\u0000"+
		"\u0000LQ\u0003\u001e\u000f\u0000MN\u0005\'\u0000\u0000NO\u0005\u0018\u0000"+
		"\u0000OQ\u0003\u001e\u000f\u0000PH\u0001\u0000\u0000\u0000PM\u0001\u0000"+
		"\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\u001e\u0000\u0000ST\u0003"+
		"\u001e\u000f\u0000TU\u0005\u001f\u0000\u0000U^\u0003\f\u0006\u0000VW\u0005"+
		" \u0000\u0000WX\u0005\u001e\u0000\u0000XY\u0003\u001e\u000f\u0000YZ\u0005"+
		"\u001f\u0000\u0000Z[\u0003\f\u0006\u0000[]\u0001\u0000\u0000\u0000\\V"+
		"\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_c\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0005 \u0000\u0000bd\u0003\f\u0006\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005"+
		"$\u0000\u0000fg\u0005\u001e\u0000\u0000g\u000b\u0001\u0000\u0000\u0000"+
		"hk\u0003\u0002\u0001\u0000ik\u0003\u0006\u0003\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\r\u0001\u0000\u0000\u0000lm\u0005!\u0000"+
		"\u0000mn\u0003\u001e\u000f\u0000no\u0003\f\u0006\u0000op\u0005$\u0000"+
		"\u0000p\u000f\u0001\u0000\u0000\u0000qr\u0005\"\u0000\u0000rs\u0005\'"+
		"\u0000\u0000st\u0005\u0018\u0000\u0000tu\u0003$\u0012\u0000ux\u0005#\u0000"+
		"\u0000vy\u0003$\u0012\u0000wy\u0005\'\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0003\f\u0006"+
		"\u0000{|\u0005%\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}~\u0005\u0001"+
		"\u0000\u0000~\u007f\u0003\f\u0006\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0003\u001e\u000f\u0000\u0081\u0013\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0084\u0005\'\u0000\u0000"+
		"\u0084\u0085\u0005\u0019\u0000\u0000\u0085\u0086\u0003\u0018\f\u0000\u0086"+
		"\u0089\u0005\u001a\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088"+
		"\u008a\u0005&\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d"+
		"\u0003\f\u0006\u0000\u008c\u008e\u0003\u0016\u000b\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005$\u0000\u0000\u0090\u0015\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\u0004\u0000\u0000\u0092\u0093\u0003\u001e"+
		"\u000f\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0095\u0005\'\u0000"+
		"\u0000\u0095\u0096\u0005\u0017\u0000\u0000\u0096\u009d\u0005&\u0000\u0000"+
		"\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u0099\u0005\'\u0000\u0000\u0099"+
		"\u009a\u0005\u0017\u0000\u0000\u009a\u009c\u0005&\u0000\u0000\u009b\u0097"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u0094"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0019"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\'\u0000\u0000\u00a3\u00a5\u0005"+
		"\u0019\u0000\u0000\u00a4\u00a6\u0003\u001c\u000e\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u001a\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ae\u0003\u001e\u000f\u0000\u00aa\u00ab\u0005"+
		"\u0005\u0000\u0000\u00ab\u00ad\u0003\u001e\u000f\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u001d\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006"+
		"\u000f\uffff\uffff\u0000\u00b2\u00b3\u0005\u000f\u0000\u0000\u00b3\u00bb"+
		"\u0003\u001e\u000f\n\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00bb\u0003"+
		"\u001e\u000f\t\u00b6\u00b7\u0005*\u0000\u0000\u00b7\u00b8\u0007\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0005*\u0000\u0000\u00b9\u00bb\u0003 \u0010\u0000"+
		"\u00ba\u00b1\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bb\u00d3\u0001\u0000\u0000\u0000\u00bc\u00bd\n\u000b\u0000\u0000\u00bd"+
		"\u00be\u0005\u0013\u0000\u0000\u00be\u00d2\u0003\u001e\u000f\u000b\u00bf"+
		"\u00c0\n\b\u0000\u0000\u00c0\u00c1\u0007\u0001\u0000\u0000\u00c1\u00d2"+
		"\u0003\u001e\u000f\t\u00c2\u00c3\n\u0007\u0000\u0000\u00c3\u00c4\u0007"+
		"\u0002\u0000\u0000\u00c4\u00d2\u0003\u001e\u000f\b\u00c5\u00c6\n\u0006"+
		"\u0000\u0000\u00c6\u00c7\u0007\u0003\u0000\u0000\u00c7\u00d2\u0003\u001e"+
		"\u000f\u0007\u00c8\u00c9\n\u0005\u0000\u0000\u00c9\u00ca\u0007\u0004\u0000"+
		"\u0000\u00ca\u00d2\u0003\u001e\u000f\u0006\u00cb\u00cc\n\u0004\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd\u00d2\u0003\u001e\u000f\u0005"+
		"\u00ce\u00cf\n\u0003\u0000\u0000\u00cf\u00d0\u0005\u0006\u0000\u0000\u00d0"+
		"\u00d2\u0003\u001e\u000f\u0004\u00d1\u00bc\u0001\u0000\u0000\u0000\u00d1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00d1\u00c2\u0001\u0000\u0000\u0000\u00d1"+
		"\u00c5\u0001\u0000\u0000\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d4\u001f\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0019\u0000\u0000\u00d7"+
		"\u00d8\u0003\u001e\u000f\u0000\u00d8\u00d9\u0005\u001a\u0000\u0000\u00d9"+
		"\u00e3\u0001\u0000\u0000\u0000\u00da\u00e3\u0003$\u0012\u0000\u00db\u00e3"+
		"\u0007\u0005\u0000\u0000\u00dc\u00e3\u0003\u001a\r\u0000\u00dd\u00e3\u0005"+
		"\'\u0000\u0000\u00de\u00e3\u0005*\u0000\u0000\u00df\u00e0\u0005-\u0000"+
		"\u0000\u00e0\u00e3\u0005*\u0000\u0000\u00e1\u00e3\u0005\u001d\u0000\u0000"+
		"\u00e2\u00d6\u0001\u0000\u0000\u0000\u00e2\u00da\u0001\u0000\u0000\u0000"+
		"\u00e2\u00db\u0001\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000\u0000"+
		"\u00e2\u00df\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3!\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u001e\u000f\u0000\u00e5"+
		"#\u0001\u0000\u0000\u0000\u00e6\u00e9\u0003&\u0013\u0000\u00e7\u00e9\u0003"+
		"(\u0014\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9%\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005(\u0000\u0000"+
		"\u00eb\'\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005)\u0000\u0000\u00ed"+
		")\u0001\u0000\u0000\u0000\u0015,.5;FP^cjx\u0089\u008d\u009d\u00a0\u00a5"+
		"\u00ae\u00ba\u00d1\u00d3\u00e2\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}