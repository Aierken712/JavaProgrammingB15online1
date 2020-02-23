package day09;

public class SwitchStatement_Version1 {

    public static void main(String[] args) {

        int languageOption = 4;
        String greeting = "";
        switch (languageOption){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "Bounjour";
                break;
            default:
                System.out.println("greeting is Unknown");
        }

              System.out.println(greeting + ", SDET");










    }
}
