package SENAI.Revisao_aula12._5._6.dto.aluno;

public class AlunoResponseDTO {

    private String nome;
    private String cursos;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, String cursos) {
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
}
