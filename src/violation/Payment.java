package violation;

import ecommerce.DIP.Order;

public interface Payment {
    double getDiscountedPrice();

    boolean processPayment(Order order);
}
