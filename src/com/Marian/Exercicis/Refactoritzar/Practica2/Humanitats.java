package com.Marian.Exercicis.Refactoritzar.Practica2;

public class Humanitats extends Grau {

    public Humanitats(int codi, String grau, int tipus, int numCursos, String[] assignatures) {

        super(codi, grau, tipus, numCursos, assignatures);
    }

    public double getPreu(double preuCredit) {

            return numCursos * preuCredit;
    }
}
