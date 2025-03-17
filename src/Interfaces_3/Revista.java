package Interfaces_3;

public class Revista extends Publicacio {
    private int numero;

    public Revista(String codi, String titol, int anyPublicacio, int numero) {
        super(codi, titol, anyPublicacio);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista [Codi: " + codi + ", Títol: " + titol + ", Any: " + anyPublicacio + ", Número: " + numero + "]";
    }
}
