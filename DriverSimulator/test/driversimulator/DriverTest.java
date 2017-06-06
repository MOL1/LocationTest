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
import org.mockito.Mockito;
import static org.mockito.Mockito.*;


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
        System.out.println("chooseDirectionTest");
      //  double random = 0.2;
      //  double random2 = 0.5;
     
        
        Location location = Mockito.mock(Location.class);//mock Location class 
        Location[] locations = new Location[4];
        locations[0] = location;
        locations[1] = location;
        locations[2] = location;
        locations[3] = location;

        
        
        Driver driver = new Driver("1", location);//built a driver class name "1" and in mock location 
        
        when(location.getName()).thenReturn("abc");
        when(location.Left()).thenReturn(1);
        when(location.Right()).thenReturn(2);
        
        driver.chooseDirection(0.2, 0.5, locations);//run method chooseDirection using test data
       
        verify(location, times(1)).Left();//verify location.Left method runs once
        
//        System.out.println("testLocationName");
//        verify(location, times(1)).getName();
//        assertEquals("abc", driver.locationName());//if use driver.location method, assert stubbed data "abc" with the outcome
//        System.out.println("inHastingsTest");
//        verify(driver, times(1)).inHastings();
//        assertEquals(true, driver.inHastings());

    
                                    
      
    }
        
   

    
    
}
