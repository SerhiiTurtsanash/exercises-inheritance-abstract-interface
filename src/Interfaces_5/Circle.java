package Interfaces_5;

public class Circle extends Figures2D implements Constants {
    private double radius;

    public Circle(int idFigure, double radius) {
        super(idFigure);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [ID: " + idFigure + ", Radius: " + radius + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
