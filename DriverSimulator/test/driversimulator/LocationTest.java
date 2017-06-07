/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driversimulator;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;



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
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);
        Location location3 = new Location("Akina", "Willowpark Road", "Southampton Street West", 0, 2);
         
        assertEquals("abc", location1.getName());
        assertEquals("Mayfair", location2.getName());
        assertEquals("Akina", location3.getName());

        
    }
    /**
     * Test of getLeftStreet method, of class Location.
     */
    @Test
    public void getLeftStreet() {
        System.out.println("getLeftStreetTest");
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);
        Location location3 = new Location("Akina", "Willowpark Road", "Southampton Street West", 0, 2);
         
        assertEquals("Left Street", location1.getLeftStreet());
        assertEquals("Frederick Street", location2.getLeftStreet());
        assertEquals("Willowpark Road", location3.getLeftStreet());

        
    }
    
        /**
     * Test of getRightStreet method, of class Location.
     */
    @Test
    public void getRightStreet() {
        System.out.println("getRightStreetTest");
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);
        Location location3 = new Location("Akina", "Willowpark Road", "Southampton Street West", 0, 2);
         
        assertEquals("Right Street", location1.getRightStreet());
        assertEquals("Willowpark Road", location2.getRightStreet());
        assertEquals("Southampton Street West", location3.getRightStreet());

        
    }
    
    
    /**
     * Test of Left method, of class Location.
     */
    @Test
    public void testLeft() {
        System.out.println("LeftTest");
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);      
        Location location3 = new Location("Mahora", "Pakowhai Road", "Frederick Street", 2, 0);
        
        assertEquals(0, location1.Left());
        assertEquals(3, location2.Left());
        assertEquals(2, location3.Left());
       
    }

    /**
     * Test of Right method, of class Location.
     */
    @Test
    public void testRight() {
        System.out.println("RightTest");
        
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);      
        Location location3 = new Location("Mahora", "Pakowhai Road", "Frederick Street", 2, 0);
        
        assertEquals(2, location1.Right());
        assertEquals(1, location2.Right());
        assertEquals(0, location3.Right());
    }
    
        @Test
    public void testStartLocation() {
        System.out.println("startLocationTest");
        Random MockRandom = Mockito.mock(Random.class);
        when(MockRandom.nextDouble()).thenReturn(0.55);
        assertEquals(2,(int)(MockRandom.nextDouble()*4));                        
    }

    /**
     * Test of getLeftStreet method, of class Location.
     */
    @Test
    public void testGetLeftStreet() {
        System.out.println("getLeftStreet");
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);      
        Location location3 = new Location("Mahora", "Pakowhai Road", "Frederick Street", 2, 0);
        
        assertEquals("Left Street", location1.getLeftStreet());
        assertEquals("Frederick Street", location2.getLeftStreet());
        assertEquals("Pakowhai Road", location3.getLeftStreet());
    }

    /**
     * Test of getRightStreet method, of class Location.
     */
    @Test
    public void testGetRightStreet() {
        System.out.println("getRightStreet");
        Location location1 = new Location("abc", "Left Street", "Right Street", 0, 2);
        Location location2 = new Location("Mayfair", "Frederick Street", "Willowpark Road", 3, 1);      
        Location location3 = new Location("Mahora", "Pakowhai Road", "Frederick Street", 2, 0);
        
        assertEquals("Right Street", location1.getRightStreet());
        assertEquals("Willowpark Road", location2.getRightStreet());
        assertEquals("Frederick Street", location3.getRightStreet());
    }
    
    
}
