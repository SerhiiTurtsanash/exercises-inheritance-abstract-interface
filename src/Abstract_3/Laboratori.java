package Abstract_3;

public class Laboratori extends Espai {
    private int nombreBunsen;

    public Laboratori(String codi, double superficie, boolean llumNatural, double consumElectric, int nombreBunsen) {
        super(codi, superficie, llumNatural, consumElectric);
        this.nombreBunsen = nombreBunsen;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return 0;
    }
}
