package Day33;

public class MethodWithReturnPractice2 {

    public static void main(String[] args) {


        System.out.println( covertNumberToDay(6) );

    }

    //   covertNumberToDay
//   This method will take number from 1-7
//             and convert that to actual day in word
//   @param int dayCode to represent day in number
//   @return the day in word in English as String
//          if the number is valid
//          if the number is not 1-7 return INVALID DAY!
    public static String covertNumberToDay(int dayCode){
        String dayName = "";
        switch (dayCode){
            case 1:
               dayName ="Monday";
                break;
            case 2:
                dayName ="Tuesday";
                break;
            case 3:
                dayName ="Wednesday";
                break;
            case 4:
                dayName ="Thursday";
                break;
            case 5:
                dayName ="Friday";
                break;
            case 6:
                dayName ="Saturday";
                break;
            case 7:
                dayName ="Sunday";
                break;
            default:
                System.out.println("Funday");
        }

        return dayName ;

    }







}
