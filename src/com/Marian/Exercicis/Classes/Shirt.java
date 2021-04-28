package com.Marian.Exercicis.Classes;

public class Shirt {

    private int id;
    private String descripcio;
    private String color;
    private char talla;

    public Shirt(int id, String descripcio, String color, char talla) {
        this.id = id;
        this.descripcio = descripcio;
        this.color = color;
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Shirt{" + "id=" + id + ", descripcio='" + descripcio + '\'' +
                ", color='" + color + '\'' + ", talla=" + talla + '}';
    }
}
