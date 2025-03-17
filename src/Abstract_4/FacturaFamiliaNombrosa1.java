package Abstract_4;
public class FacturaFamiliaNombrosa1 extends Factura {
    private static final double DESCOMPTE = 0.25;

    public FacturaFamiliaNombrosa1(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
    }

    @Override
    public double calcularTotal() {
        double descompteSanejament = importSanejament * DESCOMPTE;
        double descompteResiduals = importResiduals * DESCOMPTE;

        double nouImportSanejament = importSanejament - descompteSanejament;
        double nouImportResiduals = importResiduals - descompteResiduals;

        return importConsum + nouImportSanejament + nouImportResiduals;
    }

    @Override
    public void imprimirFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("==============");
        System.out.println("Consum: " + importConsum);
        System.out.println("Sanejament: " + (importSanejament * (1 - DESCOMPTE)));
        System.out.println("Residuals: " + (importResiduals * (1 - DESCOMPTE)));
        System.out.println("Descompte Aplicat a Sanejament: " + (DESCOMPTE * 100) + "%");
        System.out.println("Descompte Aplicat a Residuals: " + (DESCOMPTE * 100) + "%");
        System.out.println("TOTAL: " + calcularTotal());
    }
}
