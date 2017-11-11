package Chapter8;

public class Time87 {
    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR = 60;
    private final int SECONDS_IN_HOUR = 3600;

    private int secondsSinceMidnight;

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Time87() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time87(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time87(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time87(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Time2 constructor: another Time2 object supplied
    public Time87(Time87 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        secondsSinceMidnight += hour * SECONDS_IN_HOUR;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        secondsSinceMidnight += minute * SECONDS_IN_MINUTE;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        secondsSinceMidnight += second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return secondsSinceMidnight / SECONDS_IN_HOUR;
    }

    // get minute value
    public int getMinute() {
        return (secondsSinceMidnight % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }

    // get second value
    public int getSecond() {
        return secondsSinceMidnight % SECONDS_IN_MINUTE;
    }

    // increment methods
    public void incrementHour() {
        if (getHour() < 23) {
            secondsSinceMidnight += SECONDS_IN_HOUR;
        } else {
            secondsSinceMidnight -= 23 * SECONDS_IN_HOUR;
        }
    }

    public void incrementMinute() {
        if (getMinute() < MINUTES_IN_HOUR - 1) {
            secondsSinceMidnight += SECONDS_IN_MINUTE;
        } else {
            secondsSinceMidnight -= (MINUTES_IN_HOUR - 1) * SECONDS_IN_MINUTE;
            incrementHour();
        }
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}