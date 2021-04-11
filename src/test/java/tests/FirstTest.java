package tests;

import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void testCase1(){
        System.out.println("Hello!");
    }

    @Test
    public void testCase2(){
        System.out.println("Hello World");
        System.out.println("Hello Alphaleaf!");
    }

    @Test
    public void testCase3() {
        System.out.println("We have learned following tow method");
        System.out.println("str.indexOf(str)");
        System.out.println("str.lastIndexOf(str)");
    }
}
