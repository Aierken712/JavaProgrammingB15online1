package Day49;

// a class can only extends one other class
// a class can implements multiple interfaces
public class Burger implements Edible,Juicy{

   //    public static final boolean Is_Human_Food = true;
    //   public Burger(){
//       super();
//       }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
