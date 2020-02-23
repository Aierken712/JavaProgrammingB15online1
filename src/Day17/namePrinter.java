package Day17;

public class namePrinter {

    public static void main(String[] args) {

        String name = "Alexander";
        int x = 0;
        while (x < name.length() ) {
            System.out.print("index " + x + " : ");
            System.out.println( name.charAt(x) );
            ++x;
        }
    }
}
//        System.out.println(name.charAt(0) );
//        System.out.println(name.charAt(1) );
//        System.out.println(name.charAt(2) );
//        System.out.println(name.charAt(3) );
//        System.out.println(name.charAt(4) );
//        System.out.println(name.charAt(5) );
//        System.out.println(name.charAt(6) );
//        System.out.println(name.charAt(7) );
//        System.out.println(name.charAt(8) );




