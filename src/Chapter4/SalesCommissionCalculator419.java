package Chapter4;
import java.util.Scanner;

public class SalesCommissionCalculator419 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double item1 = 239.99, item2 = 129.75, item3 = 99.95, item4 = 350.89;
        System.out.printf("Item\tValue%n   1\t%.2f%n   2\t%.2f%n   3\t%.2f%n   4\t%.2f%n", item1, item2, item3, item4);
        int counter = 0, index, quanity;
        double salary = 0;
        while(true){
            System.out.print("Введите номер предмета (или -1 для выхода): ");
            index = input.nextInt();
            if(index == -1){
                break;
            }
            switch (index){
                case 1 : {
                    System.out.print("Сколько было продано? ");
                    quanity = input.nextInt();
                    salary += item1*quanity;
                    counter += quanity;
                    break;
                }
                case 2 : {
                    System.out.print("Сколько было продано? ");
                    quanity = input.nextInt();
                    salary += item2*quanity;
                    counter += quanity;
                    break;
                }
                case 3 : {
                    System.out.print("Сколько было продано? ");
                    quanity = input.nextInt();
                    salary += item3*quanity;
                    counter += quanity;
                    break;
                }
                case 4 : {
                    System.out.print("Сколько было продано? ");
                    quanity = input.nextInt();
                    salary += item4*quanity;
                    counter += quanity;
                    break;
                }
                default : {
                    System.out.println("Нет такого товара.");
                }
            }
        }
        System.out.printf("Продано %d вещей на сумму $%.2f%n", counter, salary);
        salary = salary*0.09 + 200;
        System.out.printf("Зарплата этого работника: $%.2f", salary);
        input.close();
    }
}
