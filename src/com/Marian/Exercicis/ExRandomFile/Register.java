package com.Marian.Exercicis.ExRandomFile;

public class Register {

    private boolean inscrit;
    private int id;

    public Register(int id) {

        this.inscrit = true;
        this.id = id;
    }
    public Register(){}

    public void setId(int id) {
        this.id = id;
    }
    public void setInscrit(boolean inscrit){
        this.inscrit = inscrit;
    }
    public int getId() {
        return id;
    }

    public boolean isInscrit() {
        return inscrit;
    }
}
