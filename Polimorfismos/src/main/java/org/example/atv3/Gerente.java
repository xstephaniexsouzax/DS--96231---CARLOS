package org.example.atv3;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, String dataNas, double salarioBase) {
        super(nome, cpf, dataNas, salarioBase);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNas='" + dataNas + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
