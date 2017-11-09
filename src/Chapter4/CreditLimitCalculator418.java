package Chapter4;
import java.util.Scanner;

public class CreditLimitCalculator418 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber;
        int balance;
        int totalItems;
        int totalCredits;
        int allowedCreditLimit;

        System.out.println("Введите номер аккаунта: ");
        accountNumber = input.nextInt();

        System.out.println("Введите баланс в начале месяца: ");
        balance = input.nextInt();

        System.out.println("Количество товаров, начисленных клиентом в этом месяце: ");
        totalItems = input.nextInt();

        System.out.println("Кредит клиента в этом месяце: ");
        totalCredits = input.nextInt();

        System.out.println("Введите допустимый кредитный лимит: ");
        allowedCreditLimit = input.nextInt();

        int newBalance = balance + totalItems - totalCredits;

        System.out.printf("Новый баланс клиента №%d - %d%n",accountNumber, newBalance);

        if (newBalance < allowedCreditLimit) {
            System.out.println("Превышен кредитный лимит");
        }
        input.close();
    }
}