package Practika.Practika_4_3;

import java.util.ArrayList;
import java.util.List;
class Order {
    private List<Item> items;
    private IPayment paymentMethod;
    private IDelivery deliveryMethod;
    private double totalCost;

    public Order() {
        this.items = new ArrayList<>();
    }


    public void addItem(Item item) {
        items.add(item);
    }


    public void setPaymentMethod(IPayment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    public void setDeliveryMethod(IDelivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    public double calculateTotalCost(DiscountCalculator discountCalculator) {
        totalCost = items.stream().mapToDouble(Item::getPrice).sum();
        return discountCalculator.applyDiscount(totalCost);
    }

    public void processPayment() {
        paymentMethod.processPayment(totalCost);
    }
    public void deliverOrder() {
        deliveryMethod.deliverOrder(this);
    }

    public List<Item> getItems() {
        return items;
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
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработан платеж по кредитной карте на сумму " + amount);
    }
}


class PayPalPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработан платеж PayPal на сумму " + amount);
    }
}


class BankTransferPayment implements IPayment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Обработан банковский перевод на сумму " + amount);
    }
}

interface IDelivery {
    void deliverOrder(Order order);
}


class CourierDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Курьер доставляет заказ.");
    }
}


class PostDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Заказ доставлен почтой.");
    }
}


class PickUpPointDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Заказ готов к самовывозу.");
    }
}

interface DiscountCalculator {
    double applyDiscount(double totalCost);
}


class NoDiscountCalculator implements DiscountCalculator {
    @Override
    public double applyDiscount(double totalCost) {
        return totalCost;
    }
}


class FixedDiscountCalculator implements DiscountCalculator {
    private double discount;

    public FixedDiscountCalculator(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double totalCost) {
        return totalCost - discount;
    }
}






