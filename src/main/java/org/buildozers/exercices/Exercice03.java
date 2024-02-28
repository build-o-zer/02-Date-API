package org.buildozers.exercices;

import org.buildozers.ref.City;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Exercice03 {


    // TODO : this method must return controlled Exceptions named :
    // - CityUnknowException (for both from and to parameters)
    // - TimeOutOfBoundException, if hours are not between 0 and 23 and minutes not between 0 and 59
    //
    // and an un-controlled Exception named :
    // - InvalidDateException with the message "cannot read date from the given input" if the input flightDate is not valid
    //
    // update the test class to verify these behaviours.

    /**
     * Returns the estimated arrival date and time at destination, in the timezone of the destination
     *
     * @param from the origin city (and its zone)
     * @param to the destination city (and its zone)
     * @param flightDate a string representing a date and time like "2024-02-28 10:00". The string is not zoned.
     * @param flightHours the number of hours of flight
     * @param flightMinute the numbe of minutes (added to the number of hours) of flight
     * @return the zoned date and time of the estimated flight arrival
     */
    public static ZonedDateTime getTimeAtArrival(City from, City to, String flightDate, int flightHours, int flightMinute)
    {
       return ZonedDateTime.parse("2024-02-29T06:30+01:00[Europe/Paris]");
    }
}