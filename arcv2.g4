grammar arcv2;

// Parser grammar
start                   : declarations;

declarations            : (TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';') declarations    #variable_declaration
                        | TYPE_TYPEOPERATOR IDENTIFIER '(' (TYPE_TYPEOPERATOR IDENTIFIER ( ',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')' '{' statements '}' declarations #function_declaration
                        | '#' 'pin' IDENTIFIER '('(PINDIGIT |NUMBER)',' ('INPUT' | 'OUTPUT')')' ';' declarations #pin_declaration
                        | 'task' ('(' (TYPE_TYPEOPERATOR IDENTIFIER ( ',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')')? (('every' NUMBER) | ('when' '(' expression ')')) '{' statements '}' declarations #task_declarations
                        | /*EPSILON*/ #empty_declaration;

statements              : 'return' expression ';' statements #return_statement
                        | 'if' '(' expression ')' '{' statements '}' ('else' '{' statements '}')? statements #if_else_statement
                        | 'for' '(' TYPE_TYPEOPERATOR IDENTIFIER 'in' IDENTIFIER ')' '{' statements '}' statements      #forloop_statement
                        | 'while' '(' expression ')' '{' statements '}' statements #whileloop_statement
                        | (TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';') statements #variable_declaration_statement
                        | IDENTIFIER ('[' NUMBER ']')? '=' ('[' (expression (',' expression)*)? ']' | expression) ';'statements #assignment_statement
                        | (IDENTIFIER | ARDUINOFUNCTIONS)'(' (expression (',' expression)*)? ')' ';' statements #function_call_statement
                        | /*EPSILON*/ #empty_statement;

expression              : (NUMBER | IDENTIFIER | BOOL | CHAR) #terminal_expression
                        | (IDENTIFIER | ARDUINOFUNCTIONS)'(' (expression (',' expression)*)? ')' #function_access_expression
                        | IDENTIFIER '[' NUMBER ']' | ARDUINOFUNCTIONS '(' expression ')' #array_access_expression
                        | '(' expression ')' #parentheses_expression
                        | 'not' expression  #unary_negation_expression
                        | expression (MULTI | DIVI) expression #multiplication_divide_expression
                        | expression (PLUS | MINUS) expression #plus_minus_expression
                        | expression RELATIONEQOPERATORS expression #relational_equality_expression
                        | expression RELATIONOPERATORS expression #relational_operator_expression
                        | expression 'and' expression #and_expression
                        | expression 'or' expression #or_expression;


// Lexical grammar
WS                      : [ \t\n\r]+ -> skip;

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