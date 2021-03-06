package Day63;

import java.util.*;

public class WordFrequencyMethod {

    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";

        System.out.println("getFrequencyMap(str) = " + getFrequencyMap(str));

    }

    public static Map<String, Integer> getFrequencyMap(String str) {

        Map<String, Integer> wordFreqMap = new HashMap<>();
     //   String[] allWords = str.split(" ");

        for (String  word : str.split(" ") ) {
            if (!wordFreqMap.containsKey(word)) {
                wordFreqMap.put(word, 1);
            } else {
                wordFreqMap.replace(word, wordFreqMap.get(word) + 1);
            }
        }
        return wordFreqMap;


    }
}
