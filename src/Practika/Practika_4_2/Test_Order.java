package Practika.Practika_4_2;

public class Test_Order {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 2, 1000.00);
        double totalPrice = order.getQuantity() * order.getPrice() * 0.9;
        System.out.println("Total price after discount: " + totalPrice);

        processPayment("Credit Card");
        sendConfirmationEmail("customer@example.com");
    }

    private static void processPayment(String paymentDetails) {
        System.out.println("Payment processed using: " + paymentDetails);
    }

    private static void sendConfirmationEmail(String email) {
        System.out.println("Confirmation email sent to: " + email);
    }
}
