package Herencia_4;

public class TestFixers {
    public static void main(String[] args) {
        Fitxa fitxa1 = new Fitxa("01", "Prueba1");
        Obra obra1 = new Obra("02", "Prueba1", "Author1", 10);
        Volum volum1 = new Volum("03", "Prueba1", "Author1", 20, 2);
        Revista revista1 = new Revista("04", "Prueba1", 30);

        System.out.println(fitxa1);
        System.out.println(obra1);
        System.out.println(volum1);
        System.out.println(revista1);

        Fitxa fitxa2 = new Fitxa("01", "Prueba1");
        System.out.println("fitxa1 és igual a fitxa2? " + fitxa1.equals(fitxa2));
    }
}
