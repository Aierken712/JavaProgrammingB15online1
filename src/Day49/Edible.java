package Day49;

// interface is like a contract
// once someone sign a contract he/she will provide all the details that he/she must do

// an interface is not a class
public interface Edible {

    // in interface fields automatically public static final if not defined so
    // public static final field naming convention is ALL_CAPS!!!
    // you can have as many constants as you want
    public static final boolean Is_Human_Food = true;

    // if a method with no-body is not defined public abstract ,
    // it`s automatically
    public abstract void eat(); // we can use like -->> void eat();
    public abstract void drink();

    // default method was added since java 8 to provide
    // default implementation to not break existing implementing
    // classes have option to use it as is
    // or override it according to their own requirements
    // the default method only exist in an interface
    // default keyword here is not an access modifier!!!!
    // default method must have body
    public default void digest(){
        System.out.println("You implement the code yourself");
    }




}
