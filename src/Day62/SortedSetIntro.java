package Day62;

import Day61.Job;
import Day61.JobHunter;

import java.util.*;

public class SortedSetIntro {

    public static void main(String[] args) {

        // SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet

//        SortedSet<Integer> mySet = new TreeSet<>();
//        mySet.add(40);
//        mySet.add(10);
//        mySet.add(20);
//        mySet.add(20);
//        mySet.add(30);
//        mySet.add(40);
//        System.out.println(mySet);
//
//        // These are only belong to SortedSet
//        System.out.println(mySet.first());
//        System.out.println(mySet.last());

        TreeSet<Job> mySet = new TreeSet<>();
        mySet.add(new Job("AC",120000,"BOFA") );
        mySet.add(new Job("AB",150000,"BMO") );
        mySet.add(new Job("BA",130000,"OFA") );
        mySet.add(new Job("AB",100000,"BOA") );
        mySet.add(new Job("WB",140000,"IBM") );

//        mySet.add(new Job("AC",120000,"BOFA") );
//        mySet.add(new Job("AC",120000,"BOFA") );
//        mySet.add(new Job("AC",120000,"BOFA") );
        for(Job each : mySet){
            System.out.println(each);
        }

    }
}
