package Chapter7;
public class UsingTheEnhancedForStatement716 {
    public static void main(String[] args){
        double[] array = new double[100];
        double sum = 0.0;
        for(int i = 0; i < args.length; i++){
            array[i] = Double.parseDouble(args[i]);
        }
        for (double number : array){
            sum += number;
        }
        System.out.printf("Total of array elements: %f%n", sum);
    }
}