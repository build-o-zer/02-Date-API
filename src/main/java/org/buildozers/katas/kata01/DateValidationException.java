package org.buildozers.katas.kata01;

public class DateValidationException extends RuntimeException {

    public DateValidationException()
    {
        super("first date is not before second date");
    }

}