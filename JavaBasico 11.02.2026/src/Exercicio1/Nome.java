package Exercicio1;

public class Nome {
    public static void main(String[] args) {

        String nome = "Marta";
        String sobrenome = "Silveira";

        //tamanho do nome
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanha do sobrenome " + sobrenome.length());

        //concatenando nome com sobrenome
        //String nomeCompleto = nome + " " + sobrenome;
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        //Exibindo o nome em letra maiuscula
        System.out.println("Concatenção maiuscula: " + nomeCompleto.toUpperCase());

        //Exibindo o nome em letra minuscula
        System.out.println("Concatenação Minuscula " + nomeCompleto.toLowerCase());




    }
}
