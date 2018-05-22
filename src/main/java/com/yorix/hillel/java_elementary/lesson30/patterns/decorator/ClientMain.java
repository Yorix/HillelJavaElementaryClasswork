package com.yorix.hillel.java_elementary.lesson30.patterns.decorator;



import java.util.Arrays;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        List<Item> orders = Arrays.asList(
                new BasicPizza(),
                new DeepFried(new DoubleCheese(new BasicPizza())),
                new Spicy(new DoubleCheese(new DeepFried(new BasicPizza())))
        );

        for (Item item : orders) {
            item.prepare();
            System.out.println(" ");
        }

    }
}
