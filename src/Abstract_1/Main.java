package Abstract_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pon la distancia: ");
        double distancia = sc.nextDouble();

        Transport cotxe = new Cotxe("12", 90, "Gasolina", 1, 0.8);
        Transport bicicleta = new Bicicleta("13", 15, 15);
        Transport metro = new Metro("14", 80, 2.5);

        System.out.println("Cotxe - Tiempo: " + cotxe.calcularTemps(distancia) + " horas, Costo: " + cotxe.calcularCost(distancia) + " euros");
        System.out.println("Bicicleta - Tiempo: " + bicicleta.calcularTemps(distancia) + " horas, Costo: " + bicicleta.calcularCost(distancia) + " euros");
        System.out.println("Metro - Tiempo: " + metro.calcularTemps(distancia) + " horas, Costo: " + metro.calcularCost(distancia) + " euros");
    }
}
