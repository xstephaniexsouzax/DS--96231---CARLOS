package com.example.Aula_05._5._6.dtoPersonagem;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, message = "O nome deve ter no minimo dois caracteres")
    @Size(max = 100, message = "O nome deve ter no máximo cem caracteres")
    private String nome;

    @NotBlank(message = "A cor dos olhos é obrigatório")
    @Size(min = 3, max = 100, message = "A cor dos olhos deve ser de três a cem caracteres")
    private String corDosOlhos;


    @DecimalMin(value = "0.5", message = "Altura mínima é 0.5")
    @DecimalMax(value = "2.5", message = "Altura máxima é 2.5")
    private Double altura;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(String nome, String corDosOlhos, Double altura) {
        this.nome = nome;
        this.corDosOlhos = corDosOlhos;
        this.altura = altura;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 2, message = "O nome deve ter no minimo dois caracteres") @Size(max = 100, message = "O nome deve ter no máximo cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 2, message = "O nome deve ter no minimo dois caracteres") @Size(max = 100, message = "O nome deve ter no máximo cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A cor dos olhos é obrigatório") @Size(min = 3, max = 100, message = "A cor dos olhos deve ser de três a cem caracteres") String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(@NotBlank(message = "A cor dos olhos é obrigatório") @Size(min = 3, max = 100, message = "A cor dos olhos deve ser de três a cem caracteres") String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public @DecimalMin(value = "0.5", message = "Altura mínima é 0.5") @DecimalMax(value = "2.5", message = "Altura máxima é 2.5") Double getAltura() {
        return altura;
    }

    public void setAltura(@DecimalMin(value = "0.5", message = "Altura mínima é 0.5") @DecimalMax(value = "2.5", message = "Altura máxima é 2.5") Double altura) {
        this.altura = altura;
    }
}
