package com.example.encapsulamentodia25defevereiro;

public class Prin {
    public static void main(String[] args) {
        
        //COM OS METODOS DE ACESSO
        //Aluno aluno1 = new Aluno();
        // aluno1.setNome("Stephanie");
        // aluno1.setIdade(26);
        
        //COM O CONSTRUTOR

        Aluno aluno1 = new Aluno("Stephanie", 26);

        System.out.println("Nome " + aluno1.getNome());
        System.out.println("Idade " + aluno1.getIdade());

        Funcionario f1 = new Funcionario("Stephanie", "stephaniesis024@gmail.com");

        System.out.println("Nome do funicionário: " + f1.getNome());
        System.out.println("O email é: " + f1.getEmail());



    



    }

}
