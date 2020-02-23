package Day10;

public class MultiBranch_Switch {

    public static void main(String[] args) {

        String order = "";
        int itemNumber = 88;

        switch (itemNumber){
            case 1:
                System.out.println("You have selected 1");
                order = "Burger";
            break;
            case 5 :
                System.out.println("You have selected 5");
                order = "Fry";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            default :
                System.out.println("You have selected unknown item");
                order = "unknown";
        }

             System.out.println("Your order is " + order);






    }
}
