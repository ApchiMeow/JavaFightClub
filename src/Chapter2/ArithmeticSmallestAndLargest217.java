package Chapter2;
import java.util.Scanner;

public class ArithmeticSmallestAndLargest217 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        int avg = sum/3;
        int product = num1 * num2 * num3;
        int temp = (num1 <= num2) ? num1 : num2;
        int small = (temp <= num3) ? temp : num3;
        temp = (num1 >= num2) ? num1 : num2;
        int big = (temp >= num3) ? temp : num3;
        System.out.printf("Сумма: %d%n", sum);
        System.out.printf("Среднее арифметическое: %d%n", avg);
        System.out.printf("Произведение: %d%n", product);
        System.out.printf("Найменьшее: %d%n", small);
        System.out.printf("Найбольшее: %d%n", big);
        input.close();
    }
}