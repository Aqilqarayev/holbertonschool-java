public class ControlledBankAccount extends BasicBankAccount{
    private double minimumBalance;
    private double penaltyAmount;

    public  ControlledBankAccount(String accountNumber,double penaltyAmount,double minimumBalance, double annualInterestRate){
        super(accountNumber,annualInterestRate);
        this.minimumBalance=minimumBalance;
        this.penaltyAmount=penaltyAmount;
    }
    @Override
    public void applyMonthlyUpdate() {
        double newBalance = getBalance() - calculateMonthlyFee() + calculateMonthlyInterest();
        if (newBalance < minimumBalance) {
            newBalance -= penaltyAmount;
        }
        setBalance(newBalance);
    }


}
