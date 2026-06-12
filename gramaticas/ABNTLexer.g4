lexer grammar ABNTLexer;

INSTITUICAO: 
    CADEIA_MAISUCULA '\n'
    ;

CURSO: 
    CADEIA_MAISUCULA '\n'
    ;

AUTOR: 
    CADEIA_MAISUCULA '\n'
    ;

TITULO_PRINCIPAL:      
    CADEIA_MAISUCULA
    ;

SUBTITULO: 
    ':' CADEIA_CAPITALIZADA '\n'
    ;

ESTADO: 
    MAIUSCULA{2}
    ;

CIDADE:
    CADEIA_CAPITALIZADA
    ;

ANO:
    DIGITO{4}
    ;

TITULO_PRIMARIO
    : DIGITO+ '.'? ' '? CADEIA_MAISUCULA '\n'   
    ;

TEXTO
    : [\p{Ll}0-9 ,.;:()"-]+
    ;


fragment MAIUSCULA: 
    [\p{Lu}]
    ;

fragment CADEIA_MAISUCULA: 
    [\p{Lu} ,.;:()"-]+
    ;

fragment MINUSCULA: 
    [\p{Ll}]
    ;

fragment CADEIA_MINUSCULA: 
    [\p{Ll} ,.;:()"-]+
    ;

fragment CADEIA_CAPITALIZADA: 
    [\p{Lu} ][\p{Ll} ,.;:()"-]*
    ;

fragment DIGITO: 
    [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;