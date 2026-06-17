package com.example.encapsulamentodia25defevereiro;

public class Prin {
    public static void main(String[] args) {
        
        //COM OS METODOS DE ACESSO
        //Aluno aluno1 = new Aluno();
        // aluno1.setNome("Stephanie");
        // aluno1.setIdade(26);
        
        //COM O CONSTRUTOR
        //Aluno
        Aluno aluno1 = new Aluno("Stephanie", 26);

        System.out.println("-------------------------" );
        System.out.println("ALUNO");
        System.out.println("Nome " + aluno1.getNome());
        System.out.println("Idade " + aluno1.getIdade());
 
        //Funcionario
        Funcionario f1 = new Funcionario("Stephanie", "stephaniesis024@gmail.com");

        System.out.println("-------------------------" );
        System.out.println("FUNCIONÁRIO:");   
        System.out.println("Nome do funicionário: " + f1.getNome());
        System.out.println("O email é: " + f1.getEmail());
        
        //Livro
        
        Livro l1 =  new Livro("A morte é um dia que vale a pena se viver", "desconhecido", 200, 39.00, null);
        Livro l2 = new Livro("A culpa é das estrelas", "Desconhecido", 300, 36.00, null);

        System.out.println("-------------------------" );
        System.out.println("LIVRO 1" );        
        System.out.println("O título do livro é " + l1.getTitulo());
        System.out.println("O autor do livro é " + l1.getAutor());
        System.out.println("O número de páginas do livro é " + l1.getNumeroPag());
        System.out.println("O preço do livro é " + l1.getPreco());


        System.out.println("-------------------------" );
        System.out.println("LIVRO 2" );
        System.out.println("O título do livro é " + l2.getTitulo());
        System.out.println("O autor do livro é " + l2.getAutor());
        System.out.println("O número de páginas do livro é " + l2.getNumeroPag());
        System.out.println("O preço do livro é " + l2.getPreco());

        // Pet

        Pet p1 = new Pet("Bob", 2, "pitbul", "medio", "ração");
        Pet p2 = new Pet("Dog", 5, "caramelo", "pequeno", "ração");
        System.out.println("-------------------------" );
        System.out.println("PET 1" );        
        System.out.println("O nome do Pet é " + p1.getNome());
        System.out.println("A idade do Pet é " + p1.getIdade());
        System.out.println("A raça do Pet é " + p1.getRaca());
        System.out.println("O porte do Pet é " + p1.getPorte());
        System.out.println("A alimentação do Pet é " + p1.getAlimentacao());







    



    }

}
