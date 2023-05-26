package ecommerce.ISP.violation;

import ecommerce.DIP.Order;

public class Payment implements PaymentInterface{
    @Override
    public boolean processPayment(Order order) {
        System.out.println("processing payment");
        return true;
    }

    @Override
    public double getDiscountedPrice() {
        return 0;
    }
}
