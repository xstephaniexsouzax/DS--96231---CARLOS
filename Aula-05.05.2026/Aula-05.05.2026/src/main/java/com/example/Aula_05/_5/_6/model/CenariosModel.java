package com.example.Aula_05._5._6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cenario")
public class CenariosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String clima;

    @Column(nullable = false)
    private String cultura;

    public CenariosModel() {
    }

    public CenariosModel(Long id, String clima, String cultura) {
        this.id = id;
        this.clima = clima;
        this.cultura = cultura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
