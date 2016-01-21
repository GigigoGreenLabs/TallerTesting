package com.gigigo.myapplication.exercise16;

//@RunWith(Categories.class)
//@Categories.IncludeCategory(SlowTests.class)
//@Categories.ExcludeCategory(FastTests.class)
//@Suite.SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class SlowTestSuite1 {
    // Will run A.b, but not A.a or B.c
}
