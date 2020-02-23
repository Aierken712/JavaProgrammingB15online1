package OfficeHour;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        //        -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionality
//
//        in order to get an Iterator object we can call the method

        List<Integer> lst = new ArrayList<>(Arrays.asList(20, 10, 44, 3, 11));

        Iterator<Integer> numIter = lst.iterator();
        // This iterator initially at the location right before your first element
        // (before-first-element location)

        // 3 methods available : hasNext() , next() , remove

        System.out.println("numIter.hasNext() to check if we have element at next position \n"
                + numIter.hasNext());

//        System.out.println("numIter.next() will move the pointer to the next element and get the value \n"
//                                    + numIter.next());

        //= Now time to iterate over using the iterator
        //  First thing first need to decide when we keep looping ?
        //      as long as we have next element  numIter.hasNext()
        //  How to move to the next and get the value
        //      numIter.next()
        while (numIter.hasNext()) {
            int x = numIter.next();
            if (x > 10) {
                System.out.println("current item  = " + x);
            }
        }

//        Array VS ArrayList
//
//        Array is fixed in size , can not be resized once being created
//        ArrayList can grow and shrink anytime
//
//        Array can store primitives and object
//        ArrayList can only store Object !!!!
//                -- any primitive values will be wrapped into wrapper type object
//                -- AUTOBOXED
//
//        Array can not be printed directly (need to use Arrays.toStirng(arrObject))
//        ArrayList (along with every other collection type in java)
//        can be printed directly to see whats inside(toStirng method overriden)
//
//        ArrayList has its own class and lots of ready method we can use
//                to easily manipulate data
//                Array :  it does not have convinient methods ready like ArrayList
//        we can use Arrays utility class instead
//
//  we use length property of Array object to count the items
//          we use size() method of ArrayList to count the items
//
//                ---------
//                List is the only ordered collection in entire collection framework
//        with index : NON OF THE OTHER COLLECTION TYPE PROVIDE INDEXED ACCESS!!!
//
//                -- Iterator -- see it as a tool to iterate over a collection
//        -- with basic functionlity
//
//        in order to get an Iterator object we can call the method
//
//        List<Integer> lst = new ArrayList<>(Arrays.asList(20,10,44,3,11));
//
//        Iterator<Integer> numIter = lst.iterator();
//        // 3 methods available : hasNext() , next() , remove
    }
}
