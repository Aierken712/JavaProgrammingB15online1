package Day62;

import java.util.*;

public class LinkedHashSetImplementation {

    // difference between LinkedHashSet and HashSet
    // LinkedHasSet keep insertion order
    // HashSet is always way faster since it has less responsibility
    public static void main(String[] args) {

        Set<Integer> myNum = new LinkedHashSet<>();
        myNum.add(15);
        myNum.add(10);
        myNum.add(24);
        myNum.add(25);
        myNum.add(10);
        myNum.add(15);
        System.out.println(myNum);

    }
}
