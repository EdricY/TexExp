// Generated from /home/CS/users/abell/.linux/Documents/TexExp/TexExp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TexExpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, OUT=34, ID=35, WS=36, BLOCKVAR=37, LETTER=38, DIGIT=39;
	public static final int
		RULE_prog = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_inlineVar = 3, 
		RULE_inlineDec = 4, RULE_inlineBody = 5, RULE_arrayDec = 6, RULE_decEntList = 7, 
		RULE_decEntity = 8, RULE_entity = 9, RULE_blockVar = 10, RULE_decVarRef = 11, 
		RULE_varRef = 12, RULE_iterRef = 13, RULE_iterSymbol = 14, RULE_methodCall = 15, 
		RULE_argList = 16, RULE_template = 17, RULE_templateElement = 18, RULE_ref = 19, 
		RULE_subtemplate = 20, RULE_string = 21, RULE_legalSymbol = 22, RULE_wsOrEndl = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declarations", "declaration", "inlineVar", "inlineDec", "inlineBody", 
			"arrayDec", "decEntList", "decEntity", "entity", "blockVar", "decVarRef", 
			"varRef", "iterRef", "iterSymbol", "methodCall", "argList", "template", 
			"templateElement", "ref", "subtemplate", "string", "legalSymbol", "wsOrEndl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", "'='", "'{'", "'}'", "','", "'$'", "'@'", "'.'", "'('", 
			"')'", "'!'", "'#'", "'%'", "'^'", "'&'", "'*'", "'_'", "'+'", "'-'", 
			"'['", "']'", "'\\'", "'|'", "'''", "'\"'", "';'", "':'", "'<'", "'>'", 
			"'?'", "'/'", "'`'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "OUT", "ID", 
			"WS", "BLOCKVAR", "LETTER", "DIGIT"
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
	public String getGrammarFileName() { return "TexExp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TexExpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode OUT() { return getToken(TexExpParser.OUT, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TexExpParser.EOF, 0); }
		public List<WsOrEndlContext> wsOrEndl() {
			return getRuleContexts(WsOrEndlContext.class);
		}
		public WsOrEndlContext wsOrEndl(int i) {
			return getRuleContext(WsOrEndlContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			declarations();
			setState(49);
			match(OUT);
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					wsOrEndl();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(56);
			template();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==WS) {
				{
				{
				setState(57);
				wsOrEndl();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ID:
			case BLOCKVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(65);
					match(T__0);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				declaration();
				setState(72);
				declarations();
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
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

	public static class DeclarationContext extends ParserRuleContext {
		public InlineVarContext inlineVar() {
			return getRuleContext(InlineVarContext.class,0);
		}
		public BlockVarContext blockVar() {
			return getRuleContext(BlockVarContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				inlineVar();
				}
				break;
			case BLOCKVAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				blockVar();
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

	public static class InlineVarContext extends ParserRuleContext {
		public InlineDecContext inlineDec() {
			return getRuleContext(InlineDecContext.class,0);
		}
		public InlineBodyContext inlineBody() {
			return getRuleContext(InlineBodyContext.class,0);
		}
		public InlineVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterInlineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitInlineVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitInlineVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineVarContext inlineVar() throws RecognitionException {
		InlineVarContext _localctx = new InlineVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inlineVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			inlineDec();
			setState(82);
			inlineBody();
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

	public static class InlineDecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TexExpParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(TexExpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TexExpParser.WS, i);
		}
		public InlineDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterInlineDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitInlineDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitInlineDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineDecContext inlineDec() throws RecognitionException {
		InlineDecContext _localctx = new InlineDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inlineDec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(85);
				match(WS);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(T__1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(WS);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class InlineBodyContext extends ParserRuleContext {
		public ArrayDecContext arrayDec() {
			return getRuleContext(ArrayDecContext.class,0);
		}
		public DecEntityContext decEntity() {
			return getRuleContext(DecEntityContext.class,0);
		}
		public InlineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterInlineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitInlineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitInlineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineBodyContext inlineBody() throws RecognitionException {
		InlineBodyContext _localctx = new InlineBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inlineBody);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				arrayDec();
				}
				break;
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
			case WS:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				decEntity();
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

	public static class ArrayDecContext extends ParserRuleContext {
		public DecEntListContext decEntList() {
			return getRuleContext(DecEntListContext.class,0);
		}
		public List<WsOrEndlContext> wsOrEndl() {
			return getRuleContexts(WsOrEndlContext.class);
		}
		public WsOrEndlContext wsOrEndl(int i) {
			return getRuleContext(WsOrEndlContext.class,i);
		}
		public ArrayDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterArrayDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitArrayDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitArrayDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDecContext arrayDec() throws RecognitionException {
		ArrayDecContext _localctx = new ArrayDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrayDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__2);
			setState(103);
			decEntList();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==WS) {
				{
				{
				setState(104);
				wsOrEndl();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__3);
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

	public static class DecEntListContext extends ParserRuleContext {
		public DecEntityContext decEntity() {
			return getRuleContext(DecEntityContext.class,0);
		}
		public DecEntListContext decEntList() {
			return getRuleContext(DecEntListContext.class,0);
		}
		public List<WsOrEndlContext> wsOrEndl() {
			return getRuleContexts(WsOrEndlContext.class);
		}
		public WsOrEndlContext wsOrEndl(int i) {
			return getRuleContext(WsOrEndlContext.class,i);
		}
		public DecEntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decEntList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterDecEntList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitDecEntList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitDecEntList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecEntListContext decEntList() throws RecognitionException {
		DecEntListContext _localctx = new DecEntListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decEntList);
		try {
			int _alt;
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(112);
						wsOrEndl();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(118);
				decEntity();
				setState(119);
				match(T__4);
				setState(120);
				decEntList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						wsOrEndl();
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(128);
				decEntity();
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

	public static class DecEntityContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecVarRefContext decVarRef() {
			return getRuleContext(DecVarRefContext.class,0);
		}
		public DecEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterDecEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitDecEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitDecEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecEntityContext decEntity() throws RecognitionException {
		DecEntityContext _localctx = new DecEntityContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decEntity);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
			case WS:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				string();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				decVarRef();
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

	public static class EntityContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entity);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
			case WS:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				string();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				ref();
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

	public static class BlockVarContext extends ParserRuleContext {
		public TerminalNode BLOCKVAR() { return getToken(TexExpParser.BLOCKVAR, 0); }
		public BlockVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterBlockVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitBlockVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitBlockVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockVarContext blockVar() throws RecognitionException {
		BlockVarContext _localctx = new BlockVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(BLOCKVAR);
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

	public static class DecVarRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TexExpParser.ID, 0); }
		public DecVarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVarRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterDecVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitDecVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitDecVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecVarRefContext decVarRef() throws RecognitionException {
		DecVarRefContext _localctx = new DecVarRefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decVarRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__5);
			setState(142);
			match(ID);
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

	public static class VarRefContext extends ParserRuleContext {
		public DecVarRefContext decVarRef() {
			return getRuleContext(DecVarRefContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			decVarRef();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(145);
				methodCall();
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

	public static class IterRefContext extends ParserRuleContext {
		public IterSymbolContext iterSymbol() {
			return getRuleContext(IterSymbolContext.class,0);
		}
		public TerminalNode ID() { return getToken(TexExpParser.ID, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IterRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterIterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitIterRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitIterRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterRefContext iterRef() throws RecognitionException {
		IterRefContext _localctx = new IterRefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iterRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			iterSymbol();
			setState(149);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(150);
				methodCall();
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

	public static class IterSymbolContext extends ParserRuleContext {
		public IterSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterIterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitIterSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitIterSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterSymbolContext iterSymbol() throws RecognitionException {
		IterSymbolContext _localctx = new IterSymbolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_iterSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				match(T__6);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TexExpParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__7);
			setState(159);
			match(ID);
			setState(160);
			match(T__8);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(161);
				argList();
				}
				break;
			}
			setState(164);
			match(T__9);
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

	public static class ArgListContext extends ParserRuleContext {
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public List<WsOrEndlContext> wsOrEndl() {
			return getRuleContexts(WsOrEndlContext.class);
		}
		public WsOrEndlContext wsOrEndl(int i) {
			return getRuleContext(WsOrEndlContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);
		try {
			int _alt;
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(166);
						wsOrEndl();
						}
						} 
					}
					setState(171);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(172);
				entity();
				setState(173);
				match(T__4);
				setState(174);
				argList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						wsOrEndl();
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(182);
				entity();
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

	public static class TemplateContext extends ParserRuleContext {
		public List<TemplateElementContext> templateElement() {
			return getRuleContexts(TemplateElementContext.class);
		}
		public TemplateElementContext templateElement(int i) {
			return getRuleContext(TemplateElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_template);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185);
					templateElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class TemplateElementContext extends ParserRuleContext {
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public SubtemplateContext subtemplate() {
			return getRuleContext(SubtemplateContext.class,0);
		}
		public TemplateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterTemplateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitTemplateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitTemplateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateElementContext templateElement() throws RecognitionException {
		TemplateElementContext _localctx = new TemplateElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_templateElement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case ID:
			case WS:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				entity();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				subtemplate();
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

	public static class RefContext extends ParserRuleContext {
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public IterRefContext iterRef() {
			return getRuleContext(IterRefContext.class,0);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ref);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				varRef();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				iterRef();
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

	public static class SubtemplateContext extends ParserRuleContext {
		public TerminalNode OUT() { return getToken(TexExpParser.OUT, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public List<WsOrEndlContext> wsOrEndl() {
			return getRuleContexts(WsOrEndlContext.class);
		}
		public WsOrEndlContext wsOrEndl(int i) {
			return getRuleContext(WsOrEndlContext.class,i);
		}
		public List<IterRefContext> iterRef() {
			return getRuleContexts(IterRefContext.class);
		}
		public IterRefContext iterRef(int i) {
			return getRuleContext(IterRefContext.class,i);
		}
		public SubtemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterSubtemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitSubtemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitSubtemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtemplateContext subtemplate() throws RecognitionException {
		SubtemplateContext _localctx = new SubtemplateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_subtemplate);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__2);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==WS) {
				{
				{
				setState(200);
				wsOrEndl();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				iterRef();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(207);
					wsOrEndl();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(217);
			match(OUT);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					wsOrEndl();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(224);
			template();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==WS) {
				{
				{
				setState(225);
				wsOrEndl();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(T__3);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TexExpParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TexExpParser.ID, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TexExpParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TexExpParser.DIGIT, i);
		}
		public List<TerminalNode> WS() { return getTokens(TexExpParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TexExpParser.WS, i);
		}
		public List<LegalSymbolContext> legalSymbol() {
			return getRuleContexts(LegalSymbolContext.class);
		}
		public LegalSymbolContext legalSymbol(int i) {
			return getRuleContext(LegalSymbolContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(237);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(233);
						match(ID);
						}
						break;
					case DIGIT:
						{
						setState(234);
						match(DIGIT);
						}
						break;
					case WS:
						{
						setState(235);
						match(WS);
						}
						break;
					case T__1:
					case T__3:
					case T__4:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__14:
					case T__15:
					case T__16:
					case T__17:
					case T__18:
					case T__19:
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
						{
						setState(236);
						legalSymbol();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class LegalSymbolContext extends ParserRuleContext {
		public LegalSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterLegalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitLegalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitLegalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LegalSymbolContext legalSymbol() throws RecognitionException {
		LegalSymbolContext _localctx = new LegalSymbolContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_legalSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class WsOrEndlContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TexExpParser.WS, 0); }
		public WsOrEndlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsOrEndl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).enterWsOrEndl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TexExpListener ) ((TexExpListener)listener).exitWsOrEndl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TexExpVisitor ) return ((TexExpVisitor<? extends T>)visitor).visitWsOrEndl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsOrEndlContext wsOrEndl() throws RecognitionException {
		WsOrEndlContext _localctx = new WsOrEndlContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wsOrEndl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==WS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4"+
		"\5\4R\n\4\3\5\3\5\3\5\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\7\6`\n"+
		"\6\f\6\16\6c\13\6\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b"+
		"\3\b\3\b\3\t\7\tt\n\t\f\t\16\tw\13\t\3\t\3\t\3\t\3\t\3\t\7\t~\n\t\f\t"+
		"\16\t\u0081\13\t\3\t\5\t\u0084\n\t\3\n\3\n\5\n\u0088\n\n\3\13\3\13\5\13"+
		"\u008c\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0095\n\16\3\17\3\17\3"+
		"\17\5\17\u009a\n\17\3\20\6\20\u009d\n\20\r\20\16\20\u009e\3\21\3\21\3"+
		"\21\3\21\5\21\u00a5\n\21\3\21\3\21\3\22\7\22\u00aa\n\22\f\22\16\22\u00ad"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b4\n\22\f\22\16\22\u00b7\13\22"+
		"\3\22\5\22\u00ba\n\22\3\23\6\23\u00bd\n\23\r\23\16\23\u00be\3\24\3\24"+
		"\3\24\5\24\u00c4\n\24\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\7\26\u00cc\n"+
		"\26\f\26\16\26\u00cf\13\26\3\26\3\26\7\26\u00d3\n\26\f\26\16\26\u00d6"+
		"\13\26\6\26\u00d8\n\26\r\26\16\26\u00d9\3\26\3\26\7\26\u00de\n\26\f\26"+
		"\16\26\u00e1\13\26\3\26\3\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\6\27\u00f0\n\27\r\27\16\27\u00f1\3\30\3\30"+
		"\3\31\3\31\3\31\3\u00f1\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\2\4\5\2\4\4\6\7\n#\4\2\3\3&&\2\u0101\2\62\3\2\2\2\4M\3\2\2\2"+
		"\6Q\3\2\2\2\bS\3\2\2\2\nV\3\2\2\2\ff\3\2\2\2\16h\3\2\2\2\20\u0083\3\2"+
		"\2\2\22\u0087\3\2\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2"+
		"\2\32\u0092\3\2\2\2\34\u0096\3\2\2\2\36\u009c\3\2\2\2 \u00a0\3\2\2\2\""+
		"\u00b9\3\2\2\2$\u00bc\3\2\2\2&\u00c3\3\2\2\2(\u00c7\3\2\2\2*\u00c9\3\2"+
		"\2\2,\u00ef\3\2\2\2.\u00f3\3\2\2\2\60\u00f5\3\2\2\2\62\63\5\4\3\2\63\67"+
		"\7$\2\2\64\66\5\60\31\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3"+
		"\2\2\28:\3\2\2\29\67\3\2\2\2:>\5$\23\2;=\5\60\31\2<;\3\2\2\2=@\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\2\2\3B\3\3\2\2\2CE\7\3\2"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\6\4"+
		"\2JK\5\4\3\2KN\3\2\2\2LN\3\2\2\2MF\3\2\2\2ML\3\2\2\2N\5\3\2\2\2OR\5\b"+
		"\5\2PR\5\26\f\2QO\3\2\2\2QP\3\2\2\2R\7\3\2\2\2ST\5\n\6\2TU\5\f\7\2U\t"+
		"\3\2\2\2VZ\7%\2\2WY\7&\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]"+
		"\3\2\2\2\\Z\3\2\2\2]a\7\4\2\2^`\7&\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2b\13\3\2\2\2ca\3\2\2\2dg\5\16\b\2eg\5\22\n\2fd\3\2\2\2fe\3\2"+
		"\2\2g\r\3\2\2\2hi\7\5\2\2im\5\20\t\2jl\5\60\31\2kj\3\2\2\2lo\3\2\2\2m"+
		"k\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\6\2\2q\17\3\2\2\2rt\5\60\31"+
		"\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\5\22"+
		"\n\2yz\7\7\2\2z{\5\20\t\2{\u0084\3\2\2\2|~\5\60\31\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0084\5\22\n\2\u0083u\3\2\2\2\u0083\177\3\2\2\2\u0084\21"+
		"\3\2\2\2\u0085\u0088\5,\27\2\u0086\u0088\5\30\r\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\23\3\2\2\2\u0089\u008c\5,\27\2\u008a\u008c"+
		"\5(\25\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\25\3\2\2\2\u008d"+
		"\u008e\7\'\2\2\u008e\27\3\2\2\2\u008f\u0090\7\b\2\2\u0090\u0091\7%\2\2"+
		"\u0091\31\3\2\2\2\u0092\u0094\5\30\r\2\u0093\u0095\5 \21\2\u0094\u0093"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097\5\36\20\2\u0097"+
		"\u0099\7%\2\2\u0098\u009a\5 \21\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\35\3\2\2\2\u009b\u009d\7\t\2\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\37\3\2\2\2\u00a0"+
		"\u00a1\7\n\2\2\u00a1\u00a2\7%\2\2\u00a2\u00a4\7\13\2\2\u00a3\u00a5\5\""+
		"\22\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7\f\2\2\u00a7!\3\2\2\2\u00a8\u00aa\5\60\31\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5\24\13\2\u00af\u00b0\7\7\2\2"+
		"\u00b0\u00b1\5\"\22\2\u00b1\u00ba\3\2\2\2\u00b2\u00b4\5\60\31\2\u00b3"+
		"\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5\24\13\2\u00b9"+
		"\u00ab\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00bd\5&\24\2"+
		"\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00c4\5\24\13\2\u00c1\u00c4\7\3\2\2\u00c2"+
		"\u00c4\5*\26\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\'\3\2\2\2\u00c5\u00c8\5\32\16\2\u00c6\u00c8\5\34\17\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8)\3\2\2\2\u00c9\u00cd\7\5\2\2"+
		"\u00ca\u00cc\5\60\31\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d7\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d4\5\34\17\2\u00d1\u00d3\5\60\31\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\7$\2\2\u00dc"+
		"\u00de\5\60\31\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e6\5$\23\2\u00e3\u00e5\5\60\31\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7\6\2\2\u00ea+\3\2\2\2\u00eb\u00f0\7%\2\2\u00ec"+
		"\u00f0\7)\2\2\u00ed\u00f0\7&\2\2\u00ee\u00f0\5.\30\2\u00ef\u00eb\3\2\2"+
		"\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2-\3\2\2\2\u00f3"+
		"\u00f4\t\2\2\2\u00f4/\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6\61\3\2\2\2!\67"+
		">FMQZafmu\177\u0083\u0087\u008b\u0094\u0099\u009e\u00a4\u00ab\u00b5\u00b9"+
		"\u00be\u00c3\u00c7\u00cd\u00d4\u00d9\u00df\u00e6\u00ef\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}