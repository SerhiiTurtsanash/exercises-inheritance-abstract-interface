package Abstract_2;

public class Peix extends Organisme {
    private String procedencia;
    private char dieta;
    private double longitud;

    public Peix(String nom, String familia, char llum, double tempMax, double tempMin, double phMax, double phMin,
                String procedencia, char dieta, double longitud) {
        super(nom, familia, llum, tempMax, tempMin, phMax, phMin);
        this.procedencia = procedencia;
        this.dieta = dieta;
        this.longitud = longitud;
    }

    public String getDieta() {
        switch (dieta) {
            case 'W': return "Algues";
            case 'O': return "Omnívor";
            case 'L': return "Fulles";
            default: return "Desconegut";
        }
    }
}
