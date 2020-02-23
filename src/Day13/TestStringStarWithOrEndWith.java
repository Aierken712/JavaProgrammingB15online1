package Day13;

public class TestStringStarWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge";

        // check if a String start with another string
        //IT IS CASE SENSITIVE

        System.out.println(name.startsWith("Mu") );
        System.out.println(name.startsWith("mu") );
        System.out.println(name.startsWith("Mac") );

        // check if a string end with another string

        System.out.println( name.endsWith("e"));
        System.out.println( name.endsWith("A"));
        System.out.println( name.endsWith("E"));









    }
}
