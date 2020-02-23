package Day52;

import org.w3c.dom.ls.LSOutput;

public class AccountAction {

    public static void main(String[] args) {

    Account a1 = new Account("Ershad",10000);
    Account a2 = new Account("Arshad",20000);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("------------------------------");

        a1.transferAll(a2);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("------------------------------");

        a2.transferAll(a1);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println( a1.isPalindrome() );
        System.out.println( a2.isPalindrome() );





    }

}
