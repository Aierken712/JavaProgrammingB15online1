package Day61;

import java.util.*;

public class JobHunter {

    public static void main(String[] args) {

     Job j1 = new Job("BA",120000,"BOFA") ;
     Job j2 = new Job("ON",110000,"BMO") ;
     Job j3 = new Job("ON",100000,"BMO") ;

     List<Job> jobList = new LinkedList<>();
     jobList.add(new Job("AB",120000,"BOFA") );
     jobList.add(new Job("BO",150000,"BMO") );
     jobList.add(new Job("BA",100000,"OFA") );
     jobList.add(new Job("BC",130000,"BOA") );
     jobList.add(new Job("MB",140000,"IBM") );
     System.out.println("Before = " + jobList);

     Collections.sort(jobList);
     System.out.println("After 1 = " + jobList);

     Collections.sort(jobList,Comparator.reverseOrder());
     System.out.println("After 2 = " + jobList);

     Collections.sort(jobList,Comparator.reverseOrder());
     System.out.println("After 3 = " + jobList);




    }
}
