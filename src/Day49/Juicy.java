package Day49;

// interface can achieve loosely coupling between implementing classes
// for example : when we say flyable
// all the implementing classes like Plane, Insects, Superman...
// can be all Flyable and has nothing to do with each other
// and almost no knowledge about each other : known as loosely
// this is why it`s always preferred in design

public interface Juicy {

    public abstract void melt();

    // another type of method interface can have is :
    // static method, it must have body
    // and it`s there to provide some utility methods
    // that does not belong to any class
    // static methods of interface are not inherited
    // it must have a body

    public static void squeeze(){
        System.out.println("static squeezing");
    }

}
