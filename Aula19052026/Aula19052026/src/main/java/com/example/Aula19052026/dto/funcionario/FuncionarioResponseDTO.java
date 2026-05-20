package com.example.Aula19052026.dto.funcionario;

public class FuncionarioResponseDTO {

    private String nome;
    private String matricula;

    public FuncionarioResponseDTO() {
    }

    public FuncionarioResponseDTO(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
