package ecommerce.ISP;

import ecommerce.DIP.PaymentGateway;

public interface DiscountablePaymentGateway extends PaymentGateway, Discount{

  void paymentDetails();
}
