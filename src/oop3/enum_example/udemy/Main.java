package oop3.enum_example.udemy;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    System.out.println(Day.FRIDAY.ordinal());
    System.out.println(Arrays.toString(Day.values()));

    System.out.println(Day.SUNDAY instanceof Day);
    System.out.println(Day.SUNDAY instanceof Enum<?>);

    print(Day.SATURDAY);
    print(Day.WEDNESDAY);
    System.out.println(Day.WEDNESDAY.CURRENT_VALUE);
    System.out.println(Day.WEDNESDAY.ordinal());
    System.out.println(Day.MONDAY);
    Day.MONDAY.log();

  }

  public static void print(Day day) {
    switch (day) {
      case SATURDAY, SUNDAY -> System.out.println("weekend");
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("weekday");
      default -> System.out.println("unknown day of the week");
    }
  }

}
