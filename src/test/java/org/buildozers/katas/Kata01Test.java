package org.buildozers.katas;

import org.buildozers.katas.kata01.Kata01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata01Test {

    @Test
    @DisplayName("Exercice 01 - DaysBetweenDates ")
    void getDaysBetweenDates() {
        // given
        String firstDate = "1975-06-16";
        String secondDate= "2023-01-12";

        // when
        int result = Kata01.getDaysBetweenDates(firstDate,secondDate);

        // then
        assertEquals(17384, result);
    }
}