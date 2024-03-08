package org.buildozers.katas;

import lombok.extern.slf4j.Slf4j;
import org.buildozers.katas.kata03.Kata03;
import org.buildozers.katas.kata03.City;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
class Kata03Test {

    @Test
    @DisplayName("Kata 03 - Get Time At Arrival")
    void getTimeAtArrival() {

        // given
        City from = City.CHICAGO;
        City to = City.PARIS;
        String departureDate = "2024-02-28 10:00";
        int hours = 10;
        int minutes = 30;

        // when
        ZonedDateTime zonedDateTime = Kata03.getTimeAtArrival(from,to,departureDate, hours,minutes);

        // then
        assertNotNull(zonedDateTime);
        assertEquals("2024-02-29T03:30+01:00[Europe/Paris]", zonedDateTime.toString());

    }

}