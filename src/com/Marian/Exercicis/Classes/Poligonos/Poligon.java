package com.Marian.Exercicis.Classes.Poligonos;

public class Poligon {

    private double perimetre;
    private double area;

    public Poligon(){}

    public Poligon(double perimetre, double area){

        this.perimetre=perimetre;
        this.area=area;
    }
    public double getPerimetre(){
        return perimetre;
    }
    public void setPerimetre(double perimetre){
        this.perimetre=perimetre;
    }
    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area=area;
    }
}
