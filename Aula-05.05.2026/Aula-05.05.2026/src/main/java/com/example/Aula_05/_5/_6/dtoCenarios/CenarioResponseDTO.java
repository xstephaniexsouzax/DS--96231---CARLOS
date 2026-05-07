package com.example.Aula_05._5._6.dtoCenarios;

public class CenarioResponseDTO {
    private String clima;
    private String cultura;

    public CenarioResponseDTO() {
    }

    public CenarioResponseDTO(String clima, String cultura) {
        this.clima = clima;
        this.cultura = cultura;
    }

    public CenarioResponseDTO(String nome, double valorVelocidade) {
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }
}
