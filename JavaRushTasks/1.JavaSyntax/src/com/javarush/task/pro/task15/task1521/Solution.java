package com.javarush.task.pro.task15.task1521;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Временное сохранение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        URL url = new URL(scanner.nextLine());
        InputStream inputStream = url.openStream();
        byte[] buffer = inputStream.readAllBytes();
        Path path = Files.createTempFile(null,null);
        Files.write(path,buffer);

    }
}