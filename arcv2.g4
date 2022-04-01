grammar arcv2;

// Parser grammar
start                   : setup declarations;

declarations            : declaration*;

setup                   : 'setup' '{' setupDeclaration '}'
                        | /*EPSILON*/;

setupDeclaration        : declaration';' setupDeclaration
                        | functionCall';' setupDeclaration
                        | /*EPSILON*/;

statements              : returnStatement statements
                        | ifStatement statements
                        | forLoop statements
                        | whileLoop statements
                        | whenStatement statements
                        | variableDeclaration statements
                        | assignmentStatement
                        | /*EPSILON*/;

assignmentStatement     : IDENTIFIER ('[' NUMBER ']')? '=' ('[' (expression (',' expression)*)? ']' | expression) ';';

returnStatement         : 'return' expression ';';

ifStatement             : 'if' '(' expression ')' '{' statements '}' else?;

else                    : 'else' '{' statements '}';

forLoop                 : 'for' '(' parameterDeclaration 'in' IDENTIFIER ')' '{' statements '}';

whileLoop               : 'while' '(' expression ')' '{' statements '}';

whenStatement         : 'when' '(' IDENTIFIER ')' '{' whenCase+ else '}';

whenCase              : expression '=>' '{' statements '}';

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

declaration             : functionDeclaration
                        | variableDeclaration;

functionDeclaration     : typeOf IDENTIFIER '(' (parameterDeclaration ( ',' parameterDeclaration)*)? ')' '{' statements '}';

variableDeclaration     : typeOf IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';';

typeOf                  : TYPE_TYPEOPERATOR;

parameterDeclaration    : typeOf IDENTIFIER;



// Lexical grammar
WS                      : [ \t\n\r]+ -> skip;

NUMBER                  : '-'? DIGIT+ ('.'DIGIT+)?;

fragment DIGIT          : [0-9];

BOOL                    : 'true' | 'false';

TYPE_TYPEOPERATOR       : TYPE ( TYPEOPERATOR)*; // Name should maybe be rewritten

fragment TYPEOPERATOR   : '[' ']';

fragment TYPE           : 'num'
                        | 'text'
                        | 'bool'
                        | 'char';

COMMENTS                : '//' .*? '\n' -> skip;

LINECOMMENTS            : '/*' .*? '*/' -> skip;

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