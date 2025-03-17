package Herencia_2;

public class Main {
    public static void main(String[] args) {
        ControlVehicles empresa = new ControlVehicles();

        Cotxe cotxe = new Cotxe("12345", 5, 4);
        Microbus microbus = new Microbus("123456", 3, 10);
        FurgonetaCarrega furgoneta = new FurgonetaCarrega("1234567", 7, 2);
        Camio camio = new Camio("12345678", 4, 5);

        empresa.afegirVehicle(cotxe);
        empresa.afegirVehicle(microbus);
        empresa.afegirVehicle(furgoneta);
        empresa.afegirVehicle(camio);

        System.out.println("Preu del cotxe: " + empresa.obtenirPreu("12345") + "€");
        System.out.println("Preu del microbus: " + empresa.obtenirPreu("123456") + "€");
        System.out.println("Preu de la furgoneta: " + empresa.obtenirPreu("1234567") + "€");
        System.out.println("Preu del camió: " + empresa.obtenirPreu("12345678") + "€");
    }
}
