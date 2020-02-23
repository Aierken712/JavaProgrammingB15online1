package Day22;

public class LoopControlStatementWithMain {

    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!";
        int charCount = msg.length();

        System.out.println("Character Count " + charCount);

        for (int idx = 0; idx < charCount; idx++) {

            if (idx % 2 == 1) {
                continue;
            }
            System.out.println(idx + " : " + msg.substring(idx, idx + 1));

        }

        for (int idx = 0; idx < charCount; idx++) {

            if (idx % 2 == 1) {
                continue;
            }

            String currentChar = msg.substring(idx, idx + 1);

            if(currentChar.equalsIgnoreCase("j") ) {
                break;
            }
            System.out.println("charCount = " + currentChar);
        }


        }
    }
