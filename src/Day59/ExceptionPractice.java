package Day59;

import java.util.Scanner;

public class ExceptionPractice {

    public static void main(String[] args) {

        System.out.println("The start");
     String name = "Ershad";

     Scanner scan = new Scanner(System.in);
     System.out.println("Character at what index you want to get from Ershad`s name ? ");
     int targetIndex = scan.nextInt();

     try{
         System.out.println(name.charAt(targetIndex));
     }catch(StringIndexOutOfBoundsException e){
         // getMessage is a method coming from Exception class
         // and provide some more details about exception object
         System.out.println( e.getMessage() );
         System.out.println("Something unusual happen !!! ");
     }
     System.out.println("name " + name);
     System.out.println("The End");

     // Exceptions are Object, so it has it`s own class
     // and we can create object ourselves just like we did from any other classes
     // StringIndexOutOfBoundsException e = new StringIndexOutOfBoundsException();
     // System.out.println( e.toString() );

    //    System.out.println("The End");


    }
}
