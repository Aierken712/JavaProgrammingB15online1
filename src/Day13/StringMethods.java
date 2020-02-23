package Day13;

public class StringMethods {

    public static void main(String[] args) {

        // string action that we already know so far

        // equals
        String s1 = "Hello";
        System.out.println(s1.equals("abc"));
        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Hello") );

        // toUppercase method of String is used to make String all character uppercase
        System.out.println( s1 );
        System.out.println( s1.toUpperCase()  );

        // toLowerCase method of String is used to make string all character lowercase
        System.out.println( s1.toLowerCase()    );

        String name = "Ershad";
        System.out.println("My name is " + name.toUpperCase());
        System.out.println("my name is " + name.toLowerCase());

        // in order to get how many character that we have inside String
        // we can use length method of String

        System.out.println(s1.length() );

        int lengthOfStr = s1.length();

        if (lengthOfStr > 4) {

            System.out.println("More than 4 character");

        }else{

            System.out.println("Not more than 4");
        }





    }
}
