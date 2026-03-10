package AtmMachineLLD;

public class Account {

    private String accountNumber;
    private double balance;

     public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }


    public void deposit(double amount){
        balance += amount;
    }

}
