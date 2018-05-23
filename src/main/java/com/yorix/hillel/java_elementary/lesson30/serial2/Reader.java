package com.yorix.hillel.java_elementary.lesson30.serial2;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Reader {
    private File file;

    public Reader(File file) {
        this.file = file;
    }

    public List read() {
        List list = Collections.emptyList();
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            list = (List) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
