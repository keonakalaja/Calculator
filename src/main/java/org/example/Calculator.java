package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public int calcSquare(int a) {
        return a * a;
    }
    public double calcSin(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    public double calcCos(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    public String calcToBinary(int a) {
        if (a < 0) {
            return "Input must be a non-negative integer.";
        }
        return Integer.toBinaryString(a);
    }
}
