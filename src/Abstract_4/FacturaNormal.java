package Abstract_4;

public class FacturaNormal extends Factura {
    public FacturaNormal(double importConsum, double importSanejament, double importResiduals) {
        super(importConsum, importSanejament, importResiduals);
    }

    @Override
    public double calcularTotal() {
        return importConsum + importSanejament + importResiduals;
    }
}
