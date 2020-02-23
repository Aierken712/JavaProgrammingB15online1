package Day08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WormUpTask {

    public static void main(String[] args) {

        /*
         * Voting Eligiblity Program
         *
         * Create a variable called age int
         *
         * check whether this age is more than 18
         * if yes print : you are ready to vote !!!
         * if its less 18 print  wait until you are 18
         *
         * */

        int age = 30;

        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("you are ready to vote !!!");
        } else {
            System.out.println("wait until you are 18!");
        }


        /*
         * create a program to guess your favorite number
         * create a variable called myFavoriteNumber as int
         * Ask user to guess your favorite number
         * if user guessed right then print BINGO
         * if not print try again later
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess my favorite number : ");

        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 11) {
            System.out.println("BINGO!!!");
        } else {
            System.out.println("Try again later");
        }

    }
}













