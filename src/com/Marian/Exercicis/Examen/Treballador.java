package com.Marian.Exercicis.Examen;

public class Treballador {

    private int anysExperiencia;
    private int tipus;

    public static final int DESENVOLUPADOR = 0;
    public static final int ARQUITECTE = 1;
    public static final int DBA = 2;  // Database Administrador

    public Treballador(int anysExperiencia, int tipus) {
        this.anysExperiencia = anysExperiencia;
        this.tipus = tipus;
    }

    public int estimacioSou(Treballador treballador, int souInicial) {

        Sou.estimacioSou(treballador, souInicial);

        return souInicial;
    }

    public int getTipus() {
        return this.tipus;
    }

    public int getAnysExperiencia() {
        return anysExperiencia;
    }
}
