package Abstract_2;

public class Planta extends Organisme {
    private char tipus;

    public Planta(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin, char tipus) {
        super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
        this.tipus = tipus;
    }

    public String getTipusPlanta() {
        switch (tipus) {
            case 'S': return "Tija";
            case 'B': return "Bulb";
            case 'R': return "Arrels";
            default: return "Desconegut";
        }
    }
}
