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
    /**
     * Test of decrementLives method, of class Player.
     */
    @Test
    public void testDecrementLives() {
        System.out.println("decrementLives");
        Player instance = new Player("steve", 0);
        instance.decrementLives();
        int result = instance.getLives();
        int expResult = 4;
        assertEquals(expResult, result);
    }

    /**
     * Test of increaseScore method, of class Player.
     */
    @Test
    public void testIncreaseScore() {
        System.out.println("increaseScore");
        Player instance = new Player("steve", 0);
        instance.increaseScore();
        int expResult = 50;
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
    }

    /**
     * Test of getLives method, of class Player.
     */
    @Test
    public void testGetLives() {
        System.out.println("getLives");
        Player instance = new Player("steve", 0);
        int expResult = 5;
        int result = instance.getLives();
        assertEquals(expResult, result);
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
    }

    /**
     * Test of getXCoord method, of class Player.
     */
    @Test
    public void testGetXCoord() {
        System.out.println("getXCoord");
        Player instance = new Player("Yoo",20);
        int expResult = 180;
        int result = instance.getXCoord();
        assertEquals(expResult, result);
    }
    
}
