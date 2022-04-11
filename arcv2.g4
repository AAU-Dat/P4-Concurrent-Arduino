grammar arcv2;

// Parser grammar
start                   : /*setup*/ tasks declarations;

declarations            : TYPE_TYPEOPERATOR IDENTIFIER '(' (parameterDeclaration ( ',' parameterDeclaration)*)? ')' '{' statements '}' declarations
                        | variableDeclaration declarations
                        | '#' 'pin' IDENTIFIER '('PINDIGIT',' ('INPUT' | 'OUTPUT')')' declarations
                        | /*EPSILON*/;

tasks                   : task*;  //task chould be written as a declaration

task                    : 'task' ('(' (parameterDeclaration ( ',' parameterDeclaration)*)? ')')? (('every' INT) | ('when' '(' expression ')')) '{' statements '}';

//setup                   : 'setup' '{' setupDeclaration '}'
//                        | /*EPSILON*/;
//
//setupDeclaration        : declaration';' setupDeclaration
//                        | functionCall';' setupDeclaration
//                        | /*EPSILON*/;

statements              : 'return' expression ';' statements
                        | 'if' '(' expression ')' '{' statements '}' ('else' '{' statements '}')? statements
                        | 'for' '(' parameterDeclaration 'in' IDENTIFIER ')' '{' statements '}' statements
                        | 'while' '(' expression ')' '{' statements '}' statements
                        | 'when' '(' IDENTIFIER ')' '{' (expression '=>' '{' statements '}')+ 'else' '{' statements '}' '}' statements
                        | variableDeclaration statements
                        | IDENTIFIER ('[' NUMBER ']')? '=' ('[' (expression (',' expression)*)? ']' | expression) ';'
                        | /*EPSILON*/;

expression              : (NUMBER | IDENTIFIER | BOOL)
                        | (functionCall | IDENTIFIER '[' NUMBER ']')
                        | '(' expression ')'
                        | 'not' expression
                        | expression (MULTI | DIVI) expression
                        | expression (PLUS | MINUS) expression
                        | expression RELATIONEQOPERATORS expression
                        | expression RELATIONOPERATORS expression
                        | expression 'and' expression
                        | expression 'or' expression;

functionCall            : IDENTIFIER '(' expression (',' expression)* ')';

variableDeclaration     : TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';';

parameterDeclaration    : TYPE_TYPEOPERATOR IDENTIFIER;



// Lexical grammar
WS                      : [ \t\n\r]+ -> skip;

NUMBER                  : '-'? DIGIT+ ('.'DIGIT+)?;

PINDIGIT                : DIGIT
                        | '1' [0-3]
                        | 'A'[0-5];

INT                     : DIGIT;

fragment DIGIT          : [0-9];

BOOL                    : 'true' | 'false';

TYPE_TYPEOPERATOR       : PREFIXOPERATOR? TYPE ( TYPEOPERATOR)*;

fragment TYPEOPERATOR   : '[]';

fragment PREFIXOPERATOR : 'mut ';

fragment TYPE           : 'num'
                        | 'text'
                        | 'bool'
                        | 'char'
                        | 'time'
                        | 'pin';

COMMENTS                : '//' .*? '\n' -> skip;

LINECOMMENTS            : '/*' .*? '*/' -> skip;

//keywords
RETURN                  : 'return';
WHILE                   : 'while';
IT                      : 'it';
FOR                     : 'for';
IN                      : 'in';
WHEN                    : 'when';
VOID                    : 'void';
ARDUINO                 : 'arduino';
SETUP                   : 'setup';
ELSE                    : 'else';
DEFINE                  : 'define';
EVERY                   : 'every';
TASK                    : 'task';
INPUT                   : 'INPUT';
OUTPUT                  : 'OUTPUT';
SLEEP                   : 'sleep'; //delay, await
YIELD                   : 'yield';

//from here
//Digital I/O

DIGITALREAD             : 'DigitalRead';
DIGITALWRITE            : 'DigitalWrite';
PINMODE                 : 'pinmode';

//Analog I/O

ANALOGREAD              : 'analogRead';
ANALOGWRITE             : 'analogWrite';

//Time

DELAY                   : 'delay';

//Interruption

//interrupts()        - nice to have; but is it relevant?
//noInterrupts()    - nice to have; but is it relevant?
//skal testes i protothreads
//Communication

//Serial
PRINTLN                 : 'println';

//Variables
//Arduino data types and constants.

//Constants

INPUT_PULLUP            : 'INPUT_PULLUP';
LED_BUILTIN             : 'LED_BUILTIN';


MULTI                   : '*';
DIVI                    : '/';
PLUS                    : '+';
MINUS                   : '-';

RELATIONEQOPERATORS     : '=='
                        | '!=';

RELATIONOPERATORS       : '<'
                        | '>'
                        | '<='
                        | '>=';

AND                     : 'and';
OR                      : 'or';
NOT                     : 'not';
XOR                     : 'xor';

IDENTIFIER              : ALPHA(DIGIT | ALPHA)*;

ASSIGNMENT              : '=';
SEPERATOR               : ',';

fragment ALPHA          : [a-z] | [A-Z] | '_';