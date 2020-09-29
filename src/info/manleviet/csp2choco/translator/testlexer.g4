lexer grammar testlexer;

FM4CONFversion : 'FM4Conf-v1.0';

MODELNAME : 'MODEL';
FEATURE : 'FEATURES:';
RELATIONSHIP : 'RELATIONSHIPS:';
CONSTRAINT : 'CONSTRAINTS:';
MANDATORY : 'mandatory';
OPTIONAL : 'optional';
ALTERNATIVE : 'alternative';
OR : 'or';
REQUIRES : 'requires';
EXCLUDES : 'excludes';

NAME : ID ( SPACE ID )* ;

WS  :   [ \t\n\r]+ -> skip ;

fragment ID : ID_HEAD ID_TAIL* ;
fragment ID_HEAD : LETTER ;
fragment ID_TAIL : LETTER | DIGIT;
fragment LETTER : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;
fragment SPACE : ' '+ ;