package date_time_math;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {
  public static void main(String[] args) {
    LocalTime now = LocalTime.now();
    System.out.println("Now it is: " + now);

    LocalTime workStart = LocalTime.parse("09:00");
    System.out.println("Works starts at: " + workStart);

    LocalTime workEnd = LocalTime.parse("18:00");
    System.out.println("Works ends at: " + workEnd);

    System.out.println(now.getHour());
    System.out.println(now.getMinute());
    System.out.println(now.getSecond());
    System.out.println(now.get(ChronoField.AMPM_OF_DAY));

    System.out.println(LocalTime.MIN);
    System.out.println(LocalTime.MAX);

//    calculating difference between times

    System.out.println("Working hours are: " + workStart.until(workEnd, ChronoUnit.HOURS));
    System.out.println("Working hours are: " + ChronoUnit.HOURS.between(workStart, workEnd));
    System.out.println("Working hours are: " + Duration.between(workStart, workEnd));

//    plus and minus methods
    System.out.println("Now plus 1 hour: " + now.plus(1, ChronoUnit.HOURS));
    System.out.println("Now plus 1 hour: " + now.plusHours(1));
    System.out.println("Now plus 5 minutes: " + now.plusMinutes(5));

//    before and after methods
boolean isBefore = LocalTime.parse("09:30").isBefore(LocalTime.parse("09:35"));
    System.out.println(isBefore);

    System.out.println(now.truncatedTo((ChronoUnit.HOURS)));
    System.out.println(now.truncatedTo((ChronoUnit.MINUTES)));

  }
}
