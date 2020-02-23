package Day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6",400);
        Driver d = new Driver("Arsilan",12345);

        Taxi t1 = new Taxi(101,en,d);

        System.out.println( "t1 = " + t1.toString() );

        Taxi t2 = new Taxi(102,
                  new Engine("V8", 600),
                  new Driver("John",12354) );

        System.out.println(t2.dr.name.charAt(0) ); // J

        // how do I store t2 plate number in a variable x
        int x = t2.plateNum;
        // how do I store t2 Driver Field in a variable y
        Driver y = t2.dr;
        // how do I store t2 Engine Field in a variable z
        Engine z = t2.eng;

        // Hoe do i get the name of the driver using t2
        System.out.println("Driver Name " + y.name);
        System.out.println("Driver Name " + t2.dr.name);

        // how do I get the horse power of this Taxi t2
        System.out.println("Engine horsePower is " + t2.eng.horsePower);

        // Hoe do i get the first char of the driver name using t2
        System.out.println("Driver Name first char " + t2.dr.name.charAt(0));

    }
}
