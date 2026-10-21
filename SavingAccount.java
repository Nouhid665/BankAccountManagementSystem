
public class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
