package day5;
import java.util.Scanner;
public class TheScannerWay {

    public static void main(String[] args) {

        // ask user for name
        // and capture the result
        // print your name is this
        // ask user for birth year
        // print the age !!
        // ask user for height
        // and capture the result
        // print the height !!

        //create scanner object
        //you can name your variable whatever you want
        //in below case we are calling it scan(System.in) is the valu
        //Scanner is data type , scan is the name, new Scanner(
        Scanner scan = new Scanner(System.in);

        System.out.println("what is your name : ");
        //String name = "Ershad";
        String name = scan.next();
        System.out.println("My name is " + name);

        System.out.println("what is your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;
        System.out.println("Your age is : " + age );

        System.out.println("What is your height ? ");
        double height = scan.nextDouble();
        System.out.println("Your height is : " + height);


    }





}
