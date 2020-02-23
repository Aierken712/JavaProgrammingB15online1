package Day44;

// what is inherited from Super class

// fields and methods that visible in sub class are inherited
// constructors are not inherited


public class Train extends Vehicle {

  //  String make ;
  //  int year ;
      int wagonCount ;

      public void makeChoChoSound(){
          System.out.println("Choooo Choooo");
      }

    public static void main(String[] args) {

          Train t1 = new Train();
          t1.makeChoChoSound();
          // these attribute we got from Vehicle
          t1.make = "Thomas";
         // t1.year = 1999; private is not inherited

          // calling the method we got from Vehicle
        t1.start();
        t1.goForward();
    }







}
