package org.example.Vetores;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int quantidade = ler.nextInt();

        double [] notas = new double[quantidade];
        double soma = 0;

        for (int i = 0; i<2; i++){
            System.out.println("Digite a " + (i+1) + "º nota");
            notas[i] = ler.nextDouble();
            soma+=notas[i];
        }
        double media = soma / notas.length;
        System.out.println( "\nExibindo as notas: ");

        for (double nota: notas){
            double valor = nota;
        }
        System.out.println(" A médias das notas é " + media);
    }
}
