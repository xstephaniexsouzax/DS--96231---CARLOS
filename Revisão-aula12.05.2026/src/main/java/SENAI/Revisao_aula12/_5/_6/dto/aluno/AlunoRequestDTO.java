package SENAI.Revisao_aula12._5._6.dto.aluno;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AlunoRequestDTO {

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres")
    private String nome;

    @NotBlank(message = "O curso é obrigatório")
    @Size(min = 3, max = 100, message = "O curso deve ser de três a cem caracteres")
    private String cursos;

    @NotBlank(message = "O email é obrigatório")
    @Size(min = 3, max = 100, message = "O email deve ter de três a cem caracteres")
    private String email;

    @NotBlank(message = "O nome da instituição é obrigatório")
    @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres")
    private String nomeInstituicao;

    @NotBlank(message = "A duração do curso é obrigatória")
    @Size(min = 3, max = 100, message = "A duração do curso deve ser de três a cem caracteres")
    private String duracaoCurso;


    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, String cursos, String email, String nomeInstituicao, String duracaoCurso) {
        this.nome = nome;
        this.cursos = cursos;
        this.email = email;
        this.nomeInstituicao = nomeInstituicao;
        this.duracaoCurso = duracaoCurso;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, max = 100, message = "O nome deve ser de três a cem caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O curso é obrigatório") @Size(min = 3, max = 100, message = "O curso deve ser de três a cem caracteres") String getCursos() {
        return cursos;
    }

    public void setCursos(@NotBlank(message = "O curso é obrigatório") @Size(min = 3, max = 100, message = "O curso deve ser de três a cem caracteres") String cursos) {
        this.cursos = cursos;
    }

    public @NotBlank(message = "O email é obrigatório") @Size(min = 3, max = 100, message = "O email deve ter de três a cem caracteres") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório") @Size(min = 3, max = 100, message = "O email deve ter de três a cem caracteres") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O nome da instituição é obrigatório") @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres") String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(@NotBlank(message = "O nome da instituição é obrigatório") @Size(min = 3, max = 100, message = "O nome da instituição deve ser de três a cem caracteres") String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public @NotBlank(message = "A duração do curso é obrigatória") @Size(min = 3, max = 100, message = "A duração do curso deve ser de três a cem caracteres") String getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(@NotBlank(message = "A duração do curso é obrigatória") @Size(min = 3, max = 100, message = "A duração do curso deve ser de três a cem caracteres") String duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }
}
