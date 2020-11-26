package com.Marian.Exercicis.Taller;

public class Obra {

    private String titulo;
    private String tematica;
    private int paginas;

    public Obra(String titulo, String tematica, int paginas) {

        this.titulo = titulo;
        this.tematica = tematica;
        this.paginas = paginas;
    }

    public String getTitulos() {
        return this.titulo;
    }

    public String getTematica() {
        return this.tematica;
    }

    public int getPaginas() {
        return this.paginas;
    }
}
