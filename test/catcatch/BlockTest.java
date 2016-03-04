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
 * @author Laura
 */
public class BlockTest {
    
    public BlockTest() {
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
    
    @Test
    public void TestmoveDown(){
        System.out.println("moveDown");
        int currentY=1;
        Block instance= new Block(400,400,(null));
        int expResult=1;
        int result = instance.moveDown();
        fail("The test case is a prototype.");
    }
    
    public void TestDetectCollision(){
        System.out.println("detectCollision");
        boolean collision= false;
        Block instance= new Block(400,400,(null));
        boolean expResult=true;
        Player plyr =new Player("playerName", 5,0);
        int result=instance.detectCollsion(plyr);
        fail("The test case is a prototype.");
    }
}
