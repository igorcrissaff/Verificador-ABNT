# Generated from gramatica/ABNT.g4 by ANTLR 4.13.2
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


    # Enter a parse tree produced by ABNTParser#instituicao.
    def enterInstituicao(self, ctx:ABNTParser.InstituicaoContext):
        pass

    # Exit a parse tree produced by ABNTParser#instituicao.
    def exitInstituicao(self, ctx:ABNTParser.InstituicaoContext):
        pass


    # Enter a parse tree produced by ABNTParser#curso.
    def enterCurso(self, ctx:ABNTParser.CursoContext):
        pass

    # Exit a parse tree produced by ABNTParser#curso.
    def exitCurso(self, ctx:ABNTParser.CursoContext):
        pass


    # Enter a parse tree produced by ABNTParser#autores.
    def enterAutores(self, ctx:ABNTParser.AutoresContext):
        pass

    # Exit a parse tree produced by ABNTParser#autores.
    def exitAutores(self, ctx:ABNTParser.AutoresContext):
        pass


    # Enter a parse tree produced by ABNTParser#titulo.
    def enterTitulo(self, ctx:ABNTParser.TituloContext):
        pass

    # Exit a parse tree produced by ABNTParser#titulo.
    def exitTitulo(self, ctx:ABNTParser.TituloContext):
        pass


    # Enter a parse tree produced by ABNTParser#cidade.
    def enterCidade(self, ctx:ABNTParser.CidadeContext):
        pass

    # Exit a parse tree produced by ABNTParser#cidade.
    def exitCidade(self, ctx:ABNTParser.CidadeContext):
        pass


    # Enter a parse tree produced by ABNTParser#ano.
    def enterAno(self, ctx:ABNTParser.AnoContext):
        pass

    # Exit a parse tree produced by ABNTParser#ano.
    def exitAno(self, ctx:ABNTParser.AnoContext):
        pass



del ABNTParser