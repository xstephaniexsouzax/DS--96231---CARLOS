package com.example.Aula15042026.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionario")
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String email;
    private double salario;
    @Enumerated (EnumType.STRING)
    private SetorModel setor;
    @Enumerated (EnumType.STRING)
    private Sexo sexo;
    private String genero;

    public FuncionarioModel() {
    }

    public FuncionarioModel(String email, String genero, Long id, int idade, String nome, double salario, SetorModel setor, Sexo sexo) {
        this.email = email;
        this.genero = genero;
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public SetorModel getSetor() {
        return setor;
    }

    public void setSetor(SetorModel setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
