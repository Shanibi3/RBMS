public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, String number, double balance, double interestRate) {
        super(name, number, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}
