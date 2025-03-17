package Herencia_2;

public class Camio extends VehiclesCarrega{
    public Camio(String matricula, int diasLoguer, double pma) {
        super(matricula, diasLoguer, pma);
    }
    public double calcularPreu() {
        return super.calcularPreu() +40;
    }

    @Override
    public String toString() {
        return "VehiclesCarrega{" +
                " Precio Calculado "+ calcularPreu() +
                '}';
    }
}
