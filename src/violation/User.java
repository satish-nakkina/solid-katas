package violation;

public class User {
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void  paymentReceipt(){
        System.out.println("payment Details...");
    }

    public String getEmail() {
        return email;
    }

}
