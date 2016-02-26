/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catcatch;

/**
 *
 * @author Laura
 */
public class Controller {
    final private int WIDTH = 0;
    final private int HEIGHT = 0;
    StartPanel startPanel = new StartPanel(this);
    GamePanel gamePanel = new GamePanel(this);
    
    public Controller(){
        startPanel.setVisible(true);
        startPanel.setLocationRelativeTo(null);
       
    }
    
    public void changeGamePanel(){
        startPanel.setVisible(false);
        gamePanel.setVisible(true);
        gamePanel.setLocationRelativeTo(null);
    }
    
    public void createJFrame()
    {
        
    }
}
