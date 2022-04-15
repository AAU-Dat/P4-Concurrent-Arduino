lexer grammar lexerRules;

NUMBER                                 : '-'? DIGIT+ ('.'DIGIT+)?;

PINDIGIT                                 : 'A'[0-5];

INT                                            : DIGIT;

fragment DIGIT                        : [0-9];

BOOL                                        : 'true' | 'false';

CHAR                                        :  '"' . '"'; //Is this ascii or unicode?

TYPE_TYPEOPERATOR         : PREFIXOPERATOR? TYPE ( TYPEOPERATOR)*;

fragment TYPEOPERATOR      : '[]';

fragment PREFIXOPERATOR  : 'mut ';

fragment TYPE                           : 'num'
                                                    | 'bool'
                                                    | 'char';

COMMENTS                             : '//' .*? '\n' -> skip;

LINECOMMENTS                    : '/*' .*? '*/' -> skip;

// Keywords

RETURN                                    : 'return';
WHILE                                       : 'while';
IT                                                : 'it';
FOR                                            : 'for';
IN                                                : 'in';
WHEN                                        : 'when';
VOID                                          : 'void';

SETUP                                        : 'setup';
ELSE                                           : 'else';
DEFINE                                      : 'define';
EVERY                                       : 'every';
TASK                                          : 'task';

// Arduino

PINMODE                                   : 'pinmode';
INPUT                                         : 'INPUT';
OUTPUT                                     : 'OUTPUT';
YIELD                                         : 'yield';

// Digital I/O

ARDUINOFUNCTIONS            : DIGITALWRITE | DIGITALREAD | ANALOGREAD | ANALOGWRITE;
fragment DIGITALREAD           : 'DigitalRead';
fragment DIGITALWRITE          : 'DigitalWrite';

fragment SLEEP                           : 'sleep';

// Analog I/O

fragment ANALOGREAD            : 'AnalogRead';
fragment ANALOGWRITE          : 'AnalogWrite';

// Constants

INPUT_PULLUP                         : 'INPUT_PULLUP';
LED_BUILTIN                             : 'LED_BUILTIN';


MULTI                                           : '*';
DIVI                                               : '/';
PLUS                                              : '+';
MINUS                                           : '-';

RELATIONEQOPERATORS        : '=='
                                                        | '!=';

RELATIONOPERATORS              : '<'
                                                        | '>'
                                                        | '<='
                                                        | '>=';

AND                                                : 'and';
OR                                                   : 'or';
NOT                                                : 'not';
XOR                                                : 'xor';

IDENTIFIER                                   : ALPHA(DIGIT | ALPHA)*;

ASSIGNMENT                               : '=';
SEPERATOR                                   : ',';
STARTPARANTHESES                 : '(';
ENDPARANTHESES                     : ')';
STARTSQUAREBRACKET          : '[';
ENDSQUAREBRACKET              : ']';
STARTCURLYBRACKET             : '{';
ENDCURLYBRACKET                 : '}';

fragment ALPHA                            : [a-z] | [A-Z] | '_';

WS                                                   : [ \t\n\r]+ -> skip;