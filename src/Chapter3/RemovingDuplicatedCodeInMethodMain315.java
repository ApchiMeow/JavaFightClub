package Chapter3;
import java.util.Scanner;

public class RemovingDuplicatedCodeInMethodMain315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModifiedAccountClass311 account1 = new ModifiedAccountClass311("Jane Green", 50.00);
        ModifiedAccountClass311 account2 = new ModifiedAccountClass311("John Blue", -7.53);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Введите сумму для изменения баланса Jane Green: ");
        double amount = input.nextDouble();
        account1.deposit(amount);

        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Введите сумму для изменения баланса John Blue: ");
        amount = input.nextDouble();
        account2.deposit(amount);

        displayAccount(account1);
        displayAccount(account2);
    }
    public static void displayAccount(ModifiedAccountClass311 accountToDisplay){
        System.out.printf("%s баланс: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
