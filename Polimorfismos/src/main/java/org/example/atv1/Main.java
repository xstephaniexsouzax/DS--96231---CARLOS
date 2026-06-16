package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Soma soma= new Soma();
        System.out.println("SOMA");
        System.out.println(soma.calcular(4,5));

        Subtracao subtracao = new Subtracao();
        System.out.println("SUBTRAÇÃO");
        System.out.println(subtracao.calcular(4,2));

        Divisao divisao = new Divisao();
        System.out.println("Divisão");
        System.out.println(subtracao.calcular(4,2));

        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println("Multiplicação");
        System.out.println(divisao.calcular(4,9));


    }
}
