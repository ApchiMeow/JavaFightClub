package Chapter6;
import java.util.Scanner;

public class ReversingDigits626 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();
        System.out.printf("Перевёрнутое число: %d", reverse(num));
    }
    public static int reverse(int num){
        int revNum = 0;
        while(num > 0){
            revNum *= 10;
            revNum += (num % 10);
            num /= 10;
        }
        return revNum;
    }
}