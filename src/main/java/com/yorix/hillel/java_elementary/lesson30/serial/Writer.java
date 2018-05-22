package com.yorix.hillel.java_elementary.lesson30.serial;

import com.yorix.hillel.java_elementary.lesson30.serial.entities.User;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    private User user;

    public Writer(User user) {
        this.user = user;
    }

    public void write() {
        try (
                FileOutputStream fos = new FileOutputStream("res/out.dat");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos)
        ) {

            objectOutputStream.writeObject(user);

        } catch (FileNotFoundException e) {
            System.err.println("File wasn't found. Look details bellow:");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO error was occurred unexpectedly.");
            e.printStackTrace();
        }
    }
}
