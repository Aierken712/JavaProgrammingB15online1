package Day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};
       // FOR EACH LOOP CAN ONLY BE USED FOR ARRAY
       // THERE IS NO INFINITE LOOP EVER IN FOR EACH LOOP
        for(double eachPrice : prices){
            System.out.println("eachPrice = " + eachPrice);
        }



    }
}
