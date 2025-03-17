package Herencia_2;

import java.util.HashMap;
import java.util.Map;

public class ControlVehicles {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public void afegirVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.matricula, vehicle);
    }

    public double obtenirPreu(String matricula) {
        Vehicle vehicle = vehicles.get(matricula);
        if (vehicle != null) {
            return vehicle.calcularPreu();
        } else {
            throw new IllegalArgumentException("El vehicle no existeix.");
        }
    }
}
