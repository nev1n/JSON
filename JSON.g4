// lexer rules start with upper case - observe this by adding reg expressions
//parser rules start with lower case

//**********Grammar - PARSER RULES*******************
grammar JSON;

json    : object
        ;

object  : '{' (property (',' property)*)? '}' //parser rule - one or more instances of property  | '{''}' <- optional
             //    Why are you already bothered about whitespace here?    | '{' WS '}'
        ;

property
    : key ':' value
    ;

key : StringLiteral;

value
    : object
    | array
    | stringValue
    | booleanValue
    | intValue
    | nullValue
    ;

nullValue
    : NullType
    ;

booleanValue
    :   BooleanType
    ;
intValue
    :  IntType
    ;
stringValue
    :   StringLiteral
    ;

array
    : '[' (object (',' object)*)?  ']'   // parser rule - one or more instances of object :)
    ;

//******LEXER RULES***********

StringLiteral   : '"' (~["\\])* '"' ;     // Lexer Rule
BooleanType     : 'true' | 'false'  ;
IntType         : '0' | [1-9][0-9]*;  // [0-9]+
NullType        : 'null';

WS              :   [ \t\n\r]+ -> skip ;
