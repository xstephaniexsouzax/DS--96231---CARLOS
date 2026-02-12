package Exercicio1;

import java.util.Scanner;

public class UsarioSenha {
    public static void main(String[] args) {
        // declaração de variável
        String nome = "Stephanie";
        int codigo= 123;
        String usuario;
        int senha;

        // o usuário digitando, tentativa
        Scanner ler = new Scanner(System.in);
        do {
            // digite o usuario
            System.out.println("Digite o nome de usuário");
            usuario = ler.nextLine();
            // digite a senha
            System.out.println("Digite a senha");
            senha = Integer.parseInt(ler.nextLine());

            // comparação do que o usuário digitou as variáveis pre definidas
            // equals - comparação entre strings, pois o "==" só compara numero

            if (usuario.equals(nome) && senha == codigo) {
                System.out.println("Bem-vindo, usuario logado");
            } else {
                System.out.println("Usuário ou senha incorretos");
            }

        }while (!usuario.equals(nome) || senha != codigo);
        ler.close();

    }
}
