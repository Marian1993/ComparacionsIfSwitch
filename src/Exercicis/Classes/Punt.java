package Exercicis.Classes;

public class Punt {

    private double x;
    private double y;

    public Punt(double x,double y){

        this.x=x;
        this.y=y;

    }
    public Punt(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punt punt){

        return Math.sqrt((x - punt.getX())  * (y - punt.getY()));
    }
}
