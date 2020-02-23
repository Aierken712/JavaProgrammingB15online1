package Day56;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("Macbook Pro",2999);
        Product p2 = new Product("Sony TV",499);
        Product p3 = new Product("Sony TV",499);

//        System.out.println(p1==p2);
//        System.out.println(p2==p3);

        // .equals coming from parent class Object
        System.out.println( p1.equals(p2) );
        System.out.println( p2.equals(p3) );
        System.out.println( p2.equals(p2) );

        Product p4 = p3;
        System.out.println(p4.equals(p3));
    }
}
