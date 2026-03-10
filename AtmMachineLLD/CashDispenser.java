package AtmMachineLLD;

public class CashDispenser {
    private int cashAvailable;

    public CashDispenser(int cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

     public boolean dispenseCash(int amount) {
        if(amount > cashAvailable){
            System.out.println("out of cash");
            return false;
        }

        cashAvailable -= amount;
        System.out.println("Dispensed: " + amount);
        return true;
     }
}
