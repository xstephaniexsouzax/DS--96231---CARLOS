package com.example.Aula19052026.dto.cliente;

import com.example.Aula19052026.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "O email do curso é obrigatória")
    @Size(min = 3, max = 50, message = "O email do curso deve ser de três a cinquenta caracteres")
    private String email;

    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email do curso é obrigatória") @Size(min = 3, max = 50, message = "O email do curso deve ser de três a cinquenta caracteres") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email do curso é obrigatória") @Size(min = 3, max = 50, message = "O email do curso deve ser de três a cinquenta caracteres") String email) {
        this.email = email;
    }

    public @NotNull(message = "O endereço é obrigatório") Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull(message = "O endereço é obrigatório") Endereco endereco) {
        this.endereco = endereco;
    }
}
