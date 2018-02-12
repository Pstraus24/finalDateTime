package com.company;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {
        double daysToFull = 29.5;// -------- approximate days between full moons -------
        long longDays = (new Double(daysToFull)).longValue();// convert double to long for plusDays increment
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime todayDate = LocalDateTime.now();// -------------- get local time for today ----------
        LocalDateTime lastFullMoon = LocalDateTime.of(2018, Month.JANUARY, 31, 6, 27, 46);
        long lastFull = ChronoUnit.DAYS.between(lastFullMoon, todayDate);// number of days between today and last full moon
        System.out.println("Today's date is: " + formatter.format(todayDate));
        String formattedNext = todayDate.plusDays(+longDays-lastFull).format(formatter);// use .plusDays for future
        System.out.println("Next full moon will be: "+ formattedNext);



    }


}

