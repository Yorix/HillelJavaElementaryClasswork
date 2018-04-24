package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson12.abstr;

public abstract class CommandParser {
    protected abstract boolean validateParams(String[] params);

    protected abstract void process();

    public void filter(String[] params) {
        if (validateParams(params)) {
            process();
        }
    }
}
