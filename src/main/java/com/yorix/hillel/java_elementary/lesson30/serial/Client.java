package com.yorix.hillel.java_elementary.lesson30.serial;

import com.yorix.hillel.java_elementary.lesson30.serial.entities.Auth;
import com.yorix.hillel.java_elementary.lesson30.serial.entities.User;

public class Client {
    public static void main(String[] args) {
        User user = new User(1, "Yuriy", "Gagarin");

        Auth auth = new Auth("root", "root");
        user.setAuth(auth);

        Writer writer = new Writer(user);
        writer.write();

        User restoredUser = new Reader("res/out.dat").read();
        System.out.println(restoredUser);
    }
}
