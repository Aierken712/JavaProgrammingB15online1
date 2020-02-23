package Day33;

public class NumberGame {

    public static void main(String[] args) {

        System.out.println(getSumFrom1ToX(6));

        System.out.println(build_GOT_Email( "Arya","Stark") );



    }

    // getSumFrom1ToX
    // this method should calculate the sum of the numbers from 1 to the number user passed
    // @param x final number to be added
    // @return the sum of numbers from 1 to x

    public static int getSumFrom1ToX(int x){
        int sum = 0;
        for (int i = 1; i <=x ; i++) {
             sum += i;
        }
        return sum;
    }

//  build_GOT_Email
//  This method should build email using user's first and last name
//             for example Jon Snow --->> JSnow@NightWatch.com
//  @param firstName user's first name
//             @param lastName  user's last name
//             @return the email created using
//  firstName initial+lastname+@NightWatch.com
    public static String build_GOT_Email(String firstName,String lastName){

//        String email = firstName.charAt(0) + lastName + "@NightWatch.com";
//                return email;

        return firstName.charAt(0) + lastName + "@NightWatch.com";

    }





}
