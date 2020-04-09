package com.sapient.week1;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    private App app;
    
    @Before
    public void setup() {
        app = new App();
    }
    
    
    @Test
    public void test0() {
        Boolean b = app.check(0);
        assertTrue(b == true);
    }

    @Test    
    public void test1() {
        Boolean b = app.check(10);
        assertTrue(b == true);
    }

    @Test    
    public void test2() {
        Boolean b = app.check(1);
        assertTrue(b == false);
    }

    @Test  
    public void test3() {
        Boolean b = app.check(3);
        assertTrue(b == false);
    }

    @Test    
    public void test4() {
        Boolean b = app.check(8);
        assertTrue(b == true);
    }
}