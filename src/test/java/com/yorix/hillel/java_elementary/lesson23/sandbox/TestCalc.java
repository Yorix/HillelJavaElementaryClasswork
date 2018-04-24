package com.yorix.hillel.java_elementary.lesson23.sandbox;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalc {

    static Calculator calc;

    @BeforeClass
    public static void initBeforeAllTests() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        int actualResult = calc.add(5, 10);
        assertEquals(15, actualResult);
    }

    @Test
    public void testPower() {
        int actualResult = calc.pow(3);
        assertEquals(9, actualResult);
    }

    @Test
    public void testDivNormal() {
        int actualResult = calc.div(100, 20);
        assertEquals(5, actualResult);
    }

    @Test(expected = MyCustomException.class)
    public void testDivByZero() {
        calc.div(100, 0);
        fail("This code mustn't be reached so far.");
    }
}
