package violation;

public  class Product {
    private double weight;
    private String name;
    private  double price;

    public Product(String name, double price,double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


    public double getPrice() {
        return price;
    }

    public double getShippingWeight() {
        return weight;
    }

    public void paymentProcess(){
        System.out.println("processing payment");
    }

}