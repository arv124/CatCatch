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
    
    public Controller(){
        
        StartPanel startPanel = new StartPanel(this);
        startPanel.setVisible(true);
        startPanel.setLocationRelativeTo(null);
       
    }
    public void createJFrame()
    {
        
    }
}
