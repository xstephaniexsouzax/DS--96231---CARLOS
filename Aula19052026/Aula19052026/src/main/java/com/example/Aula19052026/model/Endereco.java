package com.example.Aula19052026.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_enderecos")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;
    private String logadouro;
    private String numero;
    private String cidade;

    @Enumerated(EnumType.STRING)
    private UniversidadeFederativa uf;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String logadouro, String numero, String cidade, UniversidadeFederativa uf) {
        this.id = id;
        this.cep = cep;
        this.logadouro = logadouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UniversidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UniversidadeFederativa uf) {
        this.uf = uf;
    }
}
