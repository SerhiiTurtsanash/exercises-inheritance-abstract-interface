package Abstract_4;

public abstract class Factura {
    protected double importConsum;
    protected double importSanejament;
    protected double importResiduals;

    public Factura(double importConsum, double importSanejament, double importResiduals) {
        this.importConsum = importConsum;
        this.importSanejament = importSanejament;
        this.importResiduals = importResiduals;
    }

    public abstract double calcularTotal();

    public void imprimirFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("==============");
        System.out.println("Consum: " + importConsum);
        System.out.println("Sanejament: " + importSanejament);
        System.out.println("Residuals: " + importResiduals);
        System.out.println("TOTAL: " + calcularTotal());
    }
}
