# Generated from gramaticas/ABNTParser.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,11,39,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,1,
        0,1,0,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,3,4,3,25,8,3,11,3,12,3,26,
        1,4,1,4,3,4,31,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,0,0,6,0,2,4,6,8,10,
        0,0,34,0,12,1,0,0,0,2,15,1,0,0,0,4,20,1,0,0,0,6,24,1,0,0,0,8,28,
        1,0,0,0,10,32,1,0,0,0,12,13,3,2,1,0,13,14,5,0,0,1,14,1,1,0,0,0,15,
        16,3,4,2,0,16,17,3,6,3,0,17,18,3,8,4,0,18,19,3,10,5,0,19,3,1,0,0,
        0,20,21,5,1,0,0,21,22,5,2,0,0,22,5,1,0,0,0,23,25,5,3,0,0,24,23,1,
        0,0,0,25,26,1,0,0,0,26,24,1,0,0,0,26,27,1,0,0,0,27,7,1,0,0,0,28,
        30,5,4,0,0,29,31,5,5,0,0,30,29,1,0,0,0,30,31,1,0,0,0,31,9,1,0,0,
        0,32,33,5,7,0,0,33,34,5,1,0,0,34,35,5,6,0,0,35,36,5,2,0,0,36,37,
        5,8,0,0,37,11,1,0,0,0,2,26,30
    ]

class ABNTParserParser ( Parser ):

    grammarFileName = "ABNTParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'-'", "'\\n'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "AUTOR", "TITULO_PRINCIPAL", 
                      "SUBTITULO", "ESTADO", "CIDADE", "ANO", "TITULO_PRIMARIO", 
                      "TEXTO", "WS" ]

    RULE_documento = 0
    RULE_capa = 1
    RULE_curso = 2
    RULE_autores = 3
    RULE_titulo = 4
    RULE_publicacao = 5

    ruleNames =  [ "documento", "capa", "curso", "autores", "titulo", "publicacao" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    INSTITUICAO=1
    CURSO=2
    AUTOR=3
    TITULO_PRINCIPAL=4
    SUBTITULO=5
    ESTADO=6
    CIDADE=7
    ANO=8
    TITULO_PRIMARIO=9
    TEXTO=10
    WS=11

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def capa(self):
            return self.getTypedRuleContext(ABNTParserParser.CapaContext,0)


        def EOF(self):
            return self.getToken(ABNTParserParser.EOF, 0)

        def getRuleIndex(self):
            return ABNTParserParser.RULE_documento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocumento" ):
                listener.enterDocumento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocumento" ):
                listener.exitDocumento(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDocumento" ):
                return visitor.visitDocumento(self)
            else:
                return visitor.visitChildren(self)




    def documento(self):

        localctx = ABNTParserParser.DocumentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_documento)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.capa()
            self.state = 13
            self.match(ABNTParserParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CapaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def curso(self):
            return self.getTypedRuleContext(ABNTParserParser.CursoContext,0)


        def autores(self):
            return self.getTypedRuleContext(ABNTParserParser.AutoresContext,0)


        def titulo(self):
            return self.getTypedRuleContext(ABNTParserParser.TituloContext,0)


        def publicacao(self):
            return self.getTypedRuleContext(ABNTParserParser.PublicacaoContext,0)


        def getRuleIndex(self):
            return ABNTParserParser.RULE_capa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCapa" ):
                listener.enterCapa(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCapa" ):
                listener.exitCapa(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCapa" ):
                return visitor.visitCapa(self)
            else:
                return visitor.visitChildren(self)




    def capa(self):

        localctx = ABNTParserParser.CapaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_capa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 15
            self.curso()
            self.state = 16
            self.autores()
            self.state = 17
            self.titulo()
            self.state = 18
            self.publicacao()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CursoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INSTITUICAO(self):
            return self.getToken(ABNTParserParser.INSTITUICAO, 0)

        def CURSO(self):
            return self.getToken(ABNTParserParser.CURSO, 0)

        def getRuleIndex(self):
            return ABNTParserParser.RULE_curso

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCurso" ):
                listener.enterCurso(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCurso" ):
                listener.exitCurso(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCurso" ):
                return visitor.visitCurso(self)
            else:
                return visitor.visitChildren(self)




    def curso(self):

        localctx = ABNTParserParser.CursoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_curso)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 20
            self.match(ABNTParserParser.T__0)
            self.state = 21
            self.match(ABNTParserParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AutoresContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AUTOR(self, i:int=None):
            if i is None:
                return self.getTokens(ABNTParserParser.AUTOR)
            else:
                return self.getToken(ABNTParserParser.AUTOR, i)

        def getRuleIndex(self):
            return ABNTParserParser.RULE_autores

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAutores" ):
                listener.enterAutores(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAutores" ):
                listener.exitAutores(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAutores" ):
                return visitor.visitAutores(self)
            else:
                return visitor.visitChildren(self)




    def autores(self):

        localctx = ABNTParserParser.AutoresContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_autores)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 23
                self.match(ABNTParserParser.AUTOR)
                self.state = 26 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==3):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TituloContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TITULO_PRINCIPAL(self):
            return self.getToken(ABNTParserParser.TITULO_PRINCIPAL, 0)

        def SUBTITULO(self):
            return self.getToken(ABNTParserParser.SUBTITULO, 0)

        def getRuleIndex(self):
            return ABNTParserParser.RULE_titulo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTitulo" ):
                listener.enterTitulo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTitulo" ):
                listener.exitTitulo(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTitulo" ):
                return visitor.visitTitulo(self)
            else:
                return visitor.visitChildren(self)




    def titulo(self):

        localctx = ABNTParserParser.TituloContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_titulo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(ABNTParserParser.TITULO_PRINCIPAL)
            self.state = 30
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 29
                self.match(ABNTParserParser.SUBTITULO)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PublicacaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CIDADE(self):
            return self.getToken(ABNTParserParser.CIDADE, 0)

        def ESTADO(self):
            return self.getToken(ABNTParserParser.ESTADO, 0)

        def ANO(self):
            return self.getToken(ABNTParserParser.ANO, 0)

        def getRuleIndex(self):
            return ABNTParserParser.RULE_publicacao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPublicacao" ):
                listener.enterPublicacao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPublicacao" ):
                listener.exitPublicacao(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPublicacao" ):
                return visitor.visitPublicacao(self)
            else:
                return visitor.visitChildren(self)




    def publicacao(self):

        localctx = ABNTParserParser.PublicacaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_publicacao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(ABNTParserParser.CIDADE)
            self.state = 33
            self.match(ABNTParserParser.T__0)
            self.state = 34
            self.match(ABNTParserParser.ESTADO)
            self.state = 35
            self.match(ABNTParserParser.T__1)
            self.state = 36
            self.match(ABNTParserParser.ANO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





