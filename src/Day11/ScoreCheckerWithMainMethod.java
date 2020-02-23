package Day11;

public class ScoreCheckerWithMainMethod {

    public static void main(String[] args) {
        int score = 100;

        if (score < 0 || score > 100) {
            System.out.println("INVALID SCORE!!!1");
        }else if (score == 100) {
            System.out.println("PERFECT SCORE");
        }else if (score > 70 && score < 100) {
            System.out.println("YOU HAVE PASSED");
        }else if (score<20) {
            System.out.println("Come to my office");
        }else if (score>30 && score<40) {
            System.out.println("Attend additional classes");
        }else if (score>40 && score<70){
            System.out.println("Little bit more study will let you pass");

        }


//        int score = 100;
//
//        switch (score){
//            case 1:
//                System.out.println("INVALID SCORE!!!");
//                break;
//            case 2:
//                System.out.println("PERFECT SCORE");
//                break;
//            case 3:
//                System.out.println("YOU HAVE PASSED");
//                break;
//            case 4:
//                System.out.println("Come to my office");
//                break;
//            case 5:
//                System.out.println("Attend additional classes");
//                break;
//            case 6:
//                System.out.println("Little bit more study will let you pass");
//               break;

 //       }





    }
}
