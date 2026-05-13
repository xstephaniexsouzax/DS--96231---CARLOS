package SENAI.Revisao_aula12._5._6.dto.professor;

public class ProfessorResponseDTO {

    private String nome;
    private String email;

    public ProfessorResponseDTO() {
    }

    public ProfessorResponseDTO(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
