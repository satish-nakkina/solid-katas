package ecommerce.LSP;


public class DiscountedProduct extends Product {
    private double discount;

    public DiscountedProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * (1 - discount);
    }

    public void productDetails(){
        System.out.println("product details");
    }
}