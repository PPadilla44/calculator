package com.calculator;

public class Calculator implements java.io.Serializable{

    private double operandOne;
    private double operandTwo;
    private char operand;
    private double results;

    public Calculator(){}

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }

    public char getOperand() {
        return operand;
    }

    public void performOperation(){
        if (operand == '+') {
            results = operandOne + operandTwo;
        } else if(operand == '-') {
            results = operandOne - operandTwo;
        }
    }

    public double getResults() {
        return results;
    }
}
