package Day41;

public class ProductDemo {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Iphone");
        p1.setPrice(699);

        System.out.println("p1.getName = " + p1.getName() );
        // I want to store the the price
        double myPrice = p1.getPrice();

        System.out.println("Hello world");

        System.out.println("myPrice = " + myPrice);
    }
}
