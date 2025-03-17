package Herencia_6;

public class Main {
    public static void main(String[] args) {
        Empleat empleat = new Empleat("Marc", "Garcia", 44, 2000);
        Comercial comercial = new Comercial("Juan", "Mecanico", 21, 2500, 10);
        Repartidor repartidor = new Repartidor("Solo", "Andres", 22, 3000, "Zona1");
        System.out.println("Nom de empleat és vàlid? " + empleat.comprovaNom());
        System.out.println("Augment de salari per plus? " + empleat.plus(500));
        System.out.println("Nou salari de l'empleat: " + empleat.getSalari());
        System.out.println("El comercial és una instància de Empleat? " + (comercial instanceof Empleat));
        System.out.println("El repartidor és una instància de Empleat? " + (repartidor instanceof Empleat));
        Empleat empleat2 = new Empleat("Prueba1", "Prueba1", 44, 2000);
        System.out.println("Empleat 1 es igual a empleat 2? " + empleat.equals(empleat2));
        System.out.println("Classe del comercial: " + comercial.getClass().getSimpleName());
        System.out.println("Classe del repartidor: " + repartidor.getClass().getSimpleName());
    }
}
