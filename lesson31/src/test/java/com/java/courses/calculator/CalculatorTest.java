package com.java.courses.calculator;
import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Before
    public void setUp(){
        System.out.println("Before");
        this.calculator = new Calculator();

    }

    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Test
    public void validateTwoNumbersAddition(){
        System.out.println("Test addition...");
        int result = calculator.add(3, 5);
        int expected = 8;
        assertEquals("Function of addition of two int returned wrong", expected, result);
    }

    @Test
    public void validateTwoNumbersSubtraction(){
        System.out.println("Test subtraction...");
        int result = calculator.subtract(3, 5);
        int expected = -2;
        assertEquals("Subtraction of two int returned wrong", expected, result);
    }

    @Test
    public void validateTwoNumbersMultiplication(){
        System.out.println("Test subtraction...");
        int result = calculator.multiply(3, 5);
        int expected = 15;
        assertEquals("Multiplication of two int returned wrong", expected, result);
    }

    @Test
    public void validateTwoNumbersDivision() throws DivisionByZero {
        System.out.println("Test division...");
        double result = 0;
             result = calculator.divide(8, 2);
        double expected = 4.00;
        assertEquals(expected, result, 0.00);
    }


    @Test(expected = DivisionByZero.class)
    @Ignore
    public void shouldThrowDivideByZeroException() throws DivisionByZero {
        System.out.println("Test division by zero exception");
        double result = calculator.divide(5, 0);

    }

    @Test(timeout = 500)
    public void testTimeout(){
        //for (int i = 0; i < 1000000000; i++) {
        //    int k = i/10+10;
         //   System.out.println(k);
        //}
    }

}
