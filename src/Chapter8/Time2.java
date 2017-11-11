package Chapter8;
public class Time2 {
   private int secondsMidnight;

   public Time2() {
      this(0, 0, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int hour) {
      this(hour, 0, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2(int hour, int minute) {
      this(hour, minute, 0); // invoke constructor with three arguments
   }

   // Time2 constructor: hour, minute and second supplied
   public Time2(int hour, int minute, int second) {
      setTime(hour,minute,second);
   }

   // Time2 constructor: another Time2 object supplied
   public Time2(Time2 time) {
      // invoke constructor with three arguments
      this((time.getSecondsMidnight())/3600, ((time.getSecondsMidnight())%3600)/60, ((time.getSecondsMidnight())%3600)%60);
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

      secondsMidnight = (hour * 60) * 60 + (minute * 60) + second;
   }

   public int getSecondsMidnight() {
      return secondsMidnight;
   }

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
      return String.format(
         "%02d:%02d:%02d", getSecondsMidnight()/3600, (getSecondsMidnight()%3600)/60, (getSecondsMidnight()%3600)%60);
   } 

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
      return String.format("%d:%02d:%02d %s",
         (((getSecondsMidnight()/3600) == 0 || (getSecondsMidnight()/3600) == 12) ? 12 : (getSecondsMidnight()/3600) % 12),
              ((getSecondsMidnight()%3600)/60), ((getSecondsMidnight()%3600)%60), ((getSecondsMidnight()/3600) < 12 ? "AM" : "PM"));
   }
}