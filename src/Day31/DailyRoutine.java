package Day31;

public class DailyRoutine {

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

    public static void prepareKidsForSchool(){
        System.out.println("Kiss your kids to wake them up");
        System.out.println("Wake them up for 10 times ");
        System.out.println("prepare their breakfast and lunch ");
        System.out.println("----------------------------");
    }

    public static void takeThemToSchool(){

        System.out.println("Take them to school");
        System.out.println("----------------------------");
    }

    public static void studyJava(){
        System.out.println("Think about java waking up");
        System.out.println("Think about java drinking coffee");
        System.out.println("----------------------------");
    }

    public static void sayILoveJava300Times() {
        String name = "I Love Java 300 Times";
        for (int i = 0; i <= 300; i++) {
            System.out.print(name + " | ");
        }

    }




    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava300Times();
        // wakeUp
        // drinkCoffee
        // prepareKidsForSchool
        // takeThemToSchool
        // goToWork
        // groceryShopping
        // cooking
        // studyJava
        // goToSleep
    }


}
