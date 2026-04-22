package com.example.revisao22042026.model;

import com.example.revisao22042026.model.enus.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefoe;
    private String cargo;
    private String cpf;
    private Sexo sexo;

    public FuncionarioModel(){

    }

    public FuncionarioModel(Long id, String nome, String email, String telefoe, String cargo, String cpf, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefoe = telefoe;
        this.cargo = cargo;
        this.cpf = cpf;
        this.sexo = sexo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoe() {
        return telefoe;
    }

    public void setTelefoe(String telefoe) {
        this.telefoe = telefoe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
