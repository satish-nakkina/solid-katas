package ecommerce.LSP;

import ecommerce.ISP.Discount;

public  class Product implements Discount {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice();
    }
}