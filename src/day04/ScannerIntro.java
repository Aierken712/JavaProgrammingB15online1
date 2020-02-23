package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyboard in console
        String firstName = scan.next();

        // print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);

        // capture what user typed on keyboard in console fpr age
        int age = scan.nextInt();
        // print the result of users age
        System.out.println("your age is : " + age);


    }





}
