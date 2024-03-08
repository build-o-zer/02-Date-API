package org.buildozers.katas.kata02;

import lombok.RequiredArgsConstructor;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
@UtilityClass
public class Kata02 {

    /**
     * Returns a readable calendar of the chosen month of the specified year.
     *
     * @param year
     *      year of the generated human-readable calendar
     * @param month
     *      month of the generated human-readable  calendar
     * @return
     *      a human readable String representation of the month of this year, divided into weeks
     */
    public static String getReadableMonthCalendar(int year, int month)
    {
        MonthCalendar monthCalendar = MonthCalendar.of(year, month);
        return monthCalendar.toString();
    }

    /**
     * Represents a Month, which is an aggregation of many weeks.
     */
    @RequiredArgsConstructor
    public static class MonthCalendar
    {
        private final int year;
        private final int month;
        private final List<Week> weeks = new LinkedList<>();

        private Week currentWeek;

        /**
         * Returns a new instance of MonthCalendar with the specified year and month
         *
         * @param year
         *      year of this MonthCalendar
         * @param month
         *      month of this MonthCalendar (from 1 to 12)
         * @return new instance of MonthCalendar
         */
        public static MonthCalendar of(int year, int month)
        {
            MonthCalendar monthCalendar = new MonthCalendar(year,month);
            monthCalendar.populate();
            return monthCalendar;
        }

        /**
         * produces a full human-readable calendar for this month
         *
         * @return string reprensenting the calendar of this month
         */
        @Override
        public String toString() {
            return weeks.stream().map(Week::toString).collect(Collectors.joining("\n"));
        }

        private void populate()
        {
            // let's construct the weeks and populate them with the right day number
            YearMonth yearMonth = YearMonth.of(this.year, this.month);
            LocalDate localDate = yearMonth.atDay(1);
            this.addNewWeek(); // init with one dummy week
            for(int dayNumber = 1 ; dayNumber <= yearMonth.lengthOfMonth() ; dayNumber++)
            {
                DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                if (DayOfWeek.MONDAY.equals(dayOfWeek))
                {
                    this.addNewWeek();
                }
                currentWeek.store(dayOfWeek, dayNumber);
                localDate = localDate.plusDays(1);
            }
        }

        private void addNewWeek() {
            currentWeek = new Week();
            this.weeks.add(currentWeek);
        }
    }

    /**
     * Represents a week with 7 days. day #0 is Monday, day #6 is Sunday.
     */
    public static class Week
    {
        private final Integer[] days = new Integer[7];

        /**
         * Returns a human-readable calendar week, starting with Monday, and with the associated day number.
         *
         * @return the string representation of this week
         */
        @Override
        public String toString() {
            // using String.format for padding numbers with 2 chars
            String result = Stream.of(days)
                    .map(day -> String.format("%2s", day == null ? "" : day.toString()))
                    .collect(Collectors.joining(" "));
            log.info("week : [{}]",result);
            return result;
        }

        /**
         * Stores the dayNumber for the concerned DayOfWeek.
         * <p>
         * For examples:
         * - if MONDAY is a day 25, then it store 25 at the indice 0.
         * - if WEDNESDAY is a day 27, then it stores 27 at the indice 2.
         * <p>
         *  The purpose of this method hides the implementation based on an array of Integers to callers.
         *  Implementation can evolve without impact on the caller method.
         *
         * @param dayOfWeek
         *      selected day of week
         * @param dayNumber
         *      value to be stored
         */
        public void store(DayOfWeek dayOfWeek, int dayNumber) {
            this.days[dayOfWeek.getValue() - 1] = dayNumber;
        }
    }
}
