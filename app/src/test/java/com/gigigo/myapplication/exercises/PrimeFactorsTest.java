package com.gigigo.myapplication.exercises;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private PrimeFactors primeFactors;

    private List<Integer> list(int... numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

//    @Test(expected = NumberFormatException.class)
    public void testZero() throws Exception {
        assertEquals(list(), primeFactors.getPrime(0));
    }

//    @Test
    public void testOne() throws Exception {
        assertEquals(list(1), primeFactors.getPrime(1));
    }

//    @Test
    public void testTwo() throws Exception {
        assertEquals(list(2), primeFactors.getPrime(2));
    }

//    @Test
    public void testThree() throws Exception {
        assertEquals(list(3), primeFactors.getPrime(3));
    }

//    @Test
    public void testFour() throws Exception {
        assertEquals(list(2, 2), primeFactors.getPrime(4));
    }

//    @Test
    public void testFive() throws Exception {
        assertEquals(list(5), primeFactors.getPrime(5));
    }

//    @Test
    public void testSix() throws Exception {
        assertEquals(list(2, 3), primeFactors.getPrime(6));
    }

//    @Test
    public void testEight() throws Exception {
        assertEquals(list(2, 2, 2), primeFactors.getPrime(8));
    }

//    @Test
    public void testNine() throws Exception {
        assertEquals(list(3, 3), primeFactors.getPrime(9));
    }

//    @Test
    public void testAny() throws Exception {
        assertEquals(list(2, 2, 2, 2, 2, 2, 3, 5), primeFactors.getPrime(960));
    }

//    @Test
    public void testAny1() throws Exception {
        assertEquals(list(3, 3, 7), primeFactors.getPrime(63));
    }
}
