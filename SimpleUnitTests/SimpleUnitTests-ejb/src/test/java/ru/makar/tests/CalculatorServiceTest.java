package ru.makar.tests;

import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;
import ru.makar.services.CalculatorService;

public class CalculatorServiceTest {

    private static final int NUMBER_BOUND = 1000;
    
    private final CalculatorService calculator;
    private final Random random;

    public CalculatorServiceTest() {
        this.calculator = new CalculatorService();
        random = new Random();
    }

    @Test
    public void sumTest() {
        double a = random.nextInt(NUMBER_BOUND);
        double b = random.nextInt(NUMBER_BOUND);
        assertTrue(a + b == calculator.sum(a, b));
    }
    
    @Test
    public void substractTest() {
        double a = random.nextInt(NUMBER_BOUND);
        double b = random.nextInt(NUMBER_BOUND);
        assertTrue(a - b == calculator.subtract(a, b));
    }
    
    @Test
    public void multiplyTest() {
        double a = random.nextInt(NUMBER_BOUND);
        double b = random.nextInt(NUMBER_BOUND);
        assertTrue(a * b == calculator.multiply(a, b));
    }
    
    @Test
    public void divideTest() {
        double a = random.nextInt(NUMBER_BOUND);
        double b = random.nextInt(NUMBER_BOUND);
        assertTrue(a / b == calculator.divide(a, b));
    }
}
