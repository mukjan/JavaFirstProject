package com.sapient;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    private App app;

    // public void setup(){
    //     app = new App();
    // }

   
    public void testCheckEven1() {
        app = new App();
        boolean A = app.checkEven(0);
        assertTrue(A == true);
    }

    public void testCheckEven2() {
        app = new App();
        boolean A = app.checkEven(1);
        assertTrue(A == false);
    }


    public void testCheckEven3() {
        app = new App();
        boolean A = app.checkEven(2);
        assertTrue(A == true);
    }

    public void testCheckEven4() {
        app = new App();
        boolean A = app.checkEven(3);
        assertTrue(A == false);
    }

    
}
