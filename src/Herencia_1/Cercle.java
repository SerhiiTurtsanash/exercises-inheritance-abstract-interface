package Herencia_1;

public class Cercle extends ObjecteGeometric{
    private double radi;

    public Cercle(double coord_x, double coord_y, String color, double radi) {
        super(coord_x, coord_y, color);
        this.radi = radi;
    }
    public double perimetre(){
        return 2 * Math.PI * radi;
    }

    public double area(){
        return Math.PI * Math.pow(radi,2);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radi=" + radi +
                " perimetro=" + perimetre() +
                " area=" + area() +
                '}';
    }
}
