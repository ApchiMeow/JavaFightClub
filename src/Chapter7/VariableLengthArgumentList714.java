package Chapter7;
public class VariableLengthArgumentList714 {
    public static void main(String[] args){
        int d1 = 4;
        int d2 = 8;
        int d3 = 15;
        int d4 = 16;
        int d5 = 23;
        int d6 = 42;

        System.out.printf("d1 = %d%nd2 = %d%nd3 = %d%nd4 = %d%nd5 = %d%nd6 = %d%n%n",
                d1, d2, d3, d4, d5, d6);
        System.out.printf("Product of d1 and d2 is %d%n", product(d1, d2));
        System.out.printf("Product of d2..d5 is %d%n", product(d2, d3, d4, d5));
        System.out.printf("Product of d1..d6 is %d%n", product(d1, d2, d3, d4, d5, d6));
    }

    public static int product(int... numbers){
        int prod = 1;
        for(int d : numbers){
            prod *= d;
        }
        return prod;
    }
}