package com.example.Aula_05._5._6.dtoJogadores;

public class JogadoresResponseDTO {

    private String nome;
    private double valorVelocidade;

    public JogadoresResponseDTO() {
    }

    public JogadoresResponseDTO(String nome, double valorVelocidade) {
        this.nome = nome;
        this.valorVelocidade = valorVelocidade;
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
}
