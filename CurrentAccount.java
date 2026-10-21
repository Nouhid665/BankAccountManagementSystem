
public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
