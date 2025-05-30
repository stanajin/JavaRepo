public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Alice", 1000);
        BankAccount checking = new CheckingAccount("Bob", 500);

        savings.deposit(200);
        savings.withdraw(300);
        ((SavingsAccount) savings).applyInterest();
        savings.displayBalance();

        checking.deposit(100);
        checking.withdraw(700);
        checking.displayBalance();
    }
}
