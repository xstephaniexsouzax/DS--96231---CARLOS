package com.example.encapsulamentodia25defevereiro;



public class Livro {
    private String titulo;
    private String autor;
    private int numeroPag;
    private double preco;
    private String ISBN;
    public Livro(String titulo, String autor, int numeroPag, double preco, String iSBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
        this.preco = preco;
        ISBN = iSBN;
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
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    

    
    

}
