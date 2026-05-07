package com.example.Aula_05._5._6.dtoJogadores;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;



public class JogadoresRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @DecimalMin(value = "0.5", message = "Velocidade mínima é 0.5")
    @DecimalMax(value = "2.5", message = "Velocidade máxima é 2.5")
    private Double valorVelocidade;

    @DecimalMin(value = "0.5", message = "Agilidade mínima é 0.5")
    @DecimalMax(value = "2.5", message = "Agilidade máxima é 2.5")
    private Double agilidade;

    public JogadoresRequestDTO() {
    }

    public JogadoresRequestDTO(String nome, Double valorVelocidade, Double agilidade) {
        this.nome = nome;
        this.valorVelocidade = valorVelocidade;
        this.agilidade = agilidade;
    }


    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @DecimalMin(value = "0.5", message = "Velocidade mínima é 0.5") @DecimalMax(value = "2.5", message = "Velocidade máxima é 2.5") Double getValorVelocidade() {
        return valorVelocidade;
    }

    public void setValorVelocidade(@DecimalMin(value = "0.5", message = "Velocidade mínima é 0.5") @DecimalMax(value = "2.5", message = "Velocidade máxima é 2.5") Double valorVelocidade) {
        this.valorVelocidade = valorVelocidade;
    }

    public @DecimalMin(value = "0.5", message = "Agilidade mínima é 0.5") @DecimalMax(value = "2.5", message = "Agilidade máxima é 2.5") Double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(@DecimalMin(value = "0.5", message = "Agilidade mínima é 0.5") @DecimalMax(value = "2.5", message = "Agilidade máxima é 2.5") Double agilidade) {
        this.agilidade = agilidade;
    }
}
