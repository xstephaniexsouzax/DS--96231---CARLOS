package org.example.atv3;

public abstract class SalarioFinal {

    public SalarioFinal(String nome, String cpf, String dataNas, double salarioBase) {
        super(nome, cpf, dataNas, salarioBase);
    }

    public void obterSalario(){
        double valor = getSalarioBase();

    }
}
