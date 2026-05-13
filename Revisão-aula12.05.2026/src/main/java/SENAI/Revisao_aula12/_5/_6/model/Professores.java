package SENAI.Revisao_aula12._5._6.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_professores")
public class Professores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String materia;

    @Column(nullable = false)
    private String idade;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String email;

    public Professores() {
    }

    public Professores(Long id, String nome, String materia, String idade, String endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.materia = materia;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
