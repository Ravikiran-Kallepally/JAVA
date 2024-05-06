package com.ineuron.DataAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class CurrentDateAndTime {
    public static void main(String[] args){
        Object obj = LocalDateTime.now();
        System.out.println(obj);
        LocalDate originalDate = LocalDate.of(2024,5,6);
        LocalDate newDate = originalDate.plusDays(5);
        System.out.println("New date is : "+newDate);
        //difference between two dates
        long result =ChronoUnit.DAYS.between(originalDate,newDate);
        System.out.println("******************************");
        System.out.println(result);
        String newFormat = originalDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String newFormat2 = originalDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("***************************");
        System.out.println(newFormat);
        System.out.println(newFormat2);
        String dateString = "2024-05-06";
        try{
            LocalDate parsedDate = LocalDate.parse(dateString);
            System.out.println(parsedDate);
        }catch (Exception e){
            System.out.println("The exception is : "+e);
            e.printStackTrace();
        }
        DayOfWeek dayOfWeek = originalDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        Month getMonth = originalDate.getMonth();
        System.out.println(getMonth);

        int getYear = originalDate.getYear();
        System.out.println(getYear);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //local date to String
        LocalDate lastDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = lastDate.format(formatter);
        System.out.println("The formatted date is :  "+formattedDate);

        System.out.println("**********************************");
        //String to local date
        String dateString2 = "06/05/2024";
        LocalDate parsedDate = LocalDate.parse(dateString2, formatter);
        System.out.println("Parsed Date: " + parsedDate);

    }
}
