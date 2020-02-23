package ReplPractice;

import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

//         for(int i=1; i<=6;i++){
//
//             for(int x=1;x<=i;x++){
//                 System.out.print(x + " ");
//             }
//             System.out.println();
//         }

        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();
        if(fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")  ){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }




    }
}