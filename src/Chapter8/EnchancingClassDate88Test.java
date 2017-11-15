package Chapter8;

public class EnchancingClassDate88Test {
    public static void main(String[] args) {
        EnhancingClassDate88 date1 = new EnhancingClassDate88(12, 20, 2017);

        int finishYear = 2018;
        int finishMonth = 2;

        while(!(date1.getYear() == finishYear && date1.getMonth() == finishMonth)) {
            date1.nextDay();
            System.out.printf("%s\n", date1);
        }
    }
}