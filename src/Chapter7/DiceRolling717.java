package Chapter7;
import java.util.Random;

public class DiceRolling717 {
    private static final Random random = new Random();
    public static void main(String[] args){
        int[] array = new int[11];
        for(int i = 1; i <= 36000000; i++){
            array[rollDice()-2]++;
        }
        for(int i = 0; i < 11; i++){
            System.out.printf("%d\t:\t%d раз%n", i+2, array[i]);
        }
    }
    private static int rollDice(){
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        return die1 + die2;
    }
}
