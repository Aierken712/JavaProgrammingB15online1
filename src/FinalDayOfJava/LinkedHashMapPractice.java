package FinalDayOfJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println(groceryPriceMap);

        // for LinkedHashMap
//        {Tomato=1.99, Patato=2.99, Grape=3.99, Banana=1.99, Apple=1.89}
        // for HashMap
        // {Apple=1.89, Grape=3.99, Patato=2.99, Tomato=1.99, Banana=1.99}



    }
}
