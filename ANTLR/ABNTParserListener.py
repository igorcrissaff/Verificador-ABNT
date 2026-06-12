# Generated from gramaticas/ABNTParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ABNTParserParser import ABNTParserParser
else:
    from ABNTParserParser import ABNTParserParser

# This class defines a complete listener for a parse tree produced by ABNTParserParser.
class ABNTParserListener(ParseTreeListener):

    # Enter a parse tree produced by ABNTParserParser#documento.
    def enterDocumento(self, ctx:ABNTParserParser.DocumentoContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#documento.
    def exitDocumento(self, ctx:ABNTParserParser.DocumentoContext):
        pass


    # Enter a parse tree produced by ABNTParserParser#capa.
    def enterCapa(self, ctx:ABNTParserParser.CapaContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#capa.
    def exitCapa(self, ctx:ABNTParserParser.CapaContext):
        pass


    # Enter a parse tree produced by ABNTParserParser#curso.
    def enterCurso(self, ctx:ABNTParserParser.CursoContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#curso.
    def exitCurso(self, ctx:ABNTParserParser.CursoContext):
        pass


    # Enter a parse tree produced by ABNTParserParser#autores.
    def enterAutores(self, ctx:ABNTParserParser.AutoresContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#autores.
    def exitAutores(self, ctx:ABNTParserParser.AutoresContext):
        pass


    # Enter a parse tree produced by ABNTParserParser#titulo.
    def enterTitulo(self, ctx:ABNTParserParser.TituloContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#titulo.
    def exitTitulo(self, ctx:ABNTParserParser.TituloContext):
        pass


    # Enter a parse tree produced by ABNTParserParser#publicacao.
    def enterPublicacao(self, ctx:ABNTParserParser.PublicacaoContext):
        pass

    # Exit a parse tree produced by ABNTParserParser#publicacao.
    def exitPublicacao(self, ctx:ABNTParserParser.PublicacaoContext):
        pass



del ABNTParserParser