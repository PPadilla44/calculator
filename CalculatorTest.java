package com.calculator;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.setOperandOne(10);
        c.setOperand('-');
        c.setOperandTwo(5);
        c.performOperation();
        System.out.println(c.getResults());

        c.setOperand('+');
        c.setOperandTwo(1.4);
        c.performOperation();
        System.out.println(c.getResults());

    }

}
