package Chapter3;
import java.util.Scanner;

public class DateClass314Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DateClass314 date = new DateClass314(2, 8, 2000);
        date.displayDate();
        System.out.print("Изменить день: ");
        date.setDay(input.nextInt());
        System.out.printf("%nИзменить месяц: ");
        date.setMonth(input.nextInt());
        System.out.print("Изменить год: ");
        date.setYear(input.nextInt());
        date.displayDate();

        input.close();
    }
}
