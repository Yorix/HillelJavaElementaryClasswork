package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson19;

import java.util.HashMap;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args) {
        map();
    }

    public static void map() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Book1", 100);
        map1.put("Book2", 101);
        map1.put("Book3", 102);
        map1.put("Book4", 103);
        map1.put("Book5", 104);
        System.out.println(map1);
//        map1.clear();
        map1.replace("Book3", 102, 202);
        map1.replace("Book3", 2002);
        System.out.println(map1);
        for (Map.Entry<String, Integer> pair : map1.entrySet()) {
            System.out.println(pair);
        }
        for (String key : map1.keySet()) {
            System.out.println(key);
        }
    }
}
