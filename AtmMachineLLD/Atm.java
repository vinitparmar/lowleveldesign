package AtmMachineLLD;

public class Atm {

    private Card currentCard;
    private CashDispenser cashDispenser;
    private BankService bankService;

    public Atm() {
        cashDispenser = new CashDispenser(50000);
        bankService = new BankService();
    }

    public void insertCard(Card card){
       currentCard = card;  
    }

      public void enterPin(int pin) {

        if(bankService.authenticate(currentCard, pin)){
            System.out.println("PIN Verified");
        }else{
            System.out.println("Invalid PIN");
        }
    }

    public void checkBalance() {

        double balance = bankService.getBalance(currentCard.getAccount());
        System.out.println(balance);
    }

     public void withdraw(int amount) {

        Account account = currentCard.getAccount();

        if(account.getBalance() < amount){
            System.out.println("Insufficient Balance");
            return;
        }

        if(cashDispenser.dispenseCash(amount)){
            bankService.withdraw(account, amount);
            System.out.println("Please collect cash");
        }
    }

    public void ejectCard() {
        currentCard = null;
        System.out.println("Card Ejected");
    }
}
