package com.company;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Time {
    public static void main(String[]args){



        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.of(2,02,2);
        System.out.println(localTime1);
        LocalTime localTime2 = LocalTime.of(5,9);
        System.out.println(localTime2);


        /* getting values*/

        System.out.println("Hours " + localTime.getHour());
        System.out.println("Second " + localTime.getSecond());
        System.out.println("Minute:"+ localTime.getMinute());
        System.out.println("nanosecond:"+ localTime.getNano());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.toSecondOfDay());


        System.out.println("modify hours : " + localTime.minusHours(2));
        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("modify using with : " + localTime.with(LocalTime.NOON));
        System.out.println("modify using with chrono field: " + localTime.with(ChronoField.HOUR_OF_DAY,22));
        System.out.println("modify hours : " + localTime.plus(2, ChronoUnit.MINUTES));
        System.out.println("modify withHour : " + localTime.withHour(2));



    }

}

