package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson12.abstr;

public class MyFileOperation extends CommandParser {
    @Override
    protected boolean validateParams(String[] params) {
        for (String param : params) {
            if (param.equalsIgnoreCase("mv") ||
                    param.equalsIgnoreCase("cp") ||
                    isFilePathCorrect(param)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void process() {

    }

    public boolean isFilePathCorrect(String str) {
        //
        return true;
    }
}
