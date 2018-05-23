package com.yorix.hillel.java_elementary.lesson29;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileDemo {
    public static void main(String[] args) {
//        getFilesByPath(".")
//                .stream()
//                .forEach(System.out::println);

        System.out.println(readTextFile("Test.txt"));
    }

    public static List<String> readTextFileProgressive(final String filename) {
        List<String> result;
        try {
            result = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
            result = Collections.emptyList();
        }
        return result;
    }

    public static List<String> readTextFile(final String fileName) {
        List<String> result = new LinkedList<>();
        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = bfr.readLine()) != null) {
                result.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
            result = Collections.emptyList();
        }
        return result;
    }

    public static List<String> readTextFileOld(final String fileName) {
        List<String> result = new LinkedList<>();
        BufferedReader bfr = null;
        try {
            try {
                bfr = new BufferedReader(new FileReader(fileName));
                String currentLine;
                while ((currentLine = bfr.readLine()) != null) {
                    result.add(currentLine);
                }
            } finally {
                if (bfr != null) {
                    bfr.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            result = Collections.emptyList();
        }
        return result;
    }

    public static List<String> getFilesByPath(String path) {
        File file = new File(path);
        return Arrays.asList(Objects.requireNonNull(file.list()));
    }
}
