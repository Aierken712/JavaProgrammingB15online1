package Day57;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello B15");
      //  int num = 2.5;  Compiler error

        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
       // nums[5] = 200;
        System.out.println("Bye Bye"); // ArrayIndexOutOfBoundsException is thrown here

        int result = 10/0;
        System.out.println(result);
    }
}
