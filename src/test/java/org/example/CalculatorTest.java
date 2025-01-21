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

    @Test
    void squareRoot() {
        assertEquals(6, calculator.squareRoot(36));
        assertNotEquals(10, calculator.squareRoot(16));
    }

    @Test
    void calcSquare() {
        assertEquals(9, calculator.calcSquare(3));
        assertNotEquals(10, calculator.calcSquare(4));

    }

    @Test
    void calcSin() {

        assertEquals(0.5, calculator.calcSin(30), 0.0001);

        assertEquals(0.0, calculator.calcSin(180), 0.0001);
    }

    @Test
    void calcCos() {

        assertEquals(1.0, calculator.calcCos(0), 0.0001);


        assertEquals(0.5, calculator.calcCos(60), 0.0001);

    }

    @Test
    void calcToBinary() {

        assertEquals("101", calculator.calcToBinary(5));

        assertEquals("11111111", calculator.calcToBinary(255));

    }
}