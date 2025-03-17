package Interfaces_4;

import java.util.ArrayList;
import java.util.List;

public class Shake extends Drink {
    private String milkType;
    private List<String> ingredients;

    public Shake(int id, String name, double price, String milkType) {
        super(id, name, price);
        this.milkType = milkType;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Shake [ID: " + id + ", Name: " + name + ", Price: " + price + ", Milk Type: " + milkType + ", Ingredients: " + ingredients + "]";
    }
}
