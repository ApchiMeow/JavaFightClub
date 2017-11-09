package Chapter2;
import java.util.Scanner;

public class OddOrEven225 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = input.nextInt();
        if(num1%2 == 0){
            System.out.printf("Число %d - чётное", num1);
        } else {
            System.out.printf("Число %d - нечётное", num1);
        }
    }
}