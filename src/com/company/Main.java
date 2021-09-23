package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import java.time.temporal.TemporalAdjusters;

public class Main {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date is " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 03,03);
        System.out.println(localDate1);

        System.out.println("Year Day Date " + LocalDate.ofYearDay(2018,365));
        /**
         * Getting Values from Local Date
         */
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        /**
         * Modifying Values in Local Date
         */
        System.out.println("Plus Weeks  : " + localDate.plusWeeks(1));
        System.out.println("Plus Years : " + localDate.plusYears(1));
        System.out.println("Plus Days " + localDate.plusDays(1));
        System.out.println("Plus Months : " + localDate.plusMonths(1));
        System.out.println("Minus Months : "+localDate.minusMonths(1));
        System.out.println("Minus Years  :"+localDate.minus(2, ChronoUnit.YEARS));
        System.out.println(localDate.withMonth(7));
        System.out.println(localDate.withDayOfYear(24));
        System.out.println("With Year Chrono Field : " + localDate.with(ChronoField.YEAR , 2019));
        System.out.println("Temporial adjuster :"+ localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.from(DayOfWeek.FRIDAY))));

        System.out.println("is Supported : " + localDate.isSupported(ChronoUnit.DAYS));


        /**
         * Additional Support Methods
         */
        System.out.println("Not a Leap Year : " + localDate.isLeapYear());
        LocalDate  localDate2 = LocalDate.of(2020,01,31);
        System.out.println("Leap Year : " +  localDate2.isLeapYear());

        System.out.println("isBefore : " + localDate1.isBefore(localDate));
        System.out.println("isAfter : " + localDate1.isAfter(localDate));
        System.out.println("isEqual : " + localDate1.isEqual(localDate));





    }
}