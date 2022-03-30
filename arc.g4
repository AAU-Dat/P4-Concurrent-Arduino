grammar arc;

// We have to fix ; under statement in case of single statement

// Parser grammar
start                   : setup declarations;

declarations            : declaration declarations;

setup                   : setup '{' setupDeclaration '}'
                        | /*EPSILON*/;

setupDeclaration        : declaration';' setupDeclaration
                        | functionCall';' setupDeclaration
                        | /*EPSILON*/;

statements              : expressionStatement ';' statements
                        | returnStatement statements
                        | ifStatement statements
                        | forLoop statements
                        | whileLoop statements
                        | switchStatement statements
                        | variableDeclaration statements
                        | /*EPSILON*/;

assignmentStatement     : typeOf IDENTIFIER '=' expression;

expressionStatement     : expression;

returnStatement         : 'return' expression;

ifStatement             : 'if' '(' logicalExpression ')' '{' statements '}' else;

else                    : 'else' '{' statements '}';

forLoop                 : 'for' '(' parameterDeclaration 'in' IDENTIFIER ')' '{' statements '}';

whileLoop               : 'while' '(' logicalExpression ')' '{' statements '}';

switchStatement         : 'when' '(' IDENTIFIER ')' '{' switchCase+ else '}';

switchCase              : expression '=>' '{' statements '}';

expressionList          : expression '(' ',' expression ')'*;

expression              : arithmeticExpression
                        | relationExpression
                        | logicalExpression;
                        // ConditionalExpression

arithmeticExpression    : atomArithmeticExpression( '*' | '/' ) arithmeticExpression
                        | atomArithmeticExpression( '+' | '-' ) arithmeticExpression
                        | atomArithmeticExpression;

atomArithmeticExpression: NUMBER
                        | '(' arithmeticExpression ')'
                        | IDENTIFIER
                        | functionCall;

logicalExpression       : relationExpression
                        | logicalExpression LOGICALOPERATION logicalExpression
                        | BOOL;

relationExpression      : arithmeticExpression RELATIONOPERATORS arithmeticExpression;

declaration             : functionDeclaration
                        | variableDeclaration;

variableDeclaration     : typeOf IDENTIFIER '=' expression ';';

functionDeclaration     : typeOf IDENTIFIER '(' parameterDeclarationlist ')' '{' statements '}';

typeOf                  : TYPE ( TYPEOPERATOR )*;

parameterDeclarationlist: parameterDeclaration ( ',' parameterDeclaration)*;

parameterDeclaration    : typeOf IDENTIFIER;

functionCall            : IDENTIFIER '(' expressionList ')';





// Lexical grammar
WS                      : [ \t\n\r]+ -> skip;

NUMBER                  : '-'? DIGIT+ ('.'DIGIT+)?;

fragment DIGIT          : [0-9];

BOOL                    : 'true' | 'false';

TYPEOPERATOR            : (' [] ');

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

OPERATORS               : '+'
                        | '-'
                        | '*'
                        | '/';

RELATIONOPERATORS       : '<'
                        | '>'
                        | '=='
                        | '!='
                        | '<='
                        | '>=';

LOGICALOPERATION        : 'and'
                        | 'or'
                        | 'not'
                        | 'xor';

IDENTIFIER              : ALPHA(DIGIT | ALPHA)*;

fragment ALPHA          : [a-z] | [A-Z] | '_'; // Make ALPHA into a fragment