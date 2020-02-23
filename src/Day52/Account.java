package Day52;

public class Account implements Transferable,Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount1){
        balance += amount1;
    }

    public void withdraw(int amount2){
        balance -= amount2;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void transferAll(Account otherAccount){

       otherAccount.balance += this.balance;
       this.balance = 0;
       // otherAccount.deposit(this.balance);
       // withdraw(this.balance);

    }

    public boolean isPalindrome(){
        String temp = this.name.toLowerCase().replace(" ","");

        String reverseName = "";
        for(int i = temp.length()-1;i>=0;i--){
            reverseName += temp.charAt(i) + "";
        }
        return temp.equals(reverseName);
    }

    @Override
    public int compareTo(Account otherAccount){
        if(this.balance>otherAccount.balance){
            return 1;
        }else if(this.balance<otherAccount.balance){
            return -1;
        }else{
            return 0;
        }
    }



}
