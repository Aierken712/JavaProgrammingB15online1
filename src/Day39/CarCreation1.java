package Day39;

public class CarCreation1 {
    public static void main(String[] args) {
        // Create car object using Class
        // or
        // Get an instance of Car class

        Car c1 = new Car();
        c1.make = "Toyota";
        c1.model = "4 Runner";
        c1.color = "white";
        c1.year = 2020;

        c1.goForward();
        c1.printCarAge();

        c1.changeColorTo("blue");
        System.out.println("c1.color = "+ c1.color);
        System.out.println("-----------");

        Car c2 = new Car();
        c2.year = 2017;
        c2.make = "Hyundai";
        c2.model = "SantaFe";
        c2.color = "black";

        c2.goForward();
        c2.printCarAge();

        System.out.println("END ");
    }

}
