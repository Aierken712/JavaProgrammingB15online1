package Day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald , what can I get for you");

        String order = " ";
        int itemNumber = 35;

        if (itemNumber == 1) {
            System.out.println("You have selected 1");
            order = "Burger";
        }else if (itemNumber == 5){
            System.out.println("You have selected 5");
            order = "Fry";
        }else if (itemNumber == 8) {
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else{
            System.out.println("You have selected unknown item");
            order = "unknown";
        }

        System.out.println("Your order is " + order);




    }
}
