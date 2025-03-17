package Abstract_2;

public class Main {
    public static void main(String[] args) {
        Peix peix = new Peix("Peix1", "Familia1", 'M', 20.0, 18, 5, 5, "España", 'O', 4);
        Planta planta = new Planta("Planta1", "Familia2", 'L', 10, 5, 3, 3, 'S');

        System.out.println("Informacio del peix:");
        System.out.println("Nom: " + peix.nom);
        System.out.println("Marges acidesa: " + peix.getMargesAcidesa());
        System.out.println("Marges de temperatura: " + peix.getMargesTemperatura());
        System.out.println("Dieta: " + peix.getDieta());
        System.out.println("Necessitats de llum: " + peix.getNecessitatsLlum());

        System.out.println("\nInformació de la planta:");
        System.out.println("Nom: " + planta.nom);
        System.out.println("Marges acidesa: " + planta.getMargesAcidesa());
        System.out.println("Marges de temperatura: " + planta.getMargesTemperatura());
        System.out.println("Tipus de planta: " + planta.getTipusPlanta());
        System.out.println("Necessitats de llum: " + planta.getNecessitatsLlum());
    }
}
