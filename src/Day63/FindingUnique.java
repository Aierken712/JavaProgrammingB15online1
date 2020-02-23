package Day63;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require to login to okta, if it ask you to sign in " +
                ", please just click on it , it will take you to okta sign page , once you signing with okta" +
                "then you will be able to join right away. Please do not try to register , the link is already in the email"
                + "click to join";

        // how many unique character showed up in above sentence

            Set<Character> charSet = new HashSet<>();
            for(int i=0;i<str.length();i++){
                charSet.add(str.charAt(i));
            }
              System.out.println("How many character = " + str.length());
              System.out.println("How many unique = " + charSet.size());
              System.out.println("charSet = " + charSet);
        System.out.println("==================================================");
            for (Character each : charSet){
                System.out.println("unique = " + each);
            }


    }
}
