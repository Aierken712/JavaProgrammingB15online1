package Day20;

public class PalindromeTest {

    public static void main(String[] args) {

        // if you reverse a string if it does not change
        // it means the string is called Palindrome

        String name = "Kayak";

        String reversedName = "" ;

        for (int x = name.length()-1; x>=0; x--){
            reversedName += name.charAt(x);
        }

        System.out.println("reversedName = " + reversedName);

        //check whether reversed name is equal without case checking

        if(name.equalsIgnoreCase(reversedName)){

            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println("PALINDROME TEST HAS FAILED");
        }


    }
}
