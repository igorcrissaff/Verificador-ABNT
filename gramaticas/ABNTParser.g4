grammar ABNTParser;
options {
    tokenVocab=ABNTLexer;
}

documento: 
    capa 
    //sumario 
    //resumo 
    //introducao
    //desenvolvimento
    //conclusao
    //referencias
    EOF
    ;


capa: 
    curso
    autores
    titulo
    publicacao
    ;

curso: 
    INSTITUICAO 
    CURSO
    ;

autores:
    AUTOR+
    ;

titulo: 
    TITULO_PRINCIPAL SUBTITULO?
    ;

publicacao: 
    CIDADE '-' ESTADO '\n' ANO
    ;
