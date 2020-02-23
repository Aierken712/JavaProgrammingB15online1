package Day15;

public class ReplaceMethod {

    public static void main(String[] args) {

        // replace method of the string
        // it will go through all part of string and replace
        //any match with the new string

         String message = "I love Pumpkin , Pumpkin is fun!" ;

         message = message.replace("Pumpkin","Java");

         System.out.println(message);

         String message2 = "Happy Thanks Giving to All";
         //"Happy Thanks Giving to All" -->>"Happy Thanksgiving to All"

        message2 = message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);

        // remove all the space

        message2 = message2.replace(" ","");
        System.out.println("message2 = " + message2);




         // what if I want replace space from everywhere






    }
}
