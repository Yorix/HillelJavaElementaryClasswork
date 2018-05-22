package com.yorix.hillel.java_elementary.lesson30.serial;

import com.yorix.hillel.java_elementary.lesson30.serial.entities.User;

import java.io.*;

public class Reader {
    private File file;

    public Reader(String filename) {
        this(new File(filename));
    }

    public Reader(File file) {
        this.file = file;
    }

    public User read() {
        User restoredUser = new User();
        try (FileInputStream fin = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fin)) {
            restoredUser = (User) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.err.println("File wasn't found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO error was occurred unexpectedly.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("User class wasn't found by JVM.");
            e.printStackTrace();
        }
        return restoredUser;
    }
}
