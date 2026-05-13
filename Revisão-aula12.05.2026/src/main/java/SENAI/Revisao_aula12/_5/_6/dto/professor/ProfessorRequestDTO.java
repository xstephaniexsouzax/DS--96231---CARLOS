package SENAI.Revisao_aula12._5._6.dto.professor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProfessorRequestDTO {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "A materia é obrigatório")
    @Size(min = 3, max = 100, message = "A materia deve ser de três a cem caracteres")
    private String materia;

    @NotBlank(message = "A idade é obrigatório")
    @Size(min = 2, max = 100, message = "A idade deve ter de três a cem caracteres")
    private String idade;

    @NotBlank(message = "O endereço do professor é obrigatório")
    @Size(min = 3, max = 100, message = "O endereço do professor deve ser de três a cem caracteres")
    private String endereco;

    @NotBlank(message = "O email do curso é obrigatória")
    @Size(min = 3, max = 100, message = "O email  do professor deve ser de três a cem caracteres")
    private String email;

    public ProfessorRequestDTO() {
    }

    public ProfessorRequestDTO(String nome, String materia, String idade, String endereco, String email) {
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A materia é obrigatório") @Size(min = 3, max = 100, message = "A materia deve ser de três a cem caracteres") String getMateria() {
        return materia;
    }

    public void setMateria(@NotBlank(message = "A materia é obrigatório") @Size(min = 3, max = 100, message = "A materia deve ser de três a cem caracteres") String materia) {
        this.materia = materia;
    }

    public @NotBlank(message = "A idade é obrigatório") @Size(min = 2, max = 100, message = "A idade deve ter de três a cem caracteres") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "A idade é obrigatório") @Size(min = 3, max = 100, message = "A idade deve ter de três a cem caracteres") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "O endereço do professor é obrigatório") @Size(min = 3, max = 100, message = "O endereço do professor deve ser de três a cem caracteres") String getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "O endereço do professor é obrigatório") @Size(min = 3, max = 100, message = "O endereço do professor deve ser de três a cem caracteres") String endereco) {
        this.endereco = endereco;
    }

    public @NotBlank(message = "O email do curso é obrigatória") @Size(min = 3, max = 100, message = "O email  do professor deve ser de três a cem caracteres") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email do curso é obrigatória") @Size(min = 3, max = 100, message = "O email  do professor deve ser de três a cem caracteres") String email) {
        this.email = email;
    }
}
