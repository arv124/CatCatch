/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kjrya
 */
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of move method, of class Player.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("move");
        int currentX = 300;
        Player instance = new Player(null,1);
        int expResult = 1;
        int result = instance.getXCoord();
        instance.move();
        
        assertEquals(expResult, result);
        
        
    }

    

    /**
     * Test of decrementLives method, of class Player.
     */
    @Test
    public void testDecrementLives() {
        System.out.println("decrementLives");
        Player instance = new Player("steve", 0);
        instance.decrementLives();
        
    }

    /**
     * Test of increaseScore method, of class Player.
     */
    @Test
    public void testIncreaseScore() {
        System.out.println("increaseScore");
        Player instance = new Player("steve", 0);
        instance.increaseScore();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Player instance = new Player("steve", 1000);
        int expResult = 1000;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLives method, of class Player.
     */
    @Test
    public void testGetLives() {
        System.out.println("getLives");
        Player instance = new Player("steve", 0);
        int expResult = 3;
        int result = instance.getLives();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("steve", 0);
        String expResult = "steve";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXCoord method, of class Player.
     */
    @Test
    public void testGetXCoord() {
        System.out.println("getXCoord");
        Player instance = null;
        int expResult = 1;
        int result = instance.getXCoord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
