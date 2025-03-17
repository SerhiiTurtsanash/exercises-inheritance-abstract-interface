package Herencia_5;

public class Obra extends Fitxa {
    protected String autor;
    protected int nrePags;

    public Obra(String referencia, String titol, String autor, int nrePags) {
        super(referencia, titol);
        this.autor = autor;
        this.nrePags = nrePags;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNrePags() {
        return nrePags;
    }

    public void setNrePags(int nrePags) {
        this.nrePags = nrePags;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Pàgines: " + nrePags;
    }
}
