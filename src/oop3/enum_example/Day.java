package oop3.enum_example;

public enum Day {
  MONDAY (11) {
    @Override
    public String toString() {
      return "Monday value: 11";
    }

    @Override
    void log() {
      System.out.println("Monday constant invoked");
    }
  },
  TUESDAY(45),
  WEDNESDAY(54),
  THURSDAY(23),
  FRIDAY(43),
  SATURDAY(82),
  SUNDAY(32);

  final int CURRENT_VALUE;
  Day(int val) {
    CURRENT_VALUE = val;
  }
  void log() {
    System.out.println("Logging info");
  }
}
