package Day55;

public class Casting {

    public static void main(String[] args) {

        int  x = 10;

        long y = x;

        byte b = (byte)x;

        Object o = new Dog("Chiwawa");

        Dog d = (Dog)o; // this is downcasting from type Object to Dog
        d.bark();

        // in order to let the Dog Object bark, we need to refer a dog
        // as a Dog or




    }
}
