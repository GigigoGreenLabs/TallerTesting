package com.gigigo.myapplication.matchers;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

public class LessThanOrEqualTo<T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {

    private final T expectedValue;

    public LessThanOrEqualTo(T expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    public boolean matches(Object item) {
        int compareTo = expectedValue.compareTo((T) item);
        return compareTo > -1;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(" less than or equals (<=) " + expectedValue);
    }

    @Factory
    public static<T extends Comparable<T>> Matcher<T> lessThanOrEqualTo(T t) {
        return new LessThanOrEqualTo(t);
    }
}
