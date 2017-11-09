package Chapter5;
import java.util.Scanner;

public class FindTheSmallestValue511 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int value = input.nextInt();
        int smallest = 0, temp;
        for(int i = 1; i <= value; i++){
            System.out.printf("Введите число №%d: ", i);
            temp = input.nextInt();
            if(i == 1) {
                smallest = temp;
            }
            if (temp < smallest) {
                smallest = temp;
            }
        }
        System.out.printf("Наименьшее число: %d", smallest);
        input.close();
    }
}