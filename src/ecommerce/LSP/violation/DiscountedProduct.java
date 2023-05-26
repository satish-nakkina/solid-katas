package ecommerce.LSP.violation;

import ecommerce.ISP.Discount;

public class DiscountedProduct extends Product  {

    private double discount;

    public DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }


    @Override
    public double getDiscountedPrice() {

        throw new UnsupportedOperationException("DiscountedProduct does not support getDiscountedPrice()");
    }
}
