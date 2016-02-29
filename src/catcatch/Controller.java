/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catcatch;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Laura
 */
public class Controller extends JFrame{
    final private int WIDTH = 0;
    final private int HEIGHT = 0;
    private JFrame jFrame;
    private JPanel jPanel;
    
    
    public Controller(){
        
        //Controller extends JFrame
        //On controller initialization we need to have it creat a JFrame and a 
        //JPanel so then we will have one parent JPanel to add other elements to
        createGUI();
        StartPanel startPanel = new StartPanel(this);
        startPanel.setVisible(true);
        startPanel.setLocationRelativeTo(null);
       
    }
    
    
    public void createGUI()
    {
        this.jFrame = new JFrame("Cat Catch");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jFrame.setVisible(true);
        
        jPanel = new JPanel(new BorderLayout());
        
        jFrame.add(jPanel);
        
    }
    
}
