package Day06;

import java.util.Scanner;

public class UsingThevalueOfOtherVariable {

    public static void main(String[] args) {

        //int myFavoriteNumber = 300;

        //int yourFavoriteNumber = myFavoriteNumber;

       // System.out.println("My Favorite Number " + myFavoriteNumber );
        //System.out.println("Your Favorite Number " + yourFavoriteNumber );

        //yourFavoriteNumber = 100;
        //System.out.println("My Favorite Number " + myFavoriteNumber );
        //System.out.println("Your Favorite Number " + yourFavoriteNumber );

        //create a variable called yourOrder , type string
        // and assign a value
        //create another variable called myOrder and assign the value
        //to same value as yourOrder by copying
        //and just print them out

        Scanner input = new Scanner(System.in);
        System.out.println("WHAT IS YOUR ORDER ? I WANT TO ");
        String yourOrder = "soccer";
        String myOrder = yourOrder;

        System.out.println("Your order is : " + yourOrder + "\n" + "My order is : " + myOrder);




    }









}
