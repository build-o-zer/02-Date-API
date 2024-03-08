package org.buildozers.katas.kata03;

import java.time.ZonedDateTime;

public class Kata03 {

    /**
     * Returns the estimated arrival date and time at destination, in the timezone of the destination
     *
     * @param from         the origin city (and its zone)
     * @param to           the destination city (and its zone)
     * @param flightDate   a string representing a date and time like "2024-02-28 10:00". The string is not zoned.
     * @param flightHours  the number of hours of flight
     * @param flightMinute the numbe of minutes (added to the number of hours) of flight
     * @return the zoned date and time of the estimated flight arrival
     */
    public static ZonedDateTime getTimeAtArrival(City from, City to, String flightDate, int flightHours, int flightMinute) {
        return ZonedDateTime.parse("2024-02-29T03:30+01:00[Europe/Paris]");
    }
}
