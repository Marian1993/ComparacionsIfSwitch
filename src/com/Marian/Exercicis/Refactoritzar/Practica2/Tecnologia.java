package com.Marian.Exercicis.Refactoritzar.Practica2;

public class Tecnologia extends Grau {

    public Tecnologia(int codi, String grau, int tipus, int numCursos, String[] assignatures) {

        super(codi,grau,tipus,numCursos,assignatures);
    }
    public double getPreu(double preuCredit) {
        return numCursos * preuCredit * 10;
    }
}
