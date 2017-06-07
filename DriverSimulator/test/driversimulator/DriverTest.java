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
            
        driver.chooseDirection(0.2, 0.5, locations);//TC1:run method chooseDirection using test data
  //      driver.chooseDirection(0.7, 0.5, locations);//TC2:change to random>0.5 to verify if Right direction is choosen
  //      driver.chooseDirection(0.5, 0.5, locations);//TC3:change to the boundary data random=0.5 to test if Right direction is choosen
  
        verify(location, times(1)).Left();//TC1:verify location.Left method runs once if random<0.5
  //      verify(location, times(1)).Right();//TC2:change to verify location.Right method runs once if random>=0.5
                                                          
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
        driver.chooseDirection(0.3, 0.5, locations);//TC1:driver shall turn left
    //    driver.chooseDirection(0.7, 0.5, locations);//TC2:change to random>0.5 to verify if Right direction is choosen and return right location name
        
        assertEquals("abc", driver.locationName());//TC1: assert mock locations[1]name"abc" with driver.locationName method outcome 
                                                     //when random<0.5, choose right direction
    //    assertEquals("def", driver.locationName());//TC2:change to assert mock locations[2]name"def" with driver.locationName method outcome 
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
        driver.chooseDirection(0.5, 0.99, locations);//TC1:the driver outside city, inHastings shall be false
 //       driver.chooseDirection(0.5, 0.8, locations);//TC2:change random2<0.9, inHastings shall be true
               
        assertEquals(false, driver.inHastings());//TC1:assert inHastings false
 //       assertEquals(true, driver.inHastings());//change to assert true with driver.inHastings() method if random2>0.9 means
                                                   //the driver choose to outside city
    
    }
    
    @Test
    public void testGetLocation() {
        System.out.println("getLocationTest");  
        
        Location location = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        Location location4 = Mockito.mock(Location.class);

        when(location.Left()).thenReturn(0);//stub data when turn left
        when(location.Right()).thenReturn(2);//stub data when turn right
            
        Location[] locations = new Location[4];
        locations[0] = location;
        locations[1] = location2;
        locations[2] = location3;
        locations[3] = location4;
                      
        Driver driver = new Driver("1", location);
        driver.chooseDirection(0.3, 0.5, locations);//TC1:driver turn left, which whould return location[10
                                                    //according the mock class
//        driver.chooseDirection(0.7, 0.5, locations);//TC2:change random to turn right  which 
                                                      //should return location[2] according the mock class
               
        assertEquals(locations[0], driver.getLocation());//TC1:assert getLocation method after turning left
   //     assertEquals(locations[2], driver.getLocation());//TC2:change to assert getLocation method after turning right
    
    }
    
    @Test
    public void testGetAkinaVisit() {
        System.out.println("getAkinaVisitTest");   
        Location location = Mockito.mock(Location.class);
        Location location1 = Mockito.mock(Location.class);
        when(location.Left()).thenReturn(0);//stub data when turn left
        when(location.Right()).thenReturn(2);//stub data when turn right
        when(location.getName()).thenReturn("Akina");//stub start location is Akina
        when(location1.Right()).thenReturn(1);//stub data when location1 choose right direction
        when(location1.getName()).thenReturn("Akina");//stub destination location is Akina
            
        Location[] locations = new Location[4];
        locations[0] = location1;
        locations[1] = location;
        locations[2] = location;
        locations[3] = location;
        Driver driver = new Driver("1", location);
        driver.chooseDirection(0.3, 0.5, locations);//Akina count++ in start from Akina
        driver.chooseDirection(0.6, 0.5, locations);//Akina count++ when destination is Akina
        assertEquals(2, driver.getAkinaVisit());//assert Akina count is 2
        
        
    }
        
      }
