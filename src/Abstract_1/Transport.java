package Abstract_1;

public abstract class Transport {
    protected String id;
    protected double velocitat;

    public Transport(String id, double velocitat) {
        this.id = id;
        this.velocitat = velocitat;
    }

    public double calcularTemps(double distancia) {
        return distancia / velocitat;
    }

    public abstract double calcularCost(double distancia);
}
