package Chapter4;
import java.util.Scanner;
public class Palindromes430 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, temp, revNum, digits;
        while(true){
            System.out.print("Введите пятизначное число: ");
            num = input.nextInt();  // считываем число
            revNum = 0;             // будущее перевёрнутое число num
            temp = num;             // сохраняем отдельно num
            digits = 0;             // для подсчёта коллчества цифр
            while(num > 0){         // этим циклом переворачиваем число num и записываем в revNum
                digits++;           // и считаем количество цифр в num
                revNum *= 10;
                revNum +=(num % 10);
                num /= 10;
            }
            if(digits == 5){
                break;
            }
        }
        if(temp == revNum){         // сравниваем заранее сохранённое число num с revNum
            System.out.println("Это число палиндром");
        } else {
            System.out.println("Это число НЕ палиндром");
        }
        input.close();
    }
}