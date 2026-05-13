package SENAI.Revisao_aula12._5._6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cursos;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nomeInstituicao;

    @Column(nullable = false)
    private String duracaoCurso;


    public Alunos() {
    }

    public Alunos(Long id, String nome, String cursos, String email, String nomeInstituicao, String duracaoCurso) {
        this.id = id;
        this.nome = nome;
        this.cursos = cursos;
        this.email = email;
        this.nomeInstituicao = nomeInstituicao;
        this.duracaoCurso = duracaoCurso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(String duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }
}
