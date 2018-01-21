package Chapter2;
import java.util.Scanner;

public class Arithmetic215 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        double division = (double)num1/num2;
        System.out.printf("Сумма %d и %d = %d%n", num1, num2, sum);
        System.out.printf("Произведение %d и %d = %d%n", num1, num2, product);
        System.out.printf("Разность %d и %d = %d%n", num1, num2, difference);
        System.out.printf("Деление %d и %d = %f", num1, num2, division);
        input.close();
    }
}