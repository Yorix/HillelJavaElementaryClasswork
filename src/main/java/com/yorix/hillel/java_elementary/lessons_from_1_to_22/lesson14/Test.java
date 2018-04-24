package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson14;

import com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson14.LinkedList.Node;
import com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson14.LinkedList.SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.add("CCC");
        list.add("BBB");
        list.add("AAA");
        showList(list);

        list.remove("BBB");
        showList(list);
    }

    static void showList(SingleLinkedList list) {
        for (Node n : list.toArray()) {
            System.out.println(n.getValue());
        }
    }
}
