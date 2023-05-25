package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        String pathsFileRead = "/Users/sergeysterlikov/Desktop/file1.txt";
        String pathsFileWrite = "/Users/sergeysterlikov/Desktop/file2.txt";
        Scanner scanner = new Scanner(System.in);

        try (InputStream inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             OutputStream outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))) {
            byte[] buffer = new byte[65536];
            while (inputStream.available() > 0) {
                int date = inputStream.read(buffer);
                for (int i = 0; i < buffer.length - 1; i++) {
                    byte time = buffer[i + 1];
                    buffer[i + 1] = buffer[i];
                    buffer[i] = time;
                    i++;
                }
                outputStream.write(buffer,0,date);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}


