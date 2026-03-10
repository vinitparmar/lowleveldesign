package AtmMachineLLD;

public class BankService {
    public boolean authenticate(Card card, int pin) {
        return card.validatePin(pin);
    }

    public double getBalance(Account account) {
        return account.getBalance();
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
}
