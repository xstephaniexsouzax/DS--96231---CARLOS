package org.example.atv3;

public abstract class Funcionario extends SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String dataNas;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataNas, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNas = dataNas;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNas='" + dataNas + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
