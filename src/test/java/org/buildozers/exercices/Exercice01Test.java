package org.buildozers.exercices;

import org.buildozers.exercices.Exercice01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice01Test {

    @Test
    @DisplayName("Exercice 01 - DaysBetweenDates ")
    void getDaysBetweenDates() {
        // given
        String firstDate = "1975-06-16";
        String secondDate= "2023-01-12";

        // when
        int result = Exercice01.getDaysBetweenDates(firstDate,secondDate);

        // then
        assertEquals(17384, result);
    }
}