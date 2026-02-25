package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
        // ALGORITMO
        // String nome;
        // int idade;
        // nome = "Marta";
        // idade = 22;
        // INSTANCIAR A CLASSE CLIENTE E PET - POO
        // Cliente cliente1 = new Cliente();
        // cliente1.nome = "Marta";
        // cliente1.idade = 22;

        // Pet pet1 = new Pet();
        // pet1.nome = "Bob";
        // pet1.idade = 2;

        // ENCAPSULAMENTO
        // CLIENTE
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marta");
        cliente1.setIdade(23);

        //PET
        Pet pet1 = new Pet();
        pet1.setIdade(20);
        pet1.setNome("Bob");

        //LIVRO
        Livro livro1 = new Livro();
        livro1.setNome("A morte é um dia que vale pena se viver");
        livro1.setPreco(39.99);

        //FUNCIONARIO
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Stephanie");
        funcionario1.setCargo("Desenvolvimento");
        funcionario1.setSalario(3000);




        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade " + cliente1.getIdade());

        System.out.println("Nome " + pet1.getNome());
        System.out.println("Idade " + pet1.getIdade());

        System.out.println("Livro: " + livro1.getNome());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("Nome do funcionário: " + funcionario1.getNome());
        System.out.println("Cargo do funcionário: " + funcionario1.getCargo());
        System.out.println("Saláriuo do funcionário " + funcionario1.getSalario());
    }

}
