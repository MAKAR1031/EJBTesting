package ru.makar.controllers;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import ru.makar.services.CalculatorServiceLocal;

@Named
@RequestScoped
public class Controller {

    @EJB
    private CalculatorServiceLocal calculator;
    private double a;
    private double b;
    private double result;
    private String operation;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    
    public void calc() {
        switch(operation) {
            case "+":
                result = calculator.sum(a, b);
                break;
            case "-":
                result = calculator.subtract(a, b);
                break;
            case "*":
                result = calculator.multiply(a, b);
                break;
            case "/":
                result = calculator.divide(a, b);
                break;
            default:
                result = Double.NaN;
        }
    }
}