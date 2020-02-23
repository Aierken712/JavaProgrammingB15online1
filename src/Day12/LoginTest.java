package Day12;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String username = "user123";
        String password = "pass123";

        String username1;
        String password1;

        System.out.println("what is your username? ");
        username1 = scan.next();
        System.out.println("what is your password? ");
        password1 = scan.next();

        if (username.equals(username1) && password.equals(password1) ) {
            System.out.println("Login Successful");
        }else if (!username.equals(username1) ) {
            System.out.println("Username is not correct!");
        }else if (!password.equals(password1) ) {
            System.out.println("Password is not correct!");
        }








    }
}
