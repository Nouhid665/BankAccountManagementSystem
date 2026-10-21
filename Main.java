
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, BankAccount> accounts = new HashMap<>();
    static int nextAccountNumber = 1001;

    static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid integer.");
            }
        }
    }

    static double readAmount(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid amount.");
            }
        }
    }

    static BankAccount findAccount() {
        int number = readInt("Enter account number: ");
        BankAccount account = accounts.get(number);

        if (account == null)
            System.out.println("Account not found.");

        return account;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");

            int choice = readInt("Enter your choice: ");

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter customer name: ");
                        String name = sc.nextLine().trim();

                        if (name.isEmpty())
                            throw new IllegalArgumentException(
                                "Name cannot be empty.");

                        System.out.println("1. Savings Account");
                        System.out.println("2. Current Account");
                        int type = readInt("Choose account type: ");

                        BankAccount account;

                        if (type == 1)
                            account = new SavingsAccount(
                                nextAccountNumber, name);
                        else if (type == 2)
                            account = new CurrentAccount(
                                nextAccountNumber, name);
                        else
                            throw new IllegalArgumentException(
                                "Invalid account type.");

                        accounts.put(nextAccountNumber, account);
                        System.out.println("Account created successfully!");
                        System.out.println("Account Number: "
                            + nextAccountNumber);
                        nextAccountNumber++;
                        break;

                    case 2:
                        BankAccount a = findAccount();
                        if (a != null)
                            a.displayDetails();
                        break;

                    case 3:
                        a = findAccount();
                        if (a != null) {
                            a.deposit(readAmount("Enter deposit amount: "));
                            System.out.println("Deposit successful.");
                        }
                        break;

                    case 4:
                        a = findAccount();
                        if (a != null) {
                            a.withdraw(readAmount("Enter withdrawal amount: "));
                            System.out.println("Withdrawal successful.");
                        }
                        break;

                    case 5:
                        a = findAccount();
                        if (a != null)
                            System.out.printf("Current Balance: Rs. %.2f%n",
                                a.getBalance());
                        break;

                    case 6:
                        System.out.println("Thank you for using our system.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid menu choice.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
