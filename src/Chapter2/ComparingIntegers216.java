package Chapter2;
import java.util.Scanner;

public class ComparingIntegers216 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        if(num1 == num2){
            System.out.print("These numbers are equal");
        } else {
            if(num1 > num2){
                System.out.printf("%d is larger than %d", num1, num2);
            } else {
                System.out.printf("%d is larger than %d", num2, num1);
            }
        }
        input.close();
    }
}
