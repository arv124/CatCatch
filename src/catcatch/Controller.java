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
    
    private StartPanel startPanel = null;
    
    public Controller(){
        startPanel = new StartPanel(this);
        startPanel.setVisible(true);
        
        
    }
    public void createJFrame()
    {
        
    }
}
