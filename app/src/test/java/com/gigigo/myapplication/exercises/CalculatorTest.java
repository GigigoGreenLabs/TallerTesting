package com.gigigo.myapplication.exercises;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

//    @Test
    public void testZeroNumbers() throws Exception {
        assertEquals(0, calculator.add(""));
    }

//    @Test
    public void testOneNumber() throws Exception {
        assertEquals(5, calculator.add("5"));
    }

//    @Test
    public void testTwoNumbers() throws Exception {
        assertEquals(9, calculator.add("5,4"));
    }

//    @Test
    public void testAnyNumbers() throws Exception {
        assertEquals(15, calculator.add("5,0,4,3,0,2,0,1,0"));
    }

//    @Test
    public void testMoreCharacters() throws Exception {
        assertEquals(6, calculator.add("1\\n2,3"));
    }

//    @Test
    public void testMoreCharacters2() throws Exception {
        assertEquals(1, calculator.add("1,\\n"));
    }
}
