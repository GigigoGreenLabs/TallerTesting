package com.gigigo.myapplication.exercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public List<Integer> getPrime(int i) {
        List<Integer> numbers = new ArrayList<>();

        if (i <= 0) {
            throw new NumberFormatException();
        } else if (i == 1) {
            numbers.add(1);
        } else {
            int minPrime = 2;
            while (i > 1) {
                while (i % minPrime == 0) {
                    numbers.add(minPrime);
                    i = i / minPrime;
                }
                minPrime++;
            }
        }

        return numbers;
    }
}
