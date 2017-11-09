package Chapter6;
import java.util.Scanner;

public class TemperatureConversions622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в Фаренгейтах: ");
        int fahrenheit = input.nextInt();
        System.out.printf("%d градус по Цльсию%n", celsius(fahrenheit));
        System.out.print("Введите температуру в Цельсиях: "); // 233
        int celsius = input.nextInt();
        System.out.printf("%d градус по Фаренгейту%n", fahrenheit(celsius));
        input.close();
    }

    private static int celsius (int fahrenheit){
        return (int)(5.0 / 9.0 * (fahrenheit - 32));
    }
    private static int fahrenheit (int celsius){
        return (int)(9.0 / 5.0 * celsius + 32);
    }
}
