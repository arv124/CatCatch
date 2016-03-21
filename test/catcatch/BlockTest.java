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
    
    
    public void testGetCurrentX() {
        System.out.println("getCurrentX");
        Block instance = new Block(0,0,null);
        int expResult = 0;
        int result = instance.getCurrentX();
        assertEquals(expResult, result);
    }
    public void testGetCurrentY(){
        System.out.println("getCurrentY");
        Block instance = new Block(0,0,null);
        int expResult=0;
        int result=instance.getCurrentY();
        assertEquals(expResult, result);
    }
    public void testMove(){
        System.out.println("move");
        Block instance = new Block(0,0,null);
        int expResult=1;
        instance.move();
        int result=instance.getCurrentY();
        assertEquals(expResult, result);
    }
}
