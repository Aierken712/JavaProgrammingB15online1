package Day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {

        combineBothAction();

    }

    public static void combineBothAction(){
        wakeUp();
        drinkCoffee();
    }

    public static void wakeUp(){
        System.out.println("Open your eye");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm? open it again");
        System.out.println("----------------------------");
    }

    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button make your coffee");
        System.out.println("----------------------------");
    }










}
