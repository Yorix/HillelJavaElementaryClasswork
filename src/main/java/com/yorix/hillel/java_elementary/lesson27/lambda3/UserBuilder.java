package com.yorix.hillel.java_elementary.lesson27.lambda3;

@FunctionalInterface
public interface UserBuilder {
    User create(String name);
}
