package Chapter4;
import java.util.Scanner;

public class FindTheLargestNumber421 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число №1: ");
        int largest = input.nextInt();
        for(int counter = 1; counter < 10; counter++){
            System.out.printf("Введите число №%d: ", counter+1);
            int number = input.nextInt();
            if(number > largest){
                largest = number;
            }
        }
        System.out.printf("Наибольшее число - это %d", largest);
        input.close();
    }
}