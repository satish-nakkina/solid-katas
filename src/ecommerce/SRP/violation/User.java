package ecommerce.SRP.violation;

public class User {
    private  double weight;
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address ,double weight) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public double  getShippingWeight(){
        return weight;
    }

    public String getEmail() {
        return email;
    }

}
