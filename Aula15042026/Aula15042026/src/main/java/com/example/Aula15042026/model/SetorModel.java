package com.example.Aula15042026.model;

public enum SetorModel {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("RH"),
    VENDAS("Vendas"),
    MARKETING("Marketing");


    private String texto;

    SetorModel(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
