package ecommerce.LSP.violation;


public class Main {

    public static void main(String[] args) {

//        Product product1=new Product("prod 1",25.0);
//        Product product2=new DiscountedProduct("prod2",30.0,0.5);



        Product p2= new DiscountedProduct("prod2",30,0.2);

        System.out.println(p2.getDiscountedPrice());


    }
}
