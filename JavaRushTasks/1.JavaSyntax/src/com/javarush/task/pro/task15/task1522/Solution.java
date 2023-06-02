package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream stream = url.openStream();
        byte[] buffer = stream.readAllBytes();
        String res = new String(buffer);

        System.out.println(res);
    }
}