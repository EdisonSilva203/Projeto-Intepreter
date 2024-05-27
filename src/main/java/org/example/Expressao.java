package org.example;

/* A interface Expressão define um método interpret que todas as expressões devem implementar.
Isso permite que diferentes tipos de expressões (números, operações matemáticas, etc.)
sejam interpretados de maneira uniforme. */

interface Expressao {
    int interpret(Contexto contexto);

}