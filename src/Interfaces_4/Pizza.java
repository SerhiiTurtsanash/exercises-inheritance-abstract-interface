package Interfaces_4;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends FoodItem {
    private String size;
    private List<String> toppings;

    public Pizza(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza [ID: " + id + ", Name: " + name + ", Price: " + price + ", Size: " + size + ", Toppings: " + toppings + "]";
    }
}
