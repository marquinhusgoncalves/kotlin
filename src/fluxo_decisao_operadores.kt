// Seção 08 - Controle de fluxo

// && -> AND(Conjunção)
// || -> OR(Disjunção)
// ! -> NOT

/*
TABELA VERDADE - AND

expr1     expr2

true      false     false
true      true      true
false     false     false
false     true      false
* */

/*
TABELA VERDADE - OR

expr1     expr2

true      false     true
true      true      true
false     false     false
false     true      true
* */

/*
TABELA VERDADE - NOT

expr1     expr2

true      false
FALSE     true
* */

/*
EX:
if((expr1 && expr2) || expr3 || expr4){}

expr1 && expr2     expr3     expr4

true               false     false     true
false              true      false     true
false              false     true      true

* */