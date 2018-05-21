package com.yorix.hillel.java_elementary.lesson26.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static Person person1 = new Person("John", "Doe", 11);
    private static Person person2 = new Person("Denis", "Tsukerman", 13);
    private static Person person3 = new Person("Jane", "Doe", 12);
    private static Person person4 = new Person("Elizabet", "Li", 11);
    private static Person person5 = new Person("Tom", "Gun", 13);
    private static List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);

    public static void main(String[] args) {


//        filterExample();
//        peekExample();
//        intStreamExample();
//        skipElements();
//        sortingElements();
        streamToArray();


    }

    private static void streamToArray() {
        Object[] arrNames = personList.stream().toArray();

        Person[] people = personList.stream().toArray(Person[]::new);
        System.out.println(String.join("", Arrays.toString(people)));
    }

    private static void sortingElements() {
        Stream.of("John", "Maria", "Eugene", "Elena")
                .sorted(Comparator.reverseOrder())
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }

    private static void skipElements() {
        Stream.of("John", "Maria", "Eugene", "Elena")
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }

    private static void intStreamExample() {
        IntStream intStream = Stream.of(person1, person2, person3).mapToInt(value -> value.getSurname().length());
        intStream.forEach(System.out::println);
    }

    private static void peekExample() {
        personList.stream()
                .filter(person -> person.getSurname().equals("Doe"))
                .peek(person -> person.setName("New Name"))
                .map(Person::getName)
                .forEach(System.out::println);
    }

    private static void filterExample() {
        personList.stream().forEach(u -> System.out.println(u));
        personList.stream().filter(u -> u.getName().startsWith("J")).forEach(u -> System.out.println(u));
    }
}
