package com.gigigo.myapplication;

//@RunWith(Theories.class)
public class Exercise10Test {

//    @DataPoint public static String jack = "Jack";
//    @DataPoint public static String david = "David";

//    @Theory
    public void testTheory(String firstName, String lastName) {
        System.out.println("Sanity check: " + firstName + " " + lastName);
    }

//    @DataPoints public static char[] chars = new char[] {'a', 'b', 'c'};

//    @Theory
    public void testChars(char one, char two) {
        System.out.println(one + " " + two);
    }
}
