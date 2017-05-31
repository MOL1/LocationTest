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
        Location location1 = new Location("Akina", 0, 2);
        Location location2 = new Location("Stortford Lodge", 1, 3);
        Location location3 = new Location("Mahora", 2, 0);
        Location location4 = new Location("Mayfair", 3, 1);
     
        assertEquals("Akina", location1.getName());
        assertEquals("Stortford Lodge", location2.getName());
        assertEquals("Mahora", location3.getName());
        assertEquals("Mayfair", location4.getName());

        
    }

    /**
     * Test of Left method, of class Location.
     */
    @Test
    public void testLeft() {
        System.out.println("LeftTest");
        Location location1 = new Location("Akina", 0, 2);
        Location location2 = new Location("Akina", 1, 2);
        Location location3 = new Location("Akina", 5, 2);
        
        assertEquals(0, location1.Left());
        assertEquals(1, location2.Left());
        assertEquals(5, location3.Left());
       
    }

    /**
     * Test of Right method, of class Location.
     */
    @Test
    public void testRight() {
        System.out.println("RightTest");
        
        Location location1 = new Location("Akina", 0, 2);
        Location location2 = new Location("Akina", 0, 4);
        Location location3 = new Location("Akina", 3, -8);
        
        assertEquals(2, location1.Right());
        assertEquals(4, location2.Right());
        assertEquals(-8, location3.Right());
    }
    
}
