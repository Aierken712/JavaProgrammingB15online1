package Day56;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add( new Product( "Macbook Pro",2999) );
        productList.add( new Product( "Sony TV",499) );
        productList.add( new Product( "Macbook Air",1299) );
        productList.add( new Product( "Iphone X",999) );
        productList.add( new Product( "Iphone XL",1299) );
        productList.add( new Product( "Sumsung 10",1188) );
        productList.add( new Product( "Sumsung Note",1288) );

        System.out.println( "productList.size() = " + productList.size() );

        Product sony = new Product("Sony TV",499);
        boolean result = productList.contains(sony);
      //  System.out.println(result);

        boolean result2 = productList.contains(new Product("Apple TV",299) );
        System.out.println(result2);

        productList.remove(sony);
        System.out.println( productList.contains(sony) );

        // check whether we have "Sony TV", with 499
//        boolean result = false;
//        for(Product each : productList){

//            if(each.getName().equals("Sony TV") && each.getPrice()==499){
//                result = true;
//            }
//           if( each.equals( new Product("Sony TV",499)) ){
//               result = true;
//           }
//        }

    }
}
