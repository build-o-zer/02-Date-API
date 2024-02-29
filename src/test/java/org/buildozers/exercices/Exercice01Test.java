package org.buildozers.exercices;

import org.buildozers.exercices.kata01.DateValidationException;
import org.buildozers.exercices.kata01.Exercice01;
import org.buildozers.exercices.kata01.WrongDateFormatException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exercice01Test {

    @Test
    @DisplayName("Exercice 01 - DaysBetweenDates ")
    void getDaysBetweenDates() {
        // given
        String firstDate = "1975-06-16";
        String secondDate= "2023-01-19";

        // when
        int result = Exercice01.getDaysBetweenDates(firstDate,secondDate);

        // then
        assertEquals(17384, result);
    }

    @Test
    @DisplayName("Exercice 01 - DaysBetweenDates - Wrong Date format ")
    void getDaysBetweenDatesWrongDateFormat() {
        // given incorrect date formats
        String firstDate = "06-16";
        String secondDate= "01-19";

        // When
        Executable executable = () -> Exercice01.getDaysBetweenDates(firstDate, secondDate);

        // Then
        assertThrows(WrongDateFormatException.class, executable);
    }

    @Test
    @DisplayName("Exercice 01 - DaysBetweenDates - second date before the first ")
    void getDaysBetweenDatesDateValidationException() {
        // given
        String firstDate = "2023-01-19" ;
        String secondDate= "1975-06-16" ;

        // when
        Executable executable = () -> Exercice01.getDaysBetweenDates(firstDate, secondDate);

        // then
        assertThrows(DateValidationException.class,executable );
    }
}