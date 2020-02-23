package ReplPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        //String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
 //       float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
//       1. for (int i = 0; i < 5; i++) {
//            System.out.print(", " + groceryItems[i]);
//        }
//         1.1
//        for (int i = 0; i <=5 ; i++) {
//            if(i%2==1){
//                System.out.println(groceryItems[i]);
//            }
//        }
//        1.2
//        for (int i = 5; i >=0 ; i--) {
//            System.out.println(groceryItems[i]);
//        }
//        1.3
//          int strawberryIndex = 0;
//          for (int i=0;i<=5;i++ ) {
//
//            if(groceryItems[i].equals("strawberry") ) {
//                 strawberryIndex=i;
//             }
//             }
//          System.out.println(strawberryIndex);

//        1.4
//        int countOfBerry = 0;
//        for (int i = 0; i <=5; i++) {
//            if(groceryItems[i].equals("berry")){
//                countOfBerry++;
//            }
//        }
//        System.out.println(countOfBerry++);

//         1.5

//         for(int i=0;i<=5;i++){
//            int charCount = groceryItems[i].length();
//
//             System.out.println(charCount);
//           }

//        1.6
//        for(int i=0; i<=5;i++){
//            int charCount = groceryItems[i].length();
//            if(charCount%2==0){
//                System.out.println(groceryItems[i] );
//            }
//        }

//         1.7
//        for (int i = 0; i <=5 ; i++) {
//
//           if(groceryItems[i].endsWith("e") ) {
//               System.out.println(groceryItems[i] );
//           }
//        }
//        1.8
//        for (String eachItem : groceryItems) {
//            String last3Char = eachItem.substring(eachItem.length()-3 );
//            System.out.println(last3Char);
//        }
//        1.9
//        String allItems="";
//        for (String eachItem : groceryItems) {
//            if(eachItem.equals("kiwi") ) {
//                allItems += eachItem;
//            }else
//                allItems += eachItem + ","; // allItems = allItems + eachItem
//        }
//        System.out.println(allItems);

        // float[] prices = { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f};

//         2.
//        for (int i = 0; i <=5 ; i++) {
//            System.out.print(prices[i] + ", ");
//        }

//         2.1
//        for (int i = 0; i <=5 ; i++) {
//           if(i%2==0){
//               System.out.println(prices[i] );
//           }
//        }

//        2.2
//        for (int i = 0; i <=5 ; i++) {
//            if(prices[i]<3 ){
//                System.out.println(prices[i] );
//            }
//        }

//         2.3
//        float sum = 0;
//        for (int i = 0; i <=5 ; i++) {
//               sum += prices[i];
//        }
//        System.out.println(sum);
//        System.out.println(sum/6);

//        2.4

//        for (int i = 3; i <=5 ; i++) {
//
//            System.out.println(prices[i] );
//        }

//        2.5
//        float sumOfMiddle = 0;
//        for(int i= 2;i <=3;i++){
//            sumOfMiddle +=prices[i];
//        }
//        System.out.println(sumOfMiddle);

//        2.6
//        float sum = 0;
//        for (int i =2 ; i <= 4; i++) {
//            System.out.println(prices[i] );
//        }

//         2.7
//        float max = 0;
//        for(int i = 0; i<=5; i++){
//            if(prices[i]>max ){
//                max=prices[i];
//            }
//        }
//        System.out.println(max);
//
//        int maxIndex = 0;
//        for(int j=0;j<=prices.length-1 ;j++){
//            if(prices[j]==max ){
//                maxIndex=j;
//            }
//        }
//        System.out.println(maxIndex);

//        2.8
//        float minimumPrice = 1.99f;
//        for(float eachPrice : prices){
//
//            if(eachPrice<minimumPrice){
//                minimumPrice=eachPrice;
//            }
//        }
//        System.out.println(minimumPrice);
//
//       int minimumPriceIndex =prices.length-5;
//       System.out.println(minimumPriceIndex);

        // 2.9
//        float secondMaxPrice = prices[0];
//        float maxPrice = 4.65f;
//        int secondMaxIndex=0;
//        for (float eachPrice : prices){
//            if(eachPrice==prices[3])
//            secondMaxPrice = eachPrice;
//        }
//        System.out.println(secondMaxPrice);
//
//        int secondMaxIndex = prices.length-2;
//        System.out.println(secondMaxIndex);
//        for (int i = 0; i <prices.length ; i++) {
//            if( prices[i]<maxPrice && prices[i]>secondMaxPrice){
//                secondMaxPrice=prices[i];
//                secondMaxIndex=i;
//            }
//        }
//        System.out.println(secondMaxPrice);
//        System.out.println(secondMaxIndex);

//      3.
        //3.1
//        String firstItem = groceryItems[0];
//        float firstPrice = prices[0];

        //System.out.println(firstItem + " price is " + firstPrice);

        //3.2
//        String lastItem = groceryItems[5];
//        float lastPrice = prices[5];
//        System.out.println(lastItem + " price is " + lastPrice);

        //3.3
//        for (int i = 0; i <=5 ; i++) {
//
//            String Item  = groceryItems[i];
//            float  price = prices[i];
//
//            1.System.out.println(Item + " price is " + price);
//            2.System.out.println(groceryItems[i] + " price is " + prices[i]);
//        }
        //3.4

//        for (int i = 0; i <=5;i++) {
//            if(prices[i]>3.11){
//                System.out.println(groceryItems[i]);
//            }
//        }

        //3.5
//        float sum = 0;
//        for (int i = 0; i <=5 ; i++) {
//            sum += prices[i];
//        }
//        System.out.println(sum/6);
//        for (int j=0; j<=5;j++){
//            if(prices[j]>sum/6 ){
//                System.out.println(groceryItems[j] );
//            }
//        }
        //3.6
//        for(String eachItem : groceryItems){
//            if(eachItem.contains("b")){
//                System.out.println(eachItem);
//            }
//        }

        //3.7
//        float maxPrice = 0;
//        for (int i = 0; i <= 5; i++) {
//            if (prices[i] > maxPrice) {
//                maxPrice = prices[i];
//                //System.out.println(maxPrice);
//            }
//        }
//        System.out.println(maxPrice);
//        System.out.println(groceryItems[2] );

        // 3.8
//        float minPrice = 0.99f;
//        for (int x = 0; x <=5 ; x++) {
//            if(prices[x]<minPrice ){
//                minPrice=prices[x];
//                //println(groceryItems[x] );
//            }
//        }
//        System.out.println(minPrice );
//        System.out.println(groceryItems[1] );

        // 4.1
//        String temp = groceryItems[0];
//        groceryItems[0] = groceryItems[5];
//        groceryItems[5] = temp;
//        System.out.println(Arrays.toString(groceryItems));

        // 4.2
//        int itemCharCount = 0;
//        for (int i = 0; i <=5 ; i++) {
//            itemCharCount = groceryItems[i].length() ;
//            groceryItems[i]+=itemCharCount;
//        }
//        System.out.println(Arrays.toString(groceryItems));

        // 4.3
//        for (int i = 0; i <=5 ; i++) {
//            prices[i]+=1;
//            System.out.println(prices[i] );
//        }

        // 4.4
//        for (int x = 0; x <=5 ; x++) {
//            prices[x]*=2;
//            System.out.println(prices[x]);
//        }

        //4.5
//        for (int i = 0; i <=5 ; i++) {
//            if(prices[i]<2){
//                prices[i]*=3;
//                System.out.println(prices[i]);
//            }
//        }

        //4.6
       //  float[] prices = {5.97f,2.97f,9.3f,7.78f,7.76f,5.76f};
//        float highestPrice = 0;
//        for (int x = 0; x <=5; x++) {
//            if(prices[x]>highestPrice){
//                highestPrice=prices[x];
//            }
//        }
//        System.out.println(highestPrice);

        // 4.7
//        float highestPrice = 9.3f;
//        for(int i = 0;i<=5;i++){
//            if(prices[i]==highestPrice){
//                System.out.println(groceryItems[i]);
//            }
//        }



//        Scanner scan = new Scanner(System.in);
//
//
//        System.out.println("Enter number for a:");
//        a = scan.nextInt();
//        System.out.println("Enter number for b:");
//        b = scan.nextInt();
//        System.out.println("a = " + a + " b = " + b);
 //       System.out.println("Swapping a and b ");
   //     System.out.println("a = " + a + " b = " + b);

        int a = 10;
        int b = 23;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " + a + " b = " + b);






















    }
}

