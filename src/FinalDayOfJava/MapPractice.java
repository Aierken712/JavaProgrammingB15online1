package FinalDayOfJava;

import java.util.*;

public class MapPractice {

    public static void main(String[] args) {

        // what if we want to have multiple value for one key?
        // for example groupCode (bugHunter) -- group members names (abc,efg,htj,knl)
                     // String         List<String>
        // key data type is String , value data type is List<String>
        Map< String,List<String> > groupMap = new HashMap<>();

        groupMap.put("PowerOf4",Arrays.asList("Furkan","Daria","Serife","Muge"));
        groupMap.put("Achievers",Arrays.asList("Maiia","Anastasia","Zaki","Toyly","Like"));
        groupMap.put("BugHunter",Arrays.asList("Ayse","Rabiyam","Gulzina") );
        groupMap.put("BugBuster",Arrays.asList("Rukhshona","Fariza","Seyma","Sumayyra","Huvayda"));

      //  System.out.println(groupMap);
        groupMap.forEach((groupCode,allMembers)-> System.out.println("groupCode = " + groupCode + "\n\t allMembers = "+ allMembers));
        // get Toyly
        System.out.println(groupMap.get("Achievers").get(3));

        // check whether this Map has Gulzina or not in BugHunter ?
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        // we want to add a group entry so we can add or remove members from the group
        groupMap.put("Justice League",new ArrayList<>(Arrays.asList("Superman","Batman","WonderWomen") ) );
        groupMap.get("Justice League").add("Flash");
        System.out.println(groupMap.get("Justice League"));

        // the Key for the Map should be a type immutable

    }
}
