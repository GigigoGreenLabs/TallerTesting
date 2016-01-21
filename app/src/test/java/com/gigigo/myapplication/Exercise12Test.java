package com.gigigo.myapplication;

import org.junit.Rule;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class Exercise12Test {

    @Rule
    public Timeout timeout = new Timeout(1, TimeUnit.SECONDS);

//    @Test
    public void testRule1() throws Exception {
        Thread.sleep(500);
    }

//    @Test
//    public void testRule2() throws Exception {
//        Thread.sleep(1500);
//    }
}
