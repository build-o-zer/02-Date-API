package org.buildozers.katas.kata01;

import java.time.format.DateTimeParseException;

public class WrongDateFormatException extends RuntimeException {
    public WrongDateFormatException(DateTimeParseException e) {
        super("date format is wrong",e);
    }
}
