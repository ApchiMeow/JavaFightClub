package Chapter6;
import java.util.Scanner;

public class SquareOfAnyCharacter619 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
        int a = input.nextInt();
        System.out.print("Введите символ: ");
        char fill = input.next().charAt(0);
        squareOfAsterisks(a, fill);
        input.close();
    }

    public static void squareOfAsterisks(int a, char fill){
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){
                System.out.print(fill);
            }
            System.out.println();
        }
    }
}
