package Herencia_6;

public class Comercial extends Empleat {
    private double comissio;

    public Comercial(String nom, String cognom, int edat, double salari, double comissio) {
        super(nom, cognom, edat, salari);
        this.comissio = comissio;
    }

    public double getComissio() { return comissio; }
    public void setComissio(double comissio) { this.comissio = comissio; }
}
