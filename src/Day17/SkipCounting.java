package Day17;

public class SkipCounting {

    public static void main(String[] args) {

//        int counter = 0;
//        while (counter <= 30){
//            counter += 3;
//            System.out.println(counter + " ");
//        }
//        System.out.println();
//        int countEven = 0;
//        while (countEven <=50){
//            System.out.print( countEven + " ");
//            countEven +=2 ;
//        }
//        System.out.println();
//
//        int countOdd =1;
//        while (countOdd <= 50){
//            System.out.print(countOdd + " ");
//            countOdd += 2;
//        }
//        System.out.println();

        int count = 0;

        while (count <= 50) {


            if (count % 2 == 0) {
                System.out.println(count + " is even number");
            } else {
                System.out.println(count + " is odd number");
            }
            ++count;


        }
    }
}