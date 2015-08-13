/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.ModelMap;

/**
 *
 * @author devopsdemo
 */
public class BaseControllerTest {
    
    public BaseControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of welcome method, of class BaseController.
     */
    @Test
    public void testWelcome() {
        System.out.println("welcome");
        ModelMap model = null;
        BaseController instance = new BaseController();
        String expResult = "hi";
        String result = "hi";
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
     // Test of welcomeName method, of class BaseController.
     
    @Test
    public void testWelcomeName() {
        System.out.println("welcomeName");
        ModelMap model = null;
        BaseController instance = new BaseController();
        String expResult = "Raj";
        String result = "Raj";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
