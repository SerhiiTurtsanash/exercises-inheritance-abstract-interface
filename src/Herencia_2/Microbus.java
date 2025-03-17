package Herencia_2;

public class Microbus extends Vehicle{
    private int places;
    private int extraMicrobus;


    public Microbus(String matricula, int diasLoguer, int places) {
        super(matricula, diasLoguer);
        this.places = places;
        this.extraMicrobus = 2;
    }

    public  double calcularPreu() {
        return (diasLoguer * preuBase) + (places * preuPlasa * diasLoguer) + (extraMicrobus * places);
    }

    @Override
    public String toString() {
        return "Cotxe{" +
                "places=" + places +
                " Precio Calculado "+ calcularPreu() +
                '}';
    }
}
