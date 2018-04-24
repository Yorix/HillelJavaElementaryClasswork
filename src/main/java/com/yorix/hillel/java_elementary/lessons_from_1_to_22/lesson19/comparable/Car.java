package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson19.comparable;

public class Car implements Comparable<Car> {
    private int year;
    private String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    @Override
    public String toString() {
        return year + " " + model;
    }

    @Override
    public int compareTo(Car anotherCar) {
        return this.year - anotherCar.year;
    }
}
