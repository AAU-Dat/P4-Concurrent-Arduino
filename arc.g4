grammar arc;

// Parser grammar
start                   : setup;
setup                   : setup '{' setupdeclaration '}';
setupdeclaration        : declaration';' setupdeclaration
                        | functioncall';' setupdeclaration
                        | EPSILON;
statements              : statement';' statements
                        | EPSILON;
statement               : expression;
ifstatement             : 'if' '(' logicalexpression ')' '{' statements '}' else;
else                    : 'else' '(' logicalexpression ')' '{' statements '}';
forloop                 : 'for' '(' variabledeclaration 'in' IDENTIFIER ')' '{' statements '}';
whileloop               : 'while' '(' logicalexpression ')' '{' statements '}';
switchstatement         : 'when' '(' IDENTIFIER ')' '{' switchcase '+' else '}';
switchcase              : expression '=>' '{' statements '}';
expressionlist          : expression '(' ',' expression ')'*;
expression              : arithmeticexpression
                        | relationexpression
                        | logicalexpression;
arithmeticexpression    : atomarithmeticexpression( '*' | '/' ) arithmeticexpression
                        | atomarithmeticexpression( '+' | '-' ) arithmeticexpression;
atomarithmeticexpression: NUMBER
                        | '(' arithmeticexpression ')'
                        | IDENTIFIER;
relationexpression      : arithmeticexpression ( '<' | '>' | '==' ) arithmeticexpression;
logicalexpression       : relationexpression ( 'or' | 'and' ) relationexpression;
declaration             : functiondeclaration
                        | variabledeclaration;
functiondeclaration     : typeof IDENTIFIER '(' variabledeclarationlist ')' '{' statements '}';
typeof                  : TYPE '(' TYPEOPERATOR ')'*
variabledeclarationlist : variabledeclaration '(' ',' variabledeclaration')'*;
variabledeclaration     : typeof IDENTIFIER '=' expression;
functioncall            : IDENTIFIER '(' expressionlist ')';





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