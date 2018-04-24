package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22;

import com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22.product.Camera;
import com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22.product.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        SomeType<String> someType = new SomeType();
//
//        List<String> lStr = Arrays.asList("aa", "bb", "cc");
//
//        someType.process(lStr);

        demo1();
    }

    public static void demo1() {
        List<Camera> lCamera = new ArrayList<>();
        List<Product> lProduct = new ArrayList<>();

        lProduct = Arrays.asList(
                new Product("Sony", 100),
                new Product("Philips", 110),
                new Product("Panasonic", 120));
        Boolean result = contain(lProduct, new Camera(10, "Sony", 120));
        System.out.println(result);
    }

    public static <E extends Product> boolean contain(List<E> all, E e) {
        for (E element : all) {
            if (element.getName().equalsIgnoreCase(e.getName())) {
                return true;
            }
        }
        return false;
    }

    static void copy(List<? extends Product> src, List<? super Product> dst) {
        for (Product p : src) {
            dst.add(p);
        }
    }
}