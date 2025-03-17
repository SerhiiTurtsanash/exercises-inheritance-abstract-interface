package Herencia_5;

public class Revista extends Fitxa {
    private int nro;

    public Revista(String referencia, String titol, int nro) {
        super(referencia, titol);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return super.toString() + ", Revista Número: " + nro;
    }
}
