package Day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "Pumpkin";
        //System.out.println( str.equals("Pumpkin") );

        // contains :
        // it checks whether a string exists in another string
        System.out.println("Does it contains Pumpkin : ");
        System.out.println( str.contains("Pumpkin"));
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("end With Pumpkin = " + endWithPumpkin);












    }
}
