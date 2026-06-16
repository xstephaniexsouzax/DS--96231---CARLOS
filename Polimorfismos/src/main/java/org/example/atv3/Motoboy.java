package org.example.atv3;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNas, double salarioBase) {
        super(nome, cpf, dataNas, salarioBase);
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNas='" + dataNas + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
