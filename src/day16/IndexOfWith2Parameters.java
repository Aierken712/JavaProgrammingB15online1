package day16;

import jdk.swing.interop.SwingInterOpUtils;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {

        //get the second java from the sentence
        //assume you already know there is 4 java in this sentence
        //second java means --> the java showed up after first java

        // first java out where is location of the first java showed showed up
        // in order to find second java
        //instead of searching from beginning ,
        //search from right after the location you found first java
        // then it will give you the index of second java

        // BUT HOW DO
        //

        //
        //

        String name = "I love Java Java Java Java";

        System.out.println( "Java starting from 0 " + name.indexOf("Java") );
        System.out.println( "Java starting from 7 " + name.indexOf("Java",7) );
        System.out.println( "Java starting from 8 " + name.indexOf("Java",8) );
        System.out.println( "Java starting from 9 " + name.indexOf("Java",9) );
        System.out.println( "Java starting from 19 " + name.indexOf("Java",19) );
        System.out.println( "Java starting from 20 " + name.indexOf("Java",20) );


        int firstJavaLocation = name.indexOf("Java"); // location of first java in this case 7
        //starting point can be right after the index of first character of the word
        //or you can start here + 4
        // or you can start right after you finish the word you are searching , for the word java + 4
        // if we do not know the length of the word --> + word.length()
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // I do not know how many word in this sentence . I love know there 3+ words
        // I just want to know what is the second word
        // the word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ",firstSpaceLocation + 1);

        System.out.println("Second word in this sentence is " + name.substring( firstSpaceLocation + 1, secondSpace) );




    }

}
