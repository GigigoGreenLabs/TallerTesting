package com.gigigo.myapplication;

import java.util.Arrays;
import java.util.List;

import static com.gigigo.myapplication.matchers.HasAnyItems.hasAnyItems;
import static com.gigigo.myapplication.matchers.LessThanOrEqualTo.lessThanOrEqualTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class Example7Test {

//    @Test
    public void testLessThanOrEquals() throws Exception {
        int i = 3;
        String s = "Hola";

        assertThat(i, lessThanOrEqualTo(3));
        assertThat(i, lessThanOrEqualTo(4));
//        assertThat(i, lessThanOrEqualTo(1));

        assertThat(s, lessThanOrEqualTo("Hola Mundo"));
        assertThat(s, lessThanOrEqualTo("Hola"));
//        assertThat(s, lessThanOrEqualTo("H"));
    }

//    @Test
    public void testHasAnyItems() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        assertThat(list, hasAnyItems(30));
//        assertThat(list, hasAnyItems(35));

        assertThat(list, not(hasAnyItems(35)));
    }


}
