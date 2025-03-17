package Herencia_2;

public class Vehicle {
    protected String matricula;
    protected int diasLoguer;
    protected int preuBase;
    protected double preuPlasa;

    public Vehicle(String matricula, int diasLoguer) {
        this.matricula = matricula;
        this.diasLoguer = diasLoguer;
        this.preuBase = 10;
        this.preuPlasa = 1.5;
    }

    public double calcularPreu() {
        return 0;
    }
}
