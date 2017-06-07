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
                 
        Location location = Mockito.mock(Location.class);//mock Location class 
        Location[] locations = new Location[4];
        locations[0] = location;
        locations[1] = location;
        locations[2] = location;
        locations[3] = location;
               
        Driver driver = new Driver("1", location);//built a driver class name "1" and in mock location 
            
        driver.chooseDirection(0.2, 0.5, locations);//run method chooseDirection using test data
  //      driver.chooseDirection(0.7, 0.5, locations);//change to random>0.5 to verify if Right direction is choosen
  //      driver.chooseDirection(0.5, 0.5, locations);//change to the boundary data random=0.5 to test if Right direction is choosen
  
        verify(location, times(1)).Left();//verify location.Left method runs once if random<0.5
  //      verify(location, times(1)).Right();//change to verify location.Right method runs once if random>=0.5
                                                          
    }
    @Test
    public void testLocationName() {
        System.out.println("LocationNameTest");  
        Location location = Mockito.mock(Location.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        
        Location[] locations = new Location[4];
        locations[0] = location;
        locations[1] = location1;
        locations[2] = location2;
        locations[3] = location;
        
        when(location.Left()).thenReturn(1);
        when(location.Right()).thenReturn(2);
        when(location1.getName()).thenReturn("abc");
        when(location2.getName()).thenReturn("def");
       
        Driver driver = new Driver("1", location);
        driver.chooseDirection(0.3, 0.5, locations);
    //    driver.chooseDirection(0.7, 0.5, locations);//change to random>0.5 to verify if Right direction is choosen and return right location name
        
        assertEquals("abc", driver.locationName());//change to assert mock locations[1]name"abc" with driver.locationName method outcome 
                                                     //when random<0.5, choose right direction
    //    assertEquals("def", driver.locationName());//change to assert mock locations[2]name"def" with driver.locationName method outcome 
                                                     //when random>=0.5, choose right direction
    }

    @Test
    public void testInHastings() {
        System.out.println("inHastingsTest");  
        
        Location location = Mockito.mock(Location.class);
            
        Location[] locations = new Location[4];
        locations[0] = location;
        locations[1] = location;
        locations[2] = location;
        locations[3] = location;
                      
        Driver driver = new Driver("1", location);
        driver.chooseDirection(0.5, 0.99, locations);
//        driver.chooseDirection(0.5, 0.8, locations);//change random2<0.9, inHastings shall change to false
               
        assertEquals(false, driver.inHastings());
   //     assertEquals(false, driver.inHastings());//change to assert false with driver.inHastings() method if random2>0.9 means
                                                   //the driver choose to outside city
    
    }
        
        
      }
