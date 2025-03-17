package Interfaces_5;

public class Cylinder extends Figures3D implements Constants {
    private double radius;
    private double height;

    public Cylinder(int idFigure, double radius, double height) {
        super(idFigure);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateVolume() {
        return PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder [ID: " + idFigure + ", Radius: " + radius + ", Height: " + height + ", Surface Area: " + calculateArea() + ", Volume: " + calculateVolume() + "]";
    }
}
