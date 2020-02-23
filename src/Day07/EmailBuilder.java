package Day07;

import java.util.Scanner;

public class EmailBuilder {


    public static void main(String[] args) {

      //String firstName = "Aierken";
      //String lastName = "Aierxiati";
      //String company = "CGI";

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, company, email;

        firstName = scan.next();
        lastName  = scan.next();
        company   = scan.next();
        email     = scan.next();

        System.out.println("My name is " + firstName + " " + lastName + "." + "I work at " + company + "." + "My email is " + email);




    }






}
