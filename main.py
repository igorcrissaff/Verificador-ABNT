import sys
from antlr4 import *

from ANTLR.ABNTLexer import ABNTLexer
from ANTLR.ABNTParser import ABNTParser

from extrator import Docx

doc = Docx.ler_docx(sys.argv[1])

input_stream = InputStream(doc)

lexer = ABNTLexer(input_stream)

stream = CommonTokenStream(lexer)

parser = ABNTParser(stream)

tree = parser.documento()

print(tree.toStringTree(recog=parser))