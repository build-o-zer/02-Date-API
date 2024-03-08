package org.buildozers.katas.kata03;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@UtilityClass
public class Exercice03 {
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm";


    /**
     * Returns the estimated arrival date and time at destination, in the timezone of the destination
     *
     * @param from the origin city (and its zone)
     * @param to the destination city (and its zone)
     * @param flightDate a string representing a date and time like "2024-02-28 10:00". The string is not zoned.
     * @param flightHours the number of hours of flight
     * @param flightMinute the number of minutes (added to the number of hours) of flight
     * @return the zoned date and time of the estimated flight arrival
     */
    public static ZonedDateTime getTimeAtArrival(City from, City to, String flightDate, int flightHours, int flightMinute)
    {
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);
       LocalDateTime localFightDate = LocalDateTime.parse(flightDate, dateTimeFormatter);
       log.info("localFightDate: {}", localFightDate);

       ZonedDateTime zonedDateTime = localFightDate.atZone(ZoneId.of(from.getTimeZone()));
       log.info("zonedDateTime: {}", zonedDateTime);

       Duration flightDuration = Duration.ofHours(flightHours).plusMinutes(flightMinute);
       log.info("flightDuration: {}", flightDuration);

       ZonedDateTime arrivalFromZonedDateTime = zonedDateTime.plus(flightDuration);
       log.info("arrivalFromZonedDateTime: {}", arrivalFromZonedDateTime);

       ZonedDateTime arrivalToZonedDateTime = arrivalFromZonedDateTime.withZoneSameInstant(ZoneId.of(to.getTimeZone()));
       log.info("arrivalToZonedDateTime: {}", arrivalToZonedDateTime);

       return arrivalToZonedDateTime;
    }
}
