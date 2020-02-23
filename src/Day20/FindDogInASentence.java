package Day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        String msg = "I like Dog, Dogs are cute, Dogs are friendly";
        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <= lastCharIndex-2; x++){

            String current3char = msg.substring(x,x+3);
            //System.out.println(x + " : " + current3chars);
            if(current3char.equals("Dog")) {
                System.out.println("BINGO!!! AT " + x);
            }

        }



    }
}
