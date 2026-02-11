package org.example.Vetores;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(8.0);
        for (double nota:notas){
            System.out.println("Nota " + nota);
        }
    }
}
