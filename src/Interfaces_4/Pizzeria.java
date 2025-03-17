package Interfaces_4;

public class Pizzeria {
    public static void main(String[] args) {
        Order order = new Order();

        Pizza pizza1 = new Pizza(1, "Piza", 8, "Midium");
        pizza1.addTopping("Olivas");

        Burger burger1 = new Burger(2, "Burger", 7, "Tipo");

        Shake shake1 = new Shake(3, "Shake", 6, "Leche");
        shake1.addIngredient("Ingrediente");

        Drink soda = new Drink(4, "Soda", 5);

        order.addItem(pizza1);
        order.addItem(burger1);
        order.addItem(shake1);
        order.addItem(soda);

        System.out.println("Order List:");
        order.listItems();

        System.out.println("Personaliazcion:");
        for (MenuItem item : order.getCustomizableItems()) {
            System.out.println(item);
        }
    }
}
