class CheckingAccount extends BankAccount {
    private double overdraftLimit = 500;

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Checking Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
