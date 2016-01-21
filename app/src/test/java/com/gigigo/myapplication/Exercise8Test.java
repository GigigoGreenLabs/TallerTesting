package com.gigigo.myapplication;

import org.junit.Before;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

//@RunWith(Parameterized.class)
public class Exercise8Test {

    private final int value;
    private final int expectedValue;

    private Exercise8 exercise8;

    @Parameterized.Parameters
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        });

//        return null;

//        return Arrays.asList(new Object[][]{});

//        return Arrays.asList(new Object[][]{
//                {0, 1}, {1, 1}
//        });
    }


    public Exercise8Test(int value, int expectedValue) {
        this.value = value;
        this.expectedValue = expectedValue;
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
