package Day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest3 {

    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie", 3),
                new Product("tea", 3),
                new Product("coffee", 7),
                new Product("Muffine", 5));

        Store s2 = new Store("Denis Store",denisList);
        System.out.println(s2);

        System.out.println(s2.findSumOfAllProduct());
        System.out.println(s2.getAveragePrice());

        System.out.println("Most expensive product : " + s2.getMostExpensiveProduct());

        System.out.println(s2.getAllProductsMoreThanAveragePrice());

    }
}
