# Generated from grammar/ABNT.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ABNTParser import ABNTParser
else:
    from ABNTParser import ABNTParser

# This class defines a complete listener for a parse tree produced by ABNTParser.
class ABNTListener(ParseTreeListener):

    # Enter a parse tree produced by ABNTParser#documento.
    def enterDocumento(self, ctx:ABNTParser.DocumentoContext):
        pass

    # Exit a parse tree produced by ABNTParser#documento.
    def exitDocumento(self, ctx:ABNTParser.DocumentoContext):
        pass


    # Enter a parse tree produced by ABNTParser#capa.
    def enterCapa(self, ctx:ABNTParser.CapaContext):
        pass

    # Exit a parse tree produced by ABNTParser#capa.
    def exitCapa(self, ctx:ABNTParser.CapaContext):
        pass



del ABNTParser