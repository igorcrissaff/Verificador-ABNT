# Generated from grammar/ABNT.g4 by ANTLR 4.13.2
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
        4,1,10,18,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,3,1,13,
        8,1,1,1,1,1,1,1,1,1,0,0,2,0,2,0,0,16,0,4,1,0,0,0,2,7,1,0,0,0,4,5,
        3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,8,5,1,0,0,8,9,5,2,0,0,9,10,5,3,
        0,0,10,12,5,4,0,0,11,13,5,5,0,0,12,11,1,0,0,0,12,13,1,0,0,0,13,14,
        1,0,0,0,14,15,5,6,0,0,15,16,5,7,0,0,16,3,1,0,0,0,1,12
    ]

class ABNTParser ( Parser ):

    grammarFileName = "ABNT.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "INSTITUICAO", "CURSO", "AUTOR", "TITULO_PRINCIPAL", 
                      "SUBTITULO", "CIDADE", "ANO", "TITULO_PRIMARIO", "TEXTO", 
                      "WS" ]

    RULE_documento = 0
    RULE_capa = 1

    ruleNames =  [ "documento", "capa" ]

    EOF = Token.EOF
    INSTITUICAO=1
    CURSO=2
    AUTOR=3
    TITULO_PRINCIPAL=4
    SUBTITULO=5
    CIDADE=6
    ANO=7
    TITULO_PRIMARIO=8
    TEXTO=9
    WS=10

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
            return self.getTypedRuleContext(ABNTParser.CapaContext,0)


        def EOF(self):
            return self.getToken(ABNTParser.EOF, 0)

        def getRuleIndex(self):
            return ABNTParser.RULE_documento

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

        localctx = ABNTParser.DocumentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_documento)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.capa()
            self.state = 5
            self.match(ABNTParser.EOF)
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

        def INSTITUICAO(self):
            return self.getToken(ABNTParser.INSTITUICAO, 0)

        def CURSO(self):
            return self.getToken(ABNTParser.CURSO, 0)

        def AUTOR(self):
            return self.getToken(ABNTParser.AUTOR, 0)

        def TITULO_PRINCIPAL(self):
            return self.getToken(ABNTParser.TITULO_PRINCIPAL, 0)

        def CIDADE(self):
            return self.getToken(ABNTParser.CIDADE, 0)

        def ANO(self):
            return self.getToken(ABNTParser.ANO, 0)

        def SUBTITULO(self):
            return self.getToken(ABNTParser.SUBTITULO, 0)

        def getRuleIndex(self):
            return ABNTParser.RULE_capa

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

        localctx = ABNTParser.CapaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_capa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ABNTParser.INSTITUICAO)
            self.state = 8
            self.match(ABNTParser.CURSO)
            self.state = 9
            self.match(ABNTParser.AUTOR)
            self.state = 10
            self.match(ABNTParser.TITULO_PRINCIPAL)
            self.state = 12
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==5:
                self.state = 11
                self.match(ABNTParser.SUBTITULO)


            self.state = 14
            self.match(ABNTParser.CIDADE)
            self.state = 15
            self.match(ABNTParser.ANO)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





