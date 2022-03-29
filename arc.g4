grammar arc;

// Parser grammar
start                   : setup declarations;
declarations            : declaration declarations;
setup                   : setup '{' setupDeclaration '}';
setupDeclaration        : declaration';' setupDeclaration
                        | functionCall';' setupDeclaration
                        | EPSILON;
statements              : expressionStatement ';' statements
                        | returnStatement ';' statements
                        | ifStatement ';' statements
                        | forLoop ';' statements
                        | whileLoop ';' statements
                        | switchStatement ';' statements
                        | EPSILON;
assignmentStatement     : IDENTIFIER '=' expression;
expressionStatement     : expression;
returnStatement         : 'return' '(' expression ')';
ifStatement             : 'if' '(' logicalExpression ')' '{' statements '}' else;
else                    : 'else' '(' logicalExpression ')' '{' statements '}';
forLoop                 : 'for' '(' parameterDeclaration 'in' IDENTIFIER ')' '{' statements '}';
whileLoop               : 'while' '(' logicalExpression ')' '{' statements '}';
switchStatement         : 'when' '(' IDENTIFIER ')' '{' switchCase '+' else '}';
switchCase              : expression '=>' '{' statements '}';
expressionList          : expression '(' ',' expression ')'*;
expression              : arithmeticExpression
                        | relationExpression
                        | logicalExpression;
arithmeticExpression    : atomArithmeticExpression( '*' | '/' ) arithmeticExpression
                        | atomArithmeticExpression( '+' | '-' ) arithmeticExpression;
atomArithmeticExpression: NUMBER
                        | '(' arithmeticExpression ')'
                        | IDENTIFIER;
relationExpression      : arithmeticExpression ( '<' | '>' | '==' ) arithmeticExpression;
logicalExpression       : relationExpression ( 'or' | 'and' ) relationExpression;
declaration             : functionDeclaration
                        | variableDeclaration;
variableDeclaration     : typeOf IDENTIFIER '=' expression ';'
functionDeclaration     : typeOf IDENTIFIER '(' parameterDeclarationlist ')' '{' statements '}';
typeOf                  : TYPE '(' TYPEOPERATOR ')'*
parameterDeclarationlist: parameterDeclaration ( ',' parameterDeclaration)*;
parameterDeclaration    : typeOf IDENTIFIER '=' expression;
functionCall            : IDENTIFIER '(' expressionList ')';





// Lexical grammar
WS                      : [ \t\n\r]+ -> skip; // Ingore WS, taps, newline and return
EPSILON                 : '';
NUMBER                  : '-'? (DIGIT)+('.'DIGIT+)?;
DIGIT                   : [0-9]*;
ALPHA                   : [a-z] | [A-Z] | '_';
IDENTIFIER              : ALPHA(DIGIT | ALPHA)*;
TYPEOPERATOR            : (' [] ');
TYPE                    : num
                        | text
                        | bool;
COMMENTS                : '//' .*? '\n' -> skip;
LINECOMMENTS            : '/*' .*? '*/' -> skip;
KEYWORDS                : return
                        | while
                        | it
                        | for
                        | in
                        | when
                        | void
                        | arduino
                        | setup
                        | true
                        | false
                        | else
                        | define;
OPERATORS               : '+'
                        | '-'
                        | '*'
                        | '/';
LOGICALOPERATION        : 'and'
                        | 'or'
                        | 'not'
                        | 'xor';
RELATIONOPERATORS       : '<'
                        | '>'
                        | '=='
                        | '!='
                        | '<='
                        | '>=';