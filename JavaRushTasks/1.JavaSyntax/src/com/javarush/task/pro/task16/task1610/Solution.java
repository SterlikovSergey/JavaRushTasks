package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
*/

public class Solution {

    static LocalTime timeMax;
    static LocalTime timeMin;
    static LocalTime time1;
    static LocalTime time2;
    static LocalTime time3;
    static LocalTime time4;

    public static void main(String[] args) {
        timeMax = LocalTime.MAX;
        timeMin = LocalTime.MIN;
        time1 = LocalTime.of(14,0);
        time2 = LocalTime.of(7,0,8);
        time3 = LocalTime.of(0,45,0,61);
        time4 = LocalTime.of(14,0,45,1001);
        System.out.println(LocalTime.of(time1.getHour(),time2.getMinute(),time3.getSecond(),time4.getNano()));
    }
}
