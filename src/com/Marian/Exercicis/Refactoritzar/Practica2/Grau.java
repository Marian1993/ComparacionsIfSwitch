package com.Marian.Exercicis.Refactoritzar.Practica2;

public abstract class Grau {

    protected int codi;
    protected String grau;
    protected int tipus;
    protected int numCursos;
    protected double preu;
    protected String[] assignatures;

    public Grau(int codi, String grau, int tipus, int numCursos, String[] assignatures) {
        this.codi = codi;
        this.grau = grau;
        this.tipus = tipus;
        this.numCursos = numCursos;
        this.assignatures = assignatures;
    }
    public abstract double getPreu(double preuCredit);

    public int getTipus() {
        return this.tipus;
    }

    public boolean findAssignatura (String assignatura){
        int i = 0;
        String assignaturaAux = assignatures[i];
        for (int j = 0; j < assignatures.length; j++) {

            if (assignatures[i].equalsIgnoreCase(assignatura)) {
                return true;
            }
            i++;
        }
        return false;
    }
}
