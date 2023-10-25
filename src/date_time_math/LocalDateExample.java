package date_time_math;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

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

    boolean before = today.isBefore(hiringDate);
    System.out.println("Is today before hiring date? " + before);
    boolean after = today.isAfter(hiringDate);
    System.out.println("Is today after hiring date? " + after);

    LocalDateTime atStartOfDay = today.atTime(9, 15);
    atStartOfDay = today.atStartOfDay();
    System.out.println("At start of day: " + atStartOfDay);

    LocalDate with1 = today.with(TemporalAdjusters.lastDayOfYear());
    System.out.println("Last day of year" + with1);
    LocalDate with2 = today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
    System.out.println("First Monday in the month" + with2);

    //// plus and minus
    today.minusDays(10);
    today.minusMonths(2);
    today.minusYears(2);

    //// number and temporal unit
    today.minus(12, ChronoUnit.MONTHS);

    //// temporal amount
    today.minus(Period.ofDays(12));

    //// years of experience
    Period period = Period.between(hiringDate, today);
    System.out.println("period " + period);
    System.out.println(period.getYears());

    //// calculating years of experience using method chaining
    LocalDate experience = today
        .minusYears(hiringDate.getYear())
        .minusMonths(hiringDate.getMonthValue())
        .minusDays(hiringDate.getDayOfMonth());
    System.out.println("experience: " + experience);

    System.out.println(LocalDate.MIN);
    System.out.println(LocalDate.MAX);
  }
}
