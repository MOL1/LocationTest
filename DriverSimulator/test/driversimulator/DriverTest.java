/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversimulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MOL1
 */
public class DriverTest {
    
    public DriverTest() {
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
     * Test of chooseDirection method, of class Driver.
     */
    @Test
    public void testChooseDirection() {
        System.out.println("chooseDirection");
        double random = 0.2;
        double random2 = 0.5;
        Location[] locations = null;
        Driver instance = new Driver(name, stratLocation);
        instance.chooseDirection(random, random2, locations);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locationName method, of class Driver.
     */
    @Test
    public void testLocationName() {
        System.out.println("locationName");
        Driver instance = null;
        String expResult = "";
        String result = instance.locationName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inHastings method, of class Driver.
     */
    @Test
    public void testInHastings() {
        System.out.println("inHastings");
        Driver instance = null;
        boolean expResult = false;
        boolean result = instance.inHastings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
