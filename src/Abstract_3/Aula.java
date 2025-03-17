package Abstract_3;

public class Aula extends Espai {
    protected int aforamentMaxim;
    private boolean teCadiresPala;
    private int nombreOrdinadors;
    private boolean teConnectorsXarxa;

    public Aula(String codi, double superficie, boolean llumNatural, double consumElectric, int aforamentMaxim,
                boolean teCadiresPala, int nombreOrdinadors, boolean teConnectorsXarxa) {
        super(codi, superficie, llumNatural, consumElectric);
        this.aforamentMaxim = aforamentMaxim;
        this.teCadiresPala = teCadiresPala;
        this.nombreOrdinadors = nombreOrdinadors;
        this.teConnectorsXarxa = teConnectorsXarxa;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        return aforamentMaxim > 0 ? superficie / aforamentMaxim : 0;
    }
}
