// Generated from c:/Users/igorc/Desktop/projetos/Verificador ABNT/gramaticas/ABNTParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ABNTParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INSTITUICAO=1, CURSO=2, AUTOR=3, TITULO_PRINCIPAL=4, SUBTITULO=5, 
		ESTADO=6, CIDADE=7, ANO=8, TITULO_PRIMARIO=9, TEXTO=10, WS=11;
	public static final int
		RULE_documento = 0, RULE_capa = 1, RULE_curso = 2, RULE_autores = 3, RULE_titulo = 4, 
		RULE_publicacao = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"documento", "capa", "curso", "autores", "titulo", "publicacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AUTOR", "TITULO_PRINCIPAL", "SUBTITULO", "ESTADO", 
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
	public String getGrammarFileName() { return "ABNTParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ABNTParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentoContext extends ParserRuleContext {
		public CapaContext capa() {
			return getRuleContext(CapaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABNTParserParser.EOF, 0); }
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
			setState(12);
			capa();
			setState(13);
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
		public CursoContext curso() {
			return getRuleContext(CursoContext.class,0);
		}
		public AutoresContext autores() {
			return getRuleContext(AutoresContext.class,0);
		}
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public PublicacaoContext publicacao() {
			return getRuleContext(PublicacaoContext.class,0);
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
			setState(15);
			curso();
			setState(16);
			autores();
			setState(17);
			titulo();
			setState(18);
			publicacao();
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
		public TerminalNode INSTITUICAO() { return getToken(ABNTParserParser.INSTITUICAO, 0); }
		public TerminalNode CURSO() { return getToken(ABNTParserParser.CURSO, 0); }
		public CursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curso; }
	}

	public final CursoContext curso() throws RecognitionException {
		CursoContext _localctx = new CursoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_curso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);
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
		public List<TerminalNode> AUTOR() { return getTokens(ABNTParserParser.AUTOR); }
		public TerminalNode AUTOR(int i) {
			return getToken(ABNTParserParser.AUTOR, i);
		}
		public AutoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autores; }
	}

	public final AutoresContext autores() throws RecognitionException {
		AutoresContext _localctx = new AutoresContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_autores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(AUTOR);
				}
				}
				setState(26); 
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
		public TerminalNode TITULO_PRINCIPAL() { return getToken(ABNTParserParser.TITULO_PRINCIPAL, 0); }
		public TerminalNode SUBTITULO() { return getToken(ABNTParserParser.SUBTITULO, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_titulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(TITULO_PRINCIPAL);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTITULO) {
				{
				setState(29);
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
	public static class PublicacaoContext extends ParserRuleContext {
		public TerminalNode CIDADE() { return getToken(ABNTParserParser.CIDADE, 0); }
		public TerminalNode ESTADO() { return getToken(ABNTParserParser.ESTADO, 0); }
		public TerminalNode ANO() { return getToken(ABNTParserParser.ANO, 0); }
		public PublicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicacao; }
	}

	public final PublicacaoContext publicacao() throws RecognitionException {
		PublicacaoContext _localctx = new PublicacaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_publicacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(CIDADE);
			setState(33);
			match(T__0);
			setState(34);
			match(ESTADO);
			setState(35);
			match(T__1);
			setState(36);
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
		"\u0004\u0001\u000b\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0004\u0003\u0019\b\u0003\u000b\u0003\f\u0003\u001a"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u001f\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000"+
		"\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000\"\u0000\f\u0001\u0000\u0000"+
		"\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000"+
		"\u0000\u0006\u0018\u0001\u0000\u0000\u0000\b\u001c\u0001\u0000\u0000\u0000"+
		"\n \u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e\u0005"+
		"\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0003"+
		"\u0004\u0002\u0000\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0003"+
		"\b\u0004\u0000\u0012\u0013\u0003\n\u0005\u0000\u0013\u0003\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0016\u0005\u0002"+
		"\u0000\u0000\u0016\u0005\u0001\u0000\u0000\u0000\u0017\u0019\u0005\u0003"+
		"\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u0007\u0001\u0000\u0000\u0000\u001c\u001e\u0005\u0004"+
		"\u0000\u0000\u001d\u001f\u0005\u0005\u0000\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\t\u0001\u0000\u0000"+
		"\u0000 !\u0005\u0007\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\u0006"+
		"\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0005\b\u0000\u0000%\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u001a\u001e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}