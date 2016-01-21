package com.gigigo.myapplication.exercises;

public class Calculator {

    private static final String CUSTOM_DELIMITER = ",|\\\\n";

    public int add(String numberList) {
        int result = 0;

        String[] list = numberList.split(CUSTOM_DELIMITER);

        for (String s : list) {
            if(!s.equals("")) {
                Integer value = Integer.valueOf(s);
                result = result + value;
            }
        }
        return result;
    }
}
