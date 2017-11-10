package Chapter8;
public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount(2000);
        SavingsAccount account2 = new SavingsAccount(3000);
        System.out.println("Interest rate is 4%");
        SavingsAccount.modifyInterestRate(4);
        System.out.println("N\tAccount1\tAccount2 ");
        for (int i = 0; i < 13; i++) {
            if (i == 12) {
                System.out.println("Interest rate is 5%");
                SavingsAccount.modifyInterestRate(5);
            }
            account1.calculateMonthlyInterest();
            account2.calculateMonthlyInterest();
            System.out.printf("%d\t%.2f\t\t%.2f%n", i + 1, account1.getSavingsBalance(), account2.getSavingsBalance());
        }
    }
}
