package com.example.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(4, Calculator.divide(12, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }

    @Test
    public void testSquare() {
        assertEquals(25, Calculator.square(5));
    }

    @Test
    public void testPower() {
        assertEquals(8, Calculator.power(2, 3));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        Calculator.factorial(-5);
    }

    @Test
    public void testIsEven() {
        assertTrue(Calculator.isEven(6));
    }

    @Test
    public void testIsOdd() {
        assertFalse(Calculator.isEven(7));
    }

    @Test
    public void testIsPrime() {
        assertTrue(Calculator.isPrime(7));
    }

    @Test
    public void testIsNotPrime() {
        assertFalse(Calculator.isPrime(8));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Calculator.squareRoot(25), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeNumber() {
        Calculator.squareRoot(-25);
    }
}
