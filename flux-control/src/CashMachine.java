public class CashMachine {
    public static void main(String[] args) {
        double balance = 50.0;
        double requestedAmount = 20.2;

        if (requestedAmount < balance) {
            balance = balance - requestedAmount;
            System.out.println("Transaction completed");
        }

        System.out.println("Balance: " + balance);
    }
}
