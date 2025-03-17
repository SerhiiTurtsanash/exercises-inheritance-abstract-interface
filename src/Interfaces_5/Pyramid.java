package Interfaces_5;

public class Pyramid extends Figures3D {
    private double baseArea;
    private double perimeterBase;
    private double height;

    public Pyramid(int idFigure, double baseArea, double perimeterBase, double height) {
        super(idFigure);
        this.baseArea = baseArea;
        this.perimeterBase = perimeterBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt((perimeterBase / 4) * (perimeterBase / 4) + height * height);
        return baseArea + (perimeterBase * slantHeight / 2);
    }

    @Override
    public double calculatePerimeter() {
        return perimeterBase;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseArea * height;
    }

    @Override
    public String toString() {
        return "Pyramid [ID: " + idFigure + ", Base Area: " + baseArea + ", Height: " + height + ", Surface Area: " + calculateArea() + ", Volume: " + calculateVolume() + "]";
    }
}
