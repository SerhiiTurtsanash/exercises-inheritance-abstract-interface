package Interfaces_4;

public class Burger extends FoodItem {
    private String type;

    public Burger(int id, String name, double price, String type) {
        super(id, name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Burger [ID: " + id + ", Name: " + name + ", Price: " + price + ", Type: " + type + "]";
    }
}
