package date_time_math;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    System.out.println(now);

    String isoFormat = now.format(DateTimeFormatter.ISO_DATE);
    System.out.println(isoFormat);

    String patternFormat = now.format(DateTimeFormatter.ofPattern("EEEE, MMM dd hh:mm a"));
    System.out.println(patternFormat);

    String italianLocale = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ITALIAN));
    System.out.println(italianLocale);

    String chineseLocale = now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.CHINA));
    System.out.println(chineseLocale);

    LocalDateTime lastVisit = LocalDateTime.of(2023, Month.SEPTEMBER, 27, 6, 30);
    System.out.println("Last visit was on: " + lastVisit);

    LocalDateTime lastUpdate = LocalDateTime.parse("2023-12-30T13:45:50.63", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    System.out.println("Last update was at: " + lastUpdate);

    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = date.atTime(time);
    System.out.println(dateTime);
  }
}
