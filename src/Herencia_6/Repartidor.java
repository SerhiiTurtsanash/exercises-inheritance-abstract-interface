package Herencia_6;

public class Repartidor extends Empleat {
    private String zona;

    public Repartidor(String nom, String cognom, int edat, double salari, String zona) {
        super(nom, cognom, edat, salari);
        this.zona = zona;
    }

    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }
}
