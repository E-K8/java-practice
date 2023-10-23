package date_time_math;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateExample {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println("Today is:  " + today);

    LocalDate hiringDate = LocalDate.of(2023, Month.APRIL, 4);
    System.out.println("I was hired on: " + hiringDate);

    LocalDate futureDate = LocalDate.parse("2027-01-05");
    System.out.println("A date in the future, parsed: " + futureDate);

    System.out.println(today.getYear());
    System.out.println(today.lengthOfYear());
    System.out.println(today.get(ChronoField.YEAR));

    System.out.println(today.getMonth());
    System.out.println(today.getMonthValue());
    System.out.println(today.lengthOfMonth());
    System.out.println(today.get(ChronoField.MONTH_OF_YEAR));


    System.out.println(today.getDayOfWeek());
    System.out.println(today.get(ChronoField.DAY_OF_WEEK));

    System.out.println(today.getDayOfMonth());
    System.out.println(today.get(ChronoField.DAY_OF_MONTH));

    System.out.println(today.getDayOfYear());
    System.out.println(today.get(ChronoField.DAY_OF_YEAR));

    System.out.println(today.isLeapYear());


  }
}
