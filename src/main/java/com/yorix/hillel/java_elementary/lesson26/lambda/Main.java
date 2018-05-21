package com.yorix.hillel.java_elementary.lesson26.lambda;

public class Main {
    public static void main(String[] args) {
        AccountHelper aHelper = new AccountHelper();

        Person p = new Person("Ksusha", 10.0);

        Double cashToReturn = aHelper.getMedicalSum(p, 3, (r, d) -> .7 * r * 8 * d);
        System.out.println(cashToReturn);

        Double cashForOvertime = aHelper.getOvertimeSum(p, 18.0, (r, h) -> 2 * r * h);
        System.out.println(cashForOvertime);
    }
}
