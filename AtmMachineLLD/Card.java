package AtmMachineLLD;

public class Card {
    private String cardNumber;
    private int pin;
    private Account account;

    public Card(String cardNumber, int pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    public Account getAccount() {
        return account;
    }
}
