package com.yorix.hillel.java_elementary.lesson30.serial2.entities;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private Sex sex;
    private String colour;
    private int age;

    public Cat(String name, Sex sex, String colour, int age) {
        this.name = name;
        this.sex = sex;
        this.colour = colour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CAT{" + name + ", " + sex + ", " + colour + ", " + age + "}";
    }
}
