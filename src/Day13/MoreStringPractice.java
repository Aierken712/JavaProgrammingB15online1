package Day13;

public class MoreStringPractice {

    public static void main(String[] args) {

         String name= "Pumpkin";
         System.out.println(name);

//        name = "Bulent";
//        System.out.println(name);
          //String is immutable, once created it can not be changed
        // any string actions/methods that look like changing the value
        // actually creating a new string object.

         name.toUpperCase();
         System.out.println(name);

        System.out.println( name.toUpperCase() );

        name = name.toUpperCase();
        System.out.println(name);











    }

}
