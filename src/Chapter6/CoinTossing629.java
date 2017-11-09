package Chapter6;
import java.util.Scanner;
import java.security.SecureRandom;

public class CoinTossing629 {
    private static final SecureRandom random = new SecureRandom();
    private enum Coin {HEAD, TAIL};
    static Coin coinSide;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int head = 0, tail = 0, counter = 0, menu = 0;
        while (menu != 3){
            System.out.println("1. Бросок монеты.\n2. Автобросок.\n3. Посмотреть результаты.");
            menu = input.nextInt();
            switch(menu){
                case 1: {
                    counter++;
                    flip();
                    if(coinSide == Coin.HEAD){
                        System.out.println("HEAD");
                        head++;
                    }
                    if(coinSide == Coin.TAIL){
                        System.out.println("TAIL");
                        tail++;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Сколько бросков: ");
                    int n = input.nextInt();
                    for(int i = 0; i < n; i++){
                        counter++;
                        flip();
                        if(coinSide == Coin.HEAD){
                            System.out.println("HEAD");
                            head++;
                        }
                        if(coinSide == Coin.TAIL){
                            System.out.println("TAIL");
                            tail++;
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.printf("Для %d бросков: %n%d heads%n%d tails", counter, head, tail);
                    break;
                }
            }
        }
        input.close();
    }
    public static Coin flip() {
        int r = 1 + random.nextInt(2);
        if(r == 1){
            coinSide = Coin.HEAD;
        }
        if(r == 2){
            coinSide = Coin.TAIL;
        }
        return coinSide;
    }
}
