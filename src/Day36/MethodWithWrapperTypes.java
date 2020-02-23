package Day36;

public class MethodWithWrapperTypes {

    public static void main(String[] args) {

        // its expecting 2 Integer object
        // and we used new keyword to provide 2 Integer Objects
        //   sumAndPrint(Integer.valueOf(20),Integer.valueOf(30) );

        // i1 is a variable with data type Integer
        // and it can store Integer Object
        // whats deal here with 12 ?? --> autoBoxing
        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1,i2 );

        // we pass directly int knowing that autoboxing can take care converting to object
        // if not specific
        sumAndPrint(25,10 );
        System.out.println("--------------------------------------------");

        printTheDoubleValue(10);
        printTheDoubleValue(new Integer(10) );

    }

    /**
     * This method add 2 Integer numbers and print
     * @param num1 type Integer , first number to add
     * @param num2 type Integer , second number to add
     */
    public static void sumAndPrint(Integer num1,Integer num2){
        // we can not add two object
        // what is happening here is
        // the moment the + operator appeared
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int conversion -->> auto-unboxing
        System.out.println(num1+num2);
    }

    /**
     * This method
     * @param x
     */

    public static void printTheDoubleValue(int x){

        System.out.println("After doubling x = " + (x*2) );
    }




}
