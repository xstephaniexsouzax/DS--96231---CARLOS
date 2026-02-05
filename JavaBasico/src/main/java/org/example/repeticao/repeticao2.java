package org.example.repeticao;
import java.util.Scanner;
public class repeticao2 {
    public static void main(String[] args) {
        int avaliacao;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Avalie nosso atendimento, de 1 a 5 estrelas ");
            avaliacao = ler.nextInt();
        } while (avaliacao < 1 || avaliacao >5);
        System.out.println("Obrigado!");
    }
}
