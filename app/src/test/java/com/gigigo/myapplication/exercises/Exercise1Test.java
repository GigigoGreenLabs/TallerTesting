package com.gigigo.myapplication.exercises;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class Exercise1Test {

    private Summer summer;

    @Before
    public void setUp() throws Exception {
        summer = new Summer();
    }

//    @Test
    public void testSum() throws Exception {
        summer.add(10);
        summer.add(20);
        summer.add(30);

        assertThat(summer.calcSum(), is(60));
        assertThat(summer.calcSum(), not(70));

        summer.add(40);

        assertThat(summer.calcSum(), is(100));
    }

//    @Test
    public void testSumNegativeNumber() throws Exception {
        summer.add(-10);
        summer.add(-20);
        summer.add(-30);

        assertThat(summer.calcSum(), is(-60));

        summer.add(-40);
        assertThat(summer.calcSum(), is(-100));
    }

//    @Test
    public void testZero() throws Exception {
        assertThat(summer.calcSum(), is(0));
    }
}
