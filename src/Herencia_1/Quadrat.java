package Herencia_1;

public class Quadrat extends ObjecteGeometric{
    private double costat;

    public Quadrat(double coord_x, double coord_y, String color, double costat) {
        super(coord_x, coord_y, color);
        this.costat = costat;
    }

    public double perimetre(){
        return 2 * costat;
    }

    public double area(){
        return costat*costat;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "costat=" + costat +
                " perimetro=" + perimetre() +
                " area=" + area() +
                '}';
    }
}
