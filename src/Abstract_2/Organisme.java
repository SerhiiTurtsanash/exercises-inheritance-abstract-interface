package Abstract_2;

public abstract class Organisme {
    protected String nom;
    protected String familia;
    protected char llum;
    protected double tempMax;
    protected double tempMin;
    protected double phMax;
    protected double phMin;

    public Organisme(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin) {
        this.nom = nom;
        this.familia = familia;
        this.llum = llum;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.phMax = phMax;
        this.phMin = phMin;
    }

    public String getMargesAcidesa() {
        return phMin + "-" + phMax;
    }

    public String getMargesTemperatura() {
        return tempMin + "-" + tempMax;
    }

    public String getNecessitatsLlum() {
        switch (llum) {
            case 'H': return "Necessitats altes de llum";
            case 'M': return "Necessitats mitjanes de llum";
            case 'L': return "Necessitats baixes de llum";
            default: return "Desconegut";
        }
    }
}
