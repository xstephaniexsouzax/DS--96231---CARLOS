package SENAI.Revisao_aula12._5._6.dto.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CursoRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "A carga horária é obrigatória")
    @Size(min = 1, max = 5, message = "O curso deve ser de um a cinco caracteres")
    private String cargaHoraria;

    @NotBlank(message = "O nome do professor é obrigatório")
    @Size(min = 3, max = 100, message = "O nome do professor deve ter de três a cem caracteres")
    private String nomeProfessor;

    @NotBlank(message = "O nome da instituição é obrigatório")
    @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres")
    private String nomeInstituicao;

    @NotBlank(message = "A duração do curso é obrigatória")
    @Size(min = 1, max = 5, message = "A duração do curso deve ser de um a cinco caracteres")
    private String duracao;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(String nome, String cargaHoraria, String nomeProfessor, String nomeInstituicao, String duracao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
        this.nomeInstituicao = nomeInstituicao;
        this.duracao = duracao;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A carga horária é obrigatória") @Size(min = 1, max = 5, message = "O curso deve ser de um a cinco caracteres") String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(@NotBlank(message = "A carga horária é obrigatória") @Size(min = 1, max = 5, message = "O curso deve ser de um a cinco caracteres") String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public @NotBlank(message = "O nome do professor é obrigatório") @Size(min = 3, max = 100, message = "O nome do professor deve ter de três a cem caracteres") String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(@NotBlank(message = "O nome do professor é obrigatório") @Size(min = 3, max = 100, message = "O nome do professor deve ter de três a cem caracteres") String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public @NotBlank(message = "O nome da instituição é obrigatório") @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres") String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(@NotBlank(message = "O nome da instituição é obrigatório") @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres") String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public @NotBlank(message = "A duração do curso é obrigatória") @Size(min = 1, max = 5, message = "A duração do curso deve ser de um a cinco caracteres") String getDuracao() {
        return duracao;
    }

    public void setDuracao(@NotBlank(message = "A duração do curso é obrigatória") @Size(min = 1, max = 5, message = "A duração do curso deve ser de um a cinco caracteres") String duracao) {
        this.duracao = duracao;
    }
}
