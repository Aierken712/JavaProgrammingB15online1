package Day63;

import java.util.*;

public class FindingCharacterShowedUpAtLeastOnce_V2 {

    public static void main(String[] args) {

        String str = "The new link for joining class will require to login to okta, if it ask you to sign in " +
                ", please just click on it , it will take you to okta sign page , once you signing with okta" +
                "then you will be able to join right away. Please do not try to register , the link is already in the email"
                + "click to join";

//        Set<Character> chars = new HashSet<>(Arrays.asList(new Character[]{'A','A','A','A','A'}) );
//        System.out.println(chars);

     //   Set<Character> chars = new HashSet<>(Arrays.asList(  ) );

        String[] eachChar = str.split("");
        System.out.println("Array = " + Arrays.toString(eachChar));
     //   System.out.println("===================================================================");

        List<String> charList = Arrays.asList(eachChar);

        System.out.println("===================================================================");
        Set<String> charSet = new HashSet<>(charList);
        System.out.println("Set = " + charSet);

        System.out.println("===================================================================");

        Set<String> charHash = new HashSet<>(Arrays.asList(str.split("")) );
        System.out.println("CharSorted = " + charHash);
    }
}
