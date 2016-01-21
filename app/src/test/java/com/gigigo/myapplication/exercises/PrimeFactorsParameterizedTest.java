package com.gigigo.myapplication.exercises;

import org.junit.Before;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class PrimeFactorsParameterizedTest {

    private List<Integer> list(int... numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    @Parameterized.Parameter(value = 0)
    public int valuePrime;

    @Parameterized.Parameter(value = 1)
    public int expectedValuePrime;

    private PrimeFactors primeFactors;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1}, {2, 2}, {3,3}, {5,5}, {7,7}
        });
    }

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

//    @Test
    public void testPrimes() throws Exception {
        assertEquals(list(expectedValuePrime), primeFactors.getPrime(valuePrime));
    }
}
