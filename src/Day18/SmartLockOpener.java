package Day18;

import javax.swing.*;
import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = scan.next();

        while ( !password.equals("B15") ) {
            System.out.println("Wrong password,try again!");
            password = scan.next();
        }

        System.out.println("DOOR IS OPEN");




    }
}
