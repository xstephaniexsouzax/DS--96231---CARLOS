package org.example.Vetores;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int quantidade = ler.nextInt();

        double [] notas = new double[quantidade];


        for (int i = 0; i<quantidade; i++){
            System.out.println("Digite a " + (i+1) + "º nota");
            notas [i] = ler.nextDouble();
            if (notas[i] < 0 || notas [i] > 10){
                System.out.println(" A nota deve ser entre 0 e 10");
            }
        }

    }

}
