package Chapter4;
import java.util.Scanner;

public class SalaryCalculator420 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 1;
        double salary = 0;
        while (true) {
            System.out.printf("Введите часы работы работника №%d (или -1 для выхода): ", n);
            int hours = input.nextInt();
            if(hours == -1) {
                break;
            }
            System.out.printf("Введите часовой зарабток работника №%d: ", n);
            double rate = input.nextDouble();
            salary = 0;
            for(int i = 1; i <= hours; i++){
                if(hours <= 40){
                    salary += rate;
                } else {
                    salary += rate*1.5;
                }
            }
            System.out.printf("Заработок работника №%d - $%.2f%n", n, salary);
            n++;
        }
        input.close();
    }
}
