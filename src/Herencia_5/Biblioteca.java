package Herencia_5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int capacitat;
    private List<Fitxa> fitxes;

    public Biblioteca(int capacitat) {
        this.capacitat = capacitat;
        this.fitxes = new ArrayList<>();
    }

    public int getCapacitat() {
        return capacitat;
    }

    public int getNombreElements() {
        return fitxes.size();
    }

    public boolean afegirFitxa(Fitxa fitxa) {
        if (fitxes.size() < capacitat) {
            for (Fitxa f : fitxes) {
                if (f.getReferencia().equals(fitxa.getReferencia())) {
                    return false;
                }
            }
            fitxes.add(fitxa);
            return true;
        }
        return false;
    }

    public Fitxa extreureFitxa(String referencia) {
        for (Fitxa fitxa : fitxes) {
            if (fitxa.getReferencia().equals(referencia)) {
                fitxes.remove(fitxa);
                return fitxa;
            }
        }
        return null;
    }

    public Fitxa obtenirFitxa(int posicio) {
        if (posicio >= 0 && posicio < fitxes.size()) {
            return fitxes.get(posicio);
        }
        return null;
    }

    public void visualitzarContingut() {
        if (fitxes.isEmpty()) {
            System.out.println("La biblioteca sin nada.");
        } else {
            for (Fitxa fitxa : fitxes) {
                System.out.println(fitxa);
            }
        }
    }
}
