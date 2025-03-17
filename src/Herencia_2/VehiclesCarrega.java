package Herencia_2;

public class VehiclesCarrega extends Vehicle{
    private double pma;
    private int preuPMA;

    public VehiclesCarrega(String matricula, int diasLoguer, double pma) {
        super(matricula, diasLoguer);
        this.pma = pma;
        this.preuPMA = 20;
    }

    public double calcularPreu() {
        return (diasLoguer * preuBase) + (preuPMA * pma);
    }


}
