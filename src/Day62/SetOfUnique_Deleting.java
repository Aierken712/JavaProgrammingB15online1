package Day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class SetOfUnique_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all collection type has addAll method
        states.addAll(Arrays.asList("GA","NY","FL","NY","WA","GA"));
        System.out.println(states);
        System.out.println("-------------------");

        // The lambda expression way of removing
       //  states.removeIf(each-> each.contains("A")); ----->>  MEAT OF THE CODE
       //  System.out.println(states);

        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods --> hasNext(), next(), remove() works together
        // to remove item while iterating over a Collection

        while(stIter.hasNext()){
            // Do not call next method twice in one iteration or it will skip to next item
            String each = stIter.next();
           if(each.contains("A")){
               System.out.println("After remove = " + each + " ");
               stIter.remove();
           }
        }
        System.out.println(states);




    }
}
