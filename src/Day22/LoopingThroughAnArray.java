package Day22;

public class LoopingThroughAnArray {

    public static void main(String[] args) {

        // creating an array object with empty space
        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        //// accessing the elements inside array one by one
//        System.out.println( scores[0]   );
//        System.out.println( scores[1]   );
//        System.out.println( scores[2]   );
//        System.out.println( scores[3]   );

        // how do we get the size of any array object
        // array object has a property called length
        int itemCount = scores.length;

        for (int i = 0; i < scores.length ; i++) {
            System.out.println(scores[i]);
        }




        // how do we get the char count of a string
//        String name = "Jon Snow";
//        int charCount = name.length();


    }
}


