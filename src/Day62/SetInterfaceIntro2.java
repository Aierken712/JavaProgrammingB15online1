package Day62;

import java.util.*;

public class SetInterfaceIntro2 {

    public static void main(String[] args) {

        // In HashSet there is no defined order!!!!
        // Your output can be in any order Java desire

        List<Integer> numList = Arrays.asList(10,10,20,20,30,30,30,30);
        System.out.println(numList);
        System.out.println("--------------------------------------");
        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println(myNumSet);

        System.out.println("----------------------");

//        List<String> str = Arrays.asList("a","b","a","b");
//        System.out.println(str);
        Set<String> myString = new HashSet<>();
        myString.addAll( Arrays.asList("a","a","b","b","c","c") );

        // any type of collection has size method to count the item
        System.out.println(myString.size());
        System.out.println("----------------------");
        for(String each : myString){
            System.out.println(each + " ");
        }
        // for loop does not work, because no index!!!
        // we can use iterator for any type of collection at all time

        System.out.println("-----------------------");
        Iterator<String> stIter = myString.iterator();

        while(stIter.hasNext()){
            System.out.print(stIter.next() + " ");
        }

        System.out.println("\n" + "-----------------------");
        myString.forEach(each -> System.out.print(each + " ")); // MEAT OF THE CODE


    }
}
