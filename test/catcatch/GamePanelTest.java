/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qpm5006
 */
public class GamePanelTest {
    private Controller theController;
    
    public GamePanelTest() {
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
     * Test of increaseChallenge method, of class GamePanel.
     */
    @Test
    public void testIncreaseChallenge() {
        System.out.println("increaseChallenge");
        GamePanel instance = new GamePanel(theController);
        instance.increaseChallenge();
    }

    /**
     * Test of getPlayer method, of class GamePanel.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        GamePanel instance = new GamePanel(theController);
        Player expResult = new Player("P1",0);
        Player result = instance.getPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInGame method, of class GamePanel.
     */
    @Test

    /**
     * Test of getInGame method, of class GamePanel.
     */
    public void testGetInGame() {
        System.out.println("getInGame");
        GamePanel instance = new GamePanel(theController);
        boolean expResult = true;
        boolean result = instance.getInGame();
        assertEquals(expResult, result);
    }
    
}
