grammar arcv2;
import lexerRules;

// Parser grammar
start: declaration*;

declaration
     : PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER '=' ('[' (expression (',' expression)*)? ']' | expression) ';'                                                         # variable_declaration
     | PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER '(' (PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER (',' PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER)*)? ')' statement*                                 # function_declaration
     | '#' 'pin' IDENTIFIER '(' (PINDIGIT | NUMBER) ',' ('INPUT' | 'OUTPUT') ')' ';'                                                                       # pin_declaration
     | 'task' ('(' (PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER ( ',' PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER)*)? ')')? (('every' NUMBER) | ('when' '(' expression ')'))? statement* # task_declaration;
     // Task needs parameters and not declarations as input.
block: '{' statement* '}';
//Maybe change statement in if, function/task declaration, for and while to block
statement
     : block                                                                                                                                               # block_statement
     | 'return' expression ';'                                                                                                                             # return_statement
     | 'if' '(' expression ')' block ('else' block)?                                                                                               # if_else_statement
     | 'for' '(' PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER 'in' IDENTIFIER ')' block                                                                                # forloop_statement
     | 'while' '(' expression ')' block                                                                                                                # whileloop_statement
     | (PREFIXOPERATOR? TYPE  TYPEOPERATOR? IDENTIFIER '=' ( '[' (expression (',' expression)*)? ']' | expression) ';')                                                      # variable_declaration_statement
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
