public class FeeBasedBankAccount extends BasicBankAccount{
    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        this.transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        setBalance(getBalance() - 0.10); // transaction fee
        transactionCount++;
    }

    @Override
    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        setBalance(getBalance() - 0.10); // transaction fee
        transactionCount++;
    }
}
