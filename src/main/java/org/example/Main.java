package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto("48 3 6 35 + + -");

        //Stack Cria Pilhas Para Armazenar Expressões
        Stack<Expressao> stack = new Stack<>();

        for (String token : contexto.entrada.split(" ")) {

            if (token.equals("+")) {
                Expressao direita = stack.pop();
                Expressao esquerda = stack.pop();
                stack.push(new Soma(esquerda, direita));
            } else if (token.equals("-")) {
                Expressao direita = stack.pop();
                Expressao esquerda = stack.pop();
                stack.push(new Subtracao(esquerda, direita));
            }
            else {

                stack.push(new Numero(Integer.parseInt(token)));
            }
        }

        Expressao expressao = stack.pop();

        int resultado = expressao.interpret(contexto);

        //4
        //48 - 44
        //48 - (3 + 41)
        //48 - (3 + (6 + 35))

        System.out.println("Resultado: " + resultado); // Saída: Resultado: 4
    }
}