package Day31;

import java.util.Scanner;

public class Greeting {

    // I want to create a method that do below
    // say hello to the person's name I passed when I call this method

    public static void sayHello(){
        System.out.println("Hello batch15");
    }
    public static void sayHelloTo(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scan.next();
        sayHello();
        sayHelloTo("B15") ;    // -->> print hello B15
        sayHelloTo("Kids");    // -->> print hello Kids
    }






}
