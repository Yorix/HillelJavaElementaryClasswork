package com.yorix.hillel.java_elementary.lessons_from_1_to_22.lesson11;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User)) return false;
        User currentUser = (User) obj;
        return name.equals(currentUser.name) && id == currentUser.id;
    }

}
