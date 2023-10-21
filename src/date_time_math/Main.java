package date_time_math;

/*
Date starts from 1900
Unix epoch: Time starts from 1970-01-01

There are three common date formats:
    D M Y
    Y M D
    M D Y

Examples of DateTime formats:
    dd-M-yyyy: hh:mm:ss
    yyyy-MM-dd HH:mm:ss
    dd MMMM yyyy
    dd MMMM yyyy z
    E, dd MMM yyyy HH:mm:ss z
    EEEE MMMM yyyy HH:mm:ss.SSZ

    (z means time zone and Z - offset from GMT
    E means day of the week
    SS means milliseconds)
*/


import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy, HH:mm:ss z");
    Date today = new Date();
    System.out.println(simpleDateFormat.format(today));
  }
}
