package Chapter8;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Введите длину: ");
        float a = input.nextFloat();
        try {
            rect.setLength(a);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nException: %s%n", e.getMessage());
        }
        System.out.print("Введите ширину: ");
        a = input.nextFloat();
        try {
            rect.setWidth(a);
        }
        catch (IllegalArgumentException e){
            System.out.printf("%nException: %s%n", e.getMessage());
        }
        rect.area();
        rect.perimeter();
        input.close();
    }
}
