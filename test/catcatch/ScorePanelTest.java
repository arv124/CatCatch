/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catcatch;

import java.io.IOException;
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
    
    private ScorePanel scorePanel = new ScorePanel(new Controller(), null,0);
    
    public ScorePanelTest() {
        
            this.testInstantiation();
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

    public void testInstantiation()
    {
        assertNotNull(scorePanel);
    }
    public void testArrayRead()
        {
            try
            {scorePanel.readFile();}
            catch (IOException e) 
            {
                System.out.println("File not read!");
            } 
        assertNotNull(scorePanel.lines);
        }
}
    
