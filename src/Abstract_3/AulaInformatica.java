package Abstract_3;

public class AulaInformatica extends Aula {
    private int nombreImpressores;

    public AulaInformatica(String codi, double superficie, boolean llumNatural, double consumElectric, int aforamentMaxim,
                           boolean teCadiresPala, int nombreOrdinadors, boolean teConnectorsXarxa, int nombreImpressores) {
        super(codi, superficie, llumNatural, consumElectric, aforamentMaxim, teCadiresPala, nombreOrdinadors, teConnectorsXarxa);
        this.nombreImpressores = nombreImpressores;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        double superficieUtil = superficie - nombreImpressores;
        return superficieUtil > 0 && aforamentMaxim > 0 ? superficieUtil / aforamentMaxim : 0;
    }
}
