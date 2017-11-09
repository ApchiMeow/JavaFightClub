package Chapter2;
import java.util.Scanner;

public class LargestAndSmallestIntegers224 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int small = input.nextInt();
        int big = small;
        for(int i = 2; i <= 5; i++){
            System.out.printf("Введите %d число: ", i);
            int temp = input.nextInt();
            if(temp < small){
                small = temp;
            }
            if(temp > big){
                big = temp;
            }
        }
        System.out.printf("Наибольшее: %d%n", big);
        System.out.printf("Наименьшее: %d%n", small);
        input.close();
    }
}