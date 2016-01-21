package com.gigigo.myapplication;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

public class Exercise14Test {

    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

//    @Test
    public void testErrorCollector() throws Exception {
        errorCollector.checkThat(1, is(1));
        errorCollector.checkThat("Hola Mundo", is("Hola Mundo"));
    }

//    @Test
    public void testErrorCollector1() throws Exception {
        errorCollector.checkThat(1, not(1));
        errorCollector.checkThat("Hola Mundo", is("Hola"));
    }
}
