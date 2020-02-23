package Day32;

import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {
         // this is passing the array object directly into the method
      //  arrayPrinter( new int[] {1,6,5,3,12,3} );

        // this is assigning the array object into a variable
        // and then pass it into the method
      //  int[] score = {2,5,8,23,4,5,6} ;
     //   arrayPrinter(score);

    //printMaxOfIntArray(new int[] {2,3,6,3,7,8,4} );
    //printMinOfIntArray(new int[] {3,5,1,6,4,7} );
   // printSumOfIntArray(new int[] {3,5,1,6,4,7});
   // checkScoresAllMoreThan60(new int[] {60,45,55,90,} );
     compare2arraySize(new String[] {"Sezgin","Senay","Astrit"}, new String[] {"Araz"} );

    }

    // array printer
    // create a method that has one int array as a parameter
    // print out each item in this format
    // arrays has item : -->> all the items here

    public static void arrayPrinter(int[] nums ){
        System.out.println("arrays has item : " + Arrays.toString(nums));
    }

    // printMaxOfIntArray
    // this method has one int array as parameter
    // add it will print the max number inside the array

    public static void printMaxOfIntArray(int[] num){
        int max = num[0];
        for (int i = 0; i < num.length ; i++) {
            if(max<num[i]){
                max = num[i];
            }
        }
        System.out.println(max);

    }

//     printMinOfIntArray
//     this method has one int array as parameter
//     and it will print the min number inside the array

//     printSumOfIntArray
//     this method has one int array as parameter
//     and it will print the sum of all the numbers

//     OPTIONALLY
//     checkScoresAllMoreThan60
//     this method has one int array as parameter
//     and it will check whether each and every numbers are more than 60
//     if so print everyone passed
//     if not print someone has failed

    public static void printMinOfIntArray(int[] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(min >nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
    }

    public static void printSumOfIntArray(int[] num){
        int sum = 0;
        for (int i = 0; i <num.length ; i++) {
            sum +=num[i];
        }
        System.out.println(sum);
    }

    public static void checkScoresAllMoreThan60(int[] score){

      for(int eachNum : score){
          if(eachNum>60){
              System.out.println("Pass");
          }else{
              System.out.println("Fail");
          }
      }

    }

    // compare2arraySize
    // create a method that accept 2 String array object
    // and compare the item counts inside these 2 array
    // if arr1 is more than print array 1 has more item
    // if arr2 is more than print array 2 has more item
    // else print they have same item count

    public static void compare2arraySize(String[] arr1,String[] arr2){
        if(arr1.length>arr2.length){
            System.out.println("arr1 has more item");
        }else if(arr1.length<arr2.length){
            System.out.println("arr2 has more item");
        }else{
            System.out.println("They have same item count");
        }

    }



}
