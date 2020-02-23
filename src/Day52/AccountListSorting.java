package Day52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

       List<Account> accountList = new ArrayList<>();
       accountList.add( new Account("Ershad",10000) );
       accountList.add( new Account("anna",20000) );
       accountList.add( new Account("Arshad",15000) );

       System.out.println("accountList before = \n" + accountList);
       Collections.sort(accountList);
       System.out.println("accountList after = \n" + accountList);

       Account myAccount = new Account("Muge",0);
       for(Account each : accountList){
         each.transferAll(myAccount);
       }
        System.out.println("myAccount" + myAccount);

    }

}
