package Abstract_4;

public class FacturaFamiliaNombrosa2 extends Factura {
    private static final double DESCOMPTE_SANEJAMENT = 0.75;
    private static final double DESCOMPTE_RESIDUALS = 0.50;
    private static final double LIMIT_DESCOMPTE = 16.0;

    public FacturaFamiliaNombrosa2(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
    }

    @Override
    public double calcularTotal() {
        double descompteSanejament = Math.min(importSanejament * DESCOMPTE_SANEJAMENT, LIMIT_DESCOMPTE);
        double descompteResiduals = Math.min(importResiduals * DESCOMPTE_RESIDUALS, LIMIT_DESCOMPTE);

        double nouImportSanejament = importSanejament - descompteSanejament;
        double nouImportResiduals = importResiduals - descompteResiduals;

        return importConsum + nouImportSanejament + nouImportResiduals;
    }

    @Override
    public void imprimirFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("==============");
        System.out.println("Consum: " + importConsum);
        System.out.println("Sanejament: " + Math.max(importSanejament - Math.min(importSanejament * DESCOMPTE_SANEJAMENT, LIMIT_DESCOMPTE), 0));
        System.out.println("Residuals: " + Math.max(importResiduals - Math.min(importResiduals * DESCOMPTE_RESIDUALS, LIMIT_DESCOMPTE), 0));
        System.out.println("Descompte Aplicat a Sanejament: " + (DESCOMPTE_SANEJAMENT * 100) + "%");
        System.out.println("Descompte Aplicat a Residuals: " + (DESCOMPTE_RESIDUALS * 100) + "%");
        System.out.println("TOTAL: " + calcularTotal());
        System.out.println("NOTA: si l'import màxim de sanejament i residuals és superior a 16, s'ha comptabilitzat 16.");
    }
}
