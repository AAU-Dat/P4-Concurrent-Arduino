grammar arcv2;

// Parser grammar
start                   : setup declarations;

declarations            : declaration declarations;

setup                   : setup '{' setupDeclaration '}'
                        | /*EPSILON*/;

setupDeclaration        : declaration';' setupDeclaration
                        | functionCall';' setupDeclaration
                        | /*EPSILON*/;

statements              : returnStatement statements
                        | ifStatement statements
                        | forLoop statements
                        | whileLoop statements
                        | switchStatement statements
                        | variableDeclaration statements
                        | assignmentStatement
                        | /*EPSILON*/;

assignmentStatement     : IDENTIFIER ('[' NUMBER ']')? '=' ('[' (expression (',' expression)*)? ']' | expression) ';';

returnStatement         : 'return' expression;

ifStatement             : 'if' '(' expression ')' '{' statements '}' else?;

else                    : 'else' '{' statements '}';

forLoop                 : 'for' '(' parameterDeclaration 'in' IDENTIFIER ')' '{' statements '}';

whileLoop               : 'while' '(' expression ')' '{' statements '}';

switchStatement         : 'when' '(' IDENTIFIER ')' '{' switchCase+ else '}';

switchCase              : expression '=>' '{' statements '}';

expression              : (NUMBER | IDENTIFIER | BOOL)
                        | (functionCall | IDENTIFIER '[' NUMBER ']')
                        | '(' expression ')'
                        | 'not' expression
                        | expression ('*' | '/') expression
                        | expression ('+' | '-') expression
                        | expression RELATIONEQOPERATORS expression
                        | expression RELATIONOPERATORS expression
                        | expression 'and' expression
                        | expression 'or' expression;

functionCall            : IDENTIFIER '(' expression (',' expression)* ')';

declaration             : functionDeclaration
                        | variableDeclaration;

functionDeclaration     : typeOf IDENTIFIER '(' parameterDeclarationlist ')' '{' statements '}';

variableDeclaration     : typeOf IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';';

typeOf                  : TYPE ( TYPEOPERATOR )*;

parameterDeclarationlist: parameterDeclaration ( ',' parameterDeclaration)*;

parameterDeclaration    : typeOf IDENTIFIER;




























// Lexical grammar
WS                      : [ \t\n\r]+ -> skip;

NUMBER                  : '-'? DIGIT+ ('.'DIGIT+)?;

fragment DIGIT          : [0-9];

BOOL                    : 'true' | 'false';

TYPEOPERATOR            : '[' ']';

TYPE                    : 'num'
                        | 'text'
                        | 'bool';

COMMENTS                : '//' .*? '\n' -> skip;

LINECOMMENTS            : '/*' .*? '*/' -> skip;

KEYWORDS                : 'return'
                        | 'while'
                        | 'it'
                        | 'for'
                        | 'in'
                        | 'when'
                        | 'void'
                        | 'arduino'
                        | 'setup'
                        // | 'true'
                        // | 'false'
                        | 'else'
                        | 'define';

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

fragment ALPHA          : [a-z] | [A-Z] | '_'; // Make ALPHA into a fragment