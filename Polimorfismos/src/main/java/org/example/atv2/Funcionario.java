package org.example.atv2;

public abstract class Funcionario {
    protected String nome;
    protected String dataDeNasc;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public abstract double salarioFinal();


    public Funcionario(String nome, String dataDeNasc, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataDeNasc = dataDeNasc;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNasc() {
        return dataDeNasc;
    }

    public void setDataDeNasc(String dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
