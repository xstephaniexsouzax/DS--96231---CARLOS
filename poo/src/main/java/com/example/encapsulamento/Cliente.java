package com.example.encapsulamento;

public class Cliente {
    // ATRIBUTOS DA CLASSE - POO
    // VARIAVEL DA CLASSE - ALGORITIMO
    String nome;
    private int idade;

    // MÉTODOS DE ACESSO - POO
    // FUNÇÃO DE ACESSO - ALGORITMO
    // SET COLOCAR O VALOR
    // GET PEGA, PEDE, COLOCA, DEFINE O VALOR

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
