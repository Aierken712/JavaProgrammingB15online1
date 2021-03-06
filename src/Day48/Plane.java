package Day48;

// we build relationship between class and interface
// using implements keyword
// (compared to extends keyword for class to class)
// it will build a IS-A relationship
// we can say Plane IS-A Flyable
// since we are inheriting an abstract method
// we need to provide body by overriding it
public class Plane implements Flyable{
    String name;
    int capacity;
    int speed;
    @Override
    public void fly(){
        System.out.println("Plane is flying");
    }

    // bad idea but just for demo purpose
    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();
        System.out.println(Flyable.HAVE_WING);





    }


}
