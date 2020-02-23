package Day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        // checking for string equality should be always
        // done using equals method of string

        // oneString.equals(anotherString) -->> true or false
        // equals method coming from String class
        //each and every String object you create will have this functionality

        // just compare 2 String literal directly using equals method
        //this is something that you will rarely
        //System.out.println("Java".equals("Java")  );

        String myString = "Java";
        System.out.println( myString.equals("Java")     );
        //Intellij display original as helper, its not part of your code
        //please ignore and keep trying . do not type original just type your text
        String yourString = new String("Java");

        System.out.println("is my string same as your string ? ");
        // how to compare myString to yourString for equality
        System.out.println( myString.equals(yourString) );


//        String myString = "Java";
//         if (myString.equals("Java") ) {
//             System.out.println("Correct word!!!!");
//         }else{
//             System.out.println("SAY JAVA");
//         }












    }
}
