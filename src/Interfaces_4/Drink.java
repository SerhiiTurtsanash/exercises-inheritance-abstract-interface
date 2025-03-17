package Interfaces_4;

public class Drink extends MenuItem {
    public Drink(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "Drink [ID: " + id + ", Name: " + name + ", Price: " + price + "]";
    }
}
