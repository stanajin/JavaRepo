// Savings Account (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate = 0.03; // 3% interest rate

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void applyInterest() {
        balance += balance * interestRate;
        System.out.println("Interest applied. New balance: $" + balance);
    }
}

// Checking Account (inherits from BankAccount)


// Main class to test the banking system

