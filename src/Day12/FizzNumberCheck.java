package Day12;

public class FizzNumberCheck {

    public static void main(String[] args) {

        int num = 25;

        if (num % 5 ==0 ) {
            System.out.println("Fizz Number!");
        }else if (num % 3 == 0) {
            System.out.println("Buzz Number!");
        }else if (num % 3 == 0 && num % 5 == 0 ) {
            System.out.println("FizzBuzz Number!");
        }else{
            System.out.println("NOT MY NUMBER");
        }








    }
}
