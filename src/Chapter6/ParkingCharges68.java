package Chapter6;
import java.util.Scanner;
public class ParkingCharges68 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество клиентов: ");
        int customers = input.nextInt();
        for(int i = 0; i < customers; i++){
            System.out.printf("Введите часы для клиента №%d: ", i+1);
            int hours = input.nextInt();
            if (hours < 0 || hours > 24){
                throw new IllegalArgumentException("hour must be 0-24");
            }
            System.out.printf("Для клиента №%d, счёт составляет: $%.2f%n", i+1, calculateCharges(hours));
        }
        input.close();
    }

    private static double calculateCharges(int hours){
        double charge = 2.0;
        if(hours > 3){
            for(int i = 3; i <= hours; i++){
                charge += 0.5;
            }
        }
        if(charge > 10.0){
            charge = 10.0;
        }
        return charge;
    }
}
