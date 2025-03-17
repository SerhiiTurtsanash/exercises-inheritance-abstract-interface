package Herencia_2;

public class FurgonetaCarrega extends VehiclesCarrega{
    public FurgonetaCarrega(String matricula, int diasLoguer, double pma) {
        super(matricula, diasLoguer, pma);
    }

    @Override
    public String toString() {
        return "VehiclesCarrega{" +
                " Precio Calculado "+ calcularPreu() +
                '}';
    }
}
