package Practika.Practika_4_3;

public class Test_Order {
        public static void main(String[] args) {

            Order order = new Order();
            order.addItem(new Item("Laptop", 1000));
            order.addItem(new Item("Mouse", 50));

            order.setPaymentMethod(new PayPalPayment());
            order.setDeliveryMethod(new CourierDelivery());

            DiscountCalculator discountCalculator = new FixedDiscountCalculator(100);
            double totalCost = order.calculateTotalCost(discountCalculator);
            System.out.println("Общая стоимость после скидки: " + totalCost);

            order.processPayment();
            order.deliverOrder();



        }
}
