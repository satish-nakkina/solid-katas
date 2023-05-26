package ecommerce.OCP.violation;

public class User {
    private  boolean isAdmin;
    private String name;
    private String email;
    private String address;

    public User(String name, String email, String address,boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isAdmin=isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void manageProducts(){
        System.out.println("manage products");
    }


}
