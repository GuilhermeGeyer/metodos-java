package com.dio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora:");
        Calculadora.soma(1.5,2);

        System.out.println("\nMensagem:");
        Mensagem.main(1);
        Mensagem.main(9);
        Mensagem.main(13);

        System.out.println("\nEmpréstimo:");
        int numeroParcelas=2;
        System.out.println(numeroParcelas+" parcelas de "+Emprestimo.valorParcela(1000f,numeroParcelas));

        System.out.println("\nQuadrilátero:");
        System.out.println("Quadrado: " + Quadrilatero.area(5));
        System.out.println("Retângulo: " + Quadrilatero.area(5,4));
        System.out.println("Trapézio: " + Quadrilatero.area(5,4,3));
    }
}
