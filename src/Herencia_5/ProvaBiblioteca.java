package Herencia_5;

public class ProvaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Fitxa fitxa1 = new Fitxa("01", "Prueba1");
        Obra obra1 = new Obra("02", "Prueba1", "Author1", 10);
        Volum volum1 = new Volum("03", "Prueba1", "Author1", 20, 2);
        Revista revista1 = new Revista("04", "Prueba1", 30);
        Obra obra2 = new Obra("05", "Prueba1", "Author1", 10);


        System.out.println("Afegeix fitxa1: " + biblioteca.afegirFitxa(fitxa1));
        System.out.println("Afegeix obra1: " + biblioteca.afegirFitxa(obra1));
        System.out.println("Afegeix volum1: " + biblioteca.afegirFitxa(volum1));
        System.out.println("Afegeix revista1: " + biblioteca.afegirFitxa(revista1));
        System.out.println("Afegeix obra2: " + biblioteca.afegirFitxa(obra2));
        System.out.println("Afegeix fitxa1 otra vez : " + biblioteca.afegirFitxa(fitxa1));
        System.out.println("\nContingut de la biblioteca:");
        biblioteca.visualitzarContingut();
        System.out.println("\nExtreure la fitxa amb referència 01: " + biblioteca.extreureFitxa("01"));
        System.out.println("\nContingut de la biblioteca després d'extreure la fitxa 01:");
        biblioteca.visualitzarContingut();
        System.out.println("\nFitxa a la posició 3: " + biblioteca.obtenirFitxa(2));
    }
}
