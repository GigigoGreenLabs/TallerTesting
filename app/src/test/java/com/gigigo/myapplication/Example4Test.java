package com.gigigo.myapplication;

import com.gigigo.myapplication.classes.Foo;

import org.junit.Assume;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;

// http://junit.org/apidocs/org/junit/Assume.html

public class Example4Test {

//    @Test
    public void testAssumeTrueAndFalse()  {
        Assume.assumeTrue(true);
        Assume.assumeFalse(false);
        Assume.assumeTrue("Explain why it should be true", true);
        Assume.assumeFalse("Explain why it should be false", false);
    }

//    @Test
    public void testAssumeNotNull() {
        Foo object = new Foo(5);
        Assume.assumeNotNull(object);
    }

//    @Test
    public void testAssumeNoException() {
        try {
            List<Foo> list = null;
            list.add(new Foo(3));
        } catch (NullPointerException e) {
            Assume.assumeNoException(e);
        }
    }

//    @Test
    public void testAssumeThat() {
        Assume.assumeThat(1, is(1));    // passes
        Foo foo = new Foo(5);           // will execute
        Assume.assumeThat(0, is(1));    // assumption failure! test halts
        foo.setValue(3);                // will never execute
    }
}
