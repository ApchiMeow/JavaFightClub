package Chapter5;
import java.util.Scanner;

public class CalculatingSales517 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float item1 = 2.98f, item2 = 4.5f, item3 = 9.98f, item4 = 4.49f, item5 = 6.87f;
        float price1 = 0.0f, price2 = 0.0f, price3 = 0.0f, price4 = 0.0f, price5 = 0.0f;
        int item = 0, quantity = 0;
        System.out.printf("Товар\t|\tЦена%n");
        System.out.println("------------------");
        System.out.printf("  #1\t|\t$%.2f%n", item1);
        System.out.printf("  #2\t|\t$%.2f%n", item2);
        System.out.printf("  #3\t|\t$%.2f%n", item3);
        System.out.printf("  #4\t|\t$%.2f%n", item4);
        System.out.printf("  #5\t|\t$%.2f%n", item5);
        System.out.println("------------------");
        do{
            item = 0; quantity = 0;
            System.out.println("Для выхода введите -1");
            System.out.print("Введите номер товара: ");
            item = input.nextInt();
            if(item == -1){
                break;
            }
            System.out.print("Введите количество проданного товара: ");
            quantity = input.nextInt();
            switch (item){
                case 1 : {
                    price1 += item1 * quantity;
                    break;
                }
                case 2 : {
                    price2 += item2 * quantity;
                    break;
                }
                case 3 : {
                    price3 += item3 * quantity;
                    break;
                }
                case 4 : {
                    price4 += item4 * quantity;
                    break;
                }
                case 5 : {
                    price5 += item5 * quantity;
                    break;
                }

                default : System.out.println("Такого товара не существует");
            }
        }while (true);
        System.out.printf("Товар\t|\tПродано\t|\tПрибыль%n");
        System.out.println("------------------------------");
        System.out.printf("  #1\t|\t%.0f штук\t|\t$%.2f%n", price1/item1, price1);
        System.out.printf("  #2\t|\t%.0f штук\t|\t$%.2f%n", price2/item2, price2);
        System.out.printf("  #3\t|\t%.0f штук\t|\t$%.2f%n", price3/item3, price3);
        System.out.printf("  #4\t|\t%.0f штук\t|\t$%.2f%n", price4/item4, price4);
        System.out.printf("  #5\t|\t%.0f штук\t|\t$%.2f%n", price5/item5, price5);
        System.out.println("------------------------------");
        System.out.printf("Итого: $%.2f", price1 + price2 + price3 + price4 + price5);
        input.close();
    }
}