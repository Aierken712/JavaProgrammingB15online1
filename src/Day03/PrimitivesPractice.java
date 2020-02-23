package Day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The cat count in his house is " + catCount);

        long mileToMoon = 5000000L;
        System.out.println("The mile to moon is " + mileToMoon);

        long mileToSun  = 100000000L;
        System.out.println("The mile to sun is " + mileToSun);
        //---------floating point---------

        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49f;
        System.out.println("The price of potato is " + priceOfPotato);




        //----------larger floating point numbers--------
        double priceOfIpad1   = 355.99d;
        System.out.println("The price of Ipad1 is " + priceOfIpad1 );

        double priceOfIpadPro = 1024.99D;
        System.out.println("The price of Ipad pro is " + priceOfIpadPro);
        // compiler automatically assume it's a double so it's not required to have d
        // However for good programming habbit , add them always
        double priceOfMac     = 2299.99;
        System.out.println("The price of mac is " + priceOfMac);



    }
}
