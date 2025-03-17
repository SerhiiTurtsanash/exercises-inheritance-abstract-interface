package Abstract_3;

public class Despatx extends Espai {
    private int nombreTaules;
    private boolean teCafe;

    public Despatx(String codi, double superficie, boolean llumNatural, double consumElectric, int nombreTaules, boolean teCafe) {
        super(codi, superficie, llumNatural, consumElectric);
        this.nombreTaules = nombreTaules;
        this.teCafe = teCafe;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return 0;
    }
}
