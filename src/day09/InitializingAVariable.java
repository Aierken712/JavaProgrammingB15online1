package day09;

public class InitializingAVariable {

    public static void main(String[] args) {

      //  int num;

      //a variable inside a method , must get initial value
      //before its being used for the first time
      //and there should not be any chance
      //this variable does not get value before usage
      //  System.out.println(num);

        int languageOption = 5;
        String  greeting = "";

        if (languageOption ==1) {
            greeting = "Hello";
        }else if (languageOption == 2) {
            greeting = "Salam";
        }else if (languageOption == 3) {
            greeting = "Hola";
        }else if (languageOption == 4) {
            greeting = "Privet";
        }else if (languageOption == 5) {
            greeting = "Merhaba";
        }else if (languageOption == 6) {
            greeting = "Szia";
        }else if (languageOption == 7) {
            greeting = "Bonjour";
        }else {
        greeting = "UNKNOWN";
    }
        System.out.println("This is how the greeting message you get");









}
}
