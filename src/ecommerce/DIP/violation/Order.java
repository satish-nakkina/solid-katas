package ecommerce.DIP.violation;

import ecommerce.DIP.PaypalGateway;
import ecommerce.LSP.Product;
import ecommerce.SRP.User;

import java.util.List;

public class Order {

    private User user;
    private List<Product> products;
    private PaypalGateway paymentGateway;

    public Order(User user, List<Product> products, PaypalGateway paymentGateway) {
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
