package com.example.Aula_05._5._6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_personagem")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String corDosOlhos;

    @Column (nullable = false)
    private double altura;

    public PersonagemModel() {
    }

    public PersonagemModel(Long id, String nome, String corDosOlhos, double altura) {
        this.id = id;
        this.nome = nome;
        this.corDosOlhos = corDosOlhos;
        this.altura = altura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
