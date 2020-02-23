package Day63;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ListToMapPractice {

    public static void main(String[] args) {
          /*
        * Abraham Hope
        	Zeliha Sezer
        	Onuralp Dursun
        	Tugba Bekar
        	Birnigar Ozyurt
        	Seda Civan
        	Nuran Demir
        	Murat Kilinc
        	Hakan Durmus
        	Mariia Lukianenko
        * */

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");

        Map<String,Integer> nameCharCountPair = new HashMap<>();

        for (String eachMember : names) {
            nameCharCountPair.put(eachMember, eachMember.length());
        }

        System.out.println("nameCharCountPair = " + nameCharCountPair);

//        String s = "A";
//        String s1 = new String("B");
//        System.out.println(s.concat(s1));

//        String s = "10";
//        int s1 = 22;
//        int s2 = 22;
//        System.out.println(s+s1+s2);


    }
}
