final class Account {

    private final String name;
    private final int balance;

    // Constructor
    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Safe computation method (returns new object instead of modifying)
    public Account deposit(int amount) {
        if (amount > 0) {
            return new Account(this.name, this.balance + amount);
        }
        return this;
    }

    public Account withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            return new Account(this.name, this.balance - amount);
        }
        return this;
    }
}

public class ImmutableDemo {

    public static void main(String[] args) {

        Account acc1 = new Account("Sagar", 1000);

        // Safe computation (creates new objects)
        Account acc2 = acc1.deposit(500);
        Account acc3 = acc2.withdraw(300);

        System.out.println("Original Balance: " + acc1.getBalance());
        System.out.println("After Deposit: " + acc2.getBalance());
        System.out.println("After Withdraw: " + acc3.getBalance());
    }
}