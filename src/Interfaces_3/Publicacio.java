package Interfaces_3;

public abstract class Publicacio {
    protected String codi;
    protected String titol;
    protected int anyPublicacio;

    public Publicacio(String codi, String titol, int anyPublicacio) {
        this.codi = codi;
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }

    public String getCodi() {
        return codi;
    }

    @Override
    public abstract String toString();
}
