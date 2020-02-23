package Day54;

public class Utility {
    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new MakeUps();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        System.out.println("-------------------------------");
        Wearable result = getMyWearableObject();
        System.out.println(result);

        System.out.println(result.getClass().getSimpleName() );
        wearMyWearable(result);
    }

    public static void wearMyWearable(Wearable any){

        any.wear();
    }

    public static Wearable getMyWearableObject(){
        // Wearable w = new Clothes();
        // return w;

       // return new Clothes();
       // return new Watch();
       // return new Perfume();
        return new MakeUps();
    }

}
