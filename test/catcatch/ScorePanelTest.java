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
 * @author Alex
 */
public class ScorePanelTest {
    
    public ScorePanelTest() {
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
     * Test of readFile method, of class ScorePanel.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        //creates score panel object
        ScorePanel instance = new ScorePanel(new StartPanel());
        //tests the readFile method
        instance.readFile();
        //gathers output from file reading
        String output = instance.getLines();
        //verifys output
        assertEquals("[9999 Jeff, 1000 Alex, 255  Mark, 1    Dan, 444  Doug, 999  Seth, 5432 Erin, 6546 JJJ, 345  QWERTY, 666  The Devil]", output);
        
        
    }
    
}
