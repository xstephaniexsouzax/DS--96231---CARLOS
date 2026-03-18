package org.example.atv3;

public class CargoDeConfianca extends Funcionario{
    private Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataNas, double salarioBase) {
        super(nome, cpf, dataNas, salarioBase);
    }
}
