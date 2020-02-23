package Day24;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        double[] items = {125.24,354.23,243.23};
        System.out.println(Arrays.toString(items) );
        String pricesString = Arrays.toString(items);
        System.out.println(pricesString );

        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println("Character at index " + i + " is : " + pricesString.charAt(i));
        }



    }
}
