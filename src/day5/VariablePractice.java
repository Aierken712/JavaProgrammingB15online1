package day5;

import org.w3c.dom.ls.LSOutput;

public class VariablePractice {

    public static void main(String[] args) {

      // 8 primitive
      /*
       Line 1
       Line 2
       Line 3
      Block comment , evering in between will be seen as comment

      whole number         :  byte , short , int , double
      fractional numbers   :  float , double
      logical              :  boolean (true , false)
      character            :  char (single character in single quote)

    usually by default for whole numbers : just use int
    usually by default for fractional numbers : just use double

     IS String part of primitive types ?  : NOOO!!!!!
     String is sequence of character

      */

      //Task 1: age calculater
      //given birth year , please calculate the age
      int birthYear = 1989;
      int currentYear = 2019;
      int age = currentYear - birthYear ;
      // I was born in year 1989 , and I am 30 years old ;
      // System.out.println("I was born in year " + 1989 + " , and I am " + (2019-1989) + "years old";
         System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old ");

      // Task 2 : you are speeding today
      // speed limit is some number , and your current speed is this
      // generate this output of : You are driving 10 mph more than speed limit
      // speedLimit as int , currentSpeed as int , overTheLimit as int
      int speedLimit   = 50;
      int currentSpeed = 60;
      int overTheLimit    = currentSpeed - speedLimit;

        System.out.println("You are driving "+ overTheLimit + " mph more than speed limit ");








    }









}
