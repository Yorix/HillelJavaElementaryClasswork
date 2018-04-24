package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson09;

public class LittleCat {
    private static int count;
    private String name = "Unknown cat";
    private int age = 1;
    private boolean sex;


    public static int getCount() {
        return count;
    }


    public LittleCat() {
        count++;
    }

    public LittleCat(String name, int age) {
        this();
        this.name = name;
        this.age = age;
        this.sex = true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
