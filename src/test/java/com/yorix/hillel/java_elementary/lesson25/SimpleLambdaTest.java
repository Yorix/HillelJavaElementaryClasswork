package com.yorix.hillel.java_elementary.lesson25;

import org.junit.Test;
import static com.yorix.hillel.java_elementary.lesson25.SimpleLambda.*;
import static org.junit.Assert.*;

public class SimpleLambdaTest {

    @Test
    public void testAdd() {
        int actual = add(10, 20);
        assertEquals(30, actual);
    }

    @Test
    public void testSub() {
        int actual = sub(10, 5);
        assertEquals(5, actual);
    }

    @Test
    public void testPower() {
        assertEquals(100, power(10));
    }

    @Test
    public void testTerminalProcess() {
        terminalProcess("qwerty");
    }

    @Test
    public void testComplexCalc() {
        int actual = complexCalc(5, 5);
        assertEquals(5000, actual);
    }

    @Test
    public void testCountNegativeNumbers() {
        int[] a = {-1, 0, 3, -100, 5, -3};
        assertEquals(3, countNegativeNumbers(a));
    }

    @Test
    public void testConcatStrs() {
        assertEquals("1981", concatStrs("19", "81"));
    }

    @Test
    public void testSum() {
        assertEquals(30, sum(10, 20));
    }

    @Test
    public void testCountEvenNumbers() {
        int[] arr = {2, 4, 3, 5, 7};
        assertEquals(2, countEvenNumbers(arr));
    }

    @Test
    public void testCountPositiveNumbers() {
        double d = 1;
        int[] arr = {0, 1, 2, -1, -2, -3};

        int actual = countNumbers(arr, d);
        assertEquals(3, actual);
    }

    @Test
    public void testCountNegNumbers() {
        double d = .4;
        int[] arr = {0, 1, 2, -1, -2, -3};

        int actual = countNumbers(arr, d);
        assertEquals(-6, actual);
    }
}