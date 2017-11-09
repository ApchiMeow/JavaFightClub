package Chapter6;
import java.util.Scanner;

public class CircleArea620 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        int r = input.nextInt();
        double A = areaOfCircle(r);
        System.out.printf("Площадь круга: %f", A);
        input.close();
    }

    public static double areaOfCircle(int r){
        return Math.PI*r*r;
    }
}
