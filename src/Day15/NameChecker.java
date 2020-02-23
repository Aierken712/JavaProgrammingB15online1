package Day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name please : ");
        String name = scan.next();

        int lengthOfTheName = name.length();
        System.out.println("length of the name = " + lengthOfTheName);

        if (lengthOfTheName < 4) {
            System.out.println("Short Name");
        } else if (lengthOfTheName >= 4 && lengthOfTheName <= 11) {
            System.out.println("Medium Name");
        } else {
            System.out.println("Longer Name");


            if (name.contains("a")) {
                System.out.println(" ");
            } else {
                System.out.println(" I do not have both a or e in my name");
            }


        }


    }
}
