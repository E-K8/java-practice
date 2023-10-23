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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date today = new Date();
    System.out.println(simpleDateFormat.format(today));

    System.out.println(today.getDate());
    System.out.println(today.getYear());
    System.out.println(today.getMonth());
    System.out.println(today.getDay());
    System.out.println(today.getTime());

    Date date = simpleDateFormat.parse("05/01/1977");
    System.out.println(date);

    Calendar calendar = new GregorianCalendar();

    System.out.println(calendar.get(Calendar.ERA));
    System.out.println(calendar.get(Calendar.YEAR));
    System.out.println(calendar.get(Calendar.MONTH));
    System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
    System.out.println("<<<<<>>>>>");

    System.out.println(calendar.get(Calendar.DATE));
    System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println("<<<<<>>>>>");

    System.out.println(calendar.get(Calendar.HOUR));
    System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
    System.out.println(calendar.get(Calendar.MINUTE));
    System.out.println(calendar.get(Calendar.SECOND));
    System.out.println(calendar.get(Calendar.MILLISECOND));
    System.out.println(calendar.get(Calendar.AM_PM));
  }
}
