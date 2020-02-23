package FinalDayOfJava;

import java.util.Collection;
import java.util.*;


public class Map_valueView {

    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        // in order to get all the values in the Map and store it to Collection
        // we can use values method from the Map and it will return
        // a Collection object that contains all the values

        Collection<Double> allPrice = groceryPriceMap.values();
        System.out.println(allPrice);
        // first come first serve -- first occurrence will be removed
        allPrice.remove(1.99);
        System.out.println(groceryPriceMap);

        // If you want no connection you may just copy allPrices into different collection object
        //
        List<Double> pricesCopy = new ArrayList<>(allPrice);


    }
}
