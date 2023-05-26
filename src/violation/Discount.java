package violation;

public class Discount extends Product{
    private  double discount;

    public Discount(String name, double price, double weight, double discount) {
        super(name, price, weight);
        this.discount=discount;
    }
    public double getDiscountedPrice(){
        return getPrice();
    };
}
