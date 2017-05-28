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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getName method, of class Location.
     */
    @Test
    public void testGetName() {
        System.out.println("getNameTest");
        Location instance = new Location("Akina", 0, 2);
        String expResult = "Akina";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Left method, of class Location.
     */
    @Test
    public void testLeft() {
        System.out.println("LeftTest");
        Location instance = new Location("Akina", 0, 2);
        int expResult = 0;
        int result = instance.Left();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Right method, of class Location.
     */
    @Test
    public void testRight() {
        System.out.println("RightTest");
        Location instance = new Location("Akina", 0, 2);
        int expResult = 2;
        int result = instance.Right();
        assertEquals(expResult, result);
      
    }
    
}
