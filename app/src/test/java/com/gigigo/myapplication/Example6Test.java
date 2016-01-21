package com.gigigo.myapplication;

import com.gigigo.myapplication.classes.Foo;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.theInstance;
import static org.junit.Assert.assertThat;

public class Example6Test {

//    @Test
    public void testAssertThatEqualTo1() {
        int age = 30;

        assertThat(age, equalTo(30));
        assertThat(age, not(equalTo(33)));
    }

//    @Test
    public void testAssertThatEqualTo2() {
        String[] a = new String[]{"Hola", "mundo"};

        assertThat(a, equalTo(new String[]{"Hola", "mundo"}));
    }

//    @Test
    public void testAssertThatEqualTo3() {
        Foo foo = new Foo(5);
        Foo foo1 = foo;

        assertThat(foo, equalTo(foo1));
    }

//    @Test
    public void testAssertThatEqualTo4() {
        Foo foo = new Foo(5);
        Foo foo1 = new Foo(5);

        assertThat(foo, not(equalTo(foo1)));
    }

//    @Test
    public void testAssertThatIs() {
        int age = 30;

        assertThat(age, is(30));
        assertThat(age, is(equalTo(30)));

        assertThat(age, not(29));
        assertThat(age, is(not(29)));
        assertThat(age, is(not(equalTo(29))));
    }

//    @Test
    public void testAssertThatEither() {
        double marks = 100.0;

        assertThat(marks, either(is(100.0)).or(is(90.0)));

        assertThat(marks, either(is(90.0)).or(is(100.0)));

        assertThat(marks, not(either(is(101.0)).or(is(99.0))));

        assertThat(marks, either(is(90.0)).or(is(80.0)).or(is(100.0)));

        assertThat(marks, either(is(90.0)).or(is(100.0)).and(is(100.0)));
    }

//    @Test
    public void testAssertThatBoth() {
        double marks = 100.0;

        assertThat(marks, both(not(90.0)).and(not(60.0)));

        assertThat(marks, both(is(100.0)).and(is(100.0)));

        assertThat(marks, both(is(100.0)).and(not(not(100.0))).or(either(is(100.0)).or(not(100.0))));
    }

//    @Test
    public void testAssertThatAnyOf() {
        double marks = 100.0;

        assertThat(marks, anyOf(is(100.0), is(90.0), is(80.0)));

        assertThat(marks, not(anyOf(is(200.0), is(90.0), is(80.0))));

        assertThat(marks, anyOf(not(is(200.0)), is(90.0), is(80.0)));
    }

//    @Test
    public void testAssertThatAllOf() {
        double marks = 100.0;

        assertThat(marks, allOf(is(100.0), is(100.0)));

        assertThat(marks, not(allOf(is(100.0), is(90.0))));

        assertThat(marks, allOf(not(is(90.0)), is(100.0)));
    }

//    @Test
    public void testAssertThatHasItem() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        assertThat(list, hasItem(20));

        assertThat(list, not(hasItem(25)));

        assertThat(list, hasItem(anyOf(is(10), is(30), is(40), is(50))));

        assertThat(list, hasItem(either(is(20)).or(is(25))));

//        assertThat(list, hasItem(both(is(10)).and(is(30))));

//        assertThat(list, hasItem(allOf(is(10), is(20), is(30), is(40), is(50))));
    }

//    @Test
    public void testAssertThatHasItems() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        assertThat(list, hasItems(10, 20, 30));

//        assertThat(list, hasItems(10, 20, 30, 35));

        assertThat(list, hasItems(anyOf(is(10), is(30), is(40), is(50))));

        assertThat(list, hasItems(either(is(20)).or(is(25))));

//        assertThat(list, hasItems(both(is(10)).and(is(30))));

//        assertThat(list, hasItems(allOf(is(10), is(20), is(30), is(40), is(50))));


    }

//    @Test
    public void testAssertThatHasItems2() {
        List<Integer> list = Arrays.asList(10, 10, 10);

        assertThat(list, hasItems(both(is(10)).and(is(10))));

        assertThat(list, hasItems(allOf(is(10), is(10))));
    }

//    @Test
    public void testAssertThatStrings() {
        String numbers = "0123456789";

        assertThat(numbers, startsWith("012"));
        assertThat(numbers, endsWith("789"));
        assertThat(numbers, containsString("456"));
    }

//    @Test
    public void testAssertThatAny() {
        Foo foo = new Foo(5);

        assertThat(foo, any(Foo.class));
    }

//    @Test
    public void testAssertThatNullValue() {
        Foo foo = null;

        assertThat(foo, nullValue());
        assertThat(foo, nullValue(Foo.class));

        foo = new Foo(5);

        assertThat(foo, notNullValue());
        assertThat(foo, notNullValue(Foo.class));
    }

//    @Test
    public void testAssertThatSameInstance() {
        Foo foo = new Foo(5);
        Foo foo1 = foo;

        assertThat(foo, sameInstance(foo1));
        assertThat(foo, theInstance(foo1));
    }
}
