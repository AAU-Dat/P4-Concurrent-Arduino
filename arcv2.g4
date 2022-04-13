grammar arcv2;

// Parser grammar
start                   : declaration*;

declaration            : (TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';')     #variable_declaration
                        | TYPE_TYPEOPERATOR IDENTIFIER '(' (TYPE_TYPEOPERATOR IDENTIFIER ( ',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')'  statement*  #function_declaration
                        | '#' 'pin' IDENTIFIER '('(PINDIGIT |NUMBER)',' ('INPUT' | 'OUTPUT')')' ';' #pin_declaration
                        | 'task' ('(' (TYPE_TYPEOPERATOR IDENTIFIER ( ',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')')? (('every' NUMBER) | ('when' '(' expression ')')) statement*  #task_declaration;

block                   : '{' statement* '}';

statement               : 'return' expression ';' #return_statement
                        | block #block_statement
                        | 'if' '(' expression ')' statement ('else' statement )? #if_else_statement
                        | 'for' '(' TYPE_TYPEOPERATOR IDENTIFIER 'in' IDENTIFIER ')'  statement   #forloop_statement
                        | 'while' '(' expression ')' statement #whileloop_statement
                        | (TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';') #variable_declaration_statement
                        | IDENTIFIER ('[' NUMBER ']')? '=' ('[' (expression (',' expression)*)? ']' | expression) ';' #assignment_statement
                        | (IDENTIFIER | ARDUINOFUNCTIONS)'(' (expression (',' expression)*)? ')' ';' #function_call_statement;

expression              : (NUMBER | IDENTIFIER | BOOL | CHAR) #terminal_expression
                        | (IDENTIFIER | ARDUINOFUNCTIONS)'(' (expression (',' expression)*)? ')' #function_access_expression
                        | IDENTIFIER '[' NUMBER ']' #array_access_expression
                        | '(' expression ')' #parentheses_expression
                        | 'not' expression  #unary_negation_expression
                        | expression (MULTI | DIVI) expression #multiplication_divide_expression
                        | expression (PLUS | MINUS) expression #plus_minus_expression
                        | expression RELATIONEQOPERATORS expression #relational_equality_expression
                        | expression RELATIONOPERATORS expression #relational_operator_expression
                        | expression 'and' expression #and_expression
                        | expression 'or' expression #or_expression;


// Lexical grammar
NUMBER                  : '-'? DIGIT+ ('.'DIGIT+)?;

PINDIGIT                : 'A'[0-5];

INT                     : DIGIT;

fragment DIGIT          : [0-9];

BOOL                    : 'true' | 'false';

CHAR                    :  '"' . '"'; //Is this ascii or unicode?

TYPE_TYPEOPERATOR       : PREFIXOPERATOR? TYPE ( TYPEOPERATOR)*;

fragment TYPEOPERATOR   : '[]';

fragment PREFIXOPERATOR : 'mut ';

fragment TYPE           : 'num'
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

SETUP                   : 'setup';
ELSE                    : 'else';
DEFINE                  : 'define';
EVERY                   : 'every';
TASK                    : 'task';

//ARDUINO                 : 'arduino';
PINMODE                 : 'pinmode';
INPUT                   : 'INPUT';
OUTPUT                  : 'OUTPUT';
YIELD                   : 'yield';

//from here
//Digital I/O

ARDUINOFUNCTIONS        : DIGITALWRITE | DIGITALREAD | ANALOGREAD | ANALOGWRITE;
fragment DIGITALREAD    : 'DigitalRead';
fragment DIGITALWRITE   : 'DigitalWrite';

fragment SLEEP          : 'sleep'; //delay, await
//Analog I/O

fragment ANALOGREAD     : 'analogRead';
fragment ANALOGWRITE    : 'analogWrite';

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

IDENTIFIER              : ALPHA(DIGIT | ALPHA)*; //has to intersected with words in arduino and c++ that cannot be used

ASSIGNMENT              : '=';
SEPERATOR               : ',';
STARTPARANTHESES        : '(';
ENDPARANTHESES          : ')';
STARTSQUAREBRACKET      : '[';
ENDSQUAREBRACKET        : ']';
STARTCURLYBRACKET       : '{';
ENDCURLYBRACKET         : '}';

fragment ALPHA          : [a-z] | [A-Z] | '_';

WS                      : [ \t\n\r]+ -> skip;