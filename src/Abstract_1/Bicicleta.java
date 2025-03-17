package Abstract_1;

public class Bicicleta extends Transport {
    private int nombreMarxes;

    public Bicicleta(String id, double velocitat, int nombreMarxes) {
        super(id, velocitat);
        this.nombreMarxes = nombreMarxes;
    }

    @Override
    public double calcularCost(double distancia) {
        return 0;
    }
}
