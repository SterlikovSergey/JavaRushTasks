package com.javarush.task.pro.task15.task1506;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.regex.Pattern;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        String file = "/Users/sergeysterlikov/Desktop/file1.txt";
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> line = Files.readAllLines(Path.of(scanner.nextLine()));
            line.forEach(str -> {
                char[] lineChar = str.toCharArray();
                for (char i : lineChar) {
                    if (i != '.' && i != ',' && i != ' ') {
                        System.out.print(i);
                    }
                }
            });
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

