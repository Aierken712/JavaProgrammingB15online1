package FinalDayOfJava;

import java.util.*;

public class SortedMap_Practice {

    public static void main(String[] args) {

        // sort by natural order of the key data type
        SortedMap<String,Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println(groceryPriceMap);

        // Interview Question :
            // Difference between HashMap, LinkedHashMap, TreeMap :
                 // HashMap default implementation : faster . no insertion order , no sorted order
                 // LinkedHashMap extends HashMap  : slightly slower , keep insertion order , no sorted order
                 // TreeMap:SortedMap implementation : slowest , no insertion order , keep sorted order

            // Difference between HashMap and HashSet :
                      // HashSet is implementation of Set interface
                      // sort unique elements per Item

                     // HashMap is implementation of Map interface
                     // it store key value pair --- keys are unique
                     // Two completely different data structure


    }
}
