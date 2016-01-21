package com.gigigo.myapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;



public class Example1Test {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("beforeClass");
    }

    @Before
    public void setUp() {
        System.out.println("SetUp");
    }


    public void test1() {
        System.out.println("test1");
    }


    public void test2() {
        System.out.println("test2");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterClass");
    }
}