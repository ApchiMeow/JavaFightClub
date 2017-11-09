package Chapter7;
import java.security.SecureRandom;

public class GameOfCraps718 {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static int[] wonCount = new int[22];
    private static int[] lostCount = new int[22];

    public static void main(String[] args) {
        int stepsCounter = 0;
        for(int i = 0; i < 1000000; i++){
            stepsCounter += oneGame();
        }
        for(int i = 1; i < 21; i++){
            wonCount[0] += wonCount[i];
            System.out.printf("Побед / поражений на %d ходу: %d / %d%n", i, wonCount[i], lostCount[i]);
        }
        System.out.printf("Побед / поражений на 21, 22, 23... ходах: %d / %d%n", wonCount[21], lostCount[21]);
        System.out.printf("Шанс на победу: %d%%%n", wonCount[0]/10000);
        System.out.printf("Средняя продолжительность игры %d хода", stepsCounter/1000000);
    }

    public static int oneGame(){
        int myPoint = 0, step = 1;
        Status gameStatus; // can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice)
        {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = Status.WON;
                wonCount[1]++;
                break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
                lostCount[1]++;
                gameStatus = Status.LOST;
                break;
            default: // did not win or lose, so remember point
                gameStatus = Status.CONTINUE; // game is not over
                myPoint = sumOfDice; // remember the point
                break;
        }

        // while game is not complete
        while (gameStatus == Status.CONTINUE) // not WON or LOST
        {
            step++;
            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) { // win by making point
                if(step < 21){
                    wonCount[step]++;
                } else {
                    wonCount[21]++;
                }
                gameStatus = Status.WON;
            } else {
                if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                    if(step < 21){
                        lostCount[step]++;
                    } else {
                        lostCount[21]++;
                    }
                    gameStatus = Status.LOST;
                }
            }
        }
        return step;
    }

    // roll dice, calculate sum
    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll
        return die1 + die2;
    }
}