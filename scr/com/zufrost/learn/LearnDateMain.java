package com.zufrost.learn;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LearnDateMain {
    public static void main(String[] args) {
        DayOfWeek dow = DayOfWeek.FRIDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));

        Month month = Month.AUGUST;
//        Locale locale = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));

        LocalDate date = LocalDate.of(2020, Month.APRIL, 23);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(date);
        System.out.println(nextWed);

        System.out.println();
        YearMonth date4 = YearMonth.now();
        System.out.printf("%s: %d%n", date4, date4.lengthOfMonth());


        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
//        date2 = date4.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
//        date3 = date2.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());

    }
}
