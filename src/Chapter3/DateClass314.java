package Chapter3;
public class DateClass314 {
    private int day;
    private int month;
    private int year;
    public DateClass314(int day, int month, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    public void displayDate(){
        System.out.printf("%d / %d / %d", day, month, year);
    }

    public void setDay(int day){
        if(day > 0 && day < 32){
            this.day = day;
        } else {
            System.out.println("Неверно указан день");
        }
    }

    public void setMonth(int month){
        if(month > 0 && month < 13){
            this.month = month;
        } else {
            System.out.println("Неверно указан месяц");
        }
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}
