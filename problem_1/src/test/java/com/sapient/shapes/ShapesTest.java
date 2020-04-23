package com.sapient.shapes;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShapesTest {
    private Shapes sh;
    
    @Before
    public void setup() {
        sh = new Shapes();
    }
    
    @Test
    public void test1() {
        double ans = sh.calculateShapeArea(3,12);
        System.out.println(ans);
        assertTrue(ans == 62.352);
    }

    @Test
    public void test2() {
        double ans = sh.calculateShapeArea(4,15);
        System.out.println(ans);
        assertTrue(ans == 225);
    }
    @Test
    public void test3() {
        double ans = sh.calculateShapeArea(5,15);
        System.out.println(ans);
        assertTrue(ans == -1);
    }
}