package Abstract_1;

public class Metro extends Transport {
    private double preuBase;

    public Metro(String id, double velocitat, double preuBase) {
        super(id, velocitat);
        this.preuBase = preuBase;
    }

    @Override
    public double calcularCost(double distancia) {
        return preuBase + (int)(distancia / 5);
    }
}
