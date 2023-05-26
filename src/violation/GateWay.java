package violation;


import ecommerce.DIP.Order;

public class GateWay implements Payment{


    @Override
    public double getDiscountedPrice() {
        return 0;
    }

    @Override
    public boolean processPayment(Order order) {
        return false;
    }

    public boolean processPayment() {
        return true;
    }
}
