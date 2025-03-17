package Herencia_5;

public class Volum extends Obra {
    private int nro;

    public Volum(String referencia, String titol, String autor, int nrePags, int nro) {
        super(referencia, titol, autor, nrePags);
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
        return super.toString() + ", Volum Número: " + nro;
    }
}
