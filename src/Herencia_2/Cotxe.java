package Herencia_2;

public class Cotxe extends Vehicle{
    private int places;

    public Cotxe(String matricula, int diasLoguer, int places) {
        super(matricula, diasLoguer);
        this.places = places;
    }

    public double calcularPreu() {
        return (diasLoguer * preuBase) + (places * preuPlasa * diasLoguer);
    }
    @Override
    public String toString() {
        return "Cotxe{" +
                "places=" + places +
                " Precio Calculado "+ calcularPreu() +
                '}';
    }
}
