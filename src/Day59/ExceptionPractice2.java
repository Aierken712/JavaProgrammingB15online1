package Day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {

    public static void main(String[] args) {
        System.out.println("The start");
        String name = "Ershad";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Ershad`s name ? ");

        // we want to take different action according to
        // different type of Exception happen during the program
        // we can have more than one catch block
        // to handle different types of Exception
        // and take action according to the Exception type at Runtime

        try{

            int targetIndex = scan.nextInt();
            System.out.println(name.charAt(targetIndex));
            System.out.println("End of try");

        }catch(StringIndexOutOfBoundsException e){

            System.out.println("Something unusual happen !!! ");
            System.out.println("Enter between 0 and " + name.length() );

        }catch(InputMismatchException i){

            System.out.println("Input mismatch, enter number !");
            System.out.println("Here is what you get if you enter 0 " + name.charAt(0) );

        }

        System.out.println("The End");

    }
}
