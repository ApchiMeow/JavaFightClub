package Chapter2;
import java.util.Scanner;

public class Multiples226 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();
        if(num1%num2 == 0){
            System.out.printf("Число %d кратно %d", num1, num2);
        } else {
            System.out.printf("Число %d не кратно %d", num1 , num2);
        }
    }
}