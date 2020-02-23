package Day20;

public class ReversingAString {

    public static void main(String[] args) {

        String name = "Jon Snow";
        String reversedName = "";

//        System.out.println(name.charAt(7));
//        System.out.println(name.charAt(6));
//        System.out.println(name.charAt(5));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(0));

//           System.out.println();

           int lastCharIndex = name.length() - 1;

          for( int x = lastCharIndex; x>=0; x--)  {

              System.out.println(x + " index : ");

              char currentChar = name.charAt(x);
              System.out.println(currentChar);

              reversedName = reversedName + currentChar;
          }
        System.out.println("reversedName = " + reversedName);


    }
}
