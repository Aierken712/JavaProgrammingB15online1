package Day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {
        /*
         * Create an ArrayList of Integer and fill it up with 1-100
         * */

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
            //System.out.println("i = " + i);
            nums.add(number);
        }
        System.out.println("nums = " + nums);

        // change all the odd number value to 0 ;
        // from what we observed , all the odd numbers are at even index : 0 , 2 ,4 , 6.......
        // so we can just work with those even index and set the value to 0 at those location
        for (int i = 0; i < nums.size(); i += 2) {
            //System.out.println("Odd Values are at index = " + i);
            nums.set(i, 0);
        }
        System.out.println("nums = " + nums);

        // How to find index of value 20 :
        System.out.println("index of 20 : nums.indexOf(20) = " + nums.indexOf(20));

        // INSERT 100 TO FIRST INDEX :
        nums.add(0, 100);
        System.out.println("nums = " + nums);

        System.out.println("index of 20 after inserting 100 at index 0 = " + nums.indexOf(20));



        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println("lst2 = " + lst2);
        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        int locationOf34Value = lst2.indexOf(34);
        lst2.add(locationOf34Value + 1, 100);

        //lst2.add(   lst2.indexOf(34) + 1 ,  100  ) ;

        System.out.println("lst2 = " + lst2);
        // USE ADD METHOD
        // original -->  lst2 = [44, 14, 34, 100, 41, 19]
        // add five 100 in front of 44 : we know exactly 44 at index 0
        // output -->   lst2 = [100,100,100,100,100,100 , 44, 14, 34, 100, 41, 19]

//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
//        lst2.add(0, 100);
        for (int i = 1; i <= 5; i++) {
            lst2.add(0, 100);
        }
        System.out.println("lst2 = " + lst2);

    }
    }

