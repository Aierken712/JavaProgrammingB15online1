package Day17;

public class BackWordEvenNumberFinder {

    public static void main(String[] args) {

        int num = 100;

//        while ( num>=0){
//
//            if (num%2 == 0){
//                System.out.println(num + " is even number");
//            }
//             --num;

        while (num >= 0) {
            if (num % 2 != 0) { // num % 2 = 1 dose same thing
                System.out.println(num + " is Odd number");
            }
            --num;


        }
    }
}