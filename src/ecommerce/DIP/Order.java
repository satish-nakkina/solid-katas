package ecommerce.DIP;

import ecommerce.LSP.Product;
import ecommerce.SRP.User;

import java.util.List;

public class Order {
    private User user;
    private List<Product> products;
    private PaymentGateway paymentGateway;

    public Order(User user, List<Product> products, PaymentGateway paymentGateway) {
        this.user = user;
        this.products = products;
        this.paymentGateway = paymentGateway;
    }

    public double getTotal() {
        return products.stream().mapToDouble(Product::getDiscountedPrice).sum();
    }

    public boolean processPayment() {
        return paymentGateway.processPayment();
    }
}