// Generated from c:/Users/igorc/Desktop/projetos/Verificador ABNT/gramatica/ABNT.g4 by ANTLR 4.13.1
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
		RULE_documento = 0, RULE_capa = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"documento", "capa"
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
			setState(4);
			capa();
			setState(5);
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
		public TerminalNode INSTITUICAO() { return getToken(ABNTParser.INSTITUICAO, 0); }
		public TerminalNode CURSO() { return getToken(ABNTParser.CURSO, 0); }
		public TerminalNode AUTOR() { return getToken(ABNTParser.AUTOR, 0); }
		public TerminalNode TITULO_PRINCIPAL() { return getToken(ABNTParser.TITULO_PRINCIPAL, 0); }
		public TerminalNode CIDADE() { return getToken(ABNTParser.CIDADE, 0); }
		public TerminalNode ANO() { return getToken(ABNTParser.ANO, 0); }
		public TerminalNode SUBTITULO() { return getToken(ABNTParser.SUBTITULO, 0); }
		public CapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capa; }
	}

	public final CapaContext capa() throws RecognitionException {
		CapaContext _localctx = new CapaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_capa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(INSTITUICAO);
			setState(8);
			match(CURSO);
			setState(9);
			match(AUTOR);
			setState(10);
			match(TITULO_PRINCIPAL);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBTITULO) {
				{
				setState(11);
				match(SUBTITULO);
				}
			}

			setState(14);
			match(CIDADE);
			setState(15);
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
		"\u0004\u0001\n\u0012\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\r\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0010\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004"+
		"\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006"+
		"\u0001\u0001\u0000\u0000\u0000\u0007\b\u0005\u0001\u0000\u0000\b\t\u0005"+
		"\u0002\u0000\u0000\t\n\u0005\u0003\u0000\u0000\n\f\u0005\u0004\u0000\u0000"+
		"\u000b\r\u0005\u0005\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000\f\r\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0006"+
		"\u0000\u0000\u000f\u0010\u0005\u0007\u0000\u0000\u0010\u0003\u0001\u0000"+
		"\u0000\u0000\u0001\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}