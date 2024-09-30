package Practika.Practika_4_1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addItem(new Item("Apple", 1.00));
        order.addItem(new Item("Banana", 0.50));

        order.setPaymentMethod(new CreditCardPayment());
        order.setDeliveryMethod(new CourierDelivery());

        DiscountCalculator discountCalculator = new DiscountCalculator();
        double finalPrice = order.calculateTotalPrice(discountCalculator);

        System.out.println("Final price after discount: " + finalPrice);

        order.processOrder();
    }
}

