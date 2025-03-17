package Interfaces_5;

public class Rectangle extends Figures2D {
    private double width;
    private double height;

    public Rectangle(int idFigure, double width, double height) {
        super(idFigure);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [ID: " + idFigure + ", Width: " + width + ", Height: " + height + ", Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter() + "]";
    }
}
