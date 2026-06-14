// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HTMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEA_WS=1, VOID=2, CLASS=3, EXTENDS=4, BASE_CLASS=5, STATE=6, CLASS_OPEN=7, 
		MAIN=8, AROW=9, RUNAPP=10, RUNAPP_OPEN=11, VOID_CLOSE=12, MAIN_CLASS=13, 
		RUNAPP_CLOSE=14, LEFT_BRAKETS=15, RIGHT_BRAKETS=16, CLASS_NAME=17, CLASS_NAME_END=18, 
		STATE_OPEN=19, STATE_CLASS=20, STATE_CLOSE=21, OVERRIDE=22, STATE_BODY=23, 
		CREAT_STATE=24, STATE_AROW=25, STATE_SIMI=26, WIDGET=27, BUILD=28, BUILD_OPEN=29, 
		BUILD_BODY_OPEN=30, CLASS_CLOSE=31, STATE_MAIN_CLASS=32, STATE_MAIN_CLASS_OPEN=33, 
		STATE_MAIN_CLASS_CLOSE=34, STATE_MAIN_CLASS_SIMI=35, BUILDCONTEXT=36, 
		BUILD_CLOSE=37, CONTEXT=38, RETURN=39, MATERIALAPP=40, MATERIALAPP_OPEN=41, 
		MATERIAL_SIMI=42, BUILD_BODY_CLOSE=43, HOME=44, DOT=45, MATERIALAPP_CLOSE=46, 
		HOME_CLASS=47, HOME_CLASS_OPEN=48, HOME_CLASS_END=49, BODY=50, BODY_DOT=51, 
		COLUMN=52, ROW=53, BODY_END=54, COLUMN_ROW_OPEN=55, HOME_CLASS_CLOSE=56, 
		CHILDREN=57, CHILDREN_DOT=58, CHILDREN_OPEN=59, CHILDREN_END=60, COLUMN_ROW_CLOSE=61, 
		STACK=62, CONTAINER=63, CHILD_OPEN=64, NESTED_CHILDREN=65, CHILD_CLOSE=66, 
		CHILD_END=67, CHILDREN_CLOSE=68, NESTED_CHILDREN_DOT=69, NESTED_CHILDREN_OPEN=70, 
		NESTED_CHILDREN_END=71, NESTED_CONTAINER=72, NESTED_CONTAINER_END=73, 
		NESTED_CHILDREN_CLOSE=74, CONTAINER_OPEN=75, CONTAINER_CHILD_END=76, CHILD=77, 
		CHILD_DOT=78, ATTRIBUT=79, SINGLE_DOT=80, FLOATINGACTIONBUTTON=81, NETWOEK=82, 
		ATTRIBUT_OPEN=83, ATTRIBUT_END=84, CONTAINER_CLOSE=85, ATTRIBUT_DESCRIPTION=86, 
		ATTRIBUT_CLOSE=87, BUTTON_OPEN=88, ONPRESSED=89, ONPRESSED_BODY_OPEN=90, 
		BUTTON_CLOSE=91, ONPRESSED_DOT=92, ONPRESSED_OPEN=93, ONPRESSED_CLOSE=94, 
		NAVIGATOR=95, NAVIGATOR_DOT=96, PUSH=97, PUSH_OPEN=98, NAVIGATOR_SIMI=99, 
		ONPRESSED_BODY_CLOSE=100, NAVIGATOR_CONTEXT=101, NAVIGATOR_CONTEXT_SIMI=102, 
		PUSH_CLOSE=103, MATERIALPAGEROUTE=104, MATERIALPAGEROUTE_OPEN=105, BUILDER=106, 
		BUILDER_DOT=107, MATERIALPAGEROUTE_BODY_OPEN=108, MATERIALPAGEROUTE_CLOSE=109, 
		NAVIGATOR_CONTEXT_END=110, BUILDER_OPEN=111, BUILDER_BUILDCONTEXT=112, 
		BUILDER_CLOSE=113, BUILDER_CONTEXT=114, MATERIALPAGEROUTE_RETURN=115, 
		MATERIALPAGEROUTE_BODY_CLOSE=116, TARGET_CLASS=117, TARGET_CLASS_OPEN=118, 
		TARGET_CLASS_CLOSE=119, MATERIALPAGEROUTE_RETURN_SIMI=120, WHITESPACE1=121;
	public static final int
		RULE_main = 0, RULE_void = 1, RULE_class = 2, RULE_extend_class = 3, RULE_class_body = 4, 
		RULE_state = 5, RULE_widget = 6, RULE_build_brakets = 7, RULE_build_body = 8, 
		RULE_material_body = 9, RULE_home_body = 10, RULE_colum_row_body = 11, 
		RULE_children_body = 12, RULE_stacks = 13, RULE_stack = 14, RULE_stack_body = 15, 
		RULE_neted_children_body = 16, RULE_nested_containers = 17, RULE_nested_container_body = 18, 
		RULE_attribut = 19, RULE_img = 20, RULE_text = 21, RULE_nav = 22, RULE_onpress_body = 23, 
		RULE_push_body = 24, RULE_builder_brakets = 25, RULE_material_page_rout_body = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "void", "class", "extend_class", "class_body", "state", "widget", 
			"build_brakets", "build_body", "material_body", "home_body", "colum_row_body", 
			"children_body", "stacks", "stack", "stack_body", "neted_children_body", 
			"nested_containers", "nested_container_body", "attribut", "img", "text", 
			"nav", "onpress_body", "push_body", "builder_brakets", "material_page_rout_body"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEA_WS", "VOID", "CLASS", "EXTENDS", "BASE_CLASS", "STATE", "CLASS_OPEN", 
			"MAIN", "AROW", "RUNAPP", "RUNAPP_OPEN", "VOID_CLOSE", "MAIN_CLASS", 
			"RUNAPP_CLOSE", "LEFT_BRAKETS", "RIGHT_BRAKETS", "CLASS_NAME", "CLASS_NAME_END", 
			"STATE_OPEN", "STATE_CLASS", "STATE_CLOSE", "OVERRIDE", "STATE_BODY", 
			"CREAT_STATE", "STATE_AROW", "STATE_SIMI", "WIDGET", "BUILD", "BUILD_OPEN", 
			"BUILD_BODY_OPEN", "CLASS_CLOSE", "STATE_MAIN_CLASS", "STATE_MAIN_CLASS_OPEN", 
			"STATE_MAIN_CLASS_CLOSE", "STATE_MAIN_CLASS_SIMI", "BUILDCONTEXT", "BUILD_CLOSE", 
			"CONTEXT", "RETURN", "MATERIALAPP", "MATERIALAPP_OPEN", "MATERIAL_SIMI", 
			"BUILD_BODY_CLOSE", "HOME", "DOT", "MATERIALAPP_CLOSE", "HOME_CLASS", 
			"HOME_CLASS_OPEN", "HOME_CLASS_END", "BODY", "BODY_DOT", "COLUMN", "ROW", 
			"BODY_END", "COLUMN_ROW_OPEN", "HOME_CLASS_CLOSE", "CHILDREN", "CHILDREN_DOT", 
			"CHILDREN_OPEN", "CHILDREN_END", "COLUMN_ROW_CLOSE", "STACK", "CONTAINER", 
			"CHILD_OPEN", "NESTED_CHILDREN", "CHILD_CLOSE", "CHILD_END", "CHILDREN_CLOSE", 
			"NESTED_CHILDREN_DOT", "NESTED_CHILDREN_OPEN", "NESTED_CHILDREN_END", 
			"NESTED_CONTAINER", "NESTED_CONTAINER_END", "NESTED_CHILDREN_CLOSE", 
			"CONTAINER_OPEN", "CONTAINER_CHILD_END", "CHILD", "CHILD_DOT", "ATTRIBUT", 
			"SINGLE_DOT", "FLOATINGACTIONBUTTON", "NETWOEK", "ATTRIBUT_OPEN", "ATTRIBUT_END", 
			"CONTAINER_CLOSE", "ATTRIBUT_DESCRIPTION", "ATTRIBUT_CLOSE", "BUTTON_OPEN", 
			"ONPRESSED", "ONPRESSED_BODY_OPEN", "BUTTON_CLOSE", "ONPRESSED_DOT", 
			"ONPRESSED_OPEN", "ONPRESSED_CLOSE", "NAVIGATOR", "NAVIGATOR_DOT", "PUSH", 
			"PUSH_OPEN", "NAVIGATOR_SIMI", "ONPRESSED_BODY_CLOSE", "NAVIGATOR_CONTEXT", 
			"NAVIGATOR_CONTEXT_SIMI", "PUSH_CLOSE", "MATERIALPAGEROUTE", "MATERIALPAGEROUTE_OPEN", 
			"BUILDER", "BUILDER_DOT", "MATERIALPAGEROUTE_BODY_OPEN", "MATERIALPAGEROUTE_CLOSE", 
			"NAVIGATOR_CONTEXT_END", "BUILDER_OPEN", "BUILDER_BUILDCONTEXT", "BUILDER_CLOSE", 
			"BUILDER_CONTEXT", "MATERIALPAGEROUTE_RETURN", "MATERIALPAGEROUTE_BODY_CLOSE", 
			"TARGET_CLASS", "TARGET_CLASS_OPEN", "TARGET_CLASS_CLOSE", "MATERIALPAGEROUTE_RETURN_SIMI", 
			"WHITESPACE1"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public VoidContext void_() {
			return getRuleContext(VoidContext.class,0);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			void_();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(55);
				class_();
				}
				}
				setState(60);
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
	public static class VoidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(HTMLParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(HTMLParser.MAIN, 0); }
		public TerminalNode AROW() { return getToken(HTMLParser.AROW, 0); }
		public TerminalNode RUNAPP() { return getToken(HTMLParser.RUNAPP, 0); }
		public TerminalNode RUNAPP_OPEN() { return getToken(HTMLParser.RUNAPP_OPEN, 0); }
		public TerminalNode MAIN_CLASS() { return getToken(HTMLParser.MAIN_CLASS, 0); }
		public TerminalNode LEFT_BRAKETS() { return getToken(HTMLParser.LEFT_BRAKETS, 0); }
		public TerminalNode RIGHT_BRAKETS() { return getToken(HTMLParser.RIGHT_BRAKETS, 0); }
		public TerminalNode RUNAPP_CLOSE() { return getToken(HTMLParser.RUNAPP_CLOSE, 0); }
		public TerminalNode VOID_CLOSE() { return getToken(HTMLParser.VOID_CLOSE, 0); }
		public VoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidContext void_() throws RecognitionException {
		VoidContext _localctx = new VoidContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VOID);
			setState(62);
			match(MAIN);
			setState(63);
			match(AROW);
			setState(64);
			match(RUNAPP);
			setState(65);
			match(RUNAPP_OPEN);
			setState(66);
			match(MAIN_CLASS);
			setState(67);
			match(LEFT_BRAKETS);
			setState(68);
			match(RIGHT_BRAKETS);
			setState(69);
			match(RUNAPP_CLOSE);
			setState(70);
			match(VOID_CLOSE);
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
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HTMLParser.CLASS, 0); }
		public TerminalNode CLASS_NAME() { return getToken(HTMLParser.CLASS_NAME, 0); }
		public TerminalNode CLASS_NAME_END() { return getToken(HTMLParser.CLASS_NAME_END, 0); }
		public TerminalNode EXTENDS() { return getToken(HTMLParser.EXTENDS, 0); }
		public Extend_classContext extend_class() {
			return getRuleContext(Extend_classContext.class,0);
		}
		public TerminalNode CLASS_OPEN() { return getToken(HTMLParser.CLASS_OPEN, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode CLASS_CLOSE() { return getToken(HTMLParser.CLASS_CLOSE, 0); }
		public TerminalNode STATE_OPEN() { return getToken(HTMLParser.STATE_OPEN, 0); }
		public TerminalNode STATE_CLASS() { return getToken(HTMLParser.STATE_CLASS, 0); }
		public TerminalNode STATE_CLOSE() { return getToken(HTMLParser.STATE_CLOSE, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CLASS);
			setState(73);
			match(CLASS_NAME);
			setState(74);
			match(CLASS_NAME_END);
			setState(75);
			match(EXTENDS);
			setState(76);
			extend_class();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_OPEN) {
				{
				setState(77);
				match(STATE_OPEN);
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_CLASS) {
				{
				setState(80);
				match(STATE_CLASS);
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATE_CLOSE) {
				{
				setState(83);
				match(STATE_CLOSE);
				}
			}

			setState(86);
			match(CLASS_OPEN);
			setState(87);
			class_body();
			setState(88);
			match(CLASS_CLOSE);
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
	public static class Extend_classContext extends ParserRuleContext {
		public TerminalNode BASE_CLASS() { return getToken(HTMLParser.BASE_CLASS, 0); }
		public TerminalNode STATE() { return getToken(HTMLParser.STATE, 0); }
		public Extend_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extend_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterExtend_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitExtend_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitExtend_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extend_classContext extend_class() throws RecognitionException {
		Extend_classContext _localctx = new Extend_classContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_extend_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==BASE_CLASS || _la==STATE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public WidgetContext widget() {
			return getRuleContext(WidgetContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(HTMLParser.OVERRIDE, 0); }
		public StateContext state() {
			return getRuleContext(StateContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_body);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OVERRIDE:
			case WIDGET:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERRIDE) {
					{
					setState(92);
					match(OVERRIDE);
					}
				}

				setState(95);
				widget();
				}
				break;
			case STATE_BODY:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				state();
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
	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE_BODY() { return getToken(HTMLParser.STATE_BODY, 0); }
		public TerminalNode STATE_OPEN() { return getToken(HTMLParser.STATE_OPEN, 0); }
		public TerminalNode STATE_CLASS() { return getToken(HTMLParser.STATE_CLASS, 0); }
		public TerminalNode STATE_CLOSE() { return getToken(HTMLParser.STATE_CLOSE, 0); }
		public TerminalNode CREAT_STATE() { return getToken(HTMLParser.CREAT_STATE, 0); }
		public TerminalNode STATE_AROW() { return getToken(HTMLParser.STATE_AROW, 0); }
		public TerminalNode STATE_MAIN_CLASS() { return getToken(HTMLParser.STATE_MAIN_CLASS, 0); }
		public TerminalNode STATE_MAIN_CLASS_OPEN() { return getToken(HTMLParser.STATE_MAIN_CLASS_OPEN, 0); }
		public TerminalNode STATE_MAIN_CLASS_CLOSE() { return getToken(HTMLParser.STATE_MAIN_CLASS_CLOSE, 0); }
		public TerminalNode STATE_MAIN_CLASS_SIMI() { return getToken(HTMLParser.STATE_MAIN_CLASS_SIMI, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(STATE_BODY);
			setState(100);
			match(STATE_OPEN);
			setState(101);
			match(STATE_CLASS);
			setState(102);
			match(STATE_CLOSE);
			setState(103);
			match(CREAT_STATE);
			setState(104);
			match(STATE_AROW);
			setState(105);
			match(STATE_MAIN_CLASS);
			setState(106);
			match(STATE_MAIN_CLASS_OPEN);
			setState(107);
			match(STATE_MAIN_CLASS_CLOSE);
			setState(108);
			match(STATE_MAIN_CLASS_SIMI);
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
	public static class WidgetContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(HTMLParser.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(HTMLParser.BUILD, 0); }
		public TerminalNode BUILD_OPEN() { return getToken(HTMLParser.BUILD_OPEN, 0); }
		public Build_braketsContext build_brakets() {
			return getRuleContext(Build_braketsContext.class,0);
		}
		public TerminalNode BUILD_CLOSE() { return getToken(HTMLParser.BUILD_CLOSE, 0); }
		public TerminalNode BUILD_BODY_OPEN() { return getToken(HTMLParser.BUILD_BODY_OPEN, 0); }
		public Build_bodyContext build_body() {
			return getRuleContext(Build_bodyContext.class,0);
		}
		public TerminalNode BUILD_BODY_CLOSE() { return getToken(HTMLParser.BUILD_BODY_CLOSE, 0); }
		public WidgetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterWidget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitWidget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitWidget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetContext widget() throws RecognitionException {
		WidgetContext _localctx = new WidgetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_widget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(WIDGET);
			setState(111);
			match(BUILD);
			setState(112);
			match(BUILD_OPEN);
			setState(113);
			build_brakets();
			setState(114);
			match(BUILD_CLOSE);
			setState(115);
			match(BUILD_BODY_OPEN);
			setState(116);
			build_body();
			setState(117);
			match(BUILD_BODY_CLOSE);
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
	public static class Build_braketsContext extends ParserRuleContext {
		public TerminalNode BUILDCONTEXT() { return getToken(HTMLParser.BUILDCONTEXT, 0); }
		public TerminalNode CONTEXT() { return getToken(HTMLParser.CONTEXT, 0); }
		public Build_braketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_brakets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBuild_brakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBuild_brakets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBuild_brakets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_braketsContext build_brakets() throws RecognitionException {
		Build_braketsContext _localctx = new Build_braketsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_build_brakets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(BUILDCONTEXT);
			setState(120);
			match(CONTEXT);
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
	public static class Build_bodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HTMLParser.RETURN, 0); }
		public TerminalNode MATERIALAPP() { return getToken(HTMLParser.MATERIALAPP, 0); }
		public TerminalNode MATERIALAPP_OPEN() { return getToken(HTMLParser.MATERIALAPP_OPEN, 0); }
		public Material_bodyContext material_body() {
			return getRuleContext(Material_bodyContext.class,0);
		}
		public TerminalNode MATERIALAPP_CLOSE() { return getToken(HTMLParser.MATERIALAPP_CLOSE, 0); }
		public TerminalNode MATERIAL_SIMI() { return getToken(HTMLParser.MATERIAL_SIMI, 0); }
		public Build_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBuild_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBuild_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBuild_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_bodyContext build_body() throws RecognitionException {
		Build_bodyContext _localctx = new Build_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_build_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(RETURN);
			setState(123);
			match(MATERIALAPP);
			setState(124);
			match(MATERIALAPP_OPEN);
			setState(125);
			material_body();
			setState(126);
			match(MATERIALAPP_CLOSE);
			setState(127);
			match(MATERIAL_SIMI);
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
	public static class Material_bodyContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(HTMLParser.HOME, 0); }
		public TerminalNode DOT() { return getToken(HTMLParser.DOT, 0); }
		public TerminalNode HOME_CLASS() { return getToken(HTMLParser.HOME_CLASS, 0); }
		public TerminalNode HOME_CLASS_OPEN() { return getToken(HTMLParser.HOME_CLASS_OPEN, 0); }
		public TerminalNode HOME_CLASS_CLOSE() { return getToken(HTMLParser.HOME_CLASS_CLOSE, 0); }
		public TerminalNode HOME_CLASS_END() { return getToken(HTMLParser.HOME_CLASS_END, 0); }
		public Home_bodyContext home_body() {
			return getRuleContext(Home_bodyContext.class,0);
		}
		public Material_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_material_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMaterial_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMaterial_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMaterial_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Material_bodyContext material_body() throws RecognitionException {
		Material_bodyContext _localctx = new Material_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_material_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(HOME);
			setState(130);
			match(DOT);
			setState(131);
			match(HOME_CLASS);
			setState(132);
			match(HOME_CLASS_OPEN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BODY) {
				{
				setState(133);
				home_body();
				}
			}

			setState(136);
			match(HOME_CLASS_CLOSE);
			setState(137);
			match(HOME_CLASS_END);
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
	public static class Home_bodyContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(HTMLParser.BODY, 0); }
		public TerminalNode BODY_DOT() { return getToken(HTMLParser.BODY_DOT, 0); }
		public TerminalNode COLUMN_ROW_OPEN() { return getToken(HTMLParser.COLUMN_ROW_OPEN, 0); }
		public TerminalNode COLUMN_ROW_CLOSE() { return getToken(HTMLParser.COLUMN_ROW_CLOSE, 0); }
		public TerminalNode BODY_END() { return getToken(HTMLParser.BODY_END, 0); }
		public TerminalNode COLUMN() { return getToken(HTMLParser.COLUMN, 0); }
		public TerminalNode ROW() { return getToken(HTMLParser.ROW, 0); }
		public Colum_row_bodyContext colum_row_body() {
			return getRuleContext(Colum_row_bodyContext.class,0);
		}
		public Home_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_home_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterHome_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitHome_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitHome_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Home_bodyContext home_body() throws RecognitionException {
		Home_bodyContext _localctx = new Home_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_home_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(BODY);
			setState(140);
			match(BODY_DOT);
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==COLUMN || _la==ROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(COLUMN_ROW_OPEN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHILDREN) {
				{
				setState(143);
				colum_row_body();
				}
			}

			setState(146);
			match(COLUMN_ROW_CLOSE);
			setState(147);
			match(BODY_END);
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
	public static class Colum_row_bodyContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(HTMLParser.CHILDREN, 0); }
		public TerminalNode CHILDREN_DOT() { return getToken(HTMLParser.CHILDREN_DOT, 0); }
		public TerminalNode CHILDREN_OPEN() { return getToken(HTMLParser.CHILDREN_OPEN, 0); }
		public Children_bodyContext children_body() {
			return getRuleContext(Children_bodyContext.class,0);
		}
		public TerminalNode CHILDREN_CLOSE() { return getToken(HTMLParser.CHILDREN_CLOSE, 0); }
		public TerminalNode CHILDREN_END() { return getToken(HTMLParser.CHILDREN_END, 0); }
		public Colum_row_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colum_row_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterColum_row_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitColum_row_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitColum_row_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Colum_row_bodyContext colum_row_body() throws RecognitionException {
		Colum_row_bodyContext _localctx = new Colum_row_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_colum_row_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CHILDREN);
			setState(150);
			match(CHILDREN_DOT);
			setState(151);
			match(CHILDREN_OPEN);
			setState(152);
			children_body();
			setState(153);
			match(CHILDREN_CLOSE);
			setState(154);
			match(CHILDREN_END);
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
	public static class Children_bodyContext extends ParserRuleContext {
		public StacksContext stacks() {
			return getRuleContext(StacksContext.class,0);
		}
		public Neted_children_bodyContext neted_children_body() {
			return getRuleContext(Neted_children_bodyContext.class,0);
		}
		public Children_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterChildren_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitChildren_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitChildren_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Children_bodyContext children_body() throws RecognitionException {
		Children_bodyContext _localctx = new Children_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_children_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(156);
				stacks();
				}
				break;
			case 2:
				{
				setState(157);
				neted_children_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StacksContext extends ParserRuleContext {
		public List<StackContext> stack() {
			return getRuleContexts(StackContext.class);
		}
		public StackContext stack(int i) {
			return getRuleContext(StackContext.class,i);
		}
		public StacksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stacks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStacks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStacks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStacks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StacksContext stacks() throws RecognitionException {
		StacksContext _localctx = new StacksContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stacks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STACK) {
				{
				{
				setState(160);
				stack();
				}
				}
				setState(165);
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
	public static class StackContext extends ParserRuleContext {
		public TerminalNode STACK() { return getToken(HTMLParser.STACK, 0); }
		public TerminalNode CHILD_OPEN() { return getToken(HTMLParser.CHILD_OPEN, 0); }
		public TerminalNode CHILD_CLOSE() { return getToken(HTMLParser.CHILD_CLOSE, 0); }
		public TerminalNode CHILD_END() { return getToken(HTMLParser.CHILD_END, 0); }
		public Stack_bodyContext stack_body() {
			return getRuleContext(Stack_bodyContext.class,0);
		}
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stack);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(STACK);
			setState(167);
			match(CHILD_OPEN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NESTED_CHILDREN) {
				{
				setState(168);
				stack_body();
				}
			}

			setState(171);
			match(CHILD_CLOSE);
			setState(172);
			match(CHILD_END);
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
	public static class Stack_bodyContext extends ParserRuleContext {
		public TerminalNode NESTED_CHILDREN() { return getToken(HTMLParser.NESTED_CHILDREN, 0); }
		public TerminalNode NESTED_CHILDREN_DOT() { return getToken(HTMLParser.NESTED_CHILDREN_DOT, 0); }
		public TerminalNode NESTED_CHILDREN_OPEN() { return getToken(HTMLParser.NESTED_CHILDREN_OPEN, 0); }
		public Neted_children_bodyContext neted_children_body() {
			return getRuleContext(Neted_children_bodyContext.class,0);
		}
		public TerminalNode NESTED_CHILDREN_CLOSE() { return getToken(HTMLParser.NESTED_CHILDREN_CLOSE, 0); }
		public TerminalNode NESTED_CHILDREN_END() { return getToken(HTMLParser.NESTED_CHILDREN_END, 0); }
		public Stack_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterStack_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitStack_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitStack_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stack_bodyContext stack_body() throws RecognitionException {
		Stack_bodyContext _localctx = new Stack_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stack_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NESTED_CHILDREN);
			setState(175);
			match(NESTED_CHILDREN_DOT);
			setState(176);
			match(NESTED_CHILDREN_OPEN);
			setState(177);
			neted_children_body();
			setState(178);
			match(NESTED_CHILDREN_CLOSE);
			setState(179);
			match(NESTED_CHILDREN_END);
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
	public static class Neted_children_bodyContext extends ParserRuleContext {
		public List<Nested_containersContext> nested_containers() {
			return getRuleContexts(Nested_containersContext.class);
		}
		public Nested_containersContext nested_containers(int i) {
			return getRuleContext(Nested_containersContext.class,i);
		}
		public Neted_children_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neted_children_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNeted_children_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNeted_children_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNeted_children_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Neted_children_bodyContext neted_children_body() throws RecognitionException {
		Neted_children_bodyContext _localctx = new Neted_children_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_neted_children_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONTAINER || _la==NESTED_CONTAINER) {
				{
				{
				setState(181);
				nested_containers();
				}
				}
				setState(186);
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
	public static class Nested_containersContext extends ParserRuleContext {
		public TerminalNode CONTAINER_OPEN() { return getToken(HTMLParser.CONTAINER_OPEN, 0); }
		public Nested_container_bodyContext nested_container_body() {
			return getRuleContext(Nested_container_bodyContext.class,0);
		}
		public TerminalNode CONTAINER_CLOSE() { return getToken(HTMLParser.CONTAINER_CLOSE, 0); }
		public TerminalNode CONTAINER_CHILD_END() { return getToken(HTMLParser.CONTAINER_CHILD_END, 0); }
		public TerminalNode NESTED_CONTAINER() { return getToken(HTMLParser.NESTED_CONTAINER, 0); }
		public TerminalNode CONTAINER() { return getToken(HTMLParser.CONTAINER, 0); }
		public Nested_containersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_containers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNested_containers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNested_containers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNested_containers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_containersContext nested_containers() throws RecognitionException {
		Nested_containersContext _localctx = new Nested_containersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nested_containers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==CONTAINER || _la==NESTED_CONTAINER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			match(CONTAINER_OPEN);
			setState(189);
			nested_container_body();
			setState(190);
			match(CONTAINER_CLOSE);
			setState(191);
			match(CONTAINER_CHILD_END);
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
	public static class Nested_container_bodyContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(HTMLParser.CHILD, 0); }
		public TerminalNode CHILD_DOT() { return getToken(HTMLParser.CHILD_DOT, 0); }
		public AttributContext attribut() {
			return getRuleContext(AttributContext.class,0);
		}
		public NavContext nav() {
			return getRuleContext(NavContext.class,0);
		}
		public Nested_container_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_container_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNested_container_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNested_container_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNested_container_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nested_container_bodyContext nested_container_body() throws RecognitionException {
		Nested_container_bodyContext _localctx = new Nested_container_bodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nested_container_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CHILD);
			setState(194);
			match(CHILD_DOT);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTRIBUT:
				{
				setState(195);
				attribut();
				}
				break;
			case FLOATINGACTIONBUTTON:
				{
				setState(196);
				nav();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AttributContext extends ParserRuleContext {
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AttributContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterAttribut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitAttribut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitAttribut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributContext attribut() throws RecognitionException {
		AttributContext _localctx = new AttributContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribut);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				img();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				text();
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
	public static class ImgContext extends ParserRuleContext {
		public TerminalNode ATTRIBUT() { return getToken(HTMLParser.ATTRIBUT, 0); }
		public TerminalNode SINGLE_DOT() { return getToken(HTMLParser.SINGLE_DOT, 0); }
		public TerminalNode NETWOEK() { return getToken(HTMLParser.NETWOEK, 0); }
		public TerminalNode ATTRIBUT_OPEN() { return getToken(HTMLParser.ATTRIBUT_OPEN, 0); }
		public TerminalNode ATTRIBUT_DESCRIPTION() { return getToken(HTMLParser.ATTRIBUT_DESCRIPTION, 0); }
		public TerminalNode ATTRIBUT_CLOSE() { return getToken(HTMLParser.ATTRIBUT_CLOSE, 0); }
		public TerminalNode ATTRIBUT_END() { return getToken(HTMLParser.ATTRIBUT_END, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ATTRIBUT);
			setState(204);
			match(SINGLE_DOT);
			setState(205);
			match(NETWOEK);
			setState(206);
			match(ATTRIBUT_OPEN);
			setState(207);
			match(ATTRIBUT_DESCRIPTION);
			setState(208);
			match(ATTRIBUT_CLOSE);
			setState(209);
			match(ATTRIBUT_END);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode ATTRIBUT() { return getToken(HTMLParser.ATTRIBUT, 0); }
		public TerminalNode ATTRIBUT_OPEN() { return getToken(HTMLParser.ATTRIBUT_OPEN, 0); }
		public TerminalNode ATTRIBUT_DESCRIPTION() { return getToken(HTMLParser.ATTRIBUT_DESCRIPTION, 0); }
		public TerminalNode ATTRIBUT_CLOSE() { return getToken(HTMLParser.ATTRIBUT_CLOSE, 0); }
		public TerminalNode ATTRIBUT_END() { return getToken(HTMLParser.ATTRIBUT_END, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ATTRIBUT);
			setState(212);
			match(ATTRIBUT_OPEN);
			setState(213);
			match(ATTRIBUT_DESCRIPTION);
			setState(214);
			match(ATTRIBUT_CLOSE);
			setState(215);
			match(ATTRIBUT_END);
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
	public static class NavContext extends ParserRuleContext {
		public TerminalNode FLOATINGACTIONBUTTON() { return getToken(HTMLParser.FLOATINGACTIONBUTTON, 0); }
		public TerminalNode BUTTON_OPEN() { return getToken(HTMLParser.BUTTON_OPEN, 0); }
		public TerminalNode ONPRESSED() { return getToken(HTMLParser.ONPRESSED, 0); }
		public TerminalNode ONPRESSED_DOT() { return getToken(HTMLParser.ONPRESSED_DOT, 0); }
		public TerminalNode ONPRESSED_OPEN() { return getToken(HTMLParser.ONPRESSED_OPEN, 0); }
		public TerminalNode ONPRESSED_CLOSE() { return getToken(HTMLParser.ONPRESSED_CLOSE, 0); }
		public TerminalNode ONPRESSED_BODY_OPEN() { return getToken(HTMLParser.ONPRESSED_BODY_OPEN, 0); }
		public Onpress_bodyContext onpress_body() {
			return getRuleContext(Onpress_bodyContext.class,0);
		}
		public TerminalNode ONPRESSED_BODY_CLOSE() { return getToken(HTMLParser.ONPRESSED_BODY_CLOSE, 0); }
		public TerminalNode BUTTON_CLOSE() { return getToken(HTMLParser.BUTTON_CLOSE, 0); }
		public NavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nav; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterNav(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitNav(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitNav(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavContext nav() throws RecognitionException {
		NavContext _localctx = new NavContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nav);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(FLOATINGACTIONBUTTON);
			setState(218);
			match(BUTTON_OPEN);
			setState(219);
			match(ONPRESSED);
			setState(220);
			match(ONPRESSED_DOT);
			setState(221);
			match(ONPRESSED_OPEN);
			setState(222);
			match(ONPRESSED_CLOSE);
			setState(223);
			match(ONPRESSED_BODY_OPEN);
			setState(224);
			onpress_body();
			setState(225);
			match(ONPRESSED_BODY_CLOSE);
			setState(226);
			match(BUTTON_CLOSE);
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
	public static class Onpress_bodyContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR() { return getToken(HTMLParser.NAVIGATOR, 0); }
		public TerminalNode NAVIGATOR_DOT() { return getToken(HTMLParser.NAVIGATOR_DOT, 0); }
		public TerminalNode PUSH() { return getToken(HTMLParser.PUSH, 0); }
		public TerminalNode PUSH_OPEN() { return getToken(HTMLParser.PUSH_OPEN, 0); }
		public Push_bodyContext push_body() {
			return getRuleContext(Push_bodyContext.class,0);
		}
		public TerminalNode PUSH_CLOSE() { return getToken(HTMLParser.PUSH_CLOSE, 0); }
		public TerminalNode NAVIGATOR_SIMI() { return getToken(HTMLParser.NAVIGATOR_SIMI, 0); }
		public Onpress_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onpress_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterOnpress_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitOnpress_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitOnpress_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Onpress_bodyContext onpress_body() throws RecognitionException {
		Onpress_bodyContext _localctx = new Onpress_bodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_onpress_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(NAVIGATOR);
			setState(229);
			match(NAVIGATOR_DOT);
			setState(230);
			match(PUSH);
			setState(231);
			match(PUSH_OPEN);
			setState(232);
			push_body();
			setState(233);
			match(PUSH_CLOSE);
			setState(234);
			match(NAVIGATOR_SIMI);
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
	public static class Push_bodyContext extends ParserRuleContext {
		public TerminalNode NAVIGATOR_CONTEXT() { return getToken(HTMLParser.NAVIGATOR_CONTEXT, 0); }
		public TerminalNode NAVIGATOR_CONTEXT_SIMI() { return getToken(HTMLParser.NAVIGATOR_CONTEXT_SIMI, 0); }
		public TerminalNode MATERIALPAGEROUTE() { return getToken(HTMLParser.MATERIALPAGEROUTE, 0); }
		public TerminalNode MATERIALPAGEROUTE_OPEN() { return getToken(HTMLParser.MATERIALPAGEROUTE_OPEN, 0); }
		public TerminalNode BUILDER() { return getToken(HTMLParser.BUILDER, 0); }
		public TerminalNode BUILDER_DOT() { return getToken(HTMLParser.BUILDER_DOT, 0); }
		public TerminalNode BUILDER_OPEN() { return getToken(HTMLParser.BUILDER_OPEN, 0); }
		public Builder_braketsContext builder_brakets() {
			return getRuleContext(Builder_braketsContext.class,0);
		}
		public TerminalNode BUILDER_CLOSE() { return getToken(HTMLParser.BUILDER_CLOSE, 0); }
		public TerminalNode MATERIALPAGEROUTE_BODY_OPEN() { return getToken(HTMLParser.MATERIALPAGEROUTE_BODY_OPEN, 0); }
		public Material_page_rout_bodyContext material_page_rout_body() {
			return getRuleContext(Material_page_rout_bodyContext.class,0);
		}
		public TerminalNode MATERIALPAGEROUTE_BODY_CLOSE() { return getToken(HTMLParser.MATERIALPAGEROUTE_BODY_CLOSE, 0); }
		public TerminalNode MATERIALPAGEROUTE_CLOSE() { return getToken(HTMLParser.MATERIALPAGEROUTE_CLOSE, 0); }
		public TerminalNode NAVIGATOR_CONTEXT_END() { return getToken(HTMLParser.NAVIGATOR_CONTEXT_END, 0); }
		public Push_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterPush_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitPush_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitPush_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Push_bodyContext push_body() throws RecognitionException {
		Push_bodyContext _localctx = new Push_bodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_push_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NAVIGATOR_CONTEXT);
			setState(237);
			match(NAVIGATOR_CONTEXT_SIMI);
			setState(238);
			match(MATERIALPAGEROUTE);
			setState(239);
			match(MATERIALPAGEROUTE_OPEN);
			setState(240);
			match(BUILDER);
			setState(241);
			match(BUILDER_DOT);
			setState(242);
			match(BUILDER_OPEN);
			setState(243);
			builder_brakets();
			setState(244);
			match(BUILDER_CLOSE);
			setState(245);
			match(MATERIALPAGEROUTE_BODY_OPEN);
			setState(246);
			material_page_rout_body();
			setState(247);
			match(MATERIALPAGEROUTE_BODY_CLOSE);
			setState(248);
			match(MATERIALPAGEROUTE_CLOSE);
			setState(249);
			match(NAVIGATOR_CONTEXT_END);
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
	public static class Builder_braketsContext extends ParserRuleContext {
		public TerminalNode BUILDER_BUILDCONTEXT() { return getToken(HTMLParser.BUILDER_BUILDCONTEXT, 0); }
		public TerminalNode BUILDER_CONTEXT() { return getToken(HTMLParser.BUILDER_CONTEXT, 0); }
		public Builder_braketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builder_brakets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterBuilder_brakets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitBuilder_brakets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitBuilder_brakets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Builder_braketsContext builder_brakets() throws RecognitionException {
		Builder_braketsContext _localctx = new Builder_braketsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_builder_brakets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(BUILDER_BUILDCONTEXT);
			setState(252);
			match(BUILDER_CONTEXT);
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
	public static class Material_page_rout_bodyContext extends ParserRuleContext {
		public TerminalNode MATERIALPAGEROUTE_RETURN() { return getToken(HTMLParser.MATERIALPAGEROUTE_RETURN, 0); }
		public TerminalNode TARGET_CLASS() { return getToken(HTMLParser.TARGET_CLASS, 0); }
		public TerminalNode TARGET_CLASS_OPEN() { return getToken(HTMLParser.TARGET_CLASS_OPEN, 0); }
		public TerminalNode TARGET_CLASS_CLOSE() { return getToken(HTMLParser.TARGET_CLASS_CLOSE, 0); }
		public TerminalNode MATERIALPAGEROUTE_RETURN_SIMI() { return getToken(HTMLParser.MATERIALPAGEROUTE_RETURN_SIMI, 0); }
		public Material_page_rout_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_material_page_rout_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).enterMaterial_page_rout_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLParserListener ) ((HTMLParserListener)listener).exitMaterial_page_rout_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLParserVisitor ) return ((HTMLParserVisitor<? extends T>)visitor).visitMaterial_page_rout_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Material_page_rout_bodyContext material_page_rout_body() throws RecognitionException {
		Material_page_rout_bodyContext _localctx = new Material_page_rout_bodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_material_page_rout_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(MATERIALPAGEROUTE_RETURN);
			setState(255);
			match(TARGET_CLASS);
			setState(256);
			match(TARGET_CLASS_OPEN);
			setState(257);
			match(TARGET_CLASS_CLOSE);
			setState(258);
			match(MATERIALPAGEROUTE_RETURN_SIMI);
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
		"\u0004\u0001y\u0105\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0003"+
		"\u0004^\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0087\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0091\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0003\f\u009f\b\f\u0001\r\u0005\r\u00a2\b\r\n\r\f\r\u00a5\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00aa\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0005\u0010\u00b7"+
		"\b\u0010\n\u0010\f\u0010\u00ba\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00c6\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u00ca\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0000"+
		"\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.024\u0000\u0003\u0001\u0000\u0005\u0006\u0001"+
		"\u000045\u0002\u0000??HH\u00f7\u00006\u0001\u0000\u0000\u0000\u0002=\u0001"+
		"\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000"+
		"\u0000\ba\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fn\u0001"+
		"\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010z\u0001\u0000\u0000"+
		"\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u008b\u0001\u0000\u0000"+
		"\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000"+
		"\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000"+
		"\u0000\u001e\u00ae\u0001\u0000\u0000\u0000 \u00b8\u0001\u0000\u0000\u0000"+
		"\"\u00bb\u0001\u0000\u0000\u0000$\u00c1\u0001\u0000\u0000\u0000&\u00c9"+
		"\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000\u0000*\u00d3\u0001\u0000"+
		"\u0000\u0000,\u00d9\u0001\u0000\u0000\u0000.\u00e4\u0001\u0000\u0000\u0000"+
		"0\u00ec\u0001\u0000\u0000\u00002\u00fb\u0001\u0000\u0000\u00004\u00fe"+
		"\u0001\u0000\u0000\u00006:\u0003\u0002\u0001\u000079\u0003\u0004\u0002"+
		"\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0001\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005\b\u0000\u0000"+
		"?@\u0005\t\u0000\u0000@A\u0005\n\u0000\u0000AB\u0005\u000b\u0000\u0000"+
		"BC\u0005\r\u0000\u0000CD\u0005\u000f\u0000\u0000DE\u0005\u0010\u0000\u0000"+
		"EF\u0005\u000e\u0000\u0000FG\u0005\f\u0000\u0000G\u0003\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0003\u0000\u0000IJ\u0005\u0011\u0000\u0000JK\u0005\u0012"+
		"\u0000\u0000KL\u0005\u0004\u0000\u0000LN\u0003\u0006\u0003\u0000MO\u0005"+
		"\u0013\u0000\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000PR\u0005\u0014\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000SU\u0005\u0015"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VW\u0005\u0007\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005"+
		"\u001f\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000"+
		"\u0000[\u0007\u0001\u0000\u0000\u0000\\^\u0005\u0016\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_b\u0003\f\u0006\u0000`b\u0003\n\u0005\u0000a]\u0001\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0017\u0000"+
		"\u0000de\u0005\u0013\u0000\u0000ef\u0005\u0014\u0000\u0000fg\u0005\u0015"+
		"\u0000\u0000gh\u0005\u0018\u0000\u0000hi\u0005\u0019\u0000\u0000ij\u0005"+
		" \u0000\u0000jk\u0005!\u0000\u0000kl\u0005\"\u0000\u0000lm\u0005#\u0000"+
		"\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u001b\u0000\u0000op\u0005"+
		"\u001c\u0000\u0000pq\u0005\u001d\u0000\u0000qr\u0003\u000e\u0007\u0000"+
		"rs\u0005%\u0000\u0000st\u0005\u001e\u0000\u0000tu\u0003\u0010\b\u0000"+
		"uv\u0005+\u0000\u0000v\r\u0001\u0000\u0000\u0000wx\u0005$\u0000\u0000"+
		"xy\u0005&\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0005\'\u0000\u0000"+
		"{|\u0005(\u0000\u0000|}\u0005)\u0000\u0000}~\u0003\u0012\t\u0000~\u007f"+
		"\u0005.\u0000\u0000\u007f\u0080\u0005*\u0000\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005,\u0000\u0000\u0082\u0083\u0005-\u0000\u0000"+
		"\u0083\u0084\u0005/\u0000\u0000\u0084\u0086\u00050\u0000\u0000\u0085\u0087"+
		"\u0003\u0014\n\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"8\u0000\u0000\u0089\u008a\u00051\u0000\u0000\u008a\u0013\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u00052\u0000\u0000\u008c\u008d\u00053\u0000\u0000\u008d"+
		"\u008e\u0007\u0001\u0000\u0000\u008e\u0090\u00057\u0000\u0000\u008f\u0091"+
		"\u0003\u0016\u000b\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005=\u0000\u0000\u0093\u0094\u00056\u0000\u0000\u0094\u0015\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u00059\u0000\u0000\u0096\u0097\u0005:\u0000\u0000"+
		"\u0097\u0098\u0005;\u0000\u0000\u0098\u0099\u0003\u0018\f\u0000\u0099"+
		"\u009a\u0005D\u0000\u0000\u009a\u009b\u0005<\u0000\u0000\u009b\u0017\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0003\u001a\r\u0000\u009d\u009f\u0003 "+
		"\u0010\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u0019\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u001c"+
		"\u000e\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u001b\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005>\u0000\u0000\u00a7\u00a9\u0005@\u0000\u0000"+
		"\u00a8\u00aa\u0003\u001e\u000f\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005B\u0000\u0000\u00ac\u00ad\u0005C\u0000\u0000\u00ad\u001d"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005A\u0000\u0000\u00af\u00b0\u0005"+
		"E\u0000\u0000\u00b0\u00b1\u0005F\u0000\u0000\u00b1\u00b2\u0003 \u0010"+
		"\u0000\u00b2\u00b3\u0005J\u0000\u0000\u00b3\u00b4\u0005G\u0000\u0000\u00b4"+
		"\u001f\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\"\u0011\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9!\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007"+
		"\u0002\u0000\u0000\u00bc\u00bd\u0005K\u0000\u0000\u00bd\u00be\u0003$\u0012"+
		"\u0000\u00be\u00bf\u0005U\u0000\u0000\u00bf\u00c0\u0005L\u0000\u0000\u00c0"+
		"#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005M\u0000\u0000\u00c2\u00c5\u0005"+
		"N\u0000\u0000\u00c3\u00c6\u0003&\u0013\u0000\u00c4\u00c6\u0003,\u0016"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6%\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003(\u0014\u0000\u00c8"+
		"\u00ca\u0003*\u0015\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\'\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"O\u0000\u0000\u00cc\u00cd\u0005P\u0000\u0000\u00cd\u00ce\u0005R\u0000"+
		"\u0000\u00ce\u00cf\u0005S\u0000\u0000\u00cf\u00d0\u0005V\u0000\u0000\u00d0"+
		"\u00d1\u0005W\u0000\u0000\u00d1\u00d2\u0005T\u0000\u0000\u00d2)\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005O\u0000\u0000\u00d4\u00d5\u0005S\u0000"+
		"\u0000\u00d5\u00d6\u0005V\u0000\u0000\u00d6\u00d7\u0005W\u0000\u0000\u00d7"+
		"\u00d8\u0005T\u0000\u0000\u00d8+\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"Q\u0000\u0000\u00da\u00db\u0005X\u0000\u0000\u00db\u00dc\u0005Y\u0000"+
		"\u0000\u00dc\u00dd\u0005\\\u0000\u0000\u00dd\u00de\u0005]\u0000\u0000"+
		"\u00de\u00df\u0005^\u0000\u0000\u00df\u00e0\u0005Z\u0000\u0000\u00e0\u00e1"+
		"\u0003.\u0017\u0000\u00e1\u00e2\u0005d\u0000\u0000\u00e2\u00e3\u0005["+
		"\u0000\u0000\u00e3-\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005_\u0000\u0000"+
		"\u00e5\u00e6\u0005`\u0000\u0000\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8"+
		"\u0005b\u0000\u0000\u00e8\u00e9\u00030\u0018\u0000\u00e9\u00ea\u0005g"+
		"\u0000\u0000\u00ea\u00eb\u0005c\u0000\u0000\u00eb/\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005e\u0000\u0000\u00ed\u00ee\u0005f\u0000\u0000\u00ee\u00ef"+
		"\u0005h\u0000\u0000\u00ef\u00f0\u0005i\u0000\u0000\u00f0\u00f1\u0005j"+
		"\u0000\u0000\u00f1\u00f2\u0005k\u0000\u0000\u00f2\u00f3\u0005o\u0000\u0000"+
		"\u00f3\u00f4\u00032\u0019\u0000\u00f4\u00f5\u0005q\u0000\u0000\u00f5\u00f6"+
		"\u0005l\u0000\u0000\u00f6\u00f7\u00034\u001a\u0000\u00f7\u00f8\u0005t"+
		"\u0000\u0000\u00f8\u00f9\u0005m\u0000\u0000\u00f9\u00fa\u0005n\u0000\u0000"+
		"\u00fa1\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005p\u0000\u0000\u00fc\u00fd"+
		"\u0005r\u0000\u0000\u00fd3\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005s"+
		"\u0000\u0000\u00ff\u0100\u0005u\u0000\u0000\u0100\u0101\u0005v\u0000\u0000"+
		"\u0101\u0102\u0005w\u0000\u0000\u0102\u0103\u0005x\u0000\u0000\u01035"+
		"\u0001\u0000\u0000\u0000\u000e:NQT]a\u0086\u0090\u009e\u00a3\u00a9\u00b8"+
		"\u00c5\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}