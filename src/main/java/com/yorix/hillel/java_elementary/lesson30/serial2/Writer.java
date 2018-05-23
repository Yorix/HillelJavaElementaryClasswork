package com.yorix.hillel.java_elementary.lesson30.serial2;

import com.yorix.hillel.java_elementary.lesson30.serial2.entities.Cat;

import java.io.*;
import java.util.List;

public class Writer {
    private File file;

    public Writer(File file) {
        this.file = file;
    }

    public void write(List<Cat> list) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
