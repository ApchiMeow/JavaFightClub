package Chapter4;
import java.util.Scanner;
public class SidesOfARightTriangle436 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите стороны прямоугольного треугольника. Ненулевые значения");
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
        if(c*c == a*a + b*b){
            System.out.println("Из данных сторон ВОЗМОЖНО посторить прямоуг. треугольник.");
        } else {
            if(a*a == c*c + b*b){
                System.out.println("Из данных сторон ВОЗМОЖНО посторить прямоуг. треугольник.");
            } else {
                if(b*b == a*a + c*c){
                    System.out.println("Из данных сторон ВОЗМОЖНО посторить прямоуг. треугольник.");
                } else {
                    System.out.println("Из данных сторон НЕВОЗМОЖНО посторить прямоуг. треугольник.");
                }
            }
        }
        input.close();
    }
}
