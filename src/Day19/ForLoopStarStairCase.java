package Day19;

public class ForLoopStarStairCase {

    public static void main(String[] args) {
        String star = "";

        for (int i = 1; i <= 100; i++) {
            //for (int i = 1; i <= 4; i++) {

                //star = star + "* " ;
                star += "* ";
                System.out.println(star);
                star = star + "* ";
                //star += "* ";
                System.out.println(i + " " + star);

            }

        }
    }

