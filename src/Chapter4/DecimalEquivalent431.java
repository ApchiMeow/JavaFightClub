package Chapter4;
import java.util.Scanner;

public class DecimalEquivalent431 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        int num = input.nextInt();
        int decimal = 0, d = 1, i;
        while(num > 0){
            i = num % 10;
            decimal += i * d;
            d *= 2;
            num /= 10;
        }
        System.out.printf("Десятичный эквивалент: %d", decimal);
        input.close();
    }
}