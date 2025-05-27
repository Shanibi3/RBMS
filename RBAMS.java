import java.util.Scanner;

public class RBAMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer;

        System.out.println("Welcome to Rural Bank of Nepal");
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        customer = new Customer(name);

        SavingsAccount savings = new SavingsAccount(name, "SA1001", 5000, 5.0);
        CurrentAccount current = new CurrentAccount(name, "CA1001", 2000, 1000);

        customer.addAccount(savings);
        customer.addAccount(current);

        int choice;
        do {
            System.out.println("\nChoose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Add Interest to Savings");
            System.out.println("4. View Accounts");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    handleTransaction(scanner, customer, true);
                    break;
                case 2:
                    handleTransaction(scanner, customer, false);
                    break;
                case 3:
                    savings.addInterest();
                    break;
                case 4:
                    for (BankAccount acc : customer.getAccounts()) {
                        acc.displayAccountDetails();
                        System.out.println("----------------------");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using RBN!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void handleTransaction(Scanner scanner, Customer customer, boolean isDeposit) {
        System.out.print("Select account (1: Savings, 2: Current): ");
        int accChoice = scanner.nextInt();
        BankAccount account = accChoice == 1 ? customer.getAccounts().get(0) : customer.getAccounts().get(1);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
