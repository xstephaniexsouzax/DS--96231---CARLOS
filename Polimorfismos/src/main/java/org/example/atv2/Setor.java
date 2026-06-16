package org.example.atv2;

public enum Setor {
    RECURSOS_HUMANOS("RH"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");


    public String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    

}
