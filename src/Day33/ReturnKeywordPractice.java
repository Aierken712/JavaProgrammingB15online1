package Day33;

import java.util.Arrays;

public class ReturnKeywordPractice {

    public static void main(String[] args) {

        System.out.println(calculateAndReturnAge(1998) );

        int[] birthYears = {1999,122,2019, 1987, 1978,1964,3999, 2004};

        for (int i = 0; i <8 ; i++) {

            System.out.print(calculateAndReturnAge(birthYears[i]) + " " );
        }

    }
//    calculateAndReturnAge
//    Write a method accept a birth year and return the age :
//    the birth year should be within the range of 1900-2020
//            if not return 0
//    optionally : test your code against array of birthYears
//    {1999,122,2019, 1987, 1978,1964,3999, 2004}

    public static int calculateAndReturnAge(int birthYear){
        int age = 0;
        if(birthYear >= 1900 && birthYear <=2020){
             age = 2020-birthYear;
        }else{
            age = 0;
        }
        return age ;
    }



}
