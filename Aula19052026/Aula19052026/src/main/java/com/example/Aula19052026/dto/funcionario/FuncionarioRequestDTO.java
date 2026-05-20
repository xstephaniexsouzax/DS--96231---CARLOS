package com.example.Aula19052026.dto.funcionario;

import com.example.Aula19052026.model.Endereco;
import jakarta.validation.constraints.*;

public class FuncionarioRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "A matricula é obrigatório")
    @Size(min = 3, max = 50, message = "O curso deve ser de três a cinquenta caracteres ")
    private String matricula;

    @NotBlank(message = "A data de nascimento é obrigatória")
    @Size(min = 3, max = 10, message = "O email deve ter de três a dez O caracteres")
    private String dataNascimento;

    @NotNull(message = "O valor é obrigatório")
    @DecimalMin(value = "0.01", message = "O valor mínimo é 0.01")
    @DecimalMax(value = "10000.00", message = "O valor máximo é 10000.00")
    private Double salario;

    @NotBlank(message = "O email do curso é obrigatória")
    @Size(min = 3, max = 50, message = "O email do curso deve ser de três a cinquenta caracteres")
    private String email;

    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;


    public FuncionarioRequestDTO() {
    }

    public FuncionarioRequestDTO(String nome, String matricula, String dataNascimento, Double salario, String email, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A matricula é obrigatório") @Size(min = 3, max = 50, message = "O curso deve ser de três a cinquenta caracteres ") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "A matricula é obrigatório") @Size(min = 3, max = 50, message = "O curso deve ser de três a cinquenta caracteres ") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "A data de nascimento é obrigatória") @Size(min = 3, max = 10, message = "O email deve ter de três a dez O caracteres") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "A data de nascimento é obrigatória") @Size(min = 3, max = 10, message = "O email deve ter de três a dez O caracteres") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "O valor é obrigatório") @DecimalMin(value = "0.01", message = "O valor mínimo é 0.01") @DecimalMax(value = "10000.00", message = "O valor máximo é 10000.00") Double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "O valor é obrigatório") @DecimalMin(value = "0.01", message = "O valor mínimo é 0.01") @DecimalMax(value = "10000.00", message = "O valor máximo é 10000.00") Double salario) {
        this.salario = salario;
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
