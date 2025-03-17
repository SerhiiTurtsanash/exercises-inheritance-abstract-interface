package Abstract_3;

public class Main {
    public static void main(String[] args) {
        Aula aula = new Aula("A1", 30, true, 0.6, 25, true, 10, true);
        AulaInformatica aulaInfo = new AulaInformatica("COD1", 40.0, true, 0.5, 20, true, 15, true, 3);
        Laboratori laboratori = new Laboratori("LAB1", 35.0, false, 0.5, 5);
        Gimnas gimnas = new Gimnas("GIM1", 30, false, 0.4, true, 10);
        Despatx despatx = new Despatx("DES1", 20.0, true, 0.3, 3, true);

        System.out.println("Informacio dels espais:");

        System.out.println("\nAula:");
        System.out.println("Consum total: " + aula.calcularConsumTotal() + " Kwh");
        System.out.println("Espai per estudiant: " + aula.calcularEspaiPerEstudiant() + " mquadrados");

        System.out.println("\nAula d'Informatica:");
        System.out.println("Consum total: " + aulaInfo.calcularConsumTotal() + " Kwh");
        System.out.println("Espai per estudiant: " + aulaInfo.calcularEspaiPerEstudiant() + " mquadrados");

        System.out.println("\nLaboratori:");
        System.out.println("Consum total: " + laboratori.calcularConsumTotal() + " Kwh");

        System.out.println("\nGimnas:");
        System.out.println("Consum total: " + gimnas.calcularConsumTotal() + " Kwh");
        System.out.println("Espai total tenint en compte les grades: " + gimnas.calcularEspaiPerEstudiant() + " mquadrados");

        System.out.println("\nDespatx:");
        System.out.println("Consum total: " + despatx.calcularConsumTotal() + " Kwh");
    }
}

