package FinalDayOfJava;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println("groceryPriceMap before = " + groceryPriceMap);
        // Map view :
             // keySet view, values view, entrySet view
        // How do I store all the keys into a Collection?
           // what do you think the data type will be to store such Collection?
        // ---- Set   Because keys are unique

        // we can use keySet() method of Map to get Set of keys
        Set<String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames before = " + allNames);
//
//        allNames.remove("Tomato");
//        System.out.println("allNames after = " + allNames);
//
//        System.out.println("groceryPriceMap after = " + groceryPriceMap);
        // What if we do not want such relationship and we just want to use the keys someWhere else ?
           // Get a copy of the Set into different object
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }
}
