package OfficeHour;

class Test{

    public Test(){
        System.out.println("HOla");
    }

    public Test(int a){
        this(); // -->> Hola
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test obj = new Test();// -->> Hola
       // Test obj = new Test(10); -->> Hola and Hello
    }

}

public class This_Keywords {

    int a = 100;

    public void method1(){
        System.out.println(this.a); // calling instance variable
        // this.This_Super_Keywords()


    }

    public void method2(){
        this.method1(); // calling instance method
    }

    public static void main(String[] args) {

       // this.a; there is no object instance in static method
      //  System.out.println(This_Super_Keywords.a); a is not static
      // this. or super we can not use in the static method

        This_Keywords obj = new This_Keywords();
        System.out.println(obj.a);




    }




}
