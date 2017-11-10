package Chapter8;

public class EnhancingClassDate88 {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // constructor: confirm proper value for month and day given the year
    public EnhancingClassDate88(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
        System.out.printf("Date object constructor for date %s%n", this);
    }

    private void setDay(int day) {

        // check if day in range for month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.day = day;
    }

    private void setMonth(int month) {
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");

        this.month = month;
    }

    private void setYear(int year) {

        if (year < 0) {
            throw new IllegalArgumentException("year must be more than 0");
        }

        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void nextDay() {
        if (day + 1 <= daysPerMonth[month]) {
            setDay(day + 1);
        } else {
            setDay(1);
            if (month + 1 <= 12) {
                setMonth(month + 1);
            } else {
                setMonth(1);
                setYear(year + 1);
            }
        }
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}