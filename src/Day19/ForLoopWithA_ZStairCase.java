package Day19;

public class ForLoopWithA_ZStairCase {

    public static void main(String[] args) {


        String line = "";

        for (char iChar = 'A'; iChar < 'Z'; iChar++) {
            for (char iCha = 'A'; iChar <= 'Z'; iChar++) {

                line += iChar;
                System.out.println(line);

            }
            }
        }
    }