package com.gigigo.myapplication;

import org.junit.Before;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class Exercise9Test {

//    @Parameterized.Parameter(value = 0)
    public int value;

//    @Parameterized.Parameter(value = 1)
    public int expectedValue;

    private Exercise8 exercise8;

//    @Parameterized.Parameters()
    public static Collection<Object[]> testParameterizedFactorial() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        });
    }

    @Before
    public void setUp() throws Exception {
        exercise8 = new Exercise8();
    }

//    @Test
    public void testFactorial() throws Exception {
        assertEquals(expectedValue, exercise8.factorial(value));
    }
}
