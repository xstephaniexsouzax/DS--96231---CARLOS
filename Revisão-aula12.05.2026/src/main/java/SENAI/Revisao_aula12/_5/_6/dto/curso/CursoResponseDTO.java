package SENAI.Revisao_aula12._5._6.dto.curso;

public class CursoResponseDTO {

    private String nome;
    private String nomeProfessor;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(String nome, String nomeProfessor) {
        this.nome = nome;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
