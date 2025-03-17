package Herencia_1;

public class ObjecteGeometric {
    private double coord_x;
    private double coord_y;
    private String color;

    public ObjecteGeometric(double coord_x, double coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjecteGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }
}
