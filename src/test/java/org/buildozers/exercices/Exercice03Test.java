package org.buildozers.exercices;

import lombok.extern.slf4j.Slf4j;
import org.buildozers.ref.City;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class Exercice03Test {

    @Test
    @DisplayName("Exercice 03 - Get Time At Arrival")
    void getTimeAtArrival() {

        // given
        City from = City.CHICAGO;
        City to = City.PARIS;
        String departureDate = "2024-02-28";
        int hours = 10;
        int minutes = 30;

        // when
        ZonedDateTime zonedDateTime = Exercice03.getTimeAtArrival(from,to,departureDate, hours,minutes);

        // then
        assertNotNull(zonedDateTime);
        assertEquals("2024-02-29T06:30+01:00[Europe/Paris]", zonedDateTime.toString());

    }

}