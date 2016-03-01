package catcatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kjrya
 */
public class GamePanel extends javax.swing.JPanel{
    
    
    private final JPanel gui = new JPanel(new BorderLayout(3,3));
    private final JPanel gamePanel = new JPanel(new GridLayout(5,6));
    private final JLabel scoreLabel = new JLabel("Your Score: ");
    
    public GamePanel(){
        initcomponents();
    }
    
    public void initcomponents(){
        gui.add(scoreLabel, BorderLayout.NORTH);
        gui.add(gamePanel, BorderLayout.CENTER);
        gamePanel.setBorder(new LineBorder(Color.BLACK));
    }
    
}
