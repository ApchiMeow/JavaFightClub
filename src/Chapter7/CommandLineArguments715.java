package Chapter7;
public class CommandLineArguments715 {
    public static void main(String[] args){
        int[] array;
        if (args.length != 1){
            System.out.println("Аргумент не был введён. Размер массива = 10.");
            array = new int[10];
        } else {
            int arrayLength = Integer.parseInt(args[0]);
            array = new int[arrayLength];
        }
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}