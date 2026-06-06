grammar ABNT;

INSTITUICAO: 
    CADEIA_MAISUCULA
    ;

CURSO: 
    CADEIA_MAISUCULA
    ;

AUTOR: 
    CADEIA_MAISUCULA
    ;

TITULO_PRINCIPAL: 
    CADEIA_MAISUCULA
    ;

SUBTITULO: 
    ':' [A-Z] CADEIA_MINUSCULA
    ;

CIDADE:
    CADEIA_CAPITALIZADA
    ;

ANO:
    [0-9]{4}
    ;

TITULO_PRIMARIO
    : [0-9]+ '.'? ' '? [A-Z][A-Z ]*
    ;

TEXTO
    : ~[\r\n]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

fragment CADEIA_MAISUCULA: 
    [A-Z][A-Z ]*
    ;

fragment CADEIA_MINUSCULA: 
    [a-z][a-z ]*
    ;

fragment CADEIA_CAPITALIZADA: 
    [A-Z][a-z]*
    ;


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
    INSTITUICAO
    CURSO
    AUTOR
    TITULO_PRINCIPAL
    SUBTITULO?
    CIDADE
    ANO
    ;

//secao
//   : TITULO paragrafo+
//    ;

//paragrafo
//    : TEXTO
//    ;
