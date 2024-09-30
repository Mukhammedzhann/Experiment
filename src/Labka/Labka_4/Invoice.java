package Labka.Labka_4;

import java.util.ArrayList;
import java.util.List;
public class Invoice {
    private int id;
    private List<Item> items;
    private double taxRate;

    public Invoice(int id, double taxRate) {
        this.id = id;
        this.taxRate = taxRate;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double subTotal = 0;
        for (Item item : items) {
            subTotal += item.getPrice();
        }
        return subTotal + (subTotal * taxRate);
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println(" - " + item.getName() + ": $" + item.getPrice());
        }
        System.out.printf("Total (with tax): $%.2f%n", calculateTotal());
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
