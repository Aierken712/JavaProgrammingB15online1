package Day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);
    //    System.out.println(s1.allProducts);

    //    s1.allProducts.add(new Product("Imac",3999));
   //     System.out.println(s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("cookie",3),
                new Product("tea",3),
                new Product("coffee",7),
                new Product("Muffine",5));
        Store s2 = new Store("Denis store",denisList);

        System.out.println(s2);

    }
}
