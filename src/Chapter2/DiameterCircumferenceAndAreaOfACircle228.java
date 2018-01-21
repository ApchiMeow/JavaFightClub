package Chapter2;
import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle228 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите радиус окружности: ");
        int r = input.nextInt();
        System.out.printf("Диаметр окружности: %d%n", 2*r);
        System.out.printf("Длина окружности: %f%n", 2*r*Math.PI);
        System.out.printf("Площадь окружности: %f%n", r*r*Math.PI);
        input.close();
    }
}