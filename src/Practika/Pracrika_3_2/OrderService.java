package Practika.Pracrika_3_2;
public class OrderService {
    public void CreateOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " created. Total: " + totalPrice);
    }

    public void UpdateOrder(String productName, int quantity, double price) {
        double totalPrice = calculateTotalPrice(quantity, price);
        System.out.println("Order for " + productName + " updated. New total: " + totalPrice);
    }

    private double calculateTotalPrice(int quantity, double price) {
        return quantity * price;
    }
}
