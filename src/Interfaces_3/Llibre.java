package Interfaces_3;

public class Llibre extends Publicacio implements Prestable {
    private boolean enPrestec;

    public Llibre(String codi, String titol, int anyPublicacio) {
        super(codi, titol, anyPublicacio);
        this.enPrestec = false;
    }

    @Override
    public void prestar() {
        enPrestec = true;
    }

    @Override
    public void tornar() {
        enPrestec = false;
    }

    @Override
    public boolean prestat() {
        return enPrestec;
    }

    @Override
    public String toString() {
        return "Llibre [Codi: " + codi + ", Títol: " + titol + ", Any: " + anyPublicacio + ", En préstec: " + enPrestec + "]";
    }
}
