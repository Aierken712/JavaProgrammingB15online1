package Day17;

import java.util.Scanner;

public class PrintNameWithOddIndex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = scan.nextLine();

        int x = 0;
         while ( x < name.length() ) { //x <= name.length()-1
             if (x%2==1){
                 System.out.println(name.charAt(x));
             }
             ++x;
         }






    }
}
