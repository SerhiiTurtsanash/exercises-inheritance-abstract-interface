package Interfaces_4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public List<MenuItem> getCustomizableItems() {
        List<MenuItem> customizableItems = new ArrayList<>();
        for (MenuItem item : items) {
            if (item instanceof Pizza || item instanceof Shake) {
                customizableItems.add(item);
            }
        }
        return customizableItems;
    }

    public void listItems() {
        for (MenuItem item : items) {
            System.out.println(item);
        }
    }
}
