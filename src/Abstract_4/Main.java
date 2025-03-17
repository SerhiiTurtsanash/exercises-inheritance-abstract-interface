package Abstract_4;

public class Main {
    public static void main(String[] args) {
        Factura facturaNormal = new FacturaNormal(10.0, 20.0, 30.0);
        Factura facturaFN1 = new FacturaFamiliaNombrosa1(10.0, 20.0, 30.0);
        Factura facturaFN2 = new FacturaFamiliaNombrosa2(10.0, 20.0, 30.0);

        System.out.println("\nFactura de Client Normal:");
        facturaNormal.imprimirFactura();

        System.out.println("\nFactura de Família Nombrosa Tipus 1:");
        facturaFN1.imprimirFactura();

        System.out.println("\nFactura de Família Nombrosa Tipus 2:");
        facturaFN2.imprimirFactura();
    }
}
