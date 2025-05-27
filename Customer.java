import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}
