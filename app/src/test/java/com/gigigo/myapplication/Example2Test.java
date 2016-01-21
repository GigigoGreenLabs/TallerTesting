package com.gigigo.myapplication;

import com.gigigo.myapplication.classes.Foo;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;


public class Example2Test {

    public void testAssertTrueAndFalse() {
        assertTrue(true);
        assertFalse(false);
    }

    public void testAssertNullOrNotNull() {
        Object object = null;
        assertNull(object);

        object = new String("Prueba");
        assertNotNull(object);
    }

    public void testAssertEquals1() {
        int i = 5;
        int j = 5;
        assertEquals(i, j);
    }

    public void testAssertEqual2() {
        Foo foo = new Foo(5);
        Foo foo1 = new Foo(5);
        assertEquals(foo, foo1);
    }

    public void testAssertEqual3() {
        Foo foo = new Foo(5);
        Foo foo1 = foo;
        assertEquals(foo, foo1);
    }

    public void testAssertEquals4() {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        assertEquals(i, j);
    }

    public void testAssertEquals5() {
        Integer i = new Integer("5");
        Integer j = new Integer("6");
        assertEquals(i, j);
    }

    public void testAssertNotSame() {
        Integer i = new Integer("5");
        Integer j = new Integer("5");
        assertNotSame(i, j);
    }

    public void testAssertSame() {
        Integer i = new Integer("5");
        Integer j = i;
        assertSame(i, j);
    }

//    @Test(expected = RuntimeException.class)
    public void testException() {
        throw new RuntimeException();
    }

//    @Test(timeout = 100)
    public void testSleep() throws Exception {
        Thread.sleep(10);
    }

//    @Ignore("Explain why this test was ignored")
    @Test
    public void testIngored() {
        Assert.assertTrue(true);
    }
}
