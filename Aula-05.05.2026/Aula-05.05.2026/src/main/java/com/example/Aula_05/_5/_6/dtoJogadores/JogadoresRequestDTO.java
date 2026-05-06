package com.example.Aula_05._5._6.dtoJogadores;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



public class JogadoresRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "A velocidade é obrigatória")
    @Size(min = 3, max = 10, message = "A velocidade deve ser de três a dez caracteres")
    private double valorVelocidade;

    public JogadoresRequestDTO() {
    }

    public JogadoresRequestDTO(String nome, double valorVelocidade) {
        this.nome = nome;
        this.valorVelocidade = valorVelocidade;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    @NotBlank(message = "A velocidade é obrigatória")
    @Size(min = 3, max = 10, message = "A velocidade deve ser de três a dez caracteres")
    public double getValorVelocidade() {
        return valorVelocidade;
    }

    public void setValorVelocidade(@NotBlank(message = "A velocidade é obrigatória") @Size(min = 3, max = 10, message = "A velocidade deve ser de três a dez caracteres") double valorVelocidade) {
        this.valorVelocidade = valorVelocidade;
    }
}
