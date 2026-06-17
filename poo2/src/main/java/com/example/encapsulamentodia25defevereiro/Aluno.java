package com.example.encapsulamentodia25defevereiro;

public class Aluno {
    // ATRIBUTOS DA CLASE
    private String nome;
    private int idade;

    //CONSTRUTOR 
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //METODOS DE ACESSO
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
