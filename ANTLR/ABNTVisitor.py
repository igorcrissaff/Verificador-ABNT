# Generated from grammar/ABNT.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ABNTParser import ABNTParser
else:
    from ABNTParser import ABNTParser

# This class defines a complete generic visitor for a parse tree produced by ABNTParser.

class ABNTVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ABNTParser#documento.
    def visitDocumento(self, ctx:ABNTParser.DocumentoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParser#capa.
    def visitCapa(self, ctx:ABNTParser.CapaContext):
        return self.visitChildren(ctx)



del ABNTParser