package org.example;

/* A classe Contexto é responsável por armazenar o contexto no qual a expressão será
interpretada, incluindo a expressão em si e o resultado da interpretação.*/

class Contexto {
    String entrada;
    int saida;

    // Construtor que recebe a expressão como entrada.
    public Contexto(String entrada) {
        this.entrada = entrada;
    }
}