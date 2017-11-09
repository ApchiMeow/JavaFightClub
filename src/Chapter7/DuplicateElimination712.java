package Chapter7;
import java.util.Scanner;

public class DuplicateElimination712 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.printf("Введи %d число (от 10 до 100): ", i+1);
            while(true){
                array1[i] = input.nextInt();
                if((array1[i] >= 10) & (array1[i] <= 100)){
                    break;
                } else {
                    System.out.println("Число в пределах от 10 до 100!");
                }
            }
            System.out.print("Уникальные значения");
            for(int j = 0; j < i; j++){
                if(array1[j] == array1[i]){
                    array1[i] += 100;
                }
            }
            for(int k = 0; k <= i; k++){
                if((array1[k] >= 10) & (array1[k] <= 100)){
                    System.out.printf(", %d",array1[k]);
                }
            }
            System.out.println();
        }
        input.close();
    }
}