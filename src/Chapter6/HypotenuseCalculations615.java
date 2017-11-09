package Chapter6;
import java.util.Scanner;

public class HypotenuseCalculations615 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите катет1: ");
        double side1 = input.nextDouble();
        System.out.print("Введите катет2: ");
        double side2 = input.nextDouble();
        System.out.println("Треуг.\t|\tКатет1\t|\tКатет2\t|\tГипотенуза");
        System.out.printf(" Наш\t|\t%.4f\t|\t%.4f\t|\t%.4f - Math.sqrt, Math.pow%n", side1, side2, hypotenuse1(side1,side2));
        System.out.printf(" Наш\t|\t%.4f\t|\t%.4f\t|\t%.4f - Math.hypot%n", side1, side2, hypotenuse2(side1,side2));
        System.out.printf(" Наш\t|\t%.4f\t|\t%.4f\t|\t%.4f - Без Math.%n", side1, side2, hypotenuse3(side1,side2));
        side1 = 3.0; side2 = 4.0;
        System.out.printf("  #1\t|\t%.4f\t|\t%.4f\t|\t%.4f - Math.sqrt, Math.pow%n", side1, side2, hypotenuse1(side1,side2));
        side1 = 5.0; side2 = 12.0;
        System.out.printf("  #2\t|\t%.4f\t|\t%.4f\t|\t%.4f - Math.sqrt, Math.pow%n", side1, side2, hypotenuse1(side1,side2));
        side1 = 8.0; side2 = 15.0;
        System.out.printf("  #3\t|\t%.4f\t|\t%.4f\t|\t%.4f - Math.sqrt, Math.pow%n", side1, side2, hypotenuse1(side1,side2));
        input.close();
    }

    public static double hypotenuse1(double side1, double side2){
        double hypot;
        hypot = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        return hypot;
    }
    public static double hypotenuse2(double side1, double side2){
        double hypot;
        hypot = Math.hypot(side1,side2);
        return hypot;
    }
    public static double hypotenuse3(double side1, double side2){
        double hypot;
        hypot = Sqroot1((side1*side1) + (side2*side2));
        return hypot;
    }
    // для вычисления кв. корня использую Метод Ньютона
    public static double Sqroot1(double x) {
        int sp = 0, i, inv = 0;
        double a, b;
        if(x <= 0.0) {
            return(0.0);
        }
        if(x < 1.0) {
            x = 1.0 / x;
            inv = 1;
        }
        while(x > 16.0) {
            sp++;
            x /= 16.0;
        }
        a = 2.0;
        for(i = 4; i > 0; i--) {
            b = x / a;
            a += b;
            a *= 0.5;
        }
        while(sp > 0) {
            sp--;
            a *= 4.0;
        }
        if(inv == 1) {
            a = 1.0 / a;
        }
        return(a);
    }
}