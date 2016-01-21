package com.gigigo.myapplication;

import com.gigigo.myapplication.exercise11.NumberSupplier;
import com.gigigo.myapplication.exercise11.StringSupplier;

import org.junit.Before;
import org.junit.experimental.theories.ParametersSuppliedBy;

import static org.junit.Assert.assertEquals;

//@RunWith(Theories.class)
public class Exercise11Test {

    private Exercise11 exercise11;

    @Before
    public void setUp() throws Exception {
        exercise11 = new Exercise11();
    }

//    @Theory
    public void testAddNumber(@ParametersSuppliedBy(NumberSupplier.class) Number num1,
                              @ParametersSuppliedBy(NumberSupplier.class) Number num2) {

        double expectedValue = num1.doubleValue() + num2.doubleValue();
        double value = (double) exercise11.add(num1, num2);

        assertEquals(expectedValue, value, 0.01);
    }

//    @Theory
    public void testAddString(@ParametersSuppliedBy(StringSupplier.class) String s1,
                              @ParametersSuppliedBy(StringSupplier.class) String s2) {

        String expectedValue = s1 + s2;
        String value = (String) exercise11.add(s1, s2);

        assertEquals(expectedValue, value);
    }
}
