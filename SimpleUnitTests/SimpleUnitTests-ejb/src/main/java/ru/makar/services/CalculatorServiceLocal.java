package ru.makar.services;

import javax.ejb.Local;

@Local
public interface CalculatorServiceLocal {
     double sum(double a, double b);
     double subtract(double a, double b);
     double multiply(double a, double b);
     double divide(double a, double b);
}