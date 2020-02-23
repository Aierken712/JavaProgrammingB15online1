package Day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWorld {

    public static void main(String[] args) {

       // Scanner blabla = new Scanner(System.in);
        //System.out.println("What is your name ? ");
        // nextLine method of Scanner is used to capture whole line

        //String name = blabla.nextLine();
        //System.out.println( "You have entered " + name);

        // Task 4
        // use nextLine to ask your bio
        //what is your name
        //which city you live in , including state , Toronto , ON
        //what is your street address

        Scanner blabla = new Scanner(System.in);
        System.out.println("What is your name ? ");

        String name = blabla.nextLine();
        System.out.println( "You have entered " + name);

        System.out.println("Which city you live in ? ");

        String city = blabla.nextLine();
        System.out.println("You live in " + city);

        System.out.println("What is your street address ? ");
        String address = blabla.nextLine();
        System.out.println("Your street address is " + address);





    }






}
