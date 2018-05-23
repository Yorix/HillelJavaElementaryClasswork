package com.yorix.hillel.java_elementary.lesson30.serial2;

import com.yorix.hillel.java_elementary.lesson30.serial2.entities.Cat;
import com.yorix.hillel.java_elementary.lesson30.serial2.entities.Sex;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> list = List.of(
                new Cat("Mitya", Sex.MALE, "BW", 5),
                new Cat("Maramoshka", Sex.FEMALE, "Black", 3)
        );

        File file = new File("res/catsStorage.dat");

        Writer writer = new Writer(file);
        writer.write(list);

        Reader reader = new Reader(file);
        List newList = reader.read();

        System.out.println(list);
        System.out.println(newList);
    }
}
