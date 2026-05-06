package com.example.Aula_05._5._6.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_jogadores")
public class JogadoresModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column (nullable = false)
    private  double valorVelocidade;

    @Column(nullable = false)
    private double agilidade;

    public JogadoresModel() {
    }

    public JogadoresModel(String nome, double valorVelocidade, double agilidade) {
        this.nome = nome;
        this.valorVelocidade = valorVelocidade;
        this.agilidade = agilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorVelocidade() {
        return valorVelocidade;
    }

    public void setValorVelocidade(double valorVelocidade) {
        this.valorVelocidade = valorVelocidade;
    }

    public double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(double agilidade) {
        this.agilidade = agilidade;
    }
}
