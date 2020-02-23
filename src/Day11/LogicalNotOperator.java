package Day11;

public class LogicalNotOperator {

    public static void main(String[] args) {

         System.out.println( true);
         System.out.println( false);
         System.out.println( !true);
         System.out.println( !false);

        boolean isRecording = false;
        System.out.println( "result of ! isRecording -->> " );
        System.out.println( ! isRecording  );

        // third you can use it in front of a boolean expression
        // boolean expression is any expression that result in a boolean value
        // for example 7>5, x>10, y==20, x<=100, x>y, x>10 && x<100
        System.out.println("result of !(7>5) is ");
        System.out.println( !(7>5));

        int x =7;
        System.out.println("result of (x>10) is ");
        System.out.println( (x>10) );
        System.out.println("result of !(x>10) is ");
        System.out.println( !(x>10) );

        // !(x>10) -->> x<=10




    }
}
