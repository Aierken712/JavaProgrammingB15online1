package Day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        // pseudo sudo  code
        /*
        * given your currentSpeed , speedLimit
        *
        * check whether the current speed is
        *
        *
        * more than 90 -->>jail
        * more than 80 and less 90 -->> reckless driving
        *
        * -----start from here above two optional
        * more than 70  --> point taken
        * more than 60 and less than 70 --> warning
        * if not speeding keep driving
        *
        * */

        // 45, 65, 90
        int currentSpeed = 45;

        if(currentSpeed > 60) {
            System.out.println("you are speeding more than 60 -- POINT TAKEN!!!!");
            // asking whether its less or equal 70 and more than 60
            //when you come to this point , your speed is already not more than 70
        }else if (currentSpeed > 70){
            System.out.println("your speed is more then 70 ");
        }else {
            System.out.println("KEEP DRIVING YOU ARE GOOD !!!");
        }


    }
}
