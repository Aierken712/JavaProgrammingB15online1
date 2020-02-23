package Day45;

public class Apple extends Fruit{

    // if we don`t have any constructor
    // we will get default constructor
    // and compiler automatically call
    // no arg constructor of super class by inserting super()
    public Apple(){
        super("test");
    }



    // First line of constructor is automatically calling
    // super() if we don`t call any

     // I want to reuse the functionality
     // already written in super class constructor
        // we can use super() or super(arguments here)
        // to call super class`s constructor
    // super();

     // how to call constructor with 1 arguments
     //   super("test");

        // can we use this super() call more than once
        // NO !!!!!!!!!!!!

    public static void main(String[] args) {

        Apple a1 = new Apple();

    }


}
