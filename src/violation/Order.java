package violation;



import java.util.List;

public class Order {

    private User user;
    private List<Product> products;

    GateWay gateway=new GateWay();
    public Order(User user, List<violation.Product> products) {
        this.user = user;
        this.products = products;

    }

    public double getTotal() {
        return 20;
    }

    public boolean processPayment() {
        return gateway.processPayment();
    }
}
