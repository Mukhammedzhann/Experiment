package Labka;

public class Test_Invoice {
        public static void main(String[] args) {
            Invoice invoice = new Invoice(1, 0.1); // 10% налог
            invoice.addItem(new Item("Apple", 1.00));
            invoice.addItem(new Item("Banana", 0.50));
            invoice.displayInvoice();
        }
    }