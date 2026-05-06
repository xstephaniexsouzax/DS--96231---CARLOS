package com.example.Aula_05._5._6.dtoCenarios;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {

    @NotBlank(message = "O clima é obrigatório")
    @Size(min = 3, max = 100, message = "O clima deve ser de três a cem caracteres")
    private String clima;

    @NotBlank(message = "A cultura é obrigatória")
    @Size(min = 3, max = 100, message = "A cultura deve ser de três a cem caracteres")
    private String cultura;

    public CenarioRequestDTO() {
    }

    public CenarioRequestDTO(String clima, String cultura) {
        this.clima = clima;
        this.cultura = cultura;
    }

    public @NotBlank(message = "O clima é obrigatório") @Size(min = 3, max = 100, message = "O clima deve ser de três a cem caracteres") String getClima() {
        return clima;
    }

    public void setClima(@NotBlank(message = "O clima é obrigatório") @Size(min = 3, max = 100, message = "O clima deve ser de três a cem caracteres") String clima) {
        this.clima = clima;
    }

    public @NotBlank(message = "A cultura é obrigatória") @Size(min = 3, max = 100, message = "A cultura deve ser de três a cem caracteres") String getCultura() {
        return cultura;
    }

    public void setCultura(@NotBlank(message = "A cultura é obrigatória") @Size(min = 3, max = 100, message = "A cultura deve ser de três a cem caracteres") String cultura) {
        this.cultura = cultura;
    }
}
