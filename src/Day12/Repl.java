package Day12;

import java.util.Scanner;

public class Repl {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age,zipCode;
        double height, weight;
        boolean isMarried = true;
        long workPhoneNumber,personalPhoneNumber;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println( "Enter your first name");
        firstName = scan.next();
        System.out.println( "Enter your last name");
        lastName = scan.next();
        System.out.println( "Enter your email");
        email = scan.next();
        System.out.println( "Enter your street");
        street = scan.next();
        System.out.println( "Enter your city");
        city = scan.next();
        System.out.println( "Enter your state");
        state = scan.next();
        System.out.println("Enter your zipCode") ;
        zipCode = scan.nextInt();
        System.out.println( "Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println( "Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println( "Enter your age");
        age = scan.nextInt();
        System.out.println( "Enter your height");
        height = scan.nextDouble();
        System.out.println( "Enter your weight");
        weight = scan.nextDouble();
        System.out.println( "Are you married");
        isMarried = scan.nextBoolean();

        contacts ="work phone number" + "-" + workPhoneNumber + "personal phone number" + "-" + personalPhoneNumber + "email:" ;

        System.out.println(contacts);


    }
}
