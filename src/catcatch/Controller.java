/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catcatch;

import javax.swing.JFrame;

/**
 *
 * @author Laura
 */
public class Controller extends JFrame{
    final private int WIDTH = 0;
    final private int HEIGHT = 0;
    
    
    public Controller(){
        
        //Controller extends JFrame
        //On controller initialization we need to have it creat a JFrame and a 
        //JPanel so then we will have one parent JPanel to add other elements to
        
        StartPanel startPanel = new StartPanel(this);
        startPanel.setVisible(true);
        startPanel.setLocationRelativeTo(null);
       
    }
    
    
    public void createJFrame()
    {
        
    }
}
