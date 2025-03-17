package Herencia_6;

public class Empleat {
    private String nom;
    private String cognom;
    private int edat;
    private double salari;

    public Empleat() {}
    public Empleat(String nom, String cognom, int edat, double salari) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.salari = salari;
    }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCognom() { return cognom; }
    public void setCognom(String cognom) { this.cognom = cognom; }

    public int getEdat() { return edat; }
    public void setEdat(int edat) { this.edat = edat; }

    public double getSalari() { return salari; }
    public void setSalari(double salari) { this.salari = salari; }

    public boolean plus(int plusSalarial) {
        if (this.edat > 40) {
            this.salari += plusSalarial;
            return true;
        }
        return false;
    }

    public boolean comprovaNom() {
        return this.nom != null && !this.nom.trim().isEmpty();
    }
}
