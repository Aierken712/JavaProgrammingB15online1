package Day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {
        String[] marvelHeros = {"Iron Man", "Captain America", "Spider man",
                "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel",
                "Captain America", "Spider man",
                "Black Widow", "Wanda", "Captain Marvel",
                "Captain America"};

        System.out.println("Marvel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray=marvelHeros.length;
        System.out.println("Hero count = " + sizeOfArray);


//        String itemToSearch="Iron Man";
//        int countOfItem = 0;
//
//        for(String eachHero : marvelHeros){
//
//            if(eachHero.equals(itemToSearch)) {
//                countOfItem++;
//            }
//        }
//        System.out.println("countOfItem = " + countOfItem);

        int cntBlackInName = 0;
        for (String each : marvelHeros) {

            if (each.toLowerCase().contains("black")) {
                cntBlackInName++;
            }
        }
        System.out.println("countOfItem = " + cntBlackInName);





    }
}
