package com.uptc.demo.models;

public class RecursoBibliograficoDTO {
    private String titulo;
    private String autor;
    private String tipo;

    public RecursoBibliograficoDTO() {}

    public RecursoBibliograficoDTO(String titulo, String autor, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
