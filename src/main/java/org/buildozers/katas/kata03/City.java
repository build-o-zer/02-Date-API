package org.buildozers.katas.kata03;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum City {
    // Main cities in the USA
    NEW_YORK("America/New_York"),
    LOS_ANGELES("America/Los_Angeles"), //NOSONAR
    CHICAGO("America/Chicago"), //NOSONAR
    HOUSTON("America/Chicago"),
    PHOENIX("America/Phoenix"),
    PHILADELPHIA("America/New_York"),
    SAN_ANTONIO("America/Chicago"),
    SAN_DIEGO("America/Los_Angeles"),
    DALLAS("America/Chicago"),
    SAN_JOSE("America/Los_Angeles"),

    // Main cities in Europe
    LONDON("Europe/London"),
    PARIS("Europe/Paris"),
    BERLIN("Europe/Berlin"),
    ROME("Europe/Rome"),
    MADRID("Europe/Madrid"),
    ATHENS("Europe/Athens"),
    LISBON("Europe/Lisbon"),
    VIENNA("Europe/Vienna"),
    AMSTERDAM("Europe/Amsterdam"),
    OSLO("Europe/Oslo");

    private final String timeZone;
}