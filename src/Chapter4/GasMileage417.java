package Chapter4;
import java.util.Scanner;

public class GasMileage417 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int miles, gallons, milSum = 0, galSum = 0;
        int count = 1; // количество поездок
        float milPerGal, totalAvg = 0;
        while(true){
            System.out.printf("Введите мили и галлоны за поездку №%d (или -1 для выхода)%n", count);
            System.out.print("Мили: ");
            miles = input.nextInt();
            if(miles == -1){
                break;
            }
            milSum += miles;
            System.out.print("Галлоны: ");
            gallons = input.nextInt();
            galSum += gallons;
            milPerGal = (float)miles/gallons;
            System.out.printf("Для поездки №%d, милей за галлон = %.2f%n", count, milPerGal);
            count++;
        }
        milPerGal = ((float)milSum/galSum)/count;
        System.out.printf("Среднее значение милей за галлон для всех поездок = %.2f%n", milPerGal);
        input.close();
    }
}