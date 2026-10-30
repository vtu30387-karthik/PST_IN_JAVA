package ClassRoom_Tasks;

final class Account {

    private final String accountNumber;
    private final double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Account deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be positive"
            );
        }

        return new Account(
            accountNumber,
            balance + amount
        );
    }
}

public class ClassRoom_Task14_ImmutableAccount {

    public static void main(String[] args) {

        Account account1 =
            new Account("ACC101", 10000);

        Account account2 =
            account1.deposit(2000);

        System.out.println(
            "Original Balance: " +
            account1.getBalance()
        );

        System.out.println(
            "New Balance: " +
            account2.getBalance()
        );
    }
}
