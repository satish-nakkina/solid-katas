package ecommerce.DIP;

public class PaypalGateway implements PaymentGateway {

    @Override
    public boolean processPayment() {
        return true;
    }
}
