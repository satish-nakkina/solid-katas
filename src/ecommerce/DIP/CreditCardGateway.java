package ecommerce.DIP;

public class CreditCardGateway implements PaymentGateway {
    @Override
    public boolean processPayment() {

        return true;
    }
}