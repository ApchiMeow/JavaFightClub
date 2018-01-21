package Chapter2;
import java.util.Scanner;

public class NegativePositiveAndZeroValues232 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, pos = 0, neg = 0, zer = 0;
        for(int i = 1; i <= 5; i++){
            System.out.printf("Введите %d число: ", i);
            num = input.nextInt();
            if(num == 0){
                zer++;
            }
            if(num > 0){
                pos++;
            }
            if(num < 0){
                neg++;
            }
        }
        System.out.printf("Положительных: %d%nОтрицательных: %d%nНулей: %d", pos, neg, zer);
        input.close();
    }
}