package ecommerce.ISP.violation;

import ecommerce.DIP.Order;

public interface PaymentInterface {
    boolean processPayment(Order order);

    double getDiscountedPrice();
}
