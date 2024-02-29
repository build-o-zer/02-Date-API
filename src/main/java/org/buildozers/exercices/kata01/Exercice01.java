package org.buildozers.exercices.kata01;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

@UtilityClass
public class Exercice01 {


    public static int getDaysBetweenDates(String firstDate, String secondDate)
    {
        // date string format is "1975-06-16" for example
        // - return un-controlled exception with message "date format is wrong"
        // - return un-controlled exception "first date is not before second date" if firstDate < secondDate

        LocalDate convertedFirstDate = parseOrThrowRuntimeException(firstDate);
        LocalDate convertedSecondDate = parseOrThrowRuntimeException(secondDate);
        if (convertedSecondDate.isBefore(convertedFirstDate)) throw new DateValidationException();
        return (int) ChronoUnit.DAYS.between(convertedFirstDate,convertedSecondDate);
    }

    private static LocalDate parseOrThrowRuntimeException(String date) {
        try {
            return LocalDate.parse(date);
        } catch (DateTimeParseException e)
        {
            throw new WrongDateFormatException(e);
        }
    }
}
