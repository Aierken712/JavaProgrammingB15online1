package Day45;

public class Phone extends Electronic {

    // Sub class inherit every visible instance field static field
    // Sub class inherit every visible instance method static method
    double size ;
    double price ;



    // bad Idea to have main here
    // but we are doing it anywhere for less screen to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        System.out.println(Electronic.useElectricity);
        System.out.println(Phone.useElectricity);
        // directly accessing the static field of same in static method
        System.out.println(useElectricity);

        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayUseElectricity();
        //static way
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();
    }


}
