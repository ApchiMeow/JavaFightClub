package Chapter5;
import java.util.Scanner;

public class BarChartPrintingProgram516 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            while (true){
                System.out.printf("Введите число (от 1 до 30) №%d: ", i+1);
                array[i] = input.nextInt();
                if((array[i] >= 1) & (array[i] <= 30)){
                    break;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < array[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
