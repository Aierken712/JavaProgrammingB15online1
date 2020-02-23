package FinalDayOfJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySetView_MapIteration {

    public static void main(String[] args) {

        Map<String,Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato",1.99);
        groceryPriceMap.put("Potato",2.99);
        groceryPriceMap.put("Grape",3.99);
        groceryPriceMap.put("Banana",1.99);
        groceryPriceMap.put("Apple",1.89);

        System.out.println( groceryPriceMap.get("Apple") );
        // Map is not iterable so we can not directly iterate over them
        // w can get something iterable out of the Map
        // for example KeySet view will return a Set<String> and it`s iterable

        Set<String> allNames = groceryPriceMap.keySet();

        for(String eachName : allNames){
            System.out.println("eachName = " + eachName);
            System.out.println( " | value is " + groceryPriceMap.get(eachName) );
        }




    }
}
