package org.example;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {


    public void testAddition() {
        assertEquals(15.0, Calculator.addition(10.0, 5.0), 0.0001);
    }


    public void testSoustraction() {
        assertEquals(5.0, Calculator.soustraction(10.0, 5.0), 0.0001);
    }


    public void testMultiplication() {
        assertEquals(50.0, Calculator.multiplication(10.0, 5.0), 0.0001);
    }


    public void testDivision() {
        assertEquals(2.0, Calculator.division(10.0, 5.0), 0.0001);
    }
    }
