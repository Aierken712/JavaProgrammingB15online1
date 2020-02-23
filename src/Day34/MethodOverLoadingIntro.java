package Day34;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);
        // two version of substring method

        // Method overloading :
        // using same name and different parameter for methods
        // to reuse the name for similar action
        // IT DOES NOT CONCERN RETURN TYPE AND ACCESS MODIFIER

        // method name + parameter list = method signature

        // WE CAN NOT HAVE 2 METHOD WITH SAME METHOD NAME AND SAME METHOD PARAMETERS
        sayHello();
        sayHello("Ershad");
        sayHello(100);
        System.out.println(sayHello("Ershad","Arken"));

    }

    public static void sayHello(){
        System.out.println("Hello, World");
    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num){
        System.out.println("Hello, " + num);
    }

    // this is regarded as same method as above method
//    public static String sayHello(){
//
//    }

    public static String sayHello(String firsName,String lastName){
        return "Hello " + firsName + " " + lastName;
    }






}
