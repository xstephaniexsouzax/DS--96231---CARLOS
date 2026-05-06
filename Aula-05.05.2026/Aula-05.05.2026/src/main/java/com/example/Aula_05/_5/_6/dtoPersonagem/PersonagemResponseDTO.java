package com.example.Aula_05._5._6.dtoPersonagem;

public class PersonagemResponseDTO {

    private String nome;
    private String corDosOlhos;

    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, String corDosOlhos) {
        this.nome = nome;
        this.corDosOlhos = corDosOlhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }
}
