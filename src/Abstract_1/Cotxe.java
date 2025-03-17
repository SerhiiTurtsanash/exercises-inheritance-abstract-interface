package Abstract_1;

public class Cotxe extends Transport {
    private String tipusCombustible;
    private double preuPerLitre;
    private double consumPerKm;

    public Cotxe(String id, double velocitat, String tipusCombustible, double preuPerLitre, double consumPerKm) {
        super(id, velocitat);
        this.tipusCombustible = tipusCombustible;
        this.preuPerLitre = preuPerLitre;
        this.consumPerKm = consumPerKm;
    }

    @Override
    public double calcularCost(double distancia) {
        return distancia * consumPerKm * preuPerLitre;
    }
}
