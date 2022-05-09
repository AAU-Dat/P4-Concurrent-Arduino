lexer grammar lexerRules;

NUMBER:                  '-'? DIGIT+ ('.' DIGIT+)?;
PINDIGIT:                'A' [0-5];
INT:                     DIGIT;
fragment DIGIT:          [0-9];

BOOL:                    'true' | 'false';
CHAR:                    '"' . '"'; //Is this ascii or unicode?

TYPEOPERATOR:   '[]';
PREFIXOPERATOR: 'mut ';
TYPE:           'num' | 'bool' | 'char';
COMMENTS:                '//' .*? '\n' -> skip;
LINECOMMENTS:            '/*' .*? '*/' -> skip;

// Keywords
RETURN:                  'return';
WHILE:                   'while';
IT:                      'it';
FOR:                     'for';
IN:                      'in';
WHEN:                    'when';
VOID:                    'void';
SETUP:                   'setup';
ELSE:                    'else';
DEFINE:                  'define';
EVERY:                   'every';
TASK:                    'task';

// Arduino
PINMODE:                 'pinmode';
INPUT:                   'INPUT';
OUTPUT:                  'OUTPUT';
YIELD:                   'yield';

ARDUINOEXPRESSIONS: HIGH | LOW | LED_BUILTIN; 
fragment HIGH:                    'HIGH';
fragment LOW:                     'LOW';
fragment LED_BUILTIN:             'LED_BUILTIN';


ARDUINOFUNCTIONS:        DIGITALWRITE | DIGITALREAD | ANALOGREAD | ANALOGWRITE;
// Digital I/O
fragment DIGITALREAD:    'digitalRead';
fragment DIGITALWRITE:   'digitalWrite';

// Analog I/O
fragment ANALOGREAD:     'analogRead';
fragment ANALOGWRITE:    'analogWrite';

// SLEEP
// fragment SLEEP:          'sleep';

// Constants
INPUT_PULLUP:            'INPUT_PULLUP';
MULTI:                   '*';
DIVI:                    '/';
PLUS:                    '+';
MINUS:                   '-';
RELATIONEQOPERATORS:     '==' | '!=';
RELATIONOPERATORS:       '<' | '>' | '<=' | '>=';
AND:                     'and';
OR:                      'or';
NOT:                     'not';
XOR:                     'xor';
IDENTIFIER:              ALPHA (DIGIT | ALPHA)*;
ASSIGNMENT:              '=';
SEPERATOR:               ',';
STARTPARANTHESES:        '(';
ENDPARANTHESES:          ')';
STARTSQUAREBRACKET:      '[';
ENDSQUAREBRACKET:        ']';
STARTCURLYBRACKET:       '{';
ENDCURLYBRACKET:         '}';
fragment ALPHA:          [a-z] | [A-Z] | '_';
WS:                      [ \t\n\r]+    -> skip;