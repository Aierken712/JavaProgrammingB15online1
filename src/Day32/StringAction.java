package Day32;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

public class StringAction {

    public static void main(String[] args) {

        reversePrintMyOwnName();
        printStringDashInBetween("Ershad");

    }
    // reversePrintMyOwnName
    // create a method that has no parameter and print your name in reversed order
    public static void reversePrintMyOwnName(){
        String name = "Ershad";
        // start from last character and print toward first character
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printStringDashInBetween(String name){
        // String name = "Ershad";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if(i != name.length()-1){
                System.out.print("-");
            }
        }
    }


        // print each and every character of a string with dash in between
    // excluding the last one Ershad -->> E-r-s-h-a-d




}
