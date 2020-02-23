package ReplPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class NewClass {

        public static void main(String[] args) {

//        int[] number = {2,3,4};
//        System.out.println( findMax(number) );
//
//        double[] number1 = {2.3,3.5,5.3};
//        System.out.println(findMax(number1));
//
//    }
//
//    public static int findMax(int[] num){
//        int maxNum = 0 ;
//        for(int i=0;i<num.length;i++){
//            if(num[i]>maxNum ){
//                maxNum=num[i];
//            }
//        }
//        return maxNum;
//    }
//
//    public static double findMax(double[] nums) {
//        double maxNum1 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > maxNum1) {
//                maxNum1 = nums[i];
//            }
//        }
//        return maxNum1;


        //  HOW TO REVERSE ARRAY
        int[] array = {2, 3, 45, 2, 1, 4, 5, 3};
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        // HOW TO REVERSE A STRING
        String str = "whatever";
        String result="";
        for(int i = str.length()-1; i>=0; i--){
            result = result+ str.charAt(i);
        }
        System.out.println(result);

        // HOW TO FIND UNIQUE VALUES FROM ARRAY
        int [] nums = new int [6];
        nums [0] = 44;
        nums [1] = 32;
        nums [2] = 100;
        nums [3] = 100;
        nums [4] = 7;
        nums [5] = 7;
        String uniqueNum="";
        for (int n:nums) {
            if (!uniqueNum.contains(String.valueOf(n)))
                uniqueNum = uniqueNum+n+" ";
        }
        System.out.println(uniqueNum);






}


    }

