package Practika.Practika_4_1;
import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Item> items = new ArrayList<>();
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;
    private double totalPrice;

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice(DiscountCalculator discountCalculator) {
        totalPrice = items.stream().mapToDouble(Item::getPrice).sum();
        return discountCalculator.applyDiscount(totalPrice);
    }

    public void processOrder() {
        if (paymentMethod != null) {
            paymentMethod.processPayment(totalPrice);
        }
        if (deliveryMethod != null) {
            deliveryMethod.deliverOrder(this);
        }
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
interface IPayment {
    void processPayment(double amount);
}

class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: " + amount);
    }
}

class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: " + amount);
    }
}

class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of: " + amount);
    }
}
interface IDelivery {
    void deliverOrder(Order order);
}

class CourierDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Order delivered by courier.");
    }
}

class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Order delivered by post.");
    }
}

class PickUpPointDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Order ready for pickup at the point.");
    }
}
interface INotification {
    void sendNotification(String message);
}

class EmailNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("Email notification sent: " + message);
    }
}

class SmsNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("SMS notification sent: " + message);
    }
}
class DiscountCalculator {
    public double applyDiscount(double totalPrice) {
        // Здесь можно применить различные правила скидок
        return totalPrice * 0.9; // Пример: 10% скидка
    }
}






