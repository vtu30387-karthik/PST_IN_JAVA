package ClassRoom_Tasks;

final class BankAccount {

    private final String accountHolder;
    private final double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount applyInterest(double ratePercentage) {
        if (ratePercentage < 0) {
            throw new IllegalArgumentException("Rate must not be negative");
        }
        return new BankAccount(accountHolder, balance + (balance * ratePercentage / 100));
    }
}

public class ClassRoom_Task18_ImmutableBankAccount {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Ravi", 10000);

        BankAccount b2 = b1.applyInterest(5);

        System.out.println("Original Balance: " + b1.getBalance());
        System.out.println("New Balance: " + b2.getBalance());
    }
}
