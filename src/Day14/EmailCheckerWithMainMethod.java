package Day14;

import java.sql.SQLOutput;

public class EmailCheckerWithMainMethod {

    public static void main(String[] args) {

// * Email Checker:
//         * create a variable caled email
//                * check for below conditions
//         * if it does not contain character @ say invalid email
//                * if it contains space say invalid email
//         * if it ends with @gmail.com, print gmail
//         * if it ends with @yahoo.com, print yahoo email
//                * if it ends with @main.ru, russian email
//         */

        String email = "ershad0419@gmail.com";

        if  (!email.contains("@") || email.contains(" ") ) {
            System.out.println("INVALID EMAIL");
        }else if (email.endsWith("@gmail.com")) {
            System.out.println("Google Mail");
        }else if ( email.endsWith("@yahoo.com")) {
            System.out.println("Yahoo Mail");
        }else if (email.endsWith("@mail.ru")) {
            System.out.println("Russian mail");
        }







    }
}
