package com.gigigo.myapplication;

import org.junit.Rule;
import org.junit.rules.Verifier;

import static org.junit.Assert.assertNull;

public class Exercise15Test {
    private String message = null;

    @Rule
    public Verifier rule = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertNull(message);
        }
    };

//    @Test
//    public void testRule() throws Exception {
//        message = "test";
//    }
}
