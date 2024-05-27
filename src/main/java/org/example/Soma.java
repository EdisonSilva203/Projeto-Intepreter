package org.example;


class Soma implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    // Construtor que recebe as expressões à esquerda e à direita da adição.
    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    // Método para interpretar a operação de adição.
    @Override
    public int interpret(Contexto contexto) {
        // Interpretamos as expressões à esquerda e à direita e retornamos a soma.
        contexto.saida = esquerda.interpret(contexto) + direita.interpret(contexto);
        return contexto.saida;
    }
}