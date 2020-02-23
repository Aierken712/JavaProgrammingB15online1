package Day25;

import java.util.Arrays;

public class StringToCharArrayMethod {

    public static void main(String[] args) {

        String name = "Ershad";
        char[] allCharsInName =  name.toCharArray();
        System.out.println("Before sort allCharsInName : " + Arrays.toString(allCharsInName) );


//        for( char eachChar : allCharsInName ) {
//            System.out.println("eachChar = " + eachChar);
//        }

        int count = 0;
        for( char eachChar : allCharsInName ) {

            if(eachChar =='a') {
                ++count;
            }
        }
        System.out.println("Count = " + count);

        Arrays.sort(allCharsInName);
        System.out.println("After sort allCharsInName : " + Arrays.toString(allCharsInName) );



    }
}
