package Chapter8;
public class SavingsAccount {
    private static float annualInterestRate;
    private float savingsBalance;
    public SavingsAccount(float savingsBalance) {
        setSavingsBalance(savingsBalance);
    }

    public void setSavingsBalance(float savingsBalance) {
        if (savingsBalance > 0) {
            this.savingsBalance = savingsBalance;
        }
    }
    public float getSavingsBalance() {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(float newInterestRate) {
        if (newInterestRate >= 0){
            annualInterestRate = newInterestRate / 100;
        } else {
            throw new IllegalArgumentException("Interest rate must be more than 0");
        }
    }
}