package Interfaces_5;

import java.util.ArrayList;

public class GeometryTest {
    public static void main(String[] args) {
        ArrayList<Figures2D> figures2D = new ArrayList<>();
        ArrayList<Figures3D> figures3D = new ArrayList<>();

        figures2D.add(new Circle(1, 5.0));
        figures2D.add(new Rectangle(2, 4.0, 6.0));

        figures3D.add(new Cylinder(3, 3.0, 7.0));
        figures3D.add(new Pyramid(4, 20.0, 16.0, 10.0));

        System.out.println("2D Figures:");
        for (Figures2D figure : figures2D) {
            System.out.println(figure);
        }

        System.out.println("\n3D Figures:");
        for (Figures3D figure : figures3D) {
            System.out.println(figure);
        }
    }
}
