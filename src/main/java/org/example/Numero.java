package org.example;

class Numero implements Expressao {
    private int numero; // O valor numérico.

    // Construtor que recebe o valor numérico.
    public Numero(int numero) {
        this.numero = numero;
    }

    // Método para interpretar o número.
    @Override
    public int interpret(Contexto contexto) {
        return numero;
    }
}