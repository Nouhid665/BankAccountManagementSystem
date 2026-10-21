
public abstract class BankAccount {
    private int accountNumber;
    private String customerName;
    private double balance;

    public BankAccount(int accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public abstract String getAccountType();

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive.");

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive.");

        if (amount > balance)
            throw new IllegalArgumentException("Insufficient balance.");

        balance -= amount;
    }

    public void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + getAccountType());
        System.out.printf("Balance: Rs. %.2f%n", balance);
    }
}
