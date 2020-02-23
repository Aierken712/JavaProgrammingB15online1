package Day56;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {

    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie", 3),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("Muffine", 5));

        Store s2 = new Store("Denis store", denisList);
        System.out.println(s2);

        Product p1 = new Product("CheeseCake",10);
        s2.addProduct(p1);
        System.out.println(s2);

        s2.addProduct("Latta",3);
        System.out.println(s2);

        s2.displayProducts();

        s2.removeProduct(p1);
        System.out.println(s2.checkIfProductExists(p1));

        System.out.println(s2.indexOfProduct(p1));
        s2.removeProduct(p1);


    }
}
