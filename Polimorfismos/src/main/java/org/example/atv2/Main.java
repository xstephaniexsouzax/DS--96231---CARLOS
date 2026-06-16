package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Stephanie", "26082026", Sexo.FEMININO, Setor.OPERACOES, 1000.00, "12549");
        Diretor diretor = new Diretor("Elionai", "22071997", Sexo.FEMININO, Setor.FINANCEIRO, 2000.00);


        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());
    }
    
}
