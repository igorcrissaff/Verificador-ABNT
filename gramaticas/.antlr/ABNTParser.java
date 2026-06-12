// Generated from c:/Users/igorc/Desktop/projetos/Verificador ABNT/gramaticas/ABNT.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ABNTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSTITUICAO=1, CURSO=2, AUTOR=3, TITULO_PRINCIPAL=4, SUBTITULO=5, CIDADE=6, 
		ANO=7, TITULO_PRIMARIO=8, TEXTO=9, WS=10;
	public static final int
		RULE_documento = 0, RULE_capa = 1, RULE_instituicao = 2, RULE_curso = 3, 
		RULE_autores = 4, RULE_titulo = 5, RULE_cidade = 6, RULE_ano = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"documento", "capa", "instituicao", "curso", "autores", "titulo", "cidade", 
			"ano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INSTITUICAO", "CURSO", "AUTOR", "TITULO_PRINCIPAL", "SUBTITULO", 
			"CIDADE", "ANO", "TITULO_PRIMARIO", "TEXTO", "WS"
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
	public String getGrammarFileName() { return "ABNT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ABNTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentoContext extends ParserRuleContext {
		public CapaContext capa() {
			return getRuleContext(CapaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABNTParser.EOF, 0); }
		public DocumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documento; }
	}

	public final DocumentoContext documento() throws RecognitionException {
		DocumentoContext _localctx = new DocumentoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_documento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			capa();
			setState(17);
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
	public static class CapaContext extends ParserRuleContext {
		public InstituicaoContext instituicao() {
			return getRuleContext(InstituicaoContext.class,0);
		}
		public CursoContext curso() {
			return getRuleContext(CursoContext.class,0);
		}
		public AutoresContext autores() {
			return getRuleContext(AutoresContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public CidadeContext cidade() {
			return getRuleContext(CidadeContext.class,0);
		}
		public AnoContext ano() {
			return getRuleContext(AnoContext.class,0);
		}
		public CapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capa; }
	}

	public final CapaContext capa() throws RecognitionException {
		CapaContext _localctx = new CapaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_capa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			instituicao();
			setState(20);
			curso();
			setState(21);
			autores();
			setState(22);
			titulo();
			setState(23);
			cidade();
			setState(24);
			ano();
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
	public static class InstituicaoContext extends ParserRuleContext {
		public TerminalNode INSTITUICAO() { return getToken(ABNTParser.INSTITUICAO, 0); }
		public InstituicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instituicao; }
	}

	public final InstituicaoContext instituicao() throws RecognitionException {
		InstituicaoContext _localctx = new InstituicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instituicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(INSTITUICAO);
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
	public static class CursoContext extends ParserRuleContext {
		public TerminalNode CURSO() { return getToken(ABNTParser.CURSO, 0); }
		public CursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curso; }
	}

	public final CursoContext curso() throws RecognitionException {
		CursoContext _localctx = new CursoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_curso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(CURSO);
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
	public static class AutoresContext extends ParserRuleContext {
		public List<TerminalNode> AUTOR() { return getTokens(ABNTParser.AUTOR); }
		public TerminalNode AUTOR(int i) {
			return getToken(ABNTParser.AUTOR, i);
		}
		public AutoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autores; }
	}

	public final AutoresContext autores() throws RecognitionException {
		AutoresContext _localctx = new AutoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_autores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				match(AUTOR);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AUTOR );
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
	public static class TituloContext extends ParserRuleContext {
		public TerminalNode TITULO_PRINCIPAL() { return getToken(ABNTParser.TITULO_PRINCIPAL, 0); }
		public TerminalNode SUBTITULO() { return getToken(ABNTParser.SUBTITULO, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_titulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(TITULO_PRINCIPAL);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTITULO) {
				{
				setState(36);
				match(SUBTITULO);
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
	public static class CidadeContext extends ParserRuleContext {
		public TerminalNode CIDADE() { return getToken(ABNTParser.CIDADE, 0); }
		public CidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cidade; }
	}

	public final CidadeContext cidade() throws RecognitionException {
		CidadeContext _localctx = new CidadeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(CIDADE);
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
	public static class AnoContext extends ParserRuleContext {
		public TerminalNode ANO() { return getToken(ABNTParser.ANO, 0); }
		public AnoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ano; }
	}

	public final AnoContext ano() throws RecognitionException {
		AnoContext _localctx = new AnoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ANO);
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
		"\u0004\u0001\n,\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0004\u0004 \b\u0004\u000b\u0004\f\u0004"+
		"!\u0001\u0005\u0001\u0005\u0003\u0005&\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0000\u0000%\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013"+
		"\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006\u001c"+
		"\u0001\u0000\u0000\u0000\b\u001f\u0001\u0000\u0000\u0000\n#\u0001\u0000"+
		"\u0000\u0000\f\'\u0001\u0000\u0000\u0000\u000e)\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001"+
		"\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0004\u0002\u0000"+
		"\u0014\u0015\u0003\u0006\u0003\u0000\u0015\u0016\u0003\b\u0004\u0000\u0016"+
		"\u0017\u0003\n\u0005\u0000\u0017\u0018\u0003\f\u0006\u0000\u0018\u0019"+
		"\u0003\u000e\u0007\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0005\u0001\u0000\u0000\u001b\u0005\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0002\u0000\u0000\u001d\u0007\u0001\u0000\u0000\u0000\u001e \u0005"+
		"\u0003\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\t\u0001"+
		"\u0000\u0000\u0000#%\u0005\u0004\u0000\u0000$&\u0005\u0005\u0000\u0000"+
		"%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\u000b\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u0006\u0000\u0000(\r\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0007\u0000\u0000*\u000f\u0001\u0000\u0000\u0000\u0002!%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}