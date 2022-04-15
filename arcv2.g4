grammar arcv2;
import lexerRules;

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
                        | expression (MULTI | DIVI) expression #multiplication_divide_expsression
                        | expression (PLUS | MINUS) expression #plus_minus_expression
                        | expression RELATIONEQOPERATORS expression #relational_equality_expression
                        | expression RELATIONOPERATORS expression #relational_operator_expression
                        | expression 'and' expression #and_expression
                        | expression 'or' expression #or_expression;



