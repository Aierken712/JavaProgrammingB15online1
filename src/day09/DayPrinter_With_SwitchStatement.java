package day09;

public class DayPrinter_With_SwitchStatement {

    public static void main(String[] args) {

      /*
        create a variable called dayCode as int
        *  if the dayCode is 1 --->> Monday
        *  if the dayCode is 2 --->>Tuesday
        *  if the dayCode is 3 --->>Wednesday
         * if the dayCode is 4 --->>Thursday
         * if the dayCode is 5 --->>Friday
         * if the dayCode is 6 --->>Saturday
         * if the dayCode is 7 --->>Sunday
         * if none of the above just print unknown day
         *
        * */
        int dayCode = 7;
        switch (dayCode ) {
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is Unknown");
        }

    }
}
