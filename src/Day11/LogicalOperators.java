package Day11;

public class LogicalOperators {

    public static void main(String[] args) {

        // combining multiple condition togerge r
        // in java there is no range check directly like math
        // for example   int < x = 70
        // in math : 60 < x < 100 -->> true < 100
        // in java : x > 60 &&  x < 100

        // && 2 ampersand  & 1 ampersand -->> Logical AND operator
        // This is used to check both conditions are true at the same time

        // think about login example
        //



        /*               true        true
        *int x = 70:   x > 60  && x <100; true
        *
                         false       true
        * int x = 10:   x > 60  && x <100; false
        *
                         true        false
        * int x = 110:   x > 60  && x <100; false
        *
        *                true        true
        * int x = 99:   x > 60  && x <100; true
        *
         */

//        System.out.println("TRUTH TABLE");
//        System.out.println(true && true);
//        System.out.println( false && true );
//        System.out.println(true && false  );
//        System.out.println(false && false  );

//        System.out.println("Result of true && true is " +  (true && true)  );
//        System.out.println("Result of false && true is " +  (false && true)  );
//        System.out.println("Result of true && false is " +  (true && false)  );
//        System.out.println("Result of false && false is " +  (false && false)  );
//
//        System.out.println("TRUTH TABLE ||");
//        System.out.println("Result of true || true is  " +  (true || true)  );
//        System.out.println("Result of false || true is  " +  (false || true)  );
//        System.out.println("Result of true || false is  " +  (true || false)  );
//        System.out.println("Result of false || false is  " +  (false || false)  );

    //       int num1 = 70;
//        System.out.println(num1 > 100 || num1 < 10);

          int num1 = 55;
//        System.out.println(num1>10 && num1 < 60);

        System.out.println(true || false|| false); //-->>true
        System.out.println(true && true && false); //-->>false

        System.out.println( num1 == 50 || num1==51 || num1==55 );

      // check num1 is more than 50 and num1 is not 52 or num1 equal to 57
      // == is checking for equality, != is checking for inequality
        System.out.println(num1>50 && num1!=52 || num1==57);

        //System.out.println(false || true && true);







    }
}
