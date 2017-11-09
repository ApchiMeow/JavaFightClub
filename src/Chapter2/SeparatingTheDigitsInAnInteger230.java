package Chapter2;
import java.util.Scanner;

public class SeparatingTheDigitsInAnInteger230 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();
        int digit;
        int tempNum = num;
        int counter = 1;
        while(tempNum > 10){    //небольшое улучшение
            tempNum /= 10;      //делаем некий подсчёт цифр в числе
            counter *= 10;      //теперь можно вводить любое число
        }
        while(counter > 0){
            digit = (num/counter)%10;
            counter/=10;
            System.out.printf("%d   ", digit);
        }

//        int temp = 0;    // страшный, непонятный, но тоже рабочий код
//        for(int i = counter; i > 0; i /= 10){
//            digit = (num - (num % i))/i - temp;
//            temp = (temp * 10) + (digit * 10);
//            System.out.printf("%d   ", digit);
//        }
    }
}