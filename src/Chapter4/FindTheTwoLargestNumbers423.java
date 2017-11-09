package Chapter4;
import java.util.Scanner;

public class FindTheTwoLargestNumbers423 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int max1 = 0, max2 = 0;
        int[] recently = new int[10];
        System.out.println("Введи 10 чисел: ");
        for(int counter = 0; counter < 10; counter++){
            int temp = max2;
            max2 = max1;
            System.out.printf("Введи число №%d :",(counter+1));
            recently[counter] = input.nextInt();
            for(int i = 0; i < counter; i++){
                if(recently[i] == recently[counter]){
                    while (recently[counter] == recently[i]){
                        System.out.printf("Введи другое число №%d :",(counter+1));
                        recently[counter] = input.nextInt();
                    }
                } else {
                    break;
                }
            }
            if(recently[counter] > max1){
                max1 = recently[counter];
            } else {
                max2 = temp;
            }
        }
        System.out.printf("Наибольшие числа это %d и %d", max2, max1);
        input.close();
    }
}