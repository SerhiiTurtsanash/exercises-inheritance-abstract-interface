package Abstract_3;

public class Gimnas extends Espai {
    private boolean teDutxes;
    private int nombreGrades;

    public Gimnas(String codi, double superficie, boolean llumNatural, double consumElectric, boolean teDutxes, int nombreGrades) {
        super(codi, superficie, llumNatural, consumElectric);
        this.teDutxes = teDutxes;
        this.nombreGrades = nombreGrades;
    }

    @Override
    public double calcularEspaiPerEstudiant() {
        double superficieTotal = superficie + nombreGrades;
        return superficieTotal;
    }
}
