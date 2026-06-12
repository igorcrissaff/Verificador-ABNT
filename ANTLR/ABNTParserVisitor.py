# Generated from gramaticas/ABNTParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ABNTParserParser import ABNTParserParser
else:
    from ABNTParserParser import ABNTParserParser

# This class defines a complete generic visitor for a parse tree produced by ABNTParserParser.

class ABNTParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ABNTParserParser#documento.
    def visitDocumento(self, ctx:ABNTParserParser.DocumentoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParserParser#capa.
    def visitCapa(self, ctx:ABNTParserParser.CapaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParserParser#curso.
    def visitCurso(self, ctx:ABNTParserParser.CursoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParserParser#autores.
    def visitAutores(self, ctx:ABNTParserParser.AutoresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParserParser#titulo.
    def visitTitulo(self, ctx:ABNTParserParser.TituloContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ABNTParserParser#publicacao.
    def visitPublicacao(self, ctx:ABNTParserParser.PublicacaoContext):
        return self.visitChildren(ctx)



del ABNTParserParser