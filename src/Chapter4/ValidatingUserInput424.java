package Chapter4;
import java.util.Scanner;

public class ValidatingUserInput424 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10)
        {
            System.out.printf("Enter result №%d (1 = pass, 2 = fail): ", studentCounter);
            while(true) {
                int result = input.nextInt();
                if (result == 1) {
                    passes = passes + 1;
                    break;
                }
                if (result == 2){
                    failures = failures + 1;
                    break;
                }
                System.out.print("Enter only 1 or 2: ");
            }
            studentCounter++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
        input.close();
    }
}