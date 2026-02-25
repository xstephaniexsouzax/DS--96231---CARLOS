package com.example.encapsulamentodia25defevereiro;



public class Livro {
    private String titulo;
    private String autor;
    private int numeroPag;
    private double preco;

    public Livro(String titulo, String autor, int numeroPag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    };

    
    

}
