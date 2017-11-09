package Chapter3;
import java.util.Scanner;

public class ModifiedAccountClass311Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ModifiedAccountClass311 account1 = new ModifiedAccountClass311("Jane Green", 50.00);
        ModifiedAccountClass311 account2 = new ModifiedAccountClass311("John Blue", -7.53);

        System.out.printf("%s баланс: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s баланс: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        System.out.printf("Счёт аккаунта %s%nВыберите операцию:%n1.Снятие наличных%n2.Положить на счёт%n", account1.getName());
        switch (input.nextInt()){
            case 1: {
                System.out.print("Введите сумму, котрую хотите снять: ");
                double amount = input.nextDouble();
                account1.withdraw(amount);
                break;
            }
            case 2: {
                System.out.print("Введите сумму, которую хотите положить: ");
                double amount = input.nextDouble();
                account1.deposit(amount);
                break;
            }
        }
        System.out.printf("%s баланс: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s баланс: $%.2f%n%n",
                account2.getName(), account2.getBalance());
        System.out.printf("Счёт аккаунта %s%nВыберите операцию:%n1.Снятие наличных%n2.Положить на счёт%n", account2.getName());
        switch (input.nextInt()){
            case 1: {
                System.out.print("Введите сумму, котрую хотите снять: ");
                double amount = input.nextDouble();
                account2.withdraw(amount);
                break;
            }
            case 2: {
                System.out.print("Введите сумму, которую хотите положить: ");
                double amount = input.nextDouble();
                account2.deposit(amount);
                break;
            }
        }

        System.out.printf("%s баланс: $%.2f%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s баланс: $%.2f%n%n",
                account2.getName(), account2.getBalance());

        input.close();
    }
}