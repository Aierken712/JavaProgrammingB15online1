package Day49;

public interface Chargeable {

    public default void Charge(){
        System.out.println("Default charge");
    }


}
