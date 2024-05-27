package org.example;


class Subtracao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    // Construtor que recebe as expressões à esquerda e à direita da subtração.
    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // Método para interpretar a operação de subtração.
    @Override
    public int interpret(Contexto contexto) {
        // Interpretamos as expressões à esquerda e à direita e retornamos a subtração.
        contexto.saida = esquerda.interpret(contexto) - direita.interpret(contexto);
        return contexto.saida;
    }
}