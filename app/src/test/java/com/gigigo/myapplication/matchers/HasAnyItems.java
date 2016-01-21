package com.gigigo.myapplication.matchers;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import static org.hamcrest.core.IsEqual.equalTo;

public class HasAnyItems<T> extends TypeSafeDiagnosingMatcher<Iterable<? super T>> {

    private final Matcher<? super T> expectedValue;

    public HasAnyItems(Matcher<? super T> expectedValue) {
        this.expectedValue = expectedValue;
    }

    @Override
    protected boolean matchesSafely(Iterable<? super T> collection, Description mismatchDescription) {
        boolean isPastFirst = false;
        for (Object item : collection) {
            if (expectedValue.matches(item)) {
                return true;
            }
            if (isPastFirst) {
                mismatchDescription.appendText(", ");
            }
            expectedValue.describeMismatch(item, mismatchDescription);
            isPastFirst = true;
        }
        return false;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText(" value no matches :" + expectedValue);
    }

    @Factory
    public static <T> Matcher<Iterable<? super T>> hasAnyItems(T t) {
        return new HasAnyItems(equalTo(t));
    }
}
