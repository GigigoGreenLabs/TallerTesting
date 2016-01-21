package com.gigigo.myapplication.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeAssertThat {

    public int add(int a, int b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public Integer copy(Integer value) {
        Integer integer = new Integer(value);
        return integer;
    }

    public List<Integer> addItemToList(int value) {
        List<Integer> list = new ArrayList<>();
        list.add(value);
        return list;
    }

    public List<Integer> addItemSToList(int value1, int value2) {
        List<Integer> list = new ArrayList<>();
        list.add(value1);
        list.add(value2);
        return list;
    }


    public List<Integer> addRandomItemToList(int value1, int value2, int value3) {
        List<Integer> list = new ArrayList<>();

        double random = Math.random();

        if (random < 0.4) {
            list.add(value1);
        } if (random < 0.7) {
            list.add(value2);
        } else {
            list.add(value3);
        }

        return list;
    }

    public String subString(String string) {
        return string.substring((int) (Math.random() * string.length()));
    }

    public Integer sameInstance(Integer i) {
        return i;
    }
}
