# Generated from grammar/ABNT.g4 by ANTLR 4.13.2
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,10,95,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,
        6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,
        1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,4,1,5,1,5,1,6,1,6,1,6,
        1,7,4,7,46,8,7,11,7,12,7,47,1,7,3,7,51,8,7,1,7,3,7,54,8,7,1,7,1,
        7,5,7,58,8,7,10,7,12,7,61,9,7,1,8,4,8,64,8,8,11,8,12,8,65,1,9,4,
        9,69,8,9,11,9,12,9,70,1,9,1,9,1,10,1,10,5,10,77,8,10,10,10,12,10,
        80,9,10,1,11,1,11,5,11,84,8,11,10,11,12,11,87,9,11,1,12,1,12,5,12,
        91,8,12,10,12,12,12,94,9,12,0,0,13,1,1,3,2,5,3,7,4,9,5,11,6,13,7,
        15,8,17,9,19,10,21,0,23,0,25,0,1,0,7,1,0,65,90,1,0,48,57,2,0,32,
        32,65,90,2,0,10,10,13,13,3,0,9,10,13,13,32,32,1,0,97,122,2,0,32,
        32,97,122,100,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,
        9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,
        19,1,0,0,0,1,27,1,0,0,0,3,29,1,0,0,0,5,31,1,0,0,0,7,33,1,0,0,0,9,
        35,1,0,0,0,11,39,1,0,0,0,13,41,1,0,0,0,15,45,1,0,0,0,17,63,1,0,0,
        0,19,68,1,0,0,0,21,74,1,0,0,0,23,81,1,0,0,0,25,88,1,0,0,0,27,28,
        3,21,10,0,28,2,1,0,0,0,29,30,3,21,10,0,30,4,1,0,0,0,31,32,3,21,10,
        0,32,6,1,0,0,0,33,34,3,21,10,0,34,8,1,0,0,0,35,36,5,58,0,0,36,37,
        7,0,0,0,37,38,3,23,11,0,38,10,1,0,0,0,39,40,3,25,12,0,40,12,1,0,
        0,0,41,42,7,1,0,0,42,43,6,6,0,0,43,14,1,0,0,0,44,46,7,1,0,0,45,44,
        1,0,0,0,46,47,1,0,0,0,47,45,1,0,0,0,47,48,1,0,0,0,48,50,1,0,0,0,
        49,51,5,46,0,0,50,49,1,0,0,0,50,51,1,0,0,0,51,53,1,0,0,0,52,54,5,
        32,0,0,53,52,1,0,0,0,53,54,1,0,0,0,54,55,1,0,0,0,55,59,7,0,0,0,56,
        58,7,2,0,0,57,56,1,0,0,0,58,61,1,0,0,0,59,57,1,0,0,0,59,60,1,0,0,
        0,60,16,1,0,0,0,61,59,1,0,0,0,62,64,8,3,0,0,63,62,1,0,0,0,64,65,
        1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,66,18,1,0,0,0,67,69,7,4,0,0,
        68,67,1,0,0,0,69,70,1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,72,1,
        0,0,0,72,73,6,9,1,0,73,20,1,0,0,0,74,78,7,0,0,0,75,77,7,2,0,0,76,
        75,1,0,0,0,77,80,1,0,0,0,78,76,1,0,0,0,78,79,1,0,0,0,79,22,1,0,0,
        0,80,78,1,0,0,0,81,85,7,5,0,0,82,84,7,6,0,0,83,82,1,0,0,0,84,87,
        1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,24,1,0,0,0,87,85,1,0,0,0,
        88,92,7,0,0,0,89,91,7,5,0,0,90,89,1,0,0,0,91,94,1,0,0,0,92,90,1,
        0,0,0,92,93,1,0,0,0,93,26,1,0,0,0,94,92,1,0,0,0,10,0,47,50,53,59,
        65,70,78,85,92,2,1,6,0,6,0,0
    ]

class ABNTLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    INSTITUICAO = 1
    CURSO = 2
    AUTOR = 3
    TITULO_PRINCIPAL = 4
    SUBTITULO = 5
    CIDADE = 6
    ANO = 7
    TITULO_PRIMARIO = 8
    TEXTO = 9
    WS = 10

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "INSTITUICAO", "CURSO", "AUTOR", "TITULO_PRINCIPAL", "SUBTITULO", 
            "CIDADE", "ANO", "TITULO_PRIMARIO", "TEXTO", "WS" ]

    ruleNames = [ "INSTITUICAO", "CURSO", "AUTOR", "TITULO_PRINCIPAL", "SUBTITULO", 
                  "CIDADE", "ANO", "TITULO_PRIMARIO", "TEXTO", "WS", "CADEIA_MAISUCULA", 
                  "CADEIA_MINUSCULA", "CADEIA_CAPITALIZADA" ]

    grammarFileName = "ABNT.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[6] = self.ANO_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def ANO_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:
            4
     


