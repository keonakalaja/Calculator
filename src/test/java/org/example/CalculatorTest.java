package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertEquals(3, calculator.add(1, 2));
        assertNotEquals(4, calculator.add(2, 3));
    }

    @Test
    void subtract(){
        assertEquals(-1, calculator.subtract(0, 1));
        assertNotEquals(0, calculator.subtract(0, 2));
    }

    @Test
    void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertNotEquals(4, calculator.multiply(2, 4));
    }

    @Test
    void divide() throws DivideByZeroException {
        assertEquals(3, calculator.divide(3, 1));
        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0));
        assertNotEquals(4, calculator.divide(2, 4));
    }

}