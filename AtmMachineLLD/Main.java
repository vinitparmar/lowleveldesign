package AtmMachineLLD;

public class Main {
     public static void main(String[] args) {

        Account account = new Account("ACC123", 10000);
        
        Card card = new Card("CARD123", 1234, account);

        Atm atm = new Atm();

        atm.insertCard(card);
        atm.enterPin(1234);

        atm.checkBalance();

        atm.withdraw(2000);

        atm.checkBalance();

        atm.ejectCard();
    }
}
