package com.example.projeto2904.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {
    @NotBlank(message = " O nome é obrigatório")
    @Size(min = 2, message = " O nome deve ter no minimo dois caracteres")
    @Size(max = 100, message = "O nome deve ter no máximo cem caracteres")
    private String nome;

@NotBlank(message = "O email é obrigatório")
    @Email(message = "Deve ser um email válido")
    private String email;

@NotBlank(message = "A senha é obrigatória")
    @Size(min = 3, max = 8, message = "A senha deve ter de 3 a 8 digitos")
    private String senha;

    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = " O nome é obrigatório") @Size(min = 2, message = " O nome deve ter no minimo dois caracteres") @Size(max = 100, message = "O nome deve ter no máximo cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = " O nome é obrigatório") @Size(min = 2, message = " O nome deve ter no minimo dois caracteres") @Size(max = 100, message = "O nome deve ter no máximo cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório") @Email(message = "Deve ser um email válido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório") @Email(message = "Deve ser um email válido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatória") @Size(min = 3, max = 8, message = "A senha deve ter de 3 a 8 digitos") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória") @Size(min = 3, max = 8, message = "A senha deve ter de 3 a 8 digitos") String senha) {
        this.senha = senha;
    }
}
