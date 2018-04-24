package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson22;

import java.util.Collection;
import java.util.List;

public class SomeType<E> {
    public void process(Collection<E> list) {
        System.out.println("Collection");
        for (E element : list) {
            System.out.println(element);
        }
    }

    public void process(List<Integer> lInst) {
        System.out.println("List");
        for (Integer data: lInst) {
            System.out.println(data);
        }
    }
}
