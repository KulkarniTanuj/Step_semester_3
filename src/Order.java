import java.util.*;

interface PaymentMethod {
    boolean process();
    String name();
}

class CreditCardPayment implements PaymentMethod {
    boolean success;

    public CreditCardPayment(boolean success) {
        this.success = success;
    }

    public boolean process() { return this.success; }
    public String name() { return "Credit Card"; }
}

class PayPalPayment implements PaymentMethod {
    boolean success;

    public PayPalPayment(boolean success) {
        this.success = success;
    }

    public boolean process() { return this.success; }
    public String name() { return "PayPal"; }
}

class Product {
    String name;
    int qty;

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
}

class Order {
    String id;
    List<Product> items = new ArrayList<>();
    String status = "Pending";

    public Order(String id) {
        this.id = id;
    }

    public void add(Product product) {
        this.items.add(product);
    }

    public void pay(PaymentMethod method) {
        if (this.items.isEmpty()) {
            System.out.println("Cannot process payment for an empty order.");
            return;
        }

        System.out.print("Payment initiated via " + method.name() + " for Order " + this.id + ". ");

        if (method.process()) {
            this.status = "Paid";
            System.out.println("Payment for Order " + this.id + " successful. Order status: " + this.status + ".");
        } else {
            System.out.println("Payment for Order " + this.id + " failed. Order status: " + this.status + ".");
        }
    }
}

class Custome {
    String name;

    public Custome(String name) {
        this.name = name;
    }

    public Order createOrder(String id) {
        System.out.print("Order created for Customer " + this.name + ". ");
        return new Order(id);
    }
}

