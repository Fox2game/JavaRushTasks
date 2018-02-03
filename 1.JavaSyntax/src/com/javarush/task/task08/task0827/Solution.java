package com.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMMM d yyyy")
                .toFormatter();

        LocalDate taskDate = LocalDate.parse(date, formatter);
        return taskDate.getDayOfYear() % 2 != 0;
    }
}
