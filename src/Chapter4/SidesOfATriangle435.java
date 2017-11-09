package Chapter4;
import java.util.Scanner;

public class SidesOfATriangle435 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите стороны треугольника. Ненулевые значения");
        int a = 0, b = 0, c = 0;
        while(a <= 0){
            System.out.print("Сторона a: ");
            a = input.nextInt();
        }
        while(b <= 0) {
            System.out.print("Сторона b: ");
            b = input.nextInt();
        }
         while(c <= 0){
            System.out.print("Сторона c: ");
            c = input.nextInt();
        }
        if((a < b + c) &  (a > b - c)){
            if((b < a + c) & (b > a - c)){
                if((c < a + b) & (c > a - b)){
                    System.out.println("Из данных сторон ВОЗМОЖНО посторить треугольник.");
                } else {
                    System.out.println("Из данных сторон НЕВОЗМОЖНО посторить треугольник.");
                }
            } else {
                System.out.println("Из данных сторон НЕВОЗМОЖНО посторить треугольник.");
            }
        } else {
            System.out.println("Из данных сторон НЕВОЗМОЖНО посторить треугольник.");
        }
        input.close();
    }
}
