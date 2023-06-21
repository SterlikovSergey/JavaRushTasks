package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate date = LocalDate.now();
        return date;
    }

    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(1920,9,12);
        return date;
    }

    static LocalDate ofYearDayExample() {
        LocalDate date = LocalDate.ofYearDay(1920,256);
        return date;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.ofEpochDay(ofExample().toEpochDay());
        return date;
    }
}
