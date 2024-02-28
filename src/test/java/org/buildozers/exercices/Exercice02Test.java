package org.buildozers.exercices;

import org.buildozers.exercices.Exercice02;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercice02Test {

    @Test
    @DisplayName("Exercice 02 - Readable Month Calendar ")
    void getReadableMonthCalendar() {
        // given
        int year = 2013;
        int month = 3; // march

        // when
        String result = Exercice02.getReadableMonthCalendar(year, month);

        // then
        String expectedResult = "              1  2  3\n" +
                " 4  5  6  7  8  9 10\n" +
                "11 12 13 14 15 16 17\n" +
                "18 19 20 21 22 23 24\n" +
                "25 26 27 28 29 30 31";
        assertEquals(expectedResult, result);
    }
}