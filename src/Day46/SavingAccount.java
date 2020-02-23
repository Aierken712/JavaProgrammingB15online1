package Day46;

public class SavingAccount extends BankAccount {

//    String accountHolder ;
//    long accountNum ;
//    double balance ;
    double interestRate;

    /**
     * A constructor to set all the fields value
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */
    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate;
    }

    // bad idea to have main method here , just doing it anyway
    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Mohammad",12345,50000,4.2);
        System.out.println("s1 = " + s1.toString() );

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);

        s1.deposit(100);
        System.out.println("s1.balance = " + s1.balance);
    }

    @Override
    public void withdraw(int amount){
        // taking away 30$ more on top of what you withdraw
       // balance = balance - amount - 30;
        // balance -= amount ;
        // balance -= 30
        super.withdraw(amount);
        super.withdraw(30);
    }

    @Override // it is optional , once being used , it will enforce overriding rule
              // if any rule does not match it will not even compile
              // so it`s always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void deposit(int amount){
       balance += amount;
       balance += 100*0.042 ;
       // balance += amount + amount*interestRate;

    }


}
