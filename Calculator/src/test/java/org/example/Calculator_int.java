package org.example;

import static junit.framework.Assert.assertEquals;

public class Calculator_int {
    public void testAddition() {
        assertEquals(15, Calculator_Int.addition(10, 5), 0.0001);
    }


    public void testSoustraction() {
        assertEquals(5, Calculator_Int.soustraction(10, 5), 0.0001);
    }


    public void testMultiplication() {
        assertEquals(50, Calculator_Int.multiplication(10, 5), 0.0001);
    }


    public void testDivision() {
        assertEquals(2, Calculator_Int.division(10, 5), 0.0001);
    }
}

