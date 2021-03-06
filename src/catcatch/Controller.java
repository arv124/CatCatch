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
    private int score;
    GamePanel g = new GamePanel(this);
    public Controller(){
        
        //Controller extends JFrame
        //On controller initialization we need to have it creat a JFrame and a 
        //JPanel so then we will have one parent JPanel to add other elements to
        createGUI();
        //StartPanel startPanel = new StartPanel(this);
        //startPanel.setVisible(true);
        //startPanel.setLocationRelativeTo(null);
       
    }
    
    
    public void createGUI()
    {
        this.jFrame = new JFrame("Cat Catch");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setSize(400,400);
        jFrame.setLocationRelativeTo(null);
        
       
        
        jPanel = new JPanel(new BorderLayout());
        StartPanel startPanel = new StartPanel(this);
        jFrame.add(jPanel);
        jPanel.add(startPanel);
        jFrame.setVisible(true);
        
    }
    
    public void switchToInstructions()
    {
        
        jPanel.removeAll();
        jPanel.add(new InstructionPanel(this));
        jPanel.invalidate();
        jPanel.validate(); 
    }
    public void switchToScores()
    {
        score = g.getPlayer().getScore();
        jPanel.removeAll();
        jPanel.add(new ScorePanel(this, "str", score));
        jPanel.invalidate();
        jPanel.validate();
    }
    public void switchToGame()
    {
        
        jPanel.removeAll();
        jPanel.add(g);
        jPanel.invalidate();
        jPanel.validate();
        g.setFocusable(true);
        g.requestFocusInWindow();
        GamePanel.gameTimer.start();
        GamePanel.blockTimer.start();
    }
    public void switchToStart()
    {
        jPanel.removeAll();
        jPanel.add(new StartPanel(this));
        jPanel.invalidate();
        jPanel.validate();
    }
    
}
