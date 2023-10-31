package date_time_math;

import java.time.*;
import java.util.Map;
import java.util.Set;

public class TimeZones {
  public static void main(String[] args) {

    /*
    ZoneId Formats:
    20:30Z
    GMT+02:00
    America/Los_Angeles (Area/City)
    */

    System.out.println(LocalDateTime.now());
    System.out.println(Instant.now()); //Zulu time = GMT

    // UTC: the primary time standard by which the world regulates clocks and time

    Instant nowUtc = Instant.now();
    System.out.println(nowUtc.getEpochSecond()); // Returns the seconds from the epoch of 1970-01-01T00:00:00Z
    System.out.println(System.currentTimeMillis());

    long startTime = System.currentTimeMillis();
    System.out.println(System.currentTimeMillis() - startTime);

//    list of zones available
    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
    availableZoneIds.forEach(System.out::println);

//    list of zone shortIds
    Map<String, String> shortIds = ZoneId.SHORT_IDS;
    shortIds.forEach((k, v) -> System.out.println(k + "->" + v));

//    Get your current ZoneId
    System.out.println(ZoneId.systemDefault());

//    Other places ZoneId
    ZoneId tokyoTimeZone = ZoneId.of("Asia/Tokyo");
    ZoneId calcuttaTimeZone = ZoneId.of("Asia/Calcutta");
    ZoneId asiaSingapore = ZoneId.of("Asia/Singapore");

    System.out.println(asiaSingapore);

//    Date and Time now in my zone
    System.out.println(ZonedDateTime.now());

//    Date and Time now in different time zones
    System.out.println(LocalDateTime.now(tokyoTimeZone));
    System.out.println(ZonedDateTime.now(tokyoTimeZone));
    System.out.println(nowUtc.atZone(tokyoTimeZone));

    System.out.println(ZonedDateTime.now(calcuttaTimeZone));
    System.out.println(Instant.now().atZone(calcuttaTimeZone));


    ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), tokyoTimeZone);
    System.out.println(zonedDateTime);

//    if we don't know the time zone, but we know the offset

    ZoneOffset offset = ZoneOffset.of("-02:00");
    OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.now(), offset);
    System.out.println(offsetDateTime);

    System.out.println(ZoneOffset.MIN);
    System.out.println(ZoneOffset.MAX);
  }
}
