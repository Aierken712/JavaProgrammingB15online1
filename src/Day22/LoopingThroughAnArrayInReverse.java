package Day22;

public class LoopingThroughAnArrayInReverse {

    public static void main(String[] args) {

        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int elementCount = scores.length;
        int lastItemIndex = elementCount-1;

        for (int i = lastItemIndex; i >= 0 ; i--) {
            System.out.println("Index location " + i);
            System.out.println(scores[i]);
        }


    }
}
