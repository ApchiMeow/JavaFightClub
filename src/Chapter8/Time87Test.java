package Chapter8;

public class Time87Test {
    public static void main(String[] args) {
        Time87 t1 = new Time87(10, 10, 59);
        Time87 t2 = new Time87(23,10,10);
        Time87 t3 = new Time87(23,59,59);

        System.out.println("Constructed with:");
        displayTime("t1: ", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);

        t1.incrementMinute(); //increment into the next minute
        displayTime("Increment into the next minute", t1);

        t1.incrementHour(); //increment into the next hour
        displayTime("Increment into the next hour", t1);

        t2.incrementHour(); //increment into the next day
        displayTime("Increment into the next day", t2);

        t3.incrementMinute(); //increment into the next day
        displayTime("Increment into the next day", t3);


    }

    private static void displayTime(String header, Time87 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}
