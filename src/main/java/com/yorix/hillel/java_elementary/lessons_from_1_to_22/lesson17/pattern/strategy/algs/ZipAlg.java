package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson17.pattern.strategy.algs;

public class ZipAlg implements Compress {

    @Override
    public void encode(String text) {
        System.out.println("Zip compressing demo algorithm for input text: \n" + text);
        System.out.println("After compression result is: ");
        System.out.println(text.substring(0, text.length() - 1));
        System.out.println();
    }
}
