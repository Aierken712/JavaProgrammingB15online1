package day16;

public class SecondWordGetter {

    public static void main(String[] args) {

        // given a sentence with 3 words
        // get the second word

        // steps:
        //second word is between first space and second space
        //getting location of space remind me of indexOf
        //getting string inside another string by beginning and ending index
        //remind me of substring

        //String sentence = "I love Java";
        String sentence = "You Understand Java";
        String secondWord;
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println( sentence.substring(2,6) );
        secondWord = sentence.substring(firstSpaceIndex+1 , lastSpaceIndex );
        System.out.println("secondWord = " + secondWord);


        // how to get first word;
        // in plain English : first word is stating from first character till first space
        String firstWord = sentence.substring(0, firstSpaceIndex );
        //how do we print out variable with value using shortcut : soutv then tab
        System.out.println("firstWord = " + firstWord);

        // how to get last word from any sentence
        //last word in a sentence means from last space till the rest
        String lastWord = sentence.substring(lastSpaceIndex  + 1);
        System.out.println("lastWord =  " + lastWord);




    }
}
