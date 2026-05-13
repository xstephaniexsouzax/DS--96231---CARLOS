package SENAI.Revisao_aula12._5._6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_cursos")

public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cargaHoraria;

    @Column(nullable = false)
    private String nomeProfessor;

    @Column(nullable = false)
    private String nomeInstituicao;

    @Column(nullable = false)
    private String duracao;

    public Cursos() {
    }

    public Cursos(Long id, String nome, String cargaHoraria, String nomeProfessor, String nomeInstituicao, String duracao) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
        this.nomeInstituicao = nomeInstituicao;
        this.duracao = duracao;
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

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
