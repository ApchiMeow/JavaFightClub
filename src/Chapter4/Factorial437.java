package Chapter4;
import java.util.Scanner;

public class Factorial437 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // a)
        int n = -1;
        while(n < 0){
            System.out.print("Введите положительное число: ");
            n = input.nextInt();
        }
        int factorial = 1;
        if(n == 0){
            factorial = 0;
        }
        for(int i = n; i > 1; i--){
            factorial *= i;
        }
        System.out.printf("%d! = %d%n", n, factorial);
        // b)
        double e = 1;
        n = 0;
        while(n <= 0){
            System.out.print("Введите количество слогаемых для e: ");
            n = input.nextInt();
        }
        factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
            e += (1.0 / factorial);
        }
        System.out.printf("e = %f%n", e);
        // c)
        e = 1;
        n = 0;
        while(n <= 0){
            System.out.print("Введите количество слогаемых для e^x: ");
            n = input.nextInt();
        }
        System.out.print("Введите x: ");
        double x = input.nextInt();
        factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
            e += (Math.pow(x,i) / factorial);
        }
        System.out.printf("e^x = %f%n", e);
        input.close();
    }
}
