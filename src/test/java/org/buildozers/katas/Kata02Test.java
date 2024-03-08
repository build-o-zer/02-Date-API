package org.buildozers.katas;

import org.buildozers.katas.kata02.Kata02;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata02Test {

    @Test
    @DisplayName("Exercice 02 - Readable Month Calendar ")
    void getReadableMonthCalendar() {
        // given
        int year = 2013;
        int month = 3; // march

        // when
        String result = Kata02.getReadableMonthCalendar(year, month);

        // then
        String expectedResult = """
                             1  2  3
                 4  5  6  7  8  9 10
                11 12 13 14 15 16 17
                18 19 20 21 22 23 24
                25 26 27 28 29 30 31""";
        assertEquals(expectedResult, result);
    }
}