package Interfaces_4;

public class FoodItem extends MenuItem {
    public FoodItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return "FoodItem [ID: " + id + ", Name: " + name + ", Price: " + price + "]";
    }
}

