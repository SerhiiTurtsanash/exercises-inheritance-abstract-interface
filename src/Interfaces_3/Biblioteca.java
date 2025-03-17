package Interfaces_3;

public class Biblioteca {
    public static void main(String[] args) {
        Llibre llibre1 = new Llibre("01", "Titol1", 1999);
        Revista revista1 = new Revista("02", "Titol2", 2024, 12);

        System.out.println(llibre1);
        System.out.println(revista1);

        llibre1.prestar();
        System.out.println("Despres de prestar el llibre: " + llibre1.prestat());
        llibre1.tornar();
        System.out.println("Despres de tornar el llibre: " + llibre1.prestat());
    }
}
