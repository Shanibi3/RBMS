public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String name, String number, double balance, double overdraftLimit) {
        super(name, number, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > (balance + overdraftLimit)) {
            throw new InsufficientBalanceException("Withdrawal exceeds overdraft limit!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}
