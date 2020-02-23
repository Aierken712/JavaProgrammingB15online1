package OfficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    String brand ;
    // Car has Engine , so we are using Engine as instance variable data type
    Engine e ;
    // I want Car object has passenger names attacted to it
    //  String[] passengers;
    List<String> passengers;  // = new ArrayList<>();

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = new String("Toyota");  //"Toyota";
        c1.e     = new Engine("V6",270);
    //    c1.passengers = new String[]{"Ziyoda","Aykokul","Mehtp","Rauf"};

        c1.passengers = Arrays.asList("Ziyoda","Aykokul","Mehtp","Rauf");

        System.out.println("c1 = " + c1);

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                ",passengers" + passengers +
   //             ",passengers" + Arrays.toString(passengers)
               '}';
    }

}
