grammar arcv2;
import lexerRules;

// Parser grammar
start: declaration*;

declaration
     : TYPE_TYPEOPERATOR IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';'                                                         # variable_declaration
     | TYPE_TYPEOPERATOR IDENTIFIER '(' (TYPE_TYPEOPERATOR IDENTIFIER (',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')' statement*                                 # function_declaration
     | '#' 'pin' IDENTIFIER '(' (PINDIGIT | NUMBER) ',' ('INPUT' | 'OUTPUT') ')' ';'                                                                       # pin_declaration
     | 'task' ('(' (TYPE_TYPEOPERATOR IDENTIFIER ( ',' TYPE_TYPEOPERATOR IDENTIFIER)*)? ')')? (('every' NUMBER) | ('when' '(' expression ')'))? statement* # task_declaration;

block: '{' statement* '}';
//Maybe change statement in if, function/task declaration, for and while to block
statement
     : block                                                                                                                                               # block_statement
     | 'return' expression ';'                                                                                                                             # return_statement
     | 'if' '(' expression ')' statement ('else' statement)?                                                                                               # if_else_statement
     | 'for' '(' TYPE_TYPEOPERATOR IDENTIFIER 'in' IDENTIFIER ')' statement                                                                                # forloop_statement
     | 'while' '(' expression ')' statement                                                                                                                # whileloop_statement
     | (TYPE_TYPEOPERATOR IDENTIFIER '=' ( '[' (expression (',' expression)*)? ']' | expression) ';')                                                      # variable_declaration_statement
     | IDENTIFIER ('[' NUMBER ']')? '=' ( '[' (expression (',' expression)*)? ']' | expression) ';'                                                        # assignment_statement
     | (IDENTIFIER | ARDUINOFUNCTIONS) '(' (expression (',' expression)*)? ')' ';'                                                                         # function_call_statement;

expression
     : (NUMBER | IDENTIFIER | BOOL | CHAR)                                                                                                                 # terminal_expression
     | (IDENTIFIER | ARDUINOFUNCTIONS) '(' (expression (',' expression)*)? ')'                                                                             # function_access_expression
     | IDENTIFIER '[' NUMBER ']'                                                                                                                           # array_access_expression
     | '(' expression ')'                                                                                                                                  # parentheses_expression
     | 'not' expression                                                                                                                                    # unary_negation_expression
     | expression (MULTI | DIVI) expression                                                                                                                # multiplication_divide_expression
     | expression (PLUS | MINUS) expression                                                                                                                # plus_minus_expression
     | expression RELATIONEQOPERATORS expression                                                                                                           # relational_equality_expression
     | expression RELATIONOPERATORS expression                                                                                                             # relational_operator_expression
     | expression 'and' expression                                                                                                                         # and_expression
     | expression 'or' expression                                                                                                                          # or_expression;
