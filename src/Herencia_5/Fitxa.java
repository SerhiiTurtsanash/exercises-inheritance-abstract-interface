package Herencia_5;

import java.util.Objects;

public class Fitxa {
    protected String referencia;
    protected String titol;

    public Fitxa(String referencia, String titol) {
        this.referencia = referencia;
        this.titol = titol;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    @Override
    public String toString() {
        return "Fitxa [Referència: " + referencia + ", Títol: " + titol + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fitxa fitxa = (Fitxa) obj;
        return Objects.equals(referencia, fitxa.referencia);
    }
}
