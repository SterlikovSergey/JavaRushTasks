package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int num1 = 5;
        while (num1 > 0) {
            int num2 = 9;
            while (num2 > 0) {
                System.out.print("Q");
                num2--;
            }
            System.out.println("Q");
            num1--;
        }

    }
}